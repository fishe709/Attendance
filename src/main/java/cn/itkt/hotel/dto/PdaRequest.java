package cn.itkt.hotel.dto;

import java.io.Serializable;

import cn.itkt.core.dao.persistence.Pagination;

/**
 * PDA请求对象
  * @类名: PdaRequest.java
  * @描述: xxx
  * @作者: 谢亮
  * @日期: 2014年8月21日 下午7:52:20
  * @版本:  V1.0
 
 */
public  class PdaRequest<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 932755814693221291L;
	
	/**
	 * 请求用户ID
	 */
	private String uuId;
	
	/**
	 * 用户类型
	 */
	private String memberType;
    
    /**
     * 请求的其他信息
     */
    private T data;
    
    /**
     * 分页对象。如果返回对象PdaResponse的data为list，则此参数有效。
     */
    private Pagination pagination;
    
    /**
	 * 来源（WEB端值为WEB,Android端为ANDROID,IOS端为IOS）
	 */
	private String originApp;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public String getOriginApp() {
		return originApp;
	}

	public void setOriginApp(String originApp) {
		this.originApp = originApp;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	
	
}
