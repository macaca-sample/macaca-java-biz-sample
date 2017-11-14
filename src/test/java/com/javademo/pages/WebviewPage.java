package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.WebviewPageUI;

public class WebviewPage extends BasePage {

    public WebviewPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    /**
     * 点击pushView
     */
    public void pushView() {
        driver.onclickBean(WebviewPageUI.PUSH_VIEW);
    }

    /**
     * 点击popView
     */
    public void popView() {
        driver.onclickBean(WebviewPageUI.POP_VIEW);
    }

    /**
     * 修改标题
     */
    public void setTitle() {
        driver.onclickBean(WebviewPageUI.SET_TITLE);
    }
}
