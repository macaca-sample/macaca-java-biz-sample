package com.javademo.common;

import java.io.File;


public class Config {

   // 根目录
   public static final String RootPath                 = System.getProperty("user.dir");
   //截图保存目录
   public static final String ScreenshotPath           = RootPath + File.separator + "screenshot";
   //结果日志保存文件
   public static final String ResultLogPath            = RootPath + File.separator + "result.log";
   
   // 用户名
   public static final String USER_NAME = "username";
   // 密码
   public static final String PASSWORD = "password";
   // 目标平台- ios android
   public static final String PLATFORM = "android";
   // 是否覆盖安装 3-覆盖安装
   public static final String REUSE = "3";
   
   // ios平台相关信息 各参数含义参考 https://macacajs.github.io/macaca/desired-caps.html
   public static final String IOS_PLATFORM_VERSION = "9.2";
   public static final String IOS_PLATFORM_NAME = "iOS";
   public static final String IOS_DEVICE_NAME = "iPhone 6";
   public static final String IOS_APP = RootPath + File.separator + "app/ios-app-bootstrap.zip";
   public static final String IOS_UDID = "6FB69785-8E9B-4F56-8BC0-DFBE1ECD3F3B";
   
   // 安卓平台相关信息
   public static final String ADR_PLATFORM_NAME = "Android";
   public static final String ADR_APP = RootPath + File.separator + "app/android-app-bootstrap.zip";
   // 多台设备时，如果指定某一台设备可以在这里指定udid
   public static final String ADR_UDID = "";
   
  
   
}