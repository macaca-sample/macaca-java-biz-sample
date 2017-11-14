package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.PersonalPageUI;

public class PersonalPage extends BasePage {

    public PersonalPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    /**
     * 执行登出操作
     *
     * @throws Exception
     */
    public void logout() throws Exception {
        driver.onclickBean(PersonalPageUI.LOG_OUT_BTN);
    }

}
