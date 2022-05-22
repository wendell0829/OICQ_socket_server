package org.wendell.oicqs.response;


/*
 * 定义一套标准返回值,用于BLL层与USL层之间的数据传递
 * 格式为{Boolean success, Integer code, String message, Object data}
 * 其中各字段意义如下:
 * --success: 是否成功
 * --code:代码(如200表示成功,400表示参数错误)
 * --message:信息
 * --data:可能携带的数据(比如登录时返回User对象)
 * 使用static方法创建了几种常用返回格式
 */
public class Response {
	private boolean success;
	private int code;
	private String message;
	private Object data;
	private Object[] dataList;
	
	public Response() {
	}
	
	public Response(boolean success, int code, String message, Object data) {
		this.success = success;
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public Response(boolean success, int code, String message, Object[] dataList) {
		this.success = success;
		this.code = code;
		this.message = message;
		this.dataList = dataList;
	}
	
	public Response(boolean success, int code, String message) {
		this.success = success;
		this.code = code;
		this.message = message;
	}
	
	public static Response successResponse() {
		return new Response(ResponseStateEnum.SUCCESS.success, 
				ResponseStateEnum.SUCCESS.code,
				ResponseStateEnum.SUCCESS.defaultMessage);
	}
	
	public static Response successResponse(Object data) {
		return new Response(ResponseStateEnum.SUCCESS.success, 
				ResponseStateEnum.SUCCESS.code,
				ResponseStateEnum.SUCCESS.defaultMessage,
				data);
	}
	
	public static Response successResponse(Object[] dataList) {
		return new Response(ResponseStateEnum.SUCCESS.success, 
				ResponseStateEnum.SUCCESS.code,
				ResponseStateEnum.SUCCESS.defaultMessage,
				dataList);
	}
	
	public static Response errorResponse() {
		return new Response(ResponseStateEnum.PARAM_ERROR.success, 
				ResponseStateEnum.PARAM_ERROR.code,
				ResponseStateEnum.PARAM_ERROR.defaultMessage);
	}
	
	public static Response errorResponse(String message) {
		return new Response(ResponseStateEnum.PARAM_ERROR.success, 
				ResponseStateEnum.PARAM_ERROR.code,
				message);
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}

	public Object[] getDataList() {
		return dataList;
	}

	public void setDataList(Object[] dataList) {
		this.dataList = dataList;
	}
	
}
