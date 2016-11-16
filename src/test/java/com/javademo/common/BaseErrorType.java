package com.javademo.common;

public enum BaseErrorType {

	/**
	* 错误码根据自身需求分类
	*/
	//业务相关
	FUNCTION_FAILED( 3001, "其他异常--" ),	
	ELEMENT_NOT_FOUND(3004, "未找到控件"),
	PAGE_NOT_LOAD(3006,"页面未加载"),
	//平台相关
	INSTALL_FAIL(1011, "安装失败");	
	
	
	private int id;
	private String desc;
	
	private BaseErrorType(int id, String desc){
		this.id = id;
		this.desc = desc;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getDesc(){
		return this.desc;
	}
}
