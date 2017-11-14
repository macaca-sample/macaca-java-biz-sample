package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class WebviewPageUI extends BasePageUI {

    public static final CommonUIBean WEB_VIEW_TITLE = new CommonUIBean(GetElementWay.ID, "com.github.android_app_bootstrap:id/title_text", GetElementWay.NAME, "pushView", "webViewTitle");
    public static final CommonUIBean PUSH_VIEW = new CommonUIBean(GetElementWay.ID, "pushView", GetElementWay.NAME, "pushView", "pushview");
    public static final CommonUIBean POP_VIEW = new CommonUIBean(GetElementWay.ID, "popView", GetElementWay.NAME, "popView", "popView");
    public static final CommonUIBean SET_TITLE = new CommonUIBean(GetElementWay.ID, "setTitle", GetElementWay.NAME, "setTitle", "setTitle");

}
