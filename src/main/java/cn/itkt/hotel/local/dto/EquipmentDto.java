package cn.itkt.hotel.local.dto;

import java.io.Serializable;
import cn.itkt.hotel.local.pojo.EquipmentInfo;
import cn.itkt.hotel.util.StringUtil;

public class EquipmentDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2221319918602867884L;
	private Integer Tid;
	private String Name;
	private Integer Type;
	private String Comments;

	public Integer getTid() {
		return this.Tid;
	}

	public void setTid(Integer tid) {
		this.Tid = tid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getType() {
		return Type;
	}

	public void setType(Integer type) {
		Type = type;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public EquipmentDto() {
		super();
	}

	public EquipmentDto(Integer tid, String name, Integer type, String comments) {
		this.Tid = tid;
		this.Name = name;
		this.Type = type;
		this.Comments = comments;
	}

	public EquipmentDto(EquipmentInfo entity) {
		if (entity.getTid() != null) {
			this.Tid = entity.getTid();
		}
		if (StringUtil.isNotBlank(entity.getName())) {
			this.Name = entity.getName();
		}
		if (entity.getType() != null) {
			this.Type = entity.getType();
		}
		if (StringUtil.isNotBlank(entity.getComments())) {
			this.Comments = entity.getComments();
		}
	}
	/*
	 * public String getNumber() { return Number; }
	 * 
	 * public void setNumber(String number) { Number = number; }
	 */
}
