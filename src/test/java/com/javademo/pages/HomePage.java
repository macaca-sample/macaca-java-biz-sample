package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.HomePageUI;

public class HomePage extends BasePage {

    public HomePage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    /**
     * 点击home tab
     */
    public void tabHome() {
        driver.onclickBean(HomePageUI.HOME_TAB);
    }

    /**
     * 点击webView tab
     */
    public void tabWebView() {
        driver.onclickBean(HomePageUI.WEBVIEW_TAB);
    }

    /**
     * 点击百度
     */
    public void tabBaiDu() {
        driver.onclickBean(HomePageUI.BAIDU_TAB);
    }

    /**
     * 点击Personal tab
     */
    public void tabPersonal() {
        driver.onclickBean(HomePageUI.PERSONAL_TAB);
    }

    /**
     * 进入List页
     */
    public void goToList() {
        driver.onclickBean(HomePageUI.LIST_BTN);
    }
}
