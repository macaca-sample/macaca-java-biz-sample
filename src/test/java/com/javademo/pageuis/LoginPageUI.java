package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class LoginPageUI extends BasePageUI {

    public static final CommonUIBean USER_NAME = new CommonUIBean(GetElementWay.ID, "com.github.android_app_bootstrap:id/mobileNoEditText", GetElementWay.NAME, "please input username", "登录用户名输入框");
    public static final CommonUIBean PASSWORD = new CommonUIBean(GetElementWay.ID, "com.github.android_app_bootstrap:id/codeEditText", GetElementWay.NAME, "please input password", "登录密码输入框");
    public static final CommonUIBean LOGIN_BTN = new CommonUIBean(GetElementWay.ID, "com.github.android_app_bootstrap:id/login_button", GetElementWay.NAME, "Login", "登录按钮");
    public static final CommonUIBean KEY_BOARD = new CommonUIBean(GetElementWay.NAME, "Done", "键盘完成按钮");
}
