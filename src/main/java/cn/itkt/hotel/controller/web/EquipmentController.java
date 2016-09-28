package cn.itkt.hotel.controller.web;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.dto.PdaRequest;
import cn.itkt.hotel.dto.PdaResponse;
import cn.itkt.hotel.exception.PreconditionCheckFailedException;
import cn.itkt.hotel.local.dto.EquipmentDto;
import cn.itkt.hotel.local.pojo.EquipmentInfo;
import cn.itkt.hotel.local.service.EquipmentService;
import cn.itkt.hotel.util.StringUtil;
import com.google.gson.reflect.TypeToken;

@Controller("equipmentController")
@RequestMapping("/equipment")
public class EquipmentController extends WebContorller {
	@Resource
	private EquipmentService equipmentService;

	@RequestMapping(value = "getList", method = { RequestMethod.POST,
			RequestMethod.GET })
	@ResponseBody
	public String queryEquipmentList(@RequestParam String jsonString) {
		PdaResponse<List<EquipmentDto>> response = new PdaResponse<List<EquipmentDto>>();
		PdaRequest<EquipmentDto> request = new PdaRequest<EquipmentDto>();
		try {
			Type type = new TypeToken<PdaRequest<EquipmentDto>>() {
			}.getType();
			request = gson.fromJson(jsonString, type);
			Pagination page = request.getPagination();
			List<EquipmentDto> dtos = new ArrayList<EquipmentDto>();
			long total = this.equipmentService.queryEquipmentsCount();
			List<EquipmentInfo> list = this.equipmentService
					.queryEquipmentsList(page);
			if (list != null && list.size() > 0) {
				for (EquipmentInfo equi : list) {
					EquipmentDto temp = new EquipmentDto(equi);
					dtos.add(temp);
				}
			}
			response.setResponse(true, dtos, "查询成功！", total, null, null, null);
		} catch (PreconditionCheckFailedException e) {
			response.setResponse(false, null, e.getMessage(), 0, null, null,
					null);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse(false, null, "未知异常！", 0, null, null, null);
		}
		return response.toString();
	}

	@RequestMapping(value = "delete", method = { RequestMethod.POST,
			RequestMethod.GET })
	@ResponseBody
	public String deleteEquipmentInfo(@RequestParam String jsonString) {
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
			EquipmentInfo entity = this.equipmentService
					.queryEquipmentByTid(dto.getTid());
			if (entity != null) {
				this.equipmentService.deleteEquipmentInfo(entity);
				response.setResponse(true, dto, "操作成功！", 0, null, null, null);
			} else {
				throw new PreconditionCheckFailedException("要更新的设备不存在！");
			}

		} catch (PreconditionCheckFailedException e) {
			response.setResponse(false, null, e.getMessage(), 0, null, null,
					null);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse(false, null, "未知异常！", 0, null, null, null);
		}
		return response.toString();
	}

	@RequestMapping(value = "update", method = { RequestMethod.POST,
			RequestMethod.GET })
	@ResponseBody
	public String updateEquipmentInfo(@RequestParam String jsonString) {
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
			EquipmentInfo entity = this.equipmentService
					.queryEquipmentByTid(dto.getTid());
			if (entity != null) {
				this.equipmentService.updateEquipmentInfo(dto);
				response.setResponse(true, dto, "操作成功！", 0, null, null, null);
			} else {
				throw new PreconditionCheckFailedException("要更新的设备不存在！");
			}

		} catch (PreconditionCheckFailedException e) {
			response.setResponse(false, null, e.getMessage(), 0, null, null,
					null);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponse(false, null, "未知异常！", 0, null, null, null);
		}
		return response.toString();
	}

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
