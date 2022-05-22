package org.wendell.oicqs.response;


/*
 * ����һ�ױ�׼����ֵ,����BLL����USL��֮������ݴ���
 * ��ʽΪ{Boolean success, Integer code, String message, Object data}
 * ���и��ֶ���������:
 * --success: �Ƿ�ɹ�
 * --code:����(��200��ʾ�ɹ�,400��ʾ��������)
 * --message:��Ϣ
 * --data:����Я��������(�����¼ʱ����User����)
 * ʹ��static���������˼��ֳ��÷��ظ�ʽ
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
