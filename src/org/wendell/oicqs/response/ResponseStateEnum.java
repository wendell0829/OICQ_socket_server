package org.wendell.oicqs.response;


/*
 * ö�ٷ���״̬
 * ���и��ֶ���������:
 * --success: �Ƿ�ɹ�
 * --code:����(��200��ʾ�ɹ�,400��ʾ��������)
 * --defaultMessage:Ĭ����Ϣ
 * ö��״̬����:
 * --SUCCESS: �ɹ�
 * --PARAM_ERROR:��������
 */
public enum ResponseStateEnum {
	SUCCESS(true, 200, "�ɹ�"),
	PARAM_ERROR(false, 400, "��������");
	
	public boolean success;
	public int code;
	public String defaultMessage;
	
	private ResponseStateEnum(boolean success, int code, String defaultMessage){
		this.success = success;
		this.code = code;
		this.defaultMessage = defaultMessage;
	}
}
