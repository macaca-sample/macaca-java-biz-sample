package com.javademo.pageuis;

import com.javademo.common.BasePageUI;
import com.javademo.common.CommonUIBean;

import macaca.client.common.GetElementWay;

public class HomeListPageUI extends BasePageUI{

	public static final CommonUIBean LIST_VIEW = new CommonUIBean(GetElementWay.ID, "com.github.android_app_bootstrap:id/listview",GetElementWay.CLASS_NAME,"Table", "list view");
	public static final CommonUIBean CELL = new CommonUIBean(GetElementWay.CLASS_NAME, "android.widget.TextView",GetElementWay.CLASS_NAME,"Cell", "CELL");
}
