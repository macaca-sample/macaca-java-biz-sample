package com.javademo.pages;

import javax.naming.directory.DirContext;

import com.alibaba.fastjson.JSONObject;
import macaca.java.biz.BasePage;
import com.javademo.pageuis.HomeListPageUI;

public class HomeListPage extends BasePage{

	public HomeListPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 上下滑动
	 * @throws Exception
	 */
	public void scroll() throws Exception{

		JSONObject windowSize = driver.getWindowSize();
		int windowWidth = windowSize.getIntValue("width");
		int windowHeight = windowSize.getIntValue("height");

		int centerX=(int)windowWidth/2;
		driver.swipe(centerX,(int)windowHeight-100, centerX, 300, 500);
		driver.sleep(1000);
		driver.swipe(centerX, 300, centerX, (int)windowHeight-100, 500);
	}

	/**
	 * 点击指定的cell
	 * @param index 要点击的cell的index,限可视区域
	 */
	public void onclickOneCell(int index) throws Exception{
		driver.onclickBeanAtIndex(HomeListPageUI.CELL, index);
	}

}
