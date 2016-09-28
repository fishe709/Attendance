package cn.itkt.hotel.mongodb.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CpTrucktype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CP_TRUCKTYPE", schema = "ERIJSHY")
public class CpTrucktype implements java.io.Serializable {

	// Fields    

	private BigDecimal id;
	private String code;
	private String name;
	private String foreignname;
	private BigDecimal nodetype;
	private BigDecimal status;
	private BigDecimal createbyid;
	private Timestamp createtime;
	private BigDecimal updatebyid;
	private Timestamp updatetime;
	private String notes;
	private String foreignnotes;
	private BigDecimal untukloadstd;
	private Double trucklen;
	private Double truckwid;
	private String assistcode;
	private BigDecimal istrail;
	private Double truckhig;
	private String longnotes;
	private BigDecimal linestatus;
	private BigDecimal level;
	private BigDecimal tleft;
	private BigDecimal tright;
	private BigDecimal parentid;

	// Constructors

	/** default constructor */
	public CpTrucktype() {
	}

	/** minimal constructor */
	public CpTrucktype(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public CpTrucktype(BigDecimal id, String code, String name, String foreignname, BigDecimal nodetype, BigDecimal status,
			BigDecimal createbyid, Timestamp createtime, BigDecimal updatebyid, Timestamp updatetime, String notes, String foreignnotes,
			BigDecimal untukloadstd, Double trucklen, Double truckwid, String assistcode, BigDecimal istrail, Double truckhig,
			String longnotes, BigDecimal linestatus, BigDecimal level, BigDecimal tleft, BigDecimal tright, BigDecimal parentid) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.foreignname = foreignname;
		this.nodetype = nodetype;
		this.status = status;
		this.createbyid = createbyid;
		this.createtime = createtime;
		this.updatebyid = updatebyid;
		this.updatetime = updatetime;
		this.notes = notes;
		this.foreignnotes = foreignnotes;
		this.untukloadstd = untukloadstd;
		this.trucklen = trucklen;
		this.truckwid = truckwid;
		this.assistcode = assistcode;
		this.istrail = istrail;
		this.truckhig = truckhig;
		this.longnotes = longnotes;
		this.linestatus = linestatus;
		this.level = level;
		this.tleft = tleft;
		this.tright = tright;
		this.parentid = parentid;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "CODE")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "FOREIGNNAME")
	public String getForeignname() {
		return this.foreignname;
	}

	public void setForeignname(String foreignname) {
		this.foreignname = foreignname;
	}

	@Column(name = "NODETYPE", precision = 22, scale = 0)
	public BigDecimal getNodetype() {
		return this.nodetype;
	}

	public void setNodetype(BigDecimal nodetype) {
		this.nodetype = nodetype;
	}

	@Column(name = "STATUS", precision = 22, scale = 0)
	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	@Column(name = "CREATEBYID", precision = 22, scale = 0)
	public BigDecimal getCreatebyid() {
		return this.createbyid;
	}

	public void setCreatebyid(BigDecimal createbyid) {
		this.createbyid = createbyid;
	}

	@Column(name = "CREATETIME", length = 11)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Column(name = "UPDATEBYID", precision = 22, scale = 0)
	public BigDecimal getUpdatebyid() {
		return this.updatebyid;
	}

	public void setUpdatebyid(BigDecimal updatebyid) {
		this.updatebyid = updatebyid;
	}

	@Column(name = "UPDATETIME", length = 11)
	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "NOTES")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "FOREIGNNOTES")
	public String getForeignnotes() {
		return this.foreignnotes;
	}

	public void setForeignnotes(String foreignnotes) {
		this.foreignnotes = foreignnotes;
	}

	@Column(name = "UNTUKLOADSTD", precision = 22, scale = 0)
	public BigDecimal getUntukloadstd() {
		return this.untukloadstd;
	}

	public void setUntukloadstd(BigDecimal untukloadstd) {
		this.untukloadstd = untukloadstd;
	}

	@Column(name = "TRUCKLEN", precision = 16, scale = 4)
	public Double getTrucklen() {
		return this.trucklen;
	}

	public void setTrucklen(Double trucklen) {
		this.trucklen = trucklen;
	}

	@Column(name = "TRUCKWID", precision = 16, scale = 4)
	public Double getTruckwid() {
		return this.truckwid;
	}

	public void setTruckwid(Double truckwid) {
		this.truckwid = truckwid;
	}

	@Column(name = "ASSISTCODE", length = 100)
	public String getAssistcode() {
		return this.assistcode;
	}

	public void setAssistcode(String assistcode) {
		this.assistcode = assistcode;
	}

	@Column(name = "ISTRAIL", precision = 22, scale = 0)
	public BigDecimal getIstrail() {
		return this.istrail;
	}

	public void setIstrail(BigDecimal istrail) {
		this.istrail = istrail;
	}

	@Column(name = "TRUCKHIG", precision = 16, scale = 4)
	public Double getTruckhig() {
		return this.truckhig;
	}

	public void setTruckhig(Double truckhig) {
		this.truckhig = truckhig;
	}

	@Column(name = "LONGNOTES", length = 250)
	public String getLongnotes() {
		return this.longnotes;
	}

	public void setLongnotes(String longnotes) {
		this.longnotes = longnotes;
	}

	@Column(name = "LINESTATUS", precision = 22, scale = 0)
	public BigDecimal getLinestatus() {
		return this.linestatus;
	}

	public void setLinestatus(BigDecimal linestatus) {
		this.linestatus = linestatus;
	}

	@Column(name = "LEVEL", precision = 22, scale = 0)
	public BigDecimal getLevel() {
		return this.level;
	}

	public void setLevel(BigDecimal level) {
		this.level = level;
	}

	@Column(name = "TLEFT", precision = 22, scale = 0)
	public BigDecimal getTleft() {
		return this.tleft;
	}

	public void setTleft(BigDecimal tleft) {
		this.tleft = tleft;
	}

	@Column(name = "TRIGHT", precision = 22, scale = 0)
	public BigDecimal getTright() {
		return this.tright;
	}

	public void setTright(BigDecimal tright) {
		this.tright = tright;
	}

	@Column(name = "PARENTID", precision = 22, scale = 0)
	public BigDecimal getParentid() {
		return this.parentid;
	}

	public void setParentid(BigDecimal parentid) {
		this.parentid = parentid;
	}

}