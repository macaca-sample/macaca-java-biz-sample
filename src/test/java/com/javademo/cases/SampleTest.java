package com.javademo.cases;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import macaca.client.common.GetElementWay;
import macaca.java.biz.CommonUIBean;
import org.junit.Test;

import macaca.java.biz.ResultGenerator;
import com.javademo.pages.BaiDuPage;
import com.javademo.pages.HomeListPage;
import com.javademo.pages.HomePage;
import com.javademo.pages.LoginPage;
import com.javademo.pages.PersonalPage;
import com.javademo.pages.WebviewPage;
import com.javademo.pageuis.BaiDuPageUI;
import com.javademo.pageuis.HomeListPageUI;
import com.javademo.pageuis.HomePageUI;
import com.javademo.pageuis.LoginPageUI;
import com.javademo.pageuis.PersonalPageUI;
import com.javademo.pageuis.WebviewPageUI;

public class SampleTest extends BaseTest {

    @Test
    public void test() throws Exception {

        // 处理登录
        LoginPage loginPage = new LoginPage("登录页");
        loginPage.setDriver(driver);
        if (loginPage.hasPageShown(LoginPageUI.LOGIN_BTN)) {
            saveScreen(loginPage.pageDesc);
            ResultGenerator.loadPageSucc(loginPage);
            loginPage.login("test", "123");
        } else {
            ResultGenerator.loadPageFail(loginPage);

        }

        // 测试首页
        HomePage homePage = new HomePage("首页");
        homePage.setDriver(driver);
        if (homePage.hasPageShown(HomePageUI.HOME_TAB)) {
            saveScreen(homePage.pageDesc);
            ResultGenerator.loadPageSucc(homePage);
            // 进入list
            homePage.goToList();
        } else {
            // 首页没有加载成功，后面的用例都不用执行了，return
            ResultGenerator.loadPageFail(homePage);
            return;
        }

        // 自动化首页List页
        testHomePageList();
        driver.sleep(1000);

        // 测试webView Tab
        homePage.tabWebView();
        testWebView();
        driver.sleep(1000);

        // 测试浏览器
        homePage.tabBaiDu();
        testBaiDu();
        driver.sleep(1000);

        // 测试Personal
        homePage.tabPersonal();
        testPersonalPage();

    }

    public void testHomePageList() throws Exception {
        // 首页List页
        HomeListPage homeListPage = new HomeListPage("首页列表页");
        homeListPage.setDriver(driver);
        if (homeListPage.hasPageShown(HomeListPageUI.LIST_VIEW)) {

            saveScreen(homeListPage.pageDesc);
            ResultGenerator.loadPageSucc(homeListPage);

            // 滑动
            homeListPage.scroll();

            // 回到首页
            driver.customBack();
        }

    }


    public void testWebView() throws Exception {
        WebviewPage webviewPage = new WebviewPage("webviewPage");
        webviewPage.setDriver(driver);
        if (webviewPage.hasPageShown(WebviewPageUI.WEB_VIEW_TITLE)) {
            saveScreen(webviewPage.pageDesc);
            ResultGenerator.loadPageSucc(webviewPage);

            // Push view
            webviewPage.pushView();
            driver.sleep(1000);
            driver.customBack();

            // 修改标题
            webviewPage.setTitle();
            saveScreen(webviewPage.pageDesc + "_newTitle");
        } else {
            ResultGenerator.loadPageFail(webviewPage);
        }

    }


    public void testBaiDu() throws Exception {
        BaiDuPage baiDuPage = new BaiDuPage("百度");
        baiDuPage.setDriver(driver);

        driver.sleep(3000);
        // 切换上下文到当前H5 window
        driver.switchFromNativeToWebView();

        if (baiDuPage.hasPageShown(BaiDuPageUI.SEARCH_BTN)) {
            saveScreen(baiDuPage.pageDesc);
            ResultGenerator.loadPageSucc(baiDuPage);

            // 遍历所有href属性的跳转链接
            iterateBaiDuPage();
            driver.sleep(5000);


            // 常规的H5操作
            // 顶部登录按钮
            driver.onclickBean(BaiDuPageUI.USER_LOGIN_BEAN);
            driver.sleep(2000);
            saveScreen("userLoginBtn");

            // 进入登录页之后，需要更新当前上下文再对登录页做处理
            driver.updateTopContext();

            // 为了方便示例展示，此处将控件的定义放在外层，控件的value值通过在inspect页面对应控件上右键-Copy-Copy Selector得到
            CommonUIBean loginRightNowBean = new CommonUIBean(GetElementWay.CSS, "#page-bd > section.user-profile > div.user-login.clearfix > a", "立即登录");
            driver.onclickBean(loginRightNowBean);
            driver.sleep(2000);
            saveScreen("loginPage");

            driver.execute("history.back();");

            driver.execute("history.back();");


        } else {
            ResultGenerator.loadPageFail(baiDuPage);
        }

    }


    public void testPersonalPage() throws Exception {
        PersonalPage personalPage = new PersonalPage("个人主页");
        personalPage.setDriver(driver);
        if (personalPage.hasPageShown(PersonalPageUI.LOG_OUT_BTN)) {
            saveScreen(personalPage.pageDesc);
            ResultGenerator.loadPageSucc(personalPage);

            // logout
            personalPage.logout();

        } else {
            ResultGenerator.loadPageFail(personalPage);
        }
    }

    public void iterateBaiDuPage() throws Exception {
        JSONObject schemaJson = driver.execute("var arr=[];function getSchemas(){$.each($('[href]'),function(index,item){arr.push(item.getAttribute('href'))}); return arr;};return getSchemas();");
        JSONArray schemas = schemaJson.getJSONArray("value");
        System.out.println("schemas===========" + schemas);

        if (schemas != null && schemas.size() > 0) {
            // 循环进入各个二级跳转链接
            // 此处为避免href过多导致执行时间过长，限定了循环次数，实际中可以直接指定循环次数为数组长度
//			for (int i = 0; i < schemas.size(); i++) {
            for (int i = 0; i < 5; i++) {

                String tmpHref = (String) schemas.get(i);
                String jsCode = "location.assign(\"" + tmpHref + "\")";
                driver.execute(jsCode);
                driver.sleep(3000);
                saveScreen(tmpHref);

                driver.execute("history.back();");

            }

        }
    }
}
