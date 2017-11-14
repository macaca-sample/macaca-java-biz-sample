package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.LoginPageUI;

public class LoginPage extends BasePage {

    public LoginPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    // 登录操作
    public void login(String username, String password) {
        driver.inputBean(LoginPageUI.USER_NAME, username);
        driver.inputBean(LoginPageUI.PASSWORD, password);
        driver.onclickBean(LoginPageUI.KEY_BOARD);
        driver.onclickBean(LoginPageUI.LOGIN_BTN);
    }
}
