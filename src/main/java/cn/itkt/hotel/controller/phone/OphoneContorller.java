package cn.itkt.hotel.controller.phone;

import java.lang.reflect.Type;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import cn.itkt.core.gson.GsonUtils;
import cn.itkt.hotel.dto.PdaRequest;
import cn.itkt.hotel.exception.InfoException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@RequestMapping("/mobile/")
public class OphoneContorller{
	
	
	public Gson gson;
	
	public OphoneContorller(){
       if (gson == null) {
           gson = GsonUtils.createCommonBuilder().create();
       }
	}
	
	public <T> PdaRequest<T> checkPrecondition(String jsonString, PdaRequest<T> request){
		if(StringUtils.isBlank(jsonString)){
			throw new InfoException("请求参数不能为空!");
		}
		Type type = new TypeToken<PdaRequest<T>>(){}.getType();
		request = gson.fromJson(jsonString, type);
		String originApp = request.getOriginApp();
		if(StringUtils.isBlank(originApp)){
			throw new InfoException("数据来源不能为空!");
		}
		return request;
	}

}
