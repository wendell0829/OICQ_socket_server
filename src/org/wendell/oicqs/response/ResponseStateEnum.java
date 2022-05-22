package org.wendell.oicqs.response;


/*
 * 枚举返回状态
 * 其中各字段意义如下:
 * --success: 是否成功
 * --code:代码(如200表示成功,400表示参数错误)
 * --defaultMessage:默认信息
 * 枚举状态包括:
 * --SUCCESS: 成功
 * --PARAM_ERROR:参数错误
 */
public enum ResponseStateEnum {
	SUCCESS(true, 200, "成功"),
	PARAM_ERROR(false, 400, "参数错误");
	
	public boolean success;
	public int code;
	public String defaultMessage;
	
	private ResponseStateEnum(boolean success, int code, String defaultMessage){
		this.success = success;
		this.code = code;
		this.defaultMessage = defaultMessage;
	}
}
