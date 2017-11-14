package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class HomePageUI extends BasePageUI {

    public static final CommonUIBean HOME_TAB = new CommonUIBean(GetElementWay.NAME, "HOME", "HOME TAB");
    public static final CommonUIBean WEBVIEW_TAB = new CommonUIBean(GetElementWay.NAME, "Webview", "WEBVIEW TAB");
    public static final CommonUIBean BAIDU_TAB = new CommonUIBean(GetElementWay.NAME, "Baidu", "BAIDU TAB");
    public static final CommonUIBean PERSONAL_TAB = new CommonUIBean(GetElementWay.NAME, "PERSONAL", "PERSONAL TAB");
    public static final CommonUIBean LIST_BTN = new CommonUIBean(GetElementWay.NAME, "list", "首页list按钮");

}
