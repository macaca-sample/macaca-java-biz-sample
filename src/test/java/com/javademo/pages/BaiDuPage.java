package com.javademo.pages;

import com.javademo.common.BasePage;
import com.javademo.pageuis.BaiDuPageUI;

public class BaiDuPage extends BasePage{

	public BaiDuPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 按照关键字搜索
	 * @param keywords 关键字
	 */
	public void search(String keywords){
		
		driver.inputBean(BaiDuPageUI.SEARCH_FIELD, keywords);
		driver.onclickBean(BaiDuPageUI.SEARCH_BTN);
	}
	
}
