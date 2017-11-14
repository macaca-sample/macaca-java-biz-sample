package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class BaiDuPageUI extends BasePageUI {

    public static final CommonUIBean SEARCH_FIELD = new CommonUIBean(GetElementWay.CLASS_NAME, "android.widget.EditText", GetElementWay.CLASS_NAME, "TextField", "搜索框");
    public static final CommonUIBean SEARCH_BTN = new CommonUIBean(GetElementWay.CSS, "#index-bn", GetElementWay.NAME, "百度一下", "搜索按钮");
    public static final CommonUIBean USER_LOGIN_BEAN = new CommonUIBean(GetElementWay.CSS, "#login", "右上角登录按钮");
}
