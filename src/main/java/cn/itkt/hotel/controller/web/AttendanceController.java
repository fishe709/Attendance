package cn.itkt.hotel.controller.web;

import java.lang.reflect.Type;

import javax.annotation.Resource;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.itkt.hotel.dto.PdaRequest;
import cn.itkt.hotel.dto.PdaResponse;
import cn.itkt.hotel.exception.PreconditionCheckFailedException;
import cn.itkt.hotel.local.pojo.EquipmentInfo;
import cn.itkt.hotel.local.service.EquipmentService;
import cn.itkt.hotel.util.StringUtil;

import com.google.gson.reflect.TypeToken;

@Controller("attendanceController")
public class AttendanceController extends WebContorller {
	@Resource
	private EquipmentService equipmentService;

	@RequestMapping(value = "sysTest", method = { RequestMethod.POST,
			RequestMethod.GET })
	@ResponseBody
	public String sysTest(@RequestParam String jsonString) {
		PdaResponse<EquipmentInfo> response = new PdaResponse<EquipmentInfo>();
		try {
			PdaRequest<EquipmentInfo> request = new PdaRequest<EquipmentInfo>();
			Type type = new TypeToken<PdaRequest<EquipmentInfo>>() {
			}.getType();
			request = gson.fromJson(jsonString, type);
			EquipmentInfo dto = request.getData();

			if (dto == null) {
				throw new PreconditionCheckFailedException("参数不能为空！");
			}
			Integer CardId = dto.getTid();
			System.out.println(CardId);
			EquipmentInfo entity = this.equipmentService
					.queryEquipmentByTid(CardId);
			if (entity != null) {
				throw new PreconditionCheckFailedException("该卡号已绑定！");
			}
			String machineNumber = dto.getName();
			if (StringUtil.isBlank(machineNumber)) {
				throw new PreconditionCheckFailedException("闸机编号不能为空！");
			}
			this.equipmentService.addEquipment(dto);
			response.setResponse(true, dto, "操作成功！", 0, null, null, null);
		} catch (PreconditionCheckFailedException e) {
			response.setResponse(false, null, e.getMessage(), 0, null, null,
					null);
		} catch (DataIntegrityViolationException e) {
			response.setResponse(true, null, "卡号重复！", 0, null, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse(false, null, "未知异常！", 0, null, null, null);
		}
		return response.toString();
	}
}
