package cn.itkt.hotel.dto;

import java.io.Serializable;
import java.util.List;

import cn.itkt.core.gson.GsonUtils;
import cn.itkt.core.log.LogManager;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSerializer;

/**
 * web端向pda端响应时的对象（需要经过gson处理后返回给请求段）
  * @类名: PdaResponse.java
  * @描述: xxx
  * 谢亮 ft1040782@163.com 
  * @日期: 2014年8月21日 下午7:55:58
  * @版本:  V1.0
  * ============================================================================
  * 版权所有 2015-2020 芒冠科技股份有限公司,并保留所有权利。
  * ----------------------------------------------------------------------------
  * 提示：未经许可不能随意拷贝复制使用本软件，否则vschool将保留追究的权力。
  * ----------------------------------------------------------------------------
  * 官方网站：http://www.magonchina.com
  * ============================================================================
 */
public class PdaResponse<T> implements Serializable {

    private static final long serialVersionUID = -7816945325851639128L;
    
    private static GsonBuilder gsonBuilder = GsonUtils.createCommonBuilder();
    
    /**
     * 是否成功
     */
    private boolean success;
    
    /**
     * 提示消息
     */
    private String message;
    
    /**
     * 单行数据
     */
    private T data;
    
    /**
	 * 用户类型
	 */
	private String memberType;
	
    /**
     * 查询记录数量
     */
    private long total = 0;
    
    private String code;
    
    public PdaResponse() {
        this(true, "", null,"","");
    }
    
    public PdaResponse(boolean success, String message, T data, String code, String memberType) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.code = code;
        this.memberType = memberType;
    }
    
    public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
    
    public void setResponse(boolean success, T data, String msg, long total, String code, String op, String exception) {
    	this.success = success;
    	this.data = data;
    	this.message = msg;
    	this.total = total;
    	this.code = code;
    	if(success == true){
    		LogManager.logInfo(op, msg);
    	}
    	else {
    		LogManager.logExp(op, msg+exception);
    	}
    }
    
    public void setResponse(boolean success, String memberType,T data, String msg, long total, String code, String op, String exception) {
    	this.success = success;
    	this.memberType = memberType;
    	this.data = data;
    	this.message = msg;
    	this.total = total;
    	this.code = code;
    	if(success == true){
    		LogManager.logInfo(op, msg);
    	}
    	else {
    		LogManager.logExp(op, msg+exception);
    	}
    }

    /**
     * 将本对象以JSON的格式打印出来。
     */
    public String toString() {
//      return this.jsonSer.serialize(this);
        return gsonBuilder.create().toJson(this);
    }
    
    public String toStringOnlyDate() {
        return gsonBuilder.create().toJson(this.data);
    }
    
    public PdaResponse<T> appendJsonIncludes(String... propNames) {
//      for (String propName : propNames) {
//          this.jsonSer.include(propName);
//      }
        return this;
    }
    
    public PdaResponse<T> appendJsonExcludes(final String... propNames) {
//      for (String propName : propNames) {
//          this.jsonSer.exclude(propName);
//      }

        gsonBuilder.addSerializationExclusionStrategy(new ExclusionStrategy() {
            
            @Override
            public boolean shouldSkipField(FieldAttributes attr) {
                for (String propName : propNames) {
                    if (propName.equals(attr)) {
                        return true;
                    }
                }
                return false;
            }
            
            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }
        });
        return this;
    }

    public PdaResponse<T> appendJsonTransformers(JsonSerializer<?> transformer, Class<?> ... classes) {
        for (Class<?> clazz : classes) {
            gsonBuilder.registerTypeHierarchyAdapter(clazz, transformer);
        }
        return this;
    }
}
