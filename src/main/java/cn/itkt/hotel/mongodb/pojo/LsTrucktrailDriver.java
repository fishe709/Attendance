package cn.itkt.hotel.mongodb.pojo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LsTrucktrailDriver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "LS_TRUCKTRAIL_DRIVER", schema = "ERIJSHY")
public class LsTrucktrailDriver implements java.io.Serializable {

	// Fields    

	private BigDecimal billdtlid;
	private BigDecimal id;
	private BigDecimal lsmantyid;
	private BigDecimal isstaff;
	private BigDecimal staffid;
	private String lsman;
	private BigDecimal cercardid;
	private BigDecimal cardtyid;
	private String notemems;
	private BigDecimal rowno2;
	private String idcardsn;
	private String cercardsn;

	// Constructors

	/** default constructor */
	public LsTrucktrailDriver() {
	}

	/** minimal constructor */
	public LsTrucktrailDriver(BigDecimal billdtlid) {
		this.billdtlid = billdtlid;
	}

	/** full constructor */
	public LsTrucktrailDriver(BigDecimal billdtlid, BigDecimal id, BigDecimal lsmantyid, BigDecimal isstaff, BigDecimal staffid,
			String lsman, BigDecimal cercardid, BigDecimal cardtyid, String notemems, BigDecimal rowno2, String idcardsn, String cercardsn) {
		this.billdtlid = billdtlid;
		this.id = id;
		this.lsmantyid = lsmantyid;
		this.isstaff = isstaff;
		this.staffid = staffid;
		this.lsman = lsman;
		this.cercardid = cercardid;
		this.cardtyid = cardtyid;
		this.notemems = notemems;
		this.rowno2 = rowno2;
		this.idcardsn = idcardsn;
		this.cercardsn = cercardsn;
	}

	// Property accessors
	@Id
	@Column(name = "BILLDTLID", precision = 22, scale = 0)
	public BigDecimal getBilldtlid() {
		return this.billdtlid;
	}

	public void setBilldtlid(BigDecimal billdtlid) {
		this.billdtlid = billdtlid;
	}

	@Column(name = "ID", precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "LSMANTYID", precision = 22, scale = 0)
	public BigDecimal getLsmantyid() {
		return this.lsmantyid;
	}

	public void setLsmantyid(BigDecimal lsmantyid) {
		this.lsmantyid = lsmantyid;
	}

	@Column(name = "ISSTAFF", precision = 22, scale = 0)
	public BigDecimal getIsstaff() {
		return this.isstaff;
	}

	public void setIsstaff(BigDecimal isstaff) {
		this.isstaff = isstaff;
	}

	@Column(name = "STAFFID", precision = 22, scale = 0)
	public BigDecimal getStaffid() {
		return this.staffid;
	}

	public void setStaffid(BigDecimal staffid) {
		this.staffid = staffid;
	}

	@Column(name = "LSMAN", length = 100)
	public String getLsman() {
		return this.lsman;
	}

	public void setLsman(String lsman) {
		this.lsman = lsman;
	}

	@Column(name = "CERCARDID", precision = 22, scale = 0)
	public BigDecimal getCercardid() {
		return this.cercardid;
	}

	public void setCercardid(BigDecimal cercardid) {
		this.cercardid = cercardid;
	}

	@Column(name = "CARDTYID", precision = 22, scale = 0)
	public BigDecimal getCardtyid() {
		return this.cardtyid;
	}

	public void setCardtyid(BigDecimal cardtyid) {
		this.cardtyid = cardtyid;
	}

	@Column(name = "NOTEMEMS", length = 100)
	public String getNotemems() {
		return this.notemems;
	}

	public void setNotemems(String notemems) {
		this.notemems = notemems;
	}

	@Column(name = "ROWNO2", precision = 22, scale = 0)
	public BigDecimal getRowno2() {
		return this.rowno2;
	}

	public void setRowno2(BigDecimal rowno2) {
		this.rowno2 = rowno2;
	}

	@Column(name = "IDCARDSN", length = 100)
	public String getIdcardsn() {
		return this.idcardsn;
	}

	public void setIdcardsn(String idcardsn) {
		this.idcardsn = idcardsn;
	}

	@Column(name = "CERCARDSN", length = 100)
	public String getCercardsn() {
		return this.cercardsn;
	}

	public void setCercardsn(String cercardsn) {
		this.cercardsn = cercardsn;
	}

}