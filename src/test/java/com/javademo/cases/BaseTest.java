package com.javademo.cases;

import java.io.File;

import org.junit.After;
import org.junit.Before;

import macaca.java.biz.BaseErrorType;
import macaca.java.biz.BaseMacacaClient;
import macaca.java.biz.ResultGenerator;
import macaca.java.biz.BaseMacacaClient.PlatformType;
import com.javademo.utils.Config;
import com.alibaba.fastjson.JSONObject;

public class BaseTest {

    // 屏幕截图的数目，为了实现递增的顺序
    private int screenNum = 1;

    BaseMacacaClient driver = new BaseMacacaClient();

    @Before
    public void setUp() throws Exception {

        // 清除日志记录
        ResultGenerator.clearOldData();
        //清理截图重新记录
        File file = new File(Config.SCREEN_SHOT_PATH);
        deleteOldScreen(file);

        // 初始化应用基础信息
        JSONObject props = new JSONObject();
        if (Config.PLATFORM.equals("ios")) {

            // 创建ios实例
            props.put("app", Config.IOS_APP);
            props.put("platformName", Config.IOS_PLATFORM_NAME);
            props.put("deviceName", Config.IOS_DEVICE_NAME);
//			props.put("udid", Config.IOS_UDID);
            driver.setCurPlatform(PlatformType.IOS);
        } else {

            //创建安卓实例
            props.put("app", Config.ADR_APP);
            props.put("platformName", Config.ADR_PLATFORM_NAME);
            driver.setCurPlatform(PlatformType.ANDROID);
        }

        // 覆盖安装
        props.put("reuse", Config.REUSE);

        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", props);
        driver.initDriver(desiredCapabilities);

    }


    @After
    public void tearDown() throws Exception {

        try {
            driver.quit();
        } catch (Exception e) {
            // TODO: handle exception
            ResultGenerator.fail("quit fail", "", BaseErrorType.FUNCTION_FAILED);
        }

    }

    /**
     * 保存当前屏幕截图-生成的截图会按照截图的先后顺序生成有序的名称
     *
     * @param fileName 图片名称，默认为.png格式,图片默认保存在screenShot目录下
     */
    public void saveScreen(String fileName) {
        try {
            // 判断是否存在对应目录，不存在的话则创建
            File file = new File(Config.SCREEN_SHOT_PATH);
            if (!file.exists() || !file.isDirectory()) {
                // 没有目录 创建截屏目录
                System.out.println("没有screenshot目录，创建目录");
                boolean isMkdirSucc = file.mkdir();
                if (isMkdirSucc) {
                    System.out.println("创建screenshot目录成功");
                } else {
                    System.out.println("创建screenshot目录失败");
                }
            } else {
                System.out.println("存在screenshot目录");
            }

            driver.saveScreenshot(
                    Config.SCREEN_SHOT_PATH + File.separator + screenNum + "_" + fileName + ".png");
            screenNum++;
        } catch (Exception e) {
            // TODO: handle exception
            ResultGenerator.fail("截屏异常", "", BaseErrorType.FUNCTION_FAILED);
        }
    }

    //删除screenshot目录下旧的截图
    public void deleteOldScreen(File oldScreen) {
        if (oldScreen.exists() && oldScreen.isDirectory()) {
            File[] files = oldScreen.listFiles();
            for (File file : files) {
                deleteOldScreen(file);
            }
        } else {
            oldScreen.delete();
        }

    }
}
