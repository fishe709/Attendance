package cn.itkt.hotel.mongodb.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LsTrucklist entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "LS_TRUCKLIST", schema = "ERIJSHY")
public class LsTrucklist implements java.io.Serializable {

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
	private String itrucksn;
	private BigDecimal trucktyid;
	private String trucknum;
	private BigDecimal ownerty;
	private BigDecimal truckstatus;
	private BigDecimal rentBeid;
	private Timestamp rentsdate;
	private Timestamp rentedate;
	private BigDecimal renterid;
	private BigDecimal trucktradeid;
	private String truckmodel;
	private String enginesn;
	private String vehiclesn;
	private Timestamp productdate;
	private BigDecimal istrail;
	private BigDecimal dfttrucktrailid;
	private BigDecimal untukloadstd;
	private Double trucklen;
	private Double truckwid;
	private Double truckhig;
	private Timestamp purdate;
	private String carcolor;
	private Double mantannums;
	private BigDecimal unmantan;
	private BigDecimal mantanalert;
	private BigDecimal ismantanalert;
	private BigDecimal plantid;
	private BigDecimal rentadvdays;
	private BigDecimal cooprBeid;
	private BigDecimal cooprerid;
	private Timestamp cooprsdate;
	private BigDecimal coopradvdays;
	private Timestamp cooprddate;
	private String assistcode;
	private String longnotes;
	private BigDecimal linestatus;
	private Double fixedload;
	private Double fixedvolume;
	private BigDecimal iscold;
	private BigDecimal isdanger;
	private BigDecimal iscontainer;
	private BigDecimal ccid;
//	private BigDecimal level;
	private BigDecimal tleft;
	private BigDecimal tright;
	private BigDecimal parentid;
	private BigDecimal drivers;
	private BigDecimal ownership;
	private BigDecimal vehiclestate;
	private BigDecimal currentOrgId;
	private BigDecimal currentAreaId;

	// Constructors

	/** default constructor */
	public LsTrucklist() {
	}

	/** minimal constructor */
	public LsTrucklist(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public LsTrucklist(BigDecimal id, String code, String name, String foreignname, BigDecimal nodetype, BigDecimal status,
			BigDecimal createbyid, Timestamp createtime, BigDecimal updatebyid, Timestamp updatetime, String notes, String foreignnotes,
			String itrucksn, BigDecimal trucktyid, String trucknum, BigDecimal ownerty, BigDecimal truckstatus, BigDecimal rentBeid,
			Timestamp rentsdate, Timestamp rentedate, BigDecimal renterid, BigDecimal trucktradeid, String truckmodel, String enginesn,
			String vehiclesn, Timestamp productdate, BigDecimal istrail, BigDecimal dfttrucktrailid, BigDecimal untukloadstd,
			Double trucklen, Double truckwid, Double truckhig, Timestamp purdate, String carcolor, Double mantannums, BigDecimal unmantan,
			BigDecimal mantanalert, BigDecimal ismantanalert, BigDecimal plantid, BigDecimal rentadvdays, BigDecimal cooprBeid,
			BigDecimal cooprerid, Timestamp cooprsdate, BigDecimal coopradvdays, Timestamp cooprddate, String assistcode, String longnotes,
			BigDecimal linestatus, Double fixedload, Double fixedvolume, BigDecimal iscold, BigDecimal isdanger, BigDecimal iscontainer,
			BigDecimal ccid, BigDecimal level, BigDecimal tleft, BigDecimal tright, BigDecimal parentid, BigDecimal drivers,
			BigDecimal ownership, BigDecimal vehiclestate, BigDecimal currentOrgId, BigDecimal currentAreaId) {
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
		this.itrucksn = itrucksn;
		this.trucktyid = trucktyid;
		this.trucknum = trucknum;
		this.ownerty = ownerty;
		this.truckstatus = truckstatus;
		this.rentBeid = rentBeid;
		this.rentsdate = rentsdate;
		this.rentedate = rentedate;
		this.renterid = renterid;
		this.trucktradeid = trucktradeid;
		this.truckmodel = truckmodel;
		this.enginesn = enginesn;
		this.vehiclesn = vehiclesn;
		this.productdate = productdate;
		this.istrail = istrail;
		this.dfttrucktrailid = dfttrucktrailid;
		this.untukloadstd = untukloadstd;
		this.trucklen = trucklen;
		this.truckwid = truckwid;
		this.truckhig = truckhig;
		this.purdate = purdate;
		this.carcolor = carcolor;
		this.mantannums = mantannums;
		this.unmantan = unmantan;
		this.mantanalert = mantanalert;
		this.ismantanalert = ismantanalert;
		this.plantid = plantid;
		this.rentadvdays = rentadvdays;
		this.cooprBeid = cooprBeid;
		this.cooprerid = cooprerid;
		this.cooprsdate = cooprsdate;
		this.coopradvdays = coopradvdays;
		this.cooprddate = cooprddate;
		this.assistcode = assistcode;
		this.longnotes = longnotes;
		this.linestatus = linestatus;
		this.fixedload = fixedload;
		this.fixedvolume = fixedvolume;
		this.iscold = iscold;
		this.isdanger = isdanger;
		this.iscontainer = iscontainer;
		this.ccid = ccid;
//		this.level = level;
		this.tleft = tleft;
		this.tright = tright;
		this.parentid = parentid;
		this.drivers = drivers;
		this.ownership = ownership;
		this.vehiclestate = vehiclestate;
		this.currentOrgId = currentOrgId;
		this.currentAreaId = currentAreaId;
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

	@Column(name = "ITRUCKSN", length = 100)
	public String getItrucksn() {
		return this.itrucksn;
	}

	public void setItrucksn(String itrucksn) {
		this.itrucksn = itrucksn;
	}

	@Column(name = "TRUCKTYID", precision = 22, scale = 0)
	public BigDecimal getTrucktyid() {
		return this.trucktyid;
	}

	public void setTrucktyid(BigDecimal trucktyid) {
		this.trucktyid = trucktyid;
	}

	@Column(name = "TRUCKNUM", length = 100)
	public String getTrucknum() {
		return this.trucknum;
	}

	public void setTrucknum(String trucknum) {
		this.trucknum = trucknum;
	}

	@Column(name = "OWNERTY", precision = 22, scale = 0)
	public BigDecimal getOwnerty() {
		return this.ownerty;
	}

	public void setOwnerty(BigDecimal ownerty) {
		this.ownerty = ownerty;
	}

	@Column(name = "TRUCKSTATUS", precision = 22, scale = 0)
	public BigDecimal getTruckstatus() {
		return this.truckstatus;
	}

	public void setTruckstatus(BigDecimal truckstatus) {
		this.truckstatus = truckstatus;
	}

	@Column(name = "RENT_BEID", precision = 22, scale = 0)
	public BigDecimal getRentBeid() {
		return this.rentBeid;
	}

	public void setRentBeid(BigDecimal rentBeid) {
		this.rentBeid = rentBeid;
	}

	@Column(name = "RENTSDATE", length = 7)
	public Timestamp getRentsdate() {
		return this.rentsdate;
	}

	public void setRentsdate(Timestamp rentsdate) {
		this.rentsdate = rentsdate;
	}

	@Column(name = "RENTEDATE", length = 7)
	public Timestamp getRentedate() {
		return this.rentedate;
	}

	public void setRentedate(Timestamp rentedate) {
		this.rentedate = rentedate;
	}

	@Column(name = "RENTERID", precision = 22, scale = 0)
	public BigDecimal getRenterid() {
		return this.renterid;
	}

	public void setRenterid(BigDecimal renterid) {
		this.renterid = renterid;
	}

	@Column(name = "TRUCKTRADEID", precision = 22, scale = 0)
	public BigDecimal getTrucktradeid() {
		return this.trucktradeid;
	}

	public void setTrucktradeid(BigDecimal trucktradeid) {
		this.trucktradeid = trucktradeid;
	}

	@Column(name = "TRUCKMODEL", length = 100)
	public String getTruckmodel() {
		return this.truckmodel;
	}

	public void setTruckmodel(String truckmodel) {
		this.truckmodel = truckmodel;
	}

	@Column(name = "ENGINESN", length = 100)
	public String getEnginesn() {
		return this.enginesn;
	}

	public void setEnginesn(String enginesn) {
		this.enginesn = enginesn;
	}

	@Column(name = "VEHICLESN", length = 100)
	public String getVehiclesn() {
		return this.vehiclesn;
	}

	public void setVehiclesn(String vehiclesn) {
		this.vehiclesn = vehiclesn;
	}

	@Column(name = "PRODUCTDATE", length = 7)
	public Timestamp getProductdate() {
		return this.productdate;
	}

	public void setProductdate(Timestamp productdate) {
		this.productdate = productdate;
	}

	@Column(name = "ISTRAIL", precision = 22, scale = 0)
	public BigDecimal getIstrail() {
		return this.istrail;
	}

	public void setIstrail(BigDecimal istrail) {
		this.istrail = istrail;
	}

	@Column(name = "DFTTRUCKTRAILID", precision = 22, scale = 0)
	public BigDecimal getDfttrucktrailid() {
		return this.dfttrucktrailid;
	}

	public void setDfttrucktrailid(BigDecimal dfttrucktrailid) {
		this.dfttrucktrailid = dfttrucktrailid;
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

	@Column(name = "TRUCKHIG", precision = 16, scale = 4)
	public Double getTruckhig() {
		return this.truckhig;
	}

	public void setTruckhig(Double truckhig) {
		this.truckhig = truckhig;
	}

	@Column(name = "PURDATE", length = 7)
	public Timestamp getPurdate() {
		return this.purdate;
	}

	public void setPurdate(Timestamp purdate) {
		this.purdate = purdate;
	}

	@Column(name = "CARCOLOR", length = 100)
	public String getCarcolor() {
		return this.carcolor;
	}

	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}

	@Column(name = "MANTANNUMS", precision = 16, scale = 4)
	public Double getMantannums() {
		return this.mantannums;
	}

	public void setMantannums(Double mantannums) {
		this.mantannums = mantannums;
	}

	@Column(name = "UNMANTAN", precision = 22, scale = 0)
	public BigDecimal getUnmantan() {
		return this.unmantan;
	}

	public void setUnmantan(BigDecimal unmantan) {
		this.unmantan = unmantan;
	}

	@Column(name = "MANTANALERT", precision = 22, scale = 0)
	public BigDecimal getMantanalert() {
		return this.mantanalert;
	}

	public void setMantanalert(BigDecimal mantanalert) {
		this.mantanalert = mantanalert;
	}

	@Column(name = "ISMANTANALERT", precision = 22, scale = 0)
	public BigDecimal getIsmantanalert() {
		return this.ismantanalert;
	}

	public void setIsmantanalert(BigDecimal ismantanalert) {
		this.ismantanalert = ismantanalert;
	}

	@Column(name = "PLANTID", precision = 22, scale = 0)
	public BigDecimal getPlantid() {
		return this.plantid;
	}

	public void setPlantid(BigDecimal plantid) {
		this.plantid = plantid;
	}

	@Column(name = "RENTADVDAYS", precision = 22, scale = 0)
	public BigDecimal getRentadvdays() {
		return this.rentadvdays;
	}

	public void setRentadvdays(BigDecimal rentadvdays) {
		this.rentadvdays = rentadvdays;
	}

	@Column(name = "COOPR_BEID", precision = 22, scale = 0)
	public BigDecimal getCooprBeid() {
		return this.cooprBeid;
	}

	public void setCooprBeid(BigDecimal cooprBeid) {
		this.cooprBeid = cooprBeid;
	}

	@Column(name = "COOPRERID", precision = 22, scale = 0)
	public BigDecimal getCooprerid() {
		return this.cooprerid;
	}

	public void setCooprerid(BigDecimal cooprerid) {
		this.cooprerid = cooprerid;
	}

	@Column(name = "COOPRSDATE", length = 7)
	public Timestamp getCooprsdate() {
		return this.cooprsdate;
	}

	public void setCooprsdate(Timestamp cooprsdate) {
		this.cooprsdate = cooprsdate;
	}

	@Column(name = "COOPRADVDAYS", precision = 22, scale = 0)
	public BigDecimal getCoopradvdays() {
		return this.coopradvdays;
	}

	public void setCoopradvdays(BigDecimal coopradvdays) {
		this.coopradvdays = coopradvdays;
	}

	@Column(name = "COOPRDDATE", length = 7)
	public Timestamp getCooprddate() {
		return this.cooprddate;
	}

	public void setCooprddate(Timestamp cooprddate) {
		this.cooprddate = cooprddate;
	}

	@Column(name = "ASSISTCODE", length = 100)
	public String getAssistcode() {
		return this.assistcode;
	}

	public void setAssistcode(String assistcode) {
		this.assistcode = assistcode;
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

	@Column(name = "FIXEDLOAD", precision = 16)
	public Double getFixedload() {
		return this.fixedload;
	}

	public void setFixedload(Double fixedload) {
		this.fixedload = fixedload;
	}

	@Column(name = "FIXEDVOLUME", precision = 16)
	public Double getFixedvolume() {
		return this.fixedvolume;
	}

	public void setFixedvolume(Double fixedvolume) {
		this.fixedvolume = fixedvolume;
	}

	@Column(name = "ISCOLD", precision = 22, scale = 0)
	public BigDecimal getIscold() {
		return this.iscold;
	}

	public void setIscold(BigDecimal iscold) {
		this.iscold = iscold;
	}

	@Column(name = "ISDANGER", precision = 22, scale = 0)
	public BigDecimal getIsdanger() {
		return this.isdanger;
	}

	public void setIsdanger(BigDecimal isdanger) {
		this.isdanger = isdanger;
	}

	@Column(name = "ISCONTAINER", precision = 22, scale = 0)
	public BigDecimal getIscontainer() {
		return this.iscontainer;
	}

	public void setIscontainer(BigDecimal iscontainer) {
		this.iscontainer = iscontainer;
	}

	@Column(name = "CCID", precision = 22, scale = 0)
	public BigDecimal getCcid() {
		return this.ccid;
	}

	public void setCcid(BigDecimal ccid) {
		this.ccid = ccid;
	}

/*	@Column(name = "LEVEL", precision = 22, scale = 0)
	public BigDecimal getLevel() {
		return this.level;
	}

	public void setLevel(BigDecimal level) {
		this.level = level;
	}*/

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

	@Column(name = "DRIVERS", precision = 22, scale = 0)
	public BigDecimal getDrivers() {
		return this.drivers;
	}

	public void setDrivers(BigDecimal drivers) {
		this.drivers = drivers;
	}

	@Column(name = "OWNERSHIP", precision = 22, scale = 0)
	public BigDecimal getOwnership() {
		return this.ownership;
	}

	public void setOwnership(BigDecimal ownership) {
		this.ownership = ownership;
	}

	@Column(name = "VEHICLESTATE", precision = 22, scale = 0)
	public BigDecimal getVehiclestate() {
		return this.vehiclestate;
	}

	public void setVehiclestate(BigDecimal vehiclestate) {
		this.vehiclestate = vehiclestate;
	}

	@Column(name = "CURRENT_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(BigDecimal currentOrgId) {
		this.currentOrgId = currentOrgId;
	}

	@Column(name = "CURRENT_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getCurrentAreaId() {
		return this.currentAreaId;
	}

	public void setCurrentAreaId(BigDecimal currentAreaId) {
		this.currentAreaId = currentAreaId;
	}

}