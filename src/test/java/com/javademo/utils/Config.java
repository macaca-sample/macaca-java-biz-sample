package com.javademo.utils;

import java.io.File;


public class Config {

    // 根目录
    public static final String ROOT_PATH = System.getProperty("user.dir");
    //截图保存目录
    public static final String SCREEN_SHOT_PATH = ROOT_PATH + File.separator + "screenshot";
    //结果日志保存文件
    public static final String RESULT_LOG_PATH = ROOT_PATH + File.separator + "result.log";

    // 用户名
    public static final String USER_NAME = "username";
    // 密码
    public static final String PASSWORD = "password";
    // 目标平台- ios android
    public static final String PLATFORM = "ios";
    // 是否覆盖安装 3-覆盖安装
    public static final int REUSE = 1;

    // ios平台相关信息 各参数含义参考 https://macacajs.github.io/macaca/desired-caps.html
    public static final String IOS_PLATFORM_NAME = "ios";
    public static final String IOS_DEVICE_NAME = "iPhone 6s";
    public static final String IOS_APP = "https://npmcdn.com/ios-app-bootstrap@latest/build/ios-app-bootstrap.zip";
//    public static final String IOS_UDID = "3458343D-AFB1-46E1-BE33-99E04B2DE07";

    // 安卓平台相关信息
    public static final String ADR_PLATFORM_NAME = "Android";
    public static final String ADR_APP = ROOT_PATH + File.separator + "app/android-app-bootstrap.zip";
    // 多台设备时，如果指定某一台设备可以在这里指定udid
    public static final String ADR_UDID = "";

}
