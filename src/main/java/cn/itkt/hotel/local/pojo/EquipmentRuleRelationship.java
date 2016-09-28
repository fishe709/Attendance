package cn.itkt.hotel.local.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_rule", catalog = "vschool_attendanceservice")
public class EquipmentRuleRelationship implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -734337516158688577L;
	private Integer equiId;
	private Integer ruleId;

	public EquipmentRuleRelationship() {
	}

	public EquipmentRuleRelationship(Integer equiId, Integer ruleId) {
		this.equiId = equiId;
		this.ruleId = ruleId;
	}

	@Id
	@Column(name = "equipment_id", unique = true, nullable = false)
	public Integer getEquiId() {
		return equiId;
	}

	public void setEquiId(Integer equiId) {
		this.equiId = equiId;
	}

	@Column(name = "rule_id", nullable = false)
	public Integer getRuleId() {
		return ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.equiId = ruleId;
	}
}
