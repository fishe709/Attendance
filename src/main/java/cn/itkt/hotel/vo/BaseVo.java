package cn.itkt.hotel.vo;

import java.io.Serializable;

/**
 * 类: BaseVo <br>
 * 描述: 基础Vo <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-7-1 上午11:37:02
 */
public class BaseVo implements Serializable {

	private static final long serialVersionUID = -3629746599884885316L;
	
	/** 状态码 */
	private String statusCode;
    /** 提示信息 */
    private String message;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
