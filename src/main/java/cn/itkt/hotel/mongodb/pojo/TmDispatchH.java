package cn.itkt.hotel.mongodb.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TmDispatchH entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "TM_DISPATCH_H", schema = "ERIJSHY")
public class TmDispatchH implements java.io.Serializable {

	// Fields    

	private BigDecimal billid;
	private BigDecimal billtype;
	private BigDecimal sequence;
	private BigDecimal maker;
	private BigDecimal ccid;
	private BigDecimal mender;
	private Timestamp makedate;
	private Timestamp editdate;
	private String dhDispatchNo;
	private BigDecimal status;
	private BigDecimal dhOrgId;
	private String dhRelegateTo;
	private BigDecimal dhCarrierId;
	private String dhTruckCategory;
	private BigDecimal dhTruckId;
	private String dhTruckLicenseNo;
	private BigDecimal dhRouteId;
	private Double dhLoadWeight;
	private Double dhLoadWeightPercent;
	private Double dhLoadCubage;
	private Double dhLoadCubagePercent;
	private BigDecimal dhStartAreaId;
	private BigDecimal dhEndAreaId;
	private Timestamp dhDispatchDatetime;
	private Timestamp dhDispatchDate;
	private String dhRemark;
	private Timestamp dhDepartDatetime;
	private Timestamp dhDepartDate;
	private Timestamp dhFinishDatetime;
	private Timestamp dhFinishDate;
	private Timestamp dhLatestTraceDatetime;
	private String dhLatestLocation;
	private Double dhLatestSpeed;
	private String dhLatestTraceRemark;
	private BigDecimal dhPrimaryDriverId;
	private String dhPrimaryDriver;
	private String dhPrimaryTel;
	private String dhPrimaryIdNo;
	private BigDecimal dhSecondaryDriverId;
	private String dhSecondaryDriver;
	private String dhSecondaryTel;
	private String dhSecondaryIdNo;
	private BigDecimal dhEscortStaffId;
	private String dhEscortStaff;
	private String dhEscortTel;
	private String dhEscortIdNo;
	private String dhCargoLoadNo;
	private String dhConsignOrderNo;
	private String dhConsignerNo;
	private BigDecimal dhConsignerId;
	private String dhType;
	private BigDecimal dhCollectAreaId;
	private BigDecimal dhTransferUnloadOrgId;
	private String dhCollectAddress;
	private Timestamp dhActualDate;
	private String dhViaOrgsString;
	private String dhBackViaOrgsString;
	private String dhTransportMethod;
	private Double dhNormalLoadWeight;
	private Double dhNormalLoadCubage;
	private String dhRoadNo;
	private String dhTrainNo;
	private String dhFlightNo;
	private String dhVesselName;
	private String dhVoyageNo;
	private Timestamp dhExpectDepartDatetime;
	private Timestamp dhExpectDepartDate;
	private Timestamp dhArriveDatetime;
	private Timestamp dhArriveDate;
	private Timestamp dhBackDatetime;
	private Timestamp dhBackDate;
	private String dhArriveType;
	private BigDecimal dhArriveOrgId;
	private BigDecimal dhArriveAreaId;
	private Double dhEmptyDistance;
	private Double dhFullDistance;
	private String dhWaveNo;
	private Double dhBackNormalLoadCubage;
	private Double dhBackNormalLoadWeight;
	private BigDecimal dhTrailerId;
	private String dhTrailerLicenseNo;
	private BigDecimal dhBackTrailerId;
	private String dhBackTrailerLicenseNo;
	private Double dhBackLoadCubagePercent;
	private Double dhBackLoadCubage;
	private Double dhBackLoadWeight;
	private Double dhBackLoadWeightPercent;
	private BigDecimal dispatchtype;
	private String dhYclx;
	private BigDecimal cx;
	private Double czc;
	private Double czk;
	private Double czg;
	private Double czz;
	private BigDecimal dhJfzfyf;
	private BigDecimal dhJsddlx;
	private BigDecimal dhJyms;
	private BigDecimal linshiche;
	private Timestamp cldcsj;
	private Timestamp yjcldcsj;

	// Constructors

	/** default constructor */
	public TmDispatchH() {
	}

	/** minimal constructor */
	public TmDispatchH(BigDecimal billid) {
		this.billid = billid;
	}

	/** full constructor */
	public TmDispatchH(BigDecimal billid, BigDecimal billtype, BigDecimal sequence, BigDecimal maker, BigDecimal ccid, BigDecimal mender,
			Timestamp makedate, Timestamp editdate, String dhDispatchNo, BigDecimal status, BigDecimal dhOrgId, String dhRelegateTo,
			BigDecimal dhCarrierId, String dhTruckCategory, BigDecimal dhTruckId, String dhTruckLicenseNo, BigDecimal dhRouteId,
			Double dhLoadWeight, Double dhLoadWeightPercent, Double dhLoadCubage, Double dhLoadCubagePercent, BigDecimal dhStartAreaId,
			BigDecimal dhEndAreaId, Timestamp dhDispatchDatetime, Timestamp dhDispatchDate, String dhRemark, Timestamp dhDepartDatetime,
			Timestamp dhDepartDate, Timestamp dhFinishDatetime, Timestamp dhFinishDate, Timestamp dhLatestTraceDatetime,
			String dhLatestLocation, Double dhLatestSpeed, String dhLatestTraceRemark, BigDecimal dhPrimaryDriverId,
			String dhPrimaryDriver, String dhPrimaryTel, String dhPrimaryIdNo, BigDecimal dhSecondaryDriverId, String dhSecondaryDriver,
			String dhSecondaryTel, String dhSecondaryIdNo, BigDecimal dhEscortStaffId, String dhEscortStaff, String dhEscortTel,
			String dhEscortIdNo, String dhCargoLoadNo, String dhConsignOrderNo, String dhConsignerNo, BigDecimal dhConsignerId,
			String dhType, BigDecimal dhCollectAreaId, BigDecimal dhTransferUnloadOrgId, String dhCollectAddress, Timestamp dhActualDate,
			String dhViaOrgsString, String dhBackViaOrgsString, String dhTransportMethod, Double dhNormalLoadWeight,
			Double dhNormalLoadCubage, String dhRoadNo, String dhTrainNo, String dhFlightNo, String dhVesselName, String dhVoyageNo,
			Timestamp dhExpectDepartDatetime, Timestamp dhExpectDepartDate, Timestamp dhArriveDatetime, Timestamp dhArriveDate,
			Timestamp dhBackDatetime, Timestamp dhBackDate, String dhArriveType, BigDecimal dhArriveOrgId, BigDecimal dhArriveAreaId,
			Double dhEmptyDistance, Double dhFullDistance, String dhWaveNo, Double dhBackNormalLoadCubage, Double dhBackNormalLoadWeight,
			BigDecimal dhTrailerId, String dhTrailerLicenseNo, BigDecimal dhBackTrailerId, String dhBackTrailerLicenseNo,
			Double dhBackLoadCubagePercent, Double dhBackLoadCubage, Double dhBackLoadWeight, Double dhBackLoadWeightPercent,
			BigDecimal dispatchtype, String dhYclx, BigDecimal cx, Double czc, Double czk, Double czg, Double czz, BigDecimal dhJfzfyf,
			BigDecimal dhJsddlx, BigDecimal dhJyms, BigDecimal linshiche, Timestamp cldcsj, Timestamp yjcldcsj) {
		this.billid = billid;
		this.billtype = billtype;
		this.sequence = sequence;
		this.maker = maker;
		this.ccid = ccid;
		this.mender = mender;
		this.makedate = makedate;
		this.editdate = editdate;
		this.dhDispatchNo = dhDispatchNo;
		this.status = status;
		this.dhOrgId = dhOrgId;
		this.dhRelegateTo = dhRelegateTo;
		this.dhCarrierId = dhCarrierId;
		this.dhTruckCategory = dhTruckCategory;
		this.dhTruckId = dhTruckId;
		this.dhTruckLicenseNo = dhTruckLicenseNo;
		this.dhRouteId = dhRouteId;
		this.dhLoadWeight = dhLoadWeight;
		this.dhLoadWeightPercent = dhLoadWeightPercent;
		this.dhLoadCubage = dhLoadCubage;
		this.dhLoadCubagePercent = dhLoadCubagePercent;
		this.dhStartAreaId = dhStartAreaId;
		this.dhEndAreaId = dhEndAreaId;
		this.dhDispatchDatetime = dhDispatchDatetime;
		this.dhDispatchDate = dhDispatchDate;
		this.dhRemark = dhRemark;
		this.dhDepartDatetime = dhDepartDatetime;
		this.dhDepartDate = dhDepartDate;
		this.dhFinishDatetime = dhFinishDatetime;
		this.dhFinishDate = dhFinishDate;
		this.dhLatestTraceDatetime = dhLatestTraceDatetime;
		this.dhLatestLocation = dhLatestLocation;
		this.dhLatestSpeed = dhLatestSpeed;
		this.dhLatestTraceRemark = dhLatestTraceRemark;
		this.dhPrimaryDriverId = dhPrimaryDriverId;
		this.dhPrimaryDriver = dhPrimaryDriver;
		this.dhPrimaryTel = dhPrimaryTel;
		this.dhPrimaryIdNo = dhPrimaryIdNo;
		this.dhSecondaryDriverId = dhSecondaryDriverId;
		this.dhSecondaryDriver = dhSecondaryDriver;
		this.dhSecondaryTel = dhSecondaryTel;
		this.dhSecondaryIdNo = dhSecondaryIdNo;
		this.dhEscortStaffId = dhEscortStaffId;
		this.dhEscortStaff = dhEscortStaff;
		this.dhEscortTel = dhEscortTel;
		this.dhEscortIdNo = dhEscortIdNo;
		this.dhCargoLoadNo = dhCargoLoadNo;
		this.dhConsignOrderNo = dhConsignOrderNo;
		this.dhConsignerNo = dhConsignerNo;
		this.dhConsignerId = dhConsignerId;
		this.dhType = dhType;
		this.dhCollectAreaId = dhCollectAreaId;
		this.dhTransferUnloadOrgId = dhTransferUnloadOrgId;
		this.dhCollectAddress = dhCollectAddress;
		this.dhActualDate = dhActualDate;
		this.dhViaOrgsString = dhViaOrgsString;
		this.dhBackViaOrgsString = dhBackViaOrgsString;
		this.dhTransportMethod = dhTransportMethod;
		this.dhNormalLoadWeight = dhNormalLoadWeight;
		this.dhNormalLoadCubage = dhNormalLoadCubage;
		this.dhRoadNo = dhRoadNo;
		this.dhTrainNo = dhTrainNo;
		this.dhFlightNo = dhFlightNo;
		this.dhVesselName = dhVesselName;
		this.dhVoyageNo = dhVoyageNo;
		this.dhExpectDepartDatetime = dhExpectDepartDatetime;
		this.dhExpectDepartDate = dhExpectDepartDate;
		this.dhArriveDatetime = dhArriveDatetime;
		this.dhArriveDate = dhArriveDate;
		this.dhBackDatetime = dhBackDatetime;
		this.dhBackDate = dhBackDate;
		this.dhArriveType = dhArriveType;
		this.dhArriveOrgId = dhArriveOrgId;
		this.dhArriveAreaId = dhArriveAreaId;
		this.dhEmptyDistance = dhEmptyDistance;
		this.dhFullDistance = dhFullDistance;
		this.dhWaveNo = dhWaveNo;
		this.dhBackNormalLoadCubage = dhBackNormalLoadCubage;
		this.dhBackNormalLoadWeight = dhBackNormalLoadWeight;
		this.dhTrailerId = dhTrailerId;
		this.dhTrailerLicenseNo = dhTrailerLicenseNo;
		this.dhBackTrailerId = dhBackTrailerId;
		this.dhBackTrailerLicenseNo = dhBackTrailerLicenseNo;
		this.dhBackLoadCubagePercent = dhBackLoadCubagePercent;
		this.dhBackLoadCubage = dhBackLoadCubage;
		this.dhBackLoadWeight = dhBackLoadWeight;
		this.dhBackLoadWeightPercent = dhBackLoadWeightPercent;
		this.dispatchtype = dispatchtype;
		this.dhYclx = dhYclx;
		this.cx = cx;
		this.czc = czc;
		this.czk = czk;
		this.czg = czg;
		this.czz = czz;
		this.dhJfzfyf = dhJfzfyf;
		this.dhJsddlx = dhJsddlx;
		this.dhJyms = dhJyms;
		this.linshiche = linshiche;
		this.cldcsj = cldcsj;
		this.yjcldcsj = yjcldcsj;
	}

	// Property accessors
	@Id
	@Column(name = "BILLID", precision = 22, scale = 0)
	public BigDecimal getBillid() {
		return this.billid;
	}

	public void setBillid(BigDecimal billid) {
		this.billid = billid;
	}

	@Column(name = "BILLTYPE", precision = 22, scale = 0)
	public BigDecimal getBilltype() {
		return this.billtype;
	}

	public void setBilltype(BigDecimal billtype) {
		this.billtype = billtype;
	}

	@Column(name = "SEQUENCE", precision = 22, scale = 0)
	public BigDecimal getSequence() {
		return this.sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}

	@Column(name = "MAKER", precision = 22, scale = 0)
	public BigDecimal getMaker() {
		return this.maker;
	}

	public void setMaker(BigDecimal maker) {
		this.maker = maker;
	}

	@Column(name = "CCID", precision = 22, scale = 0)
	public BigDecimal getCcid() {
		return this.ccid;
	}

	public void setCcid(BigDecimal ccid) {
		this.ccid = ccid;
	}

	@Column(name = "MENDER", precision = 22, scale = 0)
	public BigDecimal getMender() {
		return this.mender;
	}

	public void setMender(BigDecimal mender) {
		this.mender = mender;
	}

	@Column(name = "MAKEDATE", length = 11)
	public Timestamp getMakedate() {
		return this.makedate;
	}

	public void setMakedate(Timestamp makedate) {
		this.makedate = makedate;
	}

	@Column(name = "EDITDATE", length = 11)
	public Timestamp getEditdate() {
		return this.editdate;
	}

	public void setEditdate(Timestamp editdate) {
		this.editdate = editdate;
	}

	@Column(name = "DH_DISPATCH_NO", length = 80)
	public String getDhDispatchNo() {
		return this.dhDispatchNo;
	}

	public void setDhDispatchNo(String dhDispatchNo) {
		this.dhDispatchNo = dhDispatchNo;
	}

	@Column(name = "STATUS", precision = 22, scale = 0)
	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	@Column(name = "DH_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getDhOrgId() {
		return this.dhOrgId;
	}

	public void setDhOrgId(BigDecimal dhOrgId) {
		this.dhOrgId = dhOrgId;
	}

	@Column(name = "DH_RELEGATE_TO")
	public String getDhRelegateTo() {
		return this.dhRelegateTo;
	}

	public void setDhRelegateTo(String dhRelegateTo) {
		this.dhRelegateTo = dhRelegateTo;
	}

	@Column(name = "DH_CARRIER_ID", precision = 22, scale = 0)
	public BigDecimal getDhCarrierId() {
		return this.dhCarrierId;
	}

	public void setDhCarrierId(BigDecimal dhCarrierId) {
		this.dhCarrierId = dhCarrierId;
	}

	@Column(name = "DH_TRUCK_CATEGORY", length = 100)
	public String getDhTruckCategory() {
		return this.dhTruckCategory;
	}

	public void setDhTruckCategory(String dhTruckCategory) {
		this.dhTruckCategory = dhTruckCategory;
	}

	@Column(name = "DH_TRUCK_ID", precision = 22, scale = 0)
	public BigDecimal getDhTruckId() {
		return this.dhTruckId;
	}

	public void setDhTruckId(BigDecimal dhTruckId) {
		this.dhTruckId = dhTruckId;
	}

	@Column(name = "DH_TRUCK_LICENSE_NO", length = 80)
	public String getDhTruckLicenseNo() {
		return this.dhTruckLicenseNo;
	}

	public void setDhTruckLicenseNo(String dhTruckLicenseNo) {
		this.dhTruckLicenseNo = dhTruckLicenseNo;
	}

	@Column(name = "DH_ROUTE_ID", precision = 22, scale = 0)
	public BigDecimal getDhRouteId() {
		return this.dhRouteId;
	}

	public void setDhRouteId(BigDecimal dhRouteId) {
		this.dhRouteId = dhRouteId;
	}

	@Column(name = "DH_LOAD_WEIGHT", precision = 18, scale = 6)
	public Double getDhLoadWeight() {
		return this.dhLoadWeight;
	}

	public void setDhLoadWeight(Double dhLoadWeight) {
		this.dhLoadWeight = dhLoadWeight;
	}

	@Column(name = "DH_LOAD_WEIGHT_PERCENT", precision = 18, scale = 6)
	public Double getDhLoadWeightPercent() {
		return this.dhLoadWeightPercent;
	}

	public void setDhLoadWeightPercent(Double dhLoadWeightPercent) {
		this.dhLoadWeightPercent = dhLoadWeightPercent;
	}

	@Column(name = "DH_LOAD_CUBAGE", precision = 18, scale = 6)
	public Double getDhLoadCubage() {
		return this.dhLoadCubage;
	}

	public void setDhLoadCubage(Double dhLoadCubage) {
		this.dhLoadCubage = dhLoadCubage;
	}

	@Column(name = "DH_LOAD_CUBAGE_PERCENT", precision = 18, scale = 6)
	public Double getDhLoadCubagePercent() {
		return this.dhLoadCubagePercent;
	}

	public void setDhLoadCubagePercent(Double dhLoadCubagePercent) {
		this.dhLoadCubagePercent = dhLoadCubagePercent;
	}

	@Column(name = "DH_START_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getDhStartAreaId() {
		return this.dhStartAreaId;
	}

	public void setDhStartAreaId(BigDecimal dhStartAreaId) {
		this.dhStartAreaId = dhStartAreaId;
	}

	@Column(name = "DH_END_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getDhEndAreaId() {
		return this.dhEndAreaId;
	}

	public void setDhEndAreaId(BigDecimal dhEndAreaId) {
		this.dhEndAreaId = dhEndAreaId;
	}

	@Column(name = "DH_DISPATCH_DATETIME", length = 11)
	public Timestamp getDhDispatchDatetime() {
		return this.dhDispatchDatetime;
	}

	public void setDhDispatchDatetime(Timestamp dhDispatchDatetime) {
		this.dhDispatchDatetime = dhDispatchDatetime;
	}

	@Column(name = "DH_DISPATCH_DATE", length = 7)
	public Timestamp getDhDispatchDate() {
		return this.dhDispatchDate;
	}

	public void setDhDispatchDate(Timestamp dhDispatchDate) {
		this.dhDispatchDate = dhDispatchDate;
	}

	@Column(name = "DH_REMARK", length = 400)
	public String getDhRemark() {
		return this.dhRemark;
	}

	public void setDhRemark(String dhRemark) {
		this.dhRemark = dhRemark;
	}

	@Column(name = "DH_DEPART_DATETIME", length = 11)
	public Timestamp getDhDepartDatetime() {
		return this.dhDepartDatetime;
	}

	public void setDhDepartDatetime(Timestamp dhDepartDatetime) {
		this.dhDepartDatetime = dhDepartDatetime;
	}

	@Column(name = "DH_DEPART_DATE", length = 7)
	public Timestamp getDhDepartDate() {
		return this.dhDepartDate;
	}

	public void setDhDepartDate(Timestamp dhDepartDate) {
		this.dhDepartDate = dhDepartDate;
	}

	@Column(name = "DH_FINISH_DATETIME", length = 11)
	public Timestamp getDhFinishDatetime() {
		return this.dhFinishDatetime;
	}

	public void setDhFinishDatetime(Timestamp dhFinishDatetime) {
		this.dhFinishDatetime = dhFinishDatetime;
	}

	@Column(name = "DH_FINISH_DATE", length = 7)
	public Timestamp getDhFinishDate() {
		return this.dhFinishDate;
	}

	public void setDhFinishDate(Timestamp dhFinishDate) {
		this.dhFinishDate = dhFinishDate;
	}

	@Column(name = "DH_LATEST_TRACE_DATETIME", length = 11)
	public Timestamp getDhLatestTraceDatetime() {
		return this.dhLatestTraceDatetime;
	}

	public void setDhLatestTraceDatetime(Timestamp dhLatestTraceDatetime) {
		this.dhLatestTraceDatetime = dhLatestTraceDatetime;
	}

	@Column(name = "DH_LATEST_LOCATION", length = 200)
	public String getDhLatestLocation() {
		return this.dhLatestLocation;
	}

	public void setDhLatestLocation(String dhLatestLocation) {
		this.dhLatestLocation = dhLatestLocation;
	}

	@Column(name = "DH_LATEST_SPEED", precision = 7, scale = 3)
	public Double getDhLatestSpeed() {
		return this.dhLatestSpeed;
	}

	public void setDhLatestSpeed(Double dhLatestSpeed) {
		this.dhLatestSpeed = dhLatestSpeed;
	}

	@Column(name = "DH_LATEST_TRACE_REMARK")
	public String getDhLatestTraceRemark() {
		return this.dhLatestTraceRemark;
	}

	public void setDhLatestTraceRemark(String dhLatestTraceRemark) {
		this.dhLatestTraceRemark = dhLatestTraceRemark;
	}

	@Column(name = "DH_PRIMARY_DRIVER_ID", precision = 22, scale = 0)
	public BigDecimal getDhPrimaryDriverId() {
		return this.dhPrimaryDriverId;
	}

	public void setDhPrimaryDriverId(BigDecimal dhPrimaryDriverId) {
		this.dhPrimaryDriverId = dhPrimaryDriverId;
	}

	@Column(name = "DH_PRIMARY_DRIVER", length = 200)
	public String getDhPrimaryDriver() {
		return this.dhPrimaryDriver;
	}

	public void setDhPrimaryDriver(String dhPrimaryDriver) {
		this.dhPrimaryDriver = dhPrimaryDriver;
	}

	@Column(name = "DH_PRIMARY_TEL", length = 200)
	public String getDhPrimaryTel() {
		return this.dhPrimaryTel;
	}

	public void setDhPrimaryTel(String dhPrimaryTel) {
		this.dhPrimaryTel = dhPrimaryTel;
	}

	@Column(name = "DH_PRIMARY_ID_NO", length = 200)
	public String getDhPrimaryIdNo() {
		return this.dhPrimaryIdNo;
	}

	public void setDhPrimaryIdNo(String dhPrimaryIdNo) {
		this.dhPrimaryIdNo = dhPrimaryIdNo;
	}

	@Column(name = "DH_SECONDARY_DRIVER_ID", precision = 22, scale = 0)
	public BigDecimal getDhSecondaryDriverId() {
		return this.dhSecondaryDriverId;
	}

	public void setDhSecondaryDriverId(BigDecimal dhSecondaryDriverId) {
		this.dhSecondaryDriverId = dhSecondaryDriverId;
	}

	@Column(name = "DH_SECONDARY_DRIVER", length = 200)
	public String getDhSecondaryDriver() {
		return this.dhSecondaryDriver;
	}

	public void setDhSecondaryDriver(String dhSecondaryDriver) {
		this.dhSecondaryDriver = dhSecondaryDriver;
	}

	@Column(name = "DH_SECONDARY_TEL", length = 200)
	public String getDhSecondaryTel() {
		return this.dhSecondaryTel;
	}

	public void setDhSecondaryTel(String dhSecondaryTel) {
		this.dhSecondaryTel = dhSecondaryTel;
	}

	@Column(name = "DH_SECONDARY_ID_NO", length = 200)
	public String getDhSecondaryIdNo() {
		return this.dhSecondaryIdNo;
	}

	public void setDhSecondaryIdNo(String dhSecondaryIdNo) {
		this.dhSecondaryIdNo = dhSecondaryIdNo;
	}

	@Column(name = "DH_ESCORT_STAFF_ID", precision = 22, scale = 0)
	public BigDecimal getDhEscortStaffId() {
		return this.dhEscortStaffId;
	}

	public void setDhEscortStaffId(BigDecimal dhEscortStaffId) {
		this.dhEscortStaffId = dhEscortStaffId;
	}

	@Column(name = "DH_ESCORT_STAFF", length = 200)
	public String getDhEscortStaff() {
		return this.dhEscortStaff;
	}

	public void setDhEscortStaff(String dhEscortStaff) {
		this.dhEscortStaff = dhEscortStaff;
	}

	@Column(name = "DH_ESCORT_TEL", length = 200)
	public String getDhEscortTel() {
		return this.dhEscortTel;
	}

	public void setDhEscortTel(String dhEscortTel) {
		this.dhEscortTel = dhEscortTel;
	}

	@Column(name = "DH_ESCORT_ID_NO", length = 200)
	public String getDhEscortIdNo() {
		return this.dhEscortIdNo;
	}

	public void setDhEscortIdNo(String dhEscortIdNo) {
		this.dhEscortIdNo = dhEscortIdNo;
	}

	@Column(name = "DH_CARGO_LOAD_NO", length = 100)
	public String getDhCargoLoadNo() {
		return this.dhCargoLoadNo;
	}

	public void setDhCargoLoadNo(String dhCargoLoadNo) {
		this.dhCargoLoadNo = dhCargoLoadNo;
	}

	@Column(name = "DH_CONSIGN_ORDER_NO", length = 100)
	public String getDhConsignOrderNo() {
		return this.dhConsignOrderNo;
	}

	public void setDhConsignOrderNo(String dhConsignOrderNo) {
		this.dhConsignOrderNo = dhConsignOrderNo;
	}

	@Column(name = "DH_CONSIGNER_NO", length = 100)
	public String getDhConsignerNo() {
		return this.dhConsignerNo;
	}

	public void setDhConsignerNo(String dhConsignerNo) {
		this.dhConsignerNo = dhConsignerNo;
	}

	@Column(name = "DH_CONSIGNER_ID", precision = 22, scale = 0)
	public BigDecimal getDhConsignerId() {
		return this.dhConsignerId;
	}

	public void setDhConsignerId(BigDecimal dhConsignerId) {
		this.dhConsignerId = dhConsignerId;
	}

	@Column(name = "DH_TYPE", length = 100)
	public String getDhType() {
		return this.dhType;
	}

	public void setDhType(String dhType) {
		this.dhType = dhType;
	}

	@Column(name = "DH_COLLECT_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getDhCollectAreaId() {
		return this.dhCollectAreaId;
	}

	public void setDhCollectAreaId(BigDecimal dhCollectAreaId) {
		this.dhCollectAreaId = dhCollectAreaId;
	}

	@Column(name = "DH_TRANSFER_UNLOAD_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getDhTransferUnloadOrgId() {
		return this.dhTransferUnloadOrgId;
	}

	public void setDhTransferUnloadOrgId(BigDecimal dhTransferUnloadOrgId) {
		this.dhTransferUnloadOrgId = dhTransferUnloadOrgId;
	}

	@Column(name = "DH_COLLECT_ADDRESS", length = 400)
	public String getDhCollectAddress() {
		return this.dhCollectAddress;
	}

	public void setDhCollectAddress(String dhCollectAddress) {
		this.dhCollectAddress = dhCollectAddress;
	}

	@Column(name = "DH_ACTUAL_DATE", length = 7)
	public Timestamp getDhActualDate() {
		return this.dhActualDate;
	}

	public void setDhActualDate(Timestamp dhActualDate) {
		this.dhActualDate = dhActualDate;
	}

	@Column(name = "DH_VIA_ORGS_STRING", length = 100)
	public String getDhViaOrgsString() {
		return this.dhViaOrgsString;
	}

	public void setDhViaOrgsString(String dhViaOrgsString) {
		this.dhViaOrgsString = dhViaOrgsString;
	}

	@Column(name = "DH_BACK_VIA_ORGS_STRING", length = 1000)
	public String getDhBackViaOrgsString() {
		return this.dhBackViaOrgsString;
	}

	public void setDhBackViaOrgsString(String dhBackViaOrgsString) {
		this.dhBackViaOrgsString = dhBackViaOrgsString;
	}

	@Column(name = "DH_TRANSPORT_METHOD")
	public String getDhTransportMethod() {
		return this.dhTransportMethod;
	}

	public void setDhTransportMethod(String dhTransportMethod) {
		this.dhTransportMethod = dhTransportMethod;
	}

	@Column(name = "DH_NORMAL_LOAD_WEIGHT", precision = 16, scale = 6)
	public Double getDhNormalLoadWeight() {
		return this.dhNormalLoadWeight;
	}

	public void setDhNormalLoadWeight(Double dhNormalLoadWeight) {
		this.dhNormalLoadWeight = dhNormalLoadWeight;
	}

	@Column(name = "DH_NORMAL_LOAD_CUBAGE", precision = 16, scale = 6)
	public Double getDhNormalLoadCubage() {
		return this.dhNormalLoadCubage;
	}

	public void setDhNormalLoadCubage(Double dhNormalLoadCubage) {
		this.dhNormalLoadCubage = dhNormalLoadCubage;
	}

	@Column(name = "DH_ROAD_NO", length = 100)
	public String getDhRoadNo() {
		return this.dhRoadNo;
	}

	public void setDhRoadNo(String dhRoadNo) {
		this.dhRoadNo = dhRoadNo;
	}

	@Column(name = "DH_TRAIN_NO", length = 100)
	public String getDhTrainNo() {
		return this.dhTrainNo;
	}

	public void setDhTrainNo(String dhTrainNo) {
		this.dhTrainNo = dhTrainNo;
	}

	@Column(name = "DH_FLIGHT_NO", length = 100)
	public String getDhFlightNo() {
		return this.dhFlightNo;
	}

	public void setDhFlightNo(String dhFlightNo) {
		this.dhFlightNo = dhFlightNo;
	}

	@Column(name = "DH_VESSEL_NAME", length = 100)
	public String getDhVesselName() {
		return this.dhVesselName;
	}

	public void setDhVesselName(String dhVesselName) {
		this.dhVesselName = dhVesselName;
	}

	@Column(name = "DH_VOYAGE_NO", length = 100)
	public String getDhVoyageNo() {
		return this.dhVoyageNo;
	}

	public void setDhVoyageNo(String dhVoyageNo) {
		this.dhVoyageNo = dhVoyageNo;
	}

	@Column(name = "DH_EXPECT_DEPART_DATETIME", length = 11)
	public Timestamp getDhExpectDepartDatetime() {
		return this.dhExpectDepartDatetime;
	}

	public void setDhExpectDepartDatetime(Timestamp dhExpectDepartDatetime) {
		this.dhExpectDepartDatetime = dhExpectDepartDatetime;
	}

	@Column(name = "DH_EXPECT_DEPART_DATE", length = 7)
	public Timestamp getDhExpectDepartDate() {
		return this.dhExpectDepartDate;
	}

	public void setDhExpectDepartDate(Timestamp dhExpectDepartDate) {
		this.dhExpectDepartDate = dhExpectDepartDate;
	}

	@Column(name = "DH_ARRIVE_DATETIME", length = 11)
	public Timestamp getDhArriveDatetime() {
		return this.dhArriveDatetime;
	}

	public void setDhArriveDatetime(Timestamp dhArriveDatetime) {
		this.dhArriveDatetime = dhArriveDatetime;
	}

	@Column(name = "DH_ARRIVE_DATE", length = 7)
	public Timestamp getDhArriveDate() {
		return this.dhArriveDate;
	}

	public void setDhArriveDate(Timestamp dhArriveDate) {
		this.dhArriveDate = dhArriveDate;
	}

	@Column(name = "DH_BACK_DATETIME", length = 11)
	public Timestamp getDhBackDatetime() {
		return this.dhBackDatetime;
	}

	public void setDhBackDatetime(Timestamp dhBackDatetime) {
		this.dhBackDatetime = dhBackDatetime;
	}

	@Column(name = "DH_BACK_DATE", length = 7)
	public Timestamp getDhBackDate() {
		return this.dhBackDate;
	}

	public void setDhBackDate(Timestamp dhBackDate) {
		this.dhBackDate = dhBackDate;
	}

	@Column(name = "DH_ARRIVE_TYPE", length = 100)
	public String getDhArriveType() {
		return this.dhArriveType;
	}

	public void setDhArriveType(String dhArriveType) {
		this.dhArriveType = dhArriveType;
	}

	@Column(name = "DH_ARRIVE_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getDhArriveOrgId() {
		return this.dhArriveOrgId;
	}

	public void setDhArriveOrgId(BigDecimal dhArriveOrgId) {
		this.dhArriveOrgId = dhArriveOrgId;
	}

	@Column(name = "DH_ARRIVE_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getDhArriveAreaId() {
		return this.dhArriveAreaId;
	}

	public void setDhArriveAreaId(BigDecimal dhArriveAreaId) {
		this.dhArriveAreaId = dhArriveAreaId;
	}

	@Column(name = "DH_EMPTY_DISTANCE", precision = 18, scale = 6)
	public Double getDhEmptyDistance() {
		return this.dhEmptyDistance;
	}

	public void setDhEmptyDistance(Double dhEmptyDistance) {
		this.dhEmptyDistance = dhEmptyDistance;
	}

	@Column(name = "DH_FULL_DISTANCE", precision = 18, scale = 6)
	public Double getDhFullDistance() {
		return this.dhFullDistance;
	}

	public void setDhFullDistance(Double dhFullDistance) {
		this.dhFullDistance = dhFullDistance;
	}

	@Column(name = "DH_WAVE_NO", length = 100)
	public String getDhWaveNo() {
		return this.dhWaveNo;
	}

	public void setDhWaveNo(String dhWaveNo) {
		this.dhWaveNo = dhWaveNo;
	}

	@Column(name = "DH_BACK_NORMAL_LOAD_CUBAGE", precision = 16, scale = 6)
	public Double getDhBackNormalLoadCubage() {
		return this.dhBackNormalLoadCubage;
	}

	public void setDhBackNormalLoadCubage(Double dhBackNormalLoadCubage) {
		this.dhBackNormalLoadCubage = dhBackNormalLoadCubage;
	}

	@Column(name = "DH_BACK_NORMAL_LOAD_WEIGHT", precision = 16, scale = 6)
	public Double getDhBackNormalLoadWeight() {
		return this.dhBackNormalLoadWeight;
	}

	public void setDhBackNormalLoadWeight(Double dhBackNormalLoadWeight) {
		this.dhBackNormalLoadWeight = dhBackNormalLoadWeight;
	}

	@Column(name = "DH_TRAILER_ID", precision = 22, scale = 0)
	public BigDecimal getDhTrailerId() {
		return this.dhTrailerId;
	}

	public void setDhTrailerId(BigDecimal dhTrailerId) {
		this.dhTrailerId = dhTrailerId;
	}

	@Column(name = "DH_TRAILER_LICENSE_NO", length = 80)
	public String getDhTrailerLicenseNo() {
		return this.dhTrailerLicenseNo;
	}

	public void setDhTrailerLicenseNo(String dhTrailerLicenseNo) {
		this.dhTrailerLicenseNo = dhTrailerLicenseNo;
	}

	@Column(name = "DH_BACK_TRAILER_ID", precision = 22, scale = 0)
	public BigDecimal getDhBackTrailerId() {
		return this.dhBackTrailerId;
	}

	public void setDhBackTrailerId(BigDecimal dhBackTrailerId) {
		this.dhBackTrailerId = dhBackTrailerId;
	}

	@Column(name = "DH_BACK_TRAILER_LICENSE_NO", length = 100)
	public String getDhBackTrailerLicenseNo() {
		return this.dhBackTrailerLicenseNo;
	}

	public void setDhBackTrailerLicenseNo(String dhBackTrailerLicenseNo) {
		this.dhBackTrailerLicenseNo = dhBackTrailerLicenseNo;
	}

	@Column(name = "DH_BACK_LOAD_CUBAGE_PERCENT", precision = 18, scale = 6)
	public Double getDhBackLoadCubagePercent() {
		return this.dhBackLoadCubagePercent;
	}

	public void setDhBackLoadCubagePercent(Double dhBackLoadCubagePercent) {
		this.dhBackLoadCubagePercent = dhBackLoadCubagePercent;
	}

	@Column(name = "DH_BACK_LOAD_CUBAGE", precision = 18, scale = 6)
	public Double getDhBackLoadCubage() {
		return this.dhBackLoadCubage;
	}

	public void setDhBackLoadCubage(Double dhBackLoadCubage) {
		this.dhBackLoadCubage = dhBackLoadCubage;
	}

	@Column(name = "DH_BACK_LOAD_WEIGHT", precision = 18, scale = 6)
	public Double getDhBackLoadWeight() {
		return this.dhBackLoadWeight;
	}

	public void setDhBackLoadWeight(Double dhBackLoadWeight) {
		this.dhBackLoadWeight = dhBackLoadWeight;
	}

	@Column(name = "DH_BACK_LOAD_WEIGHT_PERCENT", precision = 18, scale = 6)
	public Double getDhBackLoadWeightPercent() {
		return this.dhBackLoadWeightPercent;
	}

	public void setDhBackLoadWeightPercent(Double dhBackLoadWeightPercent) {
		this.dhBackLoadWeightPercent = dhBackLoadWeightPercent;
	}

	@Column(name = "DISPATCHTYPE", precision = 22, scale = 0)
	public BigDecimal getDispatchtype() {
		return this.dispatchtype;
	}

	public void setDispatchtype(BigDecimal dispatchtype) {
		this.dispatchtype = dispatchtype;
	}

	@Column(name = "DH_YCLX", length = 100)
	public String getDhYclx() {
		return this.dhYclx;
	}

	public void setDhYclx(String dhYclx) {
		this.dhYclx = dhYclx;
	}

	@Column(name = "CX", precision = 22, scale = 0)
	public BigDecimal getCx() {
		return this.cx;
	}

	public void setCx(BigDecimal cx) {
		this.cx = cx;
	}

	@Column(name = "CZC", precision = 16)
	public Double getCzc() {
		return this.czc;
	}

	public void setCzc(Double czc) {
		this.czc = czc;
	}

	@Column(name = "CZK", precision = 16)
	public Double getCzk() {
		return this.czk;
	}

	public void setCzk(Double czk) {
		this.czk = czk;
	}

	@Column(name = "CZG", precision = 16)
	public Double getCzg() {
		return this.czg;
	}

	public void setCzg(Double czg) {
		this.czg = czg;
	}

	@Column(name = "CZZ", precision = 16)
	public Double getCzz() {
		return this.czz;
	}

	public void setCzz(Double czz) {
		this.czz = czz;
	}

	@Column(name = "DH_JFZFYF", precision = 22, scale = 0)
	public BigDecimal getDhJfzfyf() {
		return this.dhJfzfyf;
	}

	public void setDhJfzfyf(BigDecimal dhJfzfyf) {
		this.dhJfzfyf = dhJfzfyf;
	}

	@Column(name = "DH_JSDDLX", precision = 22, scale = 0)
	public BigDecimal getDhJsddlx() {
		return this.dhJsddlx;
	}

	public void setDhJsddlx(BigDecimal dhJsddlx) {
		this.dhJsddlx = dhJsddlx;
	}

	@Column(name = "DH_JYMS", precision = 22, scale = 0)
	public BigDecimal getDhJyms() {
		return this.dhJyms;
	}

	public void setDhJyms(BigDecimal dhJyms) {
		this.dhJyms = dhJyms;
	}

	@Column(name = "LINSHICHE", precision = 22, scale = 0)
	public BigDecimal getLinshiche() {
		return this.linshiche;
	}

	public void setLinshiche(BigDecimal linshiche) {
		this.linshiche = linshiche;
	}

	@Column(name = "CLDCSJ", length = 11)
	public Timestamp getCldcsj() {
		return this.cldcsj;
	}

	public void setCldcsj(Timestamp cldcsj) {
		this.cldcsj = cldcsj;
	}

	@Column(name = "YJCLDCSJ", length = 11)
	public Timestamp getYjcldcsj() {
		return this.yjcldcsj;
	}

	public void setYjcldcsj(Timestamp yjcldcsj) {
		this.yjcldcsj = yjcldcsj;
	}

}