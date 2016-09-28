package cn.itkt.hotel.local.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment", catalog = "vschool_attendanceservice")
public class EquipmentInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Tid;
	private String Name;
	private Integer Type;
	private String Comments;

	/** default constructor */
	public EquipmentInfo() {
	}

	/**
	 * full constructor
	 * 
	 * @param name
	 * @param type
	 * @param comments
	 * @param Id
	 */
	public EquipmentInfo(Integer tid, String name, Integer type, String comments) {
		this.Tid = tid;
		this.Name = name;
		this.Type = type;
		this.Comments = comments;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getTid() {
		return this.Tid;
	}

	public void setTid(Integer tid) {
		this.Tid = tid;
	}

	@Column(name = "Name", length = 36, nullable = false)
	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	@Column(name = "Type", nullable = false)
	public Integer getType() {
		return Type;
	}

	public void setType(Integer type) {
		this.Type = type;
	}

	@Column(name = "Comments", length = 255)
	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}
}
