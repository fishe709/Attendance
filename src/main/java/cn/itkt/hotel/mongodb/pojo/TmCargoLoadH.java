package cn.itkt.hotel.mongodb.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TmCargoLoadH entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "TM_CARGO_LOAD_H", schema = "ERIJSHY")
public class TmCargoLoadH implements java.io.Serializable {

	// Fields    

	private BigDecimal billid;
	private BigDecimal billtype;
	private BigDecimal sequence;
	private BigDecimal maker;
	private BigDecimal mender;
	private Timestamp makedate;
	private Timestamp editdate;
	private String clhCargoLoadNo;
	private BigDecimal status;
	private BigDecimal clhLogisticsHeaderId;
	private String clhLogisticsNo;
	private BigDecimal ccid;
	private BigDecimal clhOrgId;
	private BigDecimal clhConsignerId;
	private BigDecimal clhConsignHeaderId;
	private String clhConsignNo;
	private BigDecimal clhConsignTypeId;
	private BigDecimal clhOpOrgId;
	private Timestamp clhConsignDatetime;
	private Timestamp clhConsignDate;
	private BigDecimal clhEmergencyDegreeId;
	private String clhConsignerNo;
	private BigDecimal clhSettleMethodId;
	private String clhDispatchGroupNo;
	private String clhBizMan;
	private Double clhTotalGrossWeight;
	private Double clhTotalNetWeight;
	private Double clhTotalCubage;
	private Double clhTotalAmount;
	private BigDecimal clhTotalPacks;
	private BigDecimal clhIsStartPoint;
	private BigDecimal clhIsEndPoint;
	private String clhStageString;
	private BigDecimal clhExpressFlow;
	private String clhRemark;
	private Timestamp clhLatestTraceDatetime;
	private String clhLatestLocation;
	private Double clhLatestSpeed;
	private String clhLatestTraceRemark;
	private BigDecimal clhFirstCargoLoadId;
	private String clhFirstCargoLoadNo;
	private BigDecimal clhLastCargoLoadId;
	private String clhLastCargoLoadNo;
	private BigDecimal clhDispatchHeaderId;
	private Short clhDeliverTimeCount;
	private BigDecimal clhNeedRedeliver;
	private String clhSubsequenceFlag;
	private Timestamp clhLoadDatetime;
	private Timestamp clhLoadDate;
	private String clhLoader;
	private Timestamp clhDepartDatetime;
	private Timestamp clhDepartDate;
	private Timestamp clhUnloadDatetime;
	private Timestamp clhUnloadDate;
	private String clhUnloader;
	private Timestamp clhSignDatetime;
	private Timestamp clhSignDate;
	private String clhSigner;
	private String clhWaveNo;
	private BigDecimal clhRouteId;
	private BigDecimal clhDockId;
	private BigDecimal clhLoadSeq;
	private BigDecimal clhLoadOrgId;
	private String clhLoadPlaceName;
	private String clhLoadUnitName;
	private BigDecimal clhLoadAreaId;
	private String clhLoadPostCode;
	private String clhLoadAddress;
	private String clhLoadContact;
	private String clhLoadTel;
	private Timestamp clhExpectLoadDatetime;
	private Timestamp clhExpectLoadDate;
	private BigDecimal clhUnloadOrgId;
	private String clhUnloadPlaceName;
	private String clhUnloadUnitName;
	private BigDecimal clhUnloadAreaId;
	private String clhUnloadPostCode;
	private String clhUnloadAddress;
	private String clhUnloadContact;
	private String clhUnloadTel;
	private Timestamp clhExpectUnloadDatetime;
	private Timestamp clhExpectUnloadDate;
	private Double clhDistance;
	private BigDecimal clhDirection;
	private BigDecimal clhRound;
	private BigDecimal clhRedeliverCauseId;
	private String clhRelegateTo;
	private BigDecimal clhCarrierId;
	private BigDecimal clhTruckId;
	private String clhTruckLicenseNo;
	private String clhTruckCode;
	private BigDecimal clhPrimaryDriverId;
	private String clhPrimaryDriver;
	private String clhPrimaryTel;
	private String clhPrimaryIdNo;
	private String clhPrimaryLicenseNo;
	private String clhPrimaryBizNo;
	private BigDecimal clhSecondaryDriverId;
	private String clhSecondaryDriver;
	private String clhSecondaryTel;
	private String clhSecondaryIdNo;
	private String clhSecondaryLicenseNo;
	private String clhSecondaryBizNo;
	private BigDecimal clhEscortStaffId;
	private String clhEscortStaff;
	private String clhEscortTel;
	private String clhEscortIdNo;
	private String clhEscortBizNo;
	private BigDecimal clhLoadOperatorId;
	private BigDecimal clhUnloadOperatorId;
	private BigDecimal clhSignOperatorId;
	private String clhSignResult;
	private String line1;
	private BigDecimal clhAssignedLoadOperatorId;
	private BigDecimal clhVendorId;
	private BigDecimal clhCustomerId;
	private Timestamp clhExpectLoadDatetimeU;
	private Timestamp clhExpectLoadDateU;
	private Timestamp clhExpectUnloadDatetimeU;
	private Timestamp clhExpectUnloadDateU;
	private BigDecimal clhGnlDispatchorg;
	private BigDecimal cargoloadtype;
	private BigDecimal clhIsReturnGnlDispOrg;
	private Double clhTotalRejectQty;
	private String clhYclx;
	private String clhZhlc;
	private String clhShlc;
	private String clhJspc;
	private BigDecimal clhJscx;
	private Double clhJssl;
	private String beizhu;
	private Double clhJs;
	private BigDecimal clhJfzfyf;
	private Timestamp clhExpectLoadDatetwo;
	private Timestamp clhExpectLoadDateUtwo;
	private Timestamp clhExpectUnloadDatetwo;
	private Timestamp clhExpectUnloadDatetimetwo;
	private BigDecimal clhCwfxxl;
	private String clhBeiliaodanhao;

	// Constructors

	/** default constructor */
	public TmCargoLoadH() {
	}

	/** minimal constructor */
	public TmCargoLoadH(BigDecimal billid) {
		this.billid = billid;
	}

	/** full constructor */
	public TmCargoLoadH(BigDecimal billid, BigDecimal billtype, BigDecimal sequence, BigDecimal maker, BigDecimal mender,
			Timestamp makedate, Timestamp editdate, String clhCargoLoadNo, BigDecimal status, BigDecimal clhLogisticsHeaderId,
			String clhLogisticsNo, BigDecimal ccid, BigDecimal clhOrgId, BigDecimal clhConsignerId, BigDecimal clhConsignHeaderId,
			String clhConsignNo, BigDecimal clhConsignTypeId, BigDecimal clhOpOrgId, Timestamp clhConsignDatetime,
			Timestamp clhConsignDate, BigDecimal clhEmergencyDegreeId, String clhConsignerNo, BigDecimal clhSettleMethodId,
			String clhDispatchGroupNo, String clhBizMan, Double clhTotalGrossWeight, Double clhTotalNetWeight, Double clhTotalCubage,
			Double clhTotalAmount, BigDecimal clhTotalPacks, BigDecimal clhIsStartPoint, BigDecimal clhIsEndPoint, String clhStageString,
			BigDecimal clhExpressFlow, String clhRemark, Timestamp clhLatestTraceDatetime, String clhLatestLocation, Double clhLatestSpeed,
			String clhLatestTraceRemark, BigDecimal clhFirstCargoLoadId, String clhFirstCargoLoadNo, BigDecimal clhLastCargoLoadId,
			String clhLastCargoLoadNo, BigDecimal clhDispatchHeaderId, Short clhDeliverTimeCount, BigDecimal clhNeedRedeliver,
			String clhSubsequenceFlag, Timestamp clhLoadDatetime, Timestamp clhLoadDate, String clhLoader, Timestamp clhDepartDatetime,
			Timestamp clhDepartDate, Timestamp clhUnloadDatetime, Timestamp clhUnloadDate, String clhUnloader, Timestamp clhSignDatetime,
			Timestamp clhSignDate, String clhSigner, String clhWaveNo, BigDecimal clhRouteId, BigDecimal clhDockId, BigDecimal clhLoadSeq,
			BigDecimal clhLoadOrgId, String clhLoadPlaceName, String clhLoadUnitName, BigDecimal clhLoadAreaId, String clhLoadPostCode,
			String clhLoadAddress, String clhLoadContact, String clhLoadTel, Timestamp clhExpectLoadDatetime, Timestamp clhExpectLoadDate,
			BigDecimal clhUnloadOrgId, String clhUnloadPlaceName, String clhUnloadUnitName, BigDecimal clhUnloadAreaId,
			String clhUnloadPostCode, String clhUnloadAddress, String clhUnloadContact, String clhUnloadTel,
			Timestamp clhExpectUnloadDatetime, Timestamp clhExpectUnloadDate, Double clhDistance, BigDecimal clhDirection,
			BigDecimal clhRound, BigDecimal clhRedeliverCauseId, String clhRelegateTo, BigDecimal clhCarrierId, BigDecimal clhTruckId,
			String clhTruckLicenseNo, String clhTruckCode, BigDecimal clhPrimaryDriverId, String clhPrimaryDriver, String clhPrimaryTel,
			String clhPrimaryIdNo, String clhPrimaryLicenseNo, String clhPrimaryBizNo, BigDecimal clhSecondaryDriverId,
			String clhSecondaryDriver, String clhSecondaryTel, String clhSecondaryIdNo, String clhSecondaryLicenseNo,
			String clhSecondaryBizNo, BigDecimal clhEscortStaffId, String clhEscortStaff, String clhEscortTel, String clhEscortIdNo,
			String clhEscortBizNo, BigDecimal clhLoadOperatorId, BigDecimal clhUnloadOperatorId, BigDecimal clhSignOperatorId,
			String clhSignResult, String line1, BigDecimal clhAssignedLoadOperatorId, BigDecimal clhVendorId, BigDecimal clhCustomerId,
			Timestamp clhExpectLoadDatetimeU, Timestamp clhExpectLoadDateU, Timestamp clhExpectUnloadDatetimeU,
			Timestamp clhExpectUnloadDateU, BigDecimal clhGnlDispatchorg, BigDecimal cargoloadtype, BigDecimal clhIsReturnGnlDispOrg,
			Double clhTotalRejectQty, String clhYclx, String clhZhlc, String clhShlc, String clhJspc, BigDecimal clhJscx, Double clhJssl,
			String beizhu, Double clhJs, BigDecimal clhJfzfyf, Timestamp clhExpectLoadDatetwo, Timestamp clhExpectLoadDateUtwo,
			Timestamp clhExpectUnloadDatetwo, Timestamp clhExpectUnloadDatetimetwo, BigDecimal clhCwfxxl, String clhBeiliaodanhao) {
		this.billid = billid;
		this.billtype = billtype;
		this.sequence = sequence;
		this.maker = maker;
		this.mender = mender;
		this.makedate = makedate;
		this.editdate = editdate;
		this.clhCargoLoadNo = clhCargoLoadNo;
		this.status = status;
		this.clhLogisticsHeaderId = clhLogisticsHeaderId;
		this.clhLogisticsNo = clhLogisticsNo;
		this.ccid = ccid;
		this.clhOrgId = clhOrgId;
		this.clhConsignerId = clhConsignerId;
		this.clhConsignHeaderId = clhConsignHeaderId;
		this.clhConsignNo = clhConsignNo;
		this.clhConsignTypeId = clhConsignTypeId;
		this.clhOpOrgId = clhOpOrgId;
		this.clhConsignDatetime = clhConsignDatetime;
		this.clhConsignDate = clhConsignDate;
		this.clhEmergencyDegreeId = clhEmergencyDegreeId;
		this.clhConsignerNo = clhConsignerNo;
		this.clhSettleMethodId = clhSettleMethodId;
		this.clhDispatchGroupNo = clhDispatchGroupNo;
		this.clhBizMan = clhBizMan;
		this.clhTotalGrossWeight = clhTotalGrossWeight;
		this.clhTotalNetWeight = clhTotalNetWeight;
		this.clhTotalCubage = clhTotalCubage;
		this.clhTotalAmount = clhTotalAmount;
		this.clhTotalPacks = clhTotalPacks;
		this.clhIsStartPoint = clhIsStartPoint;
		this.clhIsEndPoint = clhIsEndPoint;
		this.clhStageString = clhStageString;
		this.clhExpressFlow = clhExpressFlow;
		this.clhRemark = clhRemark;
		this.clhLatestTraceDatetime = clhLatestTraceDatetime;
		this.clhLatestLocation = clhLatestLocation;
		this.clhLatestSpeed = clhLatestSpeed;
		this.clhLatestTraceRemark = clhLatestTraceRemark;
		this.clhFirstCargoLoadId = clhFirstCargoLoadId;
		this.clhFirstCargoLoadNo = clhFirstCargoLoadNo;
		this.clhLastCargoLoadId = clhLastCargoLoadId;
		this.clhLastCargoLoadNo = clhLastCargoLoadNo;
		this.clhDispatchHeaderId = clhDispatchHeaderId;
		this.clhDeliverTimeCount = clhDeliverTimeCount;
		this.clhNeedRedeliver = clhNeedRedeliver;
		this.clhSubsequenceFlag = clhSubsequenceFlag;
		this.clhLoadDatetime = clhLoadDatetime;
		this.clhLoadDate = clhLoadDate;
		this.clhLoader = clhLoader;
		this.clhDepartDatetime = clhDepartDatetime;
		this.clhDepartDate = clhDepartDate;
		this.clhUnloadDatetime = clhUnloadDatetime;
		this.clhUnloadDate = clhUnloadDate;
		this.clhUnloader = clhUnloader;
		this.clhSignDatetime = clhSignDatetime;
		this.clhSignDate = clhSignDate;
		this.clhSigner = clhSigner;
		this.clhWaveNo = clhWaveNo;
		this.clhRouteId = clhRouteId;
		this.clhDockId = clhDockId;
		this.clhLoadSeq = clhLoadSeq;
		this.clhLoadOrgId = clhLoadOrgId;
		this.clhLoadPlaceName = clhLoadPlaceName;
		this.clhLoadUnitName = clhLoadUnitName;
		this.clhLoadAreaId = clhLoadAreaId;
		this.clhLoadPostCode = clhLoadPostCode;
		this.clhLoadAddress = clhLoadAddress;
		this.clhLoadContact = clhLoadContact;
		this.clhLoadTel = clhLoadTel;
		this.clhExpectLoadDatetime = clhExpectLoadDatetime;
		this.clhExpectLoadDate = clhExpectLoadDate;
		this.clhUnloadOrgId = clhUnloadOrgId;
		this.clhUnloadPlaceName = clhUnloadPlaceName;
		this.clhUnloadUnitName = clhUnloadUnitName;
		this.clhUnloadAreaId = clhUnloadAreaId;
		this.clhUnloadPostCode = clhUnloadPostCode;
		this.clhUnloadAddress = clhUnloadAddress;
		this.clhUnloadContact = clhUnloadContact;
		this.clhUnloadTel = clhUnloadTel;
		this.clhExpectUnloadDatetime = clhExpectUnloadDatetime;
		this.clhExpectUnloadDate = clhExpectUnloadDate;
		this.clhDistance = clhDistance;
		this.clhDirection = clhDirection;
		this.clhRound = clhRound;
		this.clhRedeliverCauseId = clhRedeliverCauseId;
		this.clhRelegateTo = clhRelegateTo;
		this.clhCarrierId = clhCarrierId;
		this.clhTruckId = clhTruckId;
		this.clhTruckLicenseNo = clhTruckLicenseNo;
		this.clhTruckCode = clhTruckCode;
		this.clhPrimaryDriverId = clhPrimaryDriverId;
		this.clhPrimaryDriver = clhPrimaryDriver;
		this.clhPrimaryTel = clhPrimaryTel;
		this.clhPrimaryIdNo = clhPrimaryIdNo;
		this.clhPrimaryLicenseNo = clhPrimaryLicenseNo;
		this.clhPrimaryBizNo = clhPrimaryBizNo;
		this.clhSecondaryDriverId = clhSecondaryDriverId;
		this.clhSecondaryDriver = clhSecondaryDriver;
		this.clhSecondaryTel = clhSecondaryTel;
		this.clhSecondaryIdNo = clhSecondaryIdNo;
		this.clhSecondaryLicenseNo = clhSecondaryLicenseNo;
		this.clhSecondaryBizNo = clhSecondaryBizNo;
		this.clhEscortStaffId = clhEscortStaffId;
		this.clhEscortStaff = clhEscortStaff;
		this.clhEscortTel = clhEscortTel;
		this.clhEscortIdNo = clhEscortIdNo;
		this.clhEscortBizNo = clhEscortBizNo;
		this.clhLoadOperatorId = clhLoadOperatorId;
		this.clhUnloadOperatorId = clhUnloadOperatorId;
		this.clhSignOperatorId = clhSignOperatorId;
		this.clhSignResult = clhSignResult;
		this.line1 = line1;
		this.clhAssignedLoadOperatorId = clhAssignedLoadOperatorId;
		this.clhVendorId = clhVendorId;
		this.clhCustomerId = clhCustomerId;
		this.clhExpectLoadDatetimeU = clhExpectLoadDatetimeU;
		this.clhExpectLoadDateU = clhExpectLoadDateU;
		this.clhExpectUnloadDatetimeU = clhExpectUnloadDatetimeU;
		this.clhExpectUnloadDateU = clhExpectUnloadDateU;
		this.clhGnlDispatchorg = clhGnlDispatchorg;
		this.cargoloadtype = cargoloadtype;
		this.clhIsReturnGnlDispOrg = clhIsReturnGnlDispOrg;
		this.clhTotalRejectQty = clhTotalRejectQty;
		this.clhYclx = clhYclx;
		this.clhZhlc = clhZhlc;
		this.clhShlc = clhShlc;
		this.clhJspc = clhJspc;
		this.clhJscx = clhJscx;
		this.clhJssl = clhJssl;
		this.beizhu = beizhu;
		this.clhJs = clhJs;
		this.clhJfzfyf = clhJfzfyf;
		this.clhExpectLoadDatetwo = clhExpectLoadDatetwo;
		this.clhExpectLoadDateUtwo = clhExpectLoadDateUtwo;
		this.clhExpectUnloadDatetwo = clhExpectUnloadDatetwo;
		this.clhExpectUnloadDatetimetwo = clhExpectUnloadDatetimetwo;
		this.clhCwfxxl = clhCwfxxl;
		this.clhBeiliaodanhao = clhBeiliaodanhao;
	}

	// Property accessors
	@Id
	@Column(name = "BILLID", unique = true, precision = 22, scale = 0)
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

	@Column(name = "CLH_CARGO_LOAD_NO", length = 80)
	public String getClhCargoLoadNo() {
		return this.clhCargoLoadNo;
	}

	public void setClhCargoLoadNo(String clhCargoLoadNo) {
		this.clhCargoLoadNo = clhCargoLoadNo;
	}

	@Column(name = "STATUS", precision = 22, scale = 0)
	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	@Column(name = "CLH_LOGISTICS_HEADER_ID", precision = 22, scale = 0)
	public BigDecimal getClhLogisticsHeaderId() {
		return this.clhLogisticsHeaderId;
	}

	public void setClhLogisticsHeaderId(BigDecimal clhLogisticsHeaderId) {
		this.clhLogisticsHeaderId = clhLogisticsHeaderId;
	}

	@Column(name = "CLH_LOGISTICS_NO", length = 80)
	public String getClhLogisticsNo() {
		return this.clhLogisticsNo;
	}

	public void setClhLogisticsNo(String clhLogisticsNo) {
		this.clhLogisticsNo = clhLogisticsNo;
	}

	@Column(name = "CCID", precision = 22, scale = 0)
	public BigDecimal getCcid() {
		return this.ccid;
	}

	public void setCcid(BigDecimal ccid) {
		this.ccid = ccid;
	}

	@Column(name = "CLH_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getClhOrgId() {
		return this.clhOrgId;
	}

	public void setClhOrgId(BigDecimal clhOrgId) {
		this.clhOrgId = clhOrgId;
	}

	@Column(name = "CLH_CONSIGNER_ID", precision = 22, scale = 0)
	public BigDecimal getClhConsignerId() {
		return this.clhConsignerId;
	}

	public void setClhConsignerId(BigDecimal clhConsignerId) {
		this.clhConsignerId = clhConsignerId;
	}

	@Column(name = "CLH_CONSIGN_HEADER_ID", precision = 22, scale = 0)
	public BigDecimal getClhConsignHeaderId() {
		return this.clhConsignHeaderId;
	}

	public void setClhConsignHeaderId(BigDecimal clhConsignHeaderId) {
		this.clhConsignHeaderId = clhConsignHeaderId;
	}

	@Column(name = "CLH_CONSIGN_NO", length = 80)
	public String getClhConsignNo() {
		return this.clhConsignNo;
	}

	public void setClhConsignNo(String clhConsignNo) {
		this.clhConsignNo = clhConsignNo;
	}

	@Column(name = "CLH_CONSIGN_TYPE_ID", precision = 22, scale = 0)
	public BigDecimal getClhConsignTypeId() {
		return this.clhConsignTypeId;
	}

	public void setClhConsignTypeId(BigDecimal clhConsignTypeId) {
		this.clhConsignTypeId = clhConsignTypeId;
	}

	@Column(name = "CLH_OP_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getClhOpOrgId() {
		return this.clhOpOrgId;
	}

	public void setClhOpOrgId(BigDecimal clhOpOrgId) {
		this.clhOpOrgId = clhOpOrgId;
	}

	@Column(name = "CLH_CONSIGN_DATETIME", length = 11)
	public Timestamp getClhConsignDatetime() {
		return this.clhConsignDatetime;
	}

	public void setClhConsignDatetime(Timestamp clhConsignDatetime) {
		this.clhConsignDatetime = clhConsignDatetime;
	}

	@Column(name = "CLH_CONSIGN_DATE", length = 7)
	public Timestamp getClhConsignDate() {
		return this.clhConsignDate;
	}

	public void setClhConsignDate(Timestamp clhConsignDate) {
		this.clhConsignDate = clhConsignDate;
	}

	@Column(name = "CLH_EMERGENCY_DEGREE_ID", precision = 22, scale = 0)
	public BigDecimal getClhEmergencyDegreeId() {
		return this.clhEmergencyDegreeId;
	}

	public void setClhEmergencyDegreeId(BigDecimal clhEmergencyDegreeId) {
		this.clhEmergencyDegreeId = clhEmergencyDegreeId;
	}

	@Column(name = "CLH_CONSIGNER_NO", length = 80)
	public String getClhConsignerNo() {
		return this.clhConsignerNo;
	}

	public void setClhConsignerNo(String clhConsignerNo) {
		this.clhConsignerNo = clhConsignerNo;
	}

	@Column(name = "CLH_SETTLE_METHOD_ID", precision = 22, scale = 0)
	public BigDecimal getClhSettleMethodId() {
		return this.clhSettleMethodId;
	}

	public void setClhSettleMethodId(BigDecimal clhSettleMethodId) {
		this.clhSettleMethodId = clhSettleMethodId;
	}

	@Column(name = "CLH_DISPATCH_GROUP_NO", length = 80)
	public String getClhDispatchGroupNo() {
		return this.clhDispatchGroupNo;
	}

	public void setClhDispatchGroupNo(String clhDispatchGroupNo) {
		this.clhDispatchGroupNo = clhDispatchGroupNo;
	}

	@Column(name = "CLH_BIZ_MAN", length = 200)
	public String getClhBizMan() {
		return this.clhBizMan;
	}

	public void setClhBizMan(String clhBizMan) {
		this.clhBizMan = clhBizMan;
	}

	@Column(name = "CLH_TOTAL_GROSS_WEIGHT", precision = 18, scale = 6)
	public Double getClhTotalGrossWeight() {
		return this.clhTotalGrossWeight;
	}

	public void setClhTotalGrossWeight(Double clhTotalGrossWeight) {
		this.clhTotalGrossWeight = clhTotalGrossWeight;
	}

	@Column(name = "CLH_TOTAL_NET_WEIGHT", precision = 18, scale = 6)
	public Double getClhTotalNetWeight() {
		return this.clhTotalNetWeight;
	}

	public void setClhTotalNetWeight(Double clhTotalNetWeight) {
		this.clhTotalNetWeight = clhTotalNetWeight;
	}

	@Column(name = "CLH_TOTAL_CUBAGE", precision = 18, scale = 6)
	public Double getClhTotalCubage() {
		return this.clhTotalCubage;
	}

	public void setClhTotalCubage(Double clhTotalCubage) {
		this.clhTotalCubage = clhTotalCubage;
	}

	@Column(name = "CLH_TOTAL_AMOUNT", precision = 18, scale = 6)
	public Double getClhTotalAmount() {
		return this.clhTotalAmount;
	}

	public void setClhTotalAmount(Double clhTotalAmount) {
		this.clhTotalAmount = clhTotalAmount;
	}

	@Column(name = "CLH_TOTAL_PACKS", precision = 22, scale = 0)
	public BigDecimal getClhTotalPacks() {
		return this.clhTotalPacks;
	}

	public void setClhTotalPacks(BigDecimal clhTotalPacks) {
		this.clhTotalPacks = clhTotalPacks;
	}

	@Column(name = "CLH_IS_START_POINT", precision = 22, scale = 0)
	public BigDecimal getClhIsStartPoint() {
		return this.clhIsStartPoint;
	}

	public void setClhIsStartPoint(BigDecimal clhIsStartPoint) {
		this.clhIsStartPoint = clhIsStartPoint;
	}

	@Column(name = "CLH_IS_END_POINT", precision = 22, scale = 0)
	public BigDecimal getClhIsEndPoint() {
		return this.clhIsEndPoint;
	}

	public void setClhIsEndPoint(BigDecimal clhIsEndPoint) {
		this.clhIsEndPoint = clhIsEndPoint;
	}

	@Column(name = "CLH_STAGE_STRING", length = 200)
	public String getClhStageString() {
		return this.clhStageString;
	}

	public void setClhStageString(String clhStageString) {
		this.clhStageString = clhStageString;
	}

	@Column(name = "CLH_EXPRESS_FLOW", precision = 22, scale = 0)
	public BigDecimal getClhExpressFlow() {
		return this.clhExpressFlow;
	}

	public void setClhExpressFlow(BigDecimal clhExpressFlow) {
		this.clhExpressFlow = clhExpressFlow;
	}

	@Column(name = "CLH_REMARK", length = 400)
	public String getClhRemark() {
		return this.clhRemark;
	}

	public void setClhRemark(String clhRemark) {
		this.clhRemark = clhRemark;
	}

	@Column(name = "CLH_LATEST_TRACE_DATETIME", length = 11)
	public Timestamp getClhLatestTraceDatetime() {
		return this.clhLatestTraceDatetime;
	}

	public void setClhLatestTraceDatetime(Timestamp clhLatestTraceDatetime) {
		this.clhLatestTraceDatetime = clhLatestTraceDatetime;
	}

	@Column(name = "CLH_LATEST_LOCATION", length = 200)
	public String getClhLatestLocation() {
		return this.clhLatestLocation;
	}

	public void setClhLatestLocation(String clhLatestLocation) {
		this.clhLatestLocation = clhLatestLocation;
	}

	@Column(name = "CLH_LATEST_SPEED", precision = 7, scale = 3)
	public Double getClhLatestSpeed() {
		return this.clhLatestSpeed;
	}

	public void setClhLatestSpeed(Double clhLatestSpeed) {
		this.clhLatestSpeed = clhLatestSpeed;
	}

	@Column(name = "CLH_LATEST_TRACE_REMARK")
	public String getClhLatestTraceRemark() {
		return this.clhLatestTraceRemark;
	}

	public void setClhLatestTraceRemark(String clhLatestTraceRemark) {
		this.clhLatestTraceRemark = clhLatestTraceRemark;
	}

	@Column(name = "CLH_FIRST_CARGO_LOAD_ID", precision = 22, scale = 0)
	public BigDecimal getClhFirstCargoLoadId() {
		return this.clhFirstCargoLoadId;
	}

	public void setClhFirstCargoLoadId(BigDecimal clhFirstCargoLoadId) {
		this.clhFirstCargoLoadId = clhFirstCargoLoadId;
	}

	@Column(name = "CLH_FIRST_CARGO_LOAD_NO", length = 80)
	public String getClhFirstCargoLoadNo() {
		return this.clhFirstCargoLoadNo;
	}

	public void setClhFirstCargoLoadNo(String clhFirstCargoLoadNo) {
		this.clhFirstCargoLoadNo = clhFirstCargoLoadNo;
	}

	@Column(name = "CLH_LAST_CARGO_LOAD_ID", precision = 22, scale = 0)
	public BigDecimal getClhLastCargoLoadId() {
		return this.clhLastCargoLoadId;
	}

	public void setClhLastCargoLoadId(BigDecimal clhLastCargoLoadId) {
		this.clhLastCargoLoadId = clhLastCargoLoadId;
	}

	@Column(name = "CLH_LAST_CARGO_LOAD_NO", length = 80)
	public String getClhLastCargoLoadNo() {
		return this.clhLastCargoLoadNo;
	}

	public void setClhLastCargoLoadNo(String clhLastCargoLoadNo) {
		this.clhLastCargoLoadNo = clhLastCargoLoadNo;
	}

	@Column(name = "CLH_DISPATCH_HEADER_ID", precision = 22, scale = 0)
	public BigDecimal getClhDispatchHeaderId() {
		return this.clhDispatchHeaderId;
	}

	public void setClhDispatchHeaderId(BigDecimal clhDispatchHeaderId) {
		this.clhDispatchHeaderId = clhDispatchHeaderId;
	}

	@Column(name = "CLH_DELIVER_TIME_COUNT", precision = 3, scale = 0)
	public Short getClhDeliverTimeCount() {
		return this.clhDeliverTimeCount;
	}

	public void setClhDeliverTimeCount(Short clhDeliverTimeCount) {
		this.clhDeliverTimeCount = clhDeliverTimeCount;
	}

	@Column(name = "CLH_NEED_REDELIVER", precision = 22, scale = 0)
	public BigDecimal getClhNeedRedeliver() {
		return this.clhNeedRedeliver;
	}

	public void setClhNeedRedeliver(BigDecimal clhNeedRedeliver) {
		this.clhNeedRedeliver = clhNeedRedeliver;
	}

	@Column(name = "CLH_SUBSEQUENCE_FLAG")
	public String getClhSubsequenceFlag() {
		return this.clhSubsequenceFlag;
	}

	public void setClhSubsequenceFlag(String clhSubsequenceFlag) {
		this.clhSubsequenceFlag = clhSubsequenceFlag;
	}

	@Column(name = "CLH_LOAD_DATETIME", length = 11)
	public Timestamp getClhLoadDatetime() {
		return this.clhLoadDatetime;
	}

	public void setClhLoadDatetime(Timestamp clhLoadDatetime) {
		this.clhLoadDatetime = clhLoadDatetime;
	}

	@Column(name = "CLH_LOAD_DATE", length = 7)
	public Timestamp getClhLoadDate() {
		return this.clhLoadDate;
	}

	public void setClhLoadDate(Timestamp clhLoadDate) {
		this.clhLoadDate = clhLoadDate;
	}

	@Column(name = "CLH_LOADER", length = 200)
	public String getClhLoader() {
		return this.clhLoader;
	}

	public void setClhLoader(String clhLoader) {
		this.clhLoader = clhLoader;
	}

	@Column(name = "CLH_DEPART_DATETIME", length = 11)
	public Timestamp getClhDepartDatetime() {
		return this.clhDepartDatetime;
	}

	public void setClhDepartDatetime(Timestamp clhDepartDatetime) {
		this.clhDepartDatetime = clhDepartDatetime;
	}

	@Column(name = "CLH_DEPART_DATE", length = 7)
	public Timestamp getClhDepartDate() {
		return this.clhDepartDate;
	}

	public void setClhDepartDate(Timestamp clhDepartDate) {
		this.clhDepartDate = clhDepartDate;
	}

	@Column(name = "CLH_UNLOAD_DATETIME", length = 11)
	public Timestamp getClhUnloadDatetime() {
		return this.clhUnloadDatetime;
	}

	public void setClhUnloadDatetime(Timestamp clhUnloadDatetime) {
		this.clhUnloadDatetime = clhUnloadDatetime;
	}

	@Column(name = "CLH_UNLOAD_DATE", length = 7)
	public Timestamp getClhUnloadDate() {
		return this.clhUnloadDate;
	}

	public void setClhUnloadDate(Timestamp clhUnloadDate) {
		this.clhUnloadDate = clhUnloadDate;
	}

	@Column(name = "CLH_UNLOADER", length = 200)
	public String getClhUnloader() {
		return this.clhUnloader;
	}

	public void setClhUnloader(String clhUnloader) {
		this.clhUnloader = clhUnloader;
	}

	@Column(name = "CLH_SIGN_DATETIME", length = 11)
	public Timestamp getClhSignDatetime() {
		return this.clhSignDatetime;
	}

	public void setClhSignDatetime(Timestamp clhSignDatetime) {
		this.clhSignDatetime = clhSignDatetime;
	}

	@Column(name = "CLH_SIGN_DATE", length = 7)
	public Timestamp getClhSignDate() {
		return this.clhSignDate;
	}

	public void setClhSignDate(Timestamp clhSignDate) {
		this.clhSignDate = clhSignDate;
	}

	@Column(name = "CLH_SIGNER", length = 200)
	public String getClhSigner() {
		return this.clhSigner;
	}

	public void setClhSigner(String clhSigner) {
		this.clhSigner = clhSigner;
	}

	@Column(name = "CLH_WAVE_NO", length = 80)
	public String getClhWaveNo() {
		return this.clhWaveNo;
	}

	public void setClhWaveNo(String clhWaveNo) {
		this.clhWaveNo = clhWaveNo;
	}

	@Column(name = "CLH_ROUTE_ID", precision = 22, scale = 0)
	public BigDecimal getClhRouteId() {
		return this.clhRouteId;
	}

	public void setClhRouteId(BigDecimal clhRouteId) {
		this.clhRouteId = clhRouteId;
	}

	@Column(name = "CLH_DOCK_ID", precision = 22, scale = 0)
	public BigDecimal getClhDockId() {
		return this.clhDockId;
	}

	public void setClhDockId(BigDecimal clhDockId) {
		this.clhDockId = clhDockId;
	}

	@Column(name = "CLH_LOAD_SEQ", precision = 22, scale = 0)
	public BigDecimal getClhLoadSeq() {
		return this.clhLoadSeq;
	}

	public void setClhLoadSeq(BigDecimal clhLoadSeq) {
		this.clhLoadSeq = clhLoadSeq;
	}

	@Column(name = "CLH_LOAD_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getClhLoadOrgId() {
		return this.clhLoadOrgId;
	}

	public void setClhLoadOrgId(BigDecimal clhLoadOrgId) {
		this.clhLoadOrgId = clhLoadOrgId;
	}

	@Column(name = "CLH_LOAD_PLACE_NAME", length = 200)
	public String getClhLoadPlaceName() {
		return this.clhLoadPlaceName;
	}

	public void setClhLoadPlaceName(String clhLoadPlaceName) {
		this.clhLoadPlaceName = clhLoadPlaceName;
	}

	@Column(name = "CLH_LOAD_UNIT_NAME", length = 200)
	public String getClhLoadUnitName() {
		return this.clhLoadUnitName;
	}

	public void setClhLoadUnitName(String clhLoadUnitName) {
		this.clhLoadUnitName = clhLoadUnitName;
	}

	@Column(name = "CLH_LOAD_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getClhLoadAreaId() {
		return this.clhLoadAreaId;
	}

	public void setClhLoadAreaId(BigDecimal clhLoadAreaId) {
		this.clhLoadAreaId = clhLoadAreaId;
	}

	@Column(name = "CLH_LOAD_POST_CODE", length = 80)
	public String getClhLoadPostCode() {
		return this.clhLoadPostCode;
	}

	public void setClhLoadPostCode(String clhLoadPostCode) {
		this.clhLoadPostCode = clhLoadPostCode;
	}

	@Column(name = "CLH_LOAD_ADDRESS", length = 400)
	public String getClhLoadAddress() {
		return this.clhLoadAddress;
	}

	public void setClhLoadAddress(String clhLoadAddress) {
		this.clhLoadAddress = clhLoadAddress;
	}

	@Column(name = "CLH_LOAD_CONTACT", length = 200)
	public String getClhLoadContact() {
		return this.clhLoadContact;
	}

	public void setClhLoadContact(String clhLoadContact) {
		this.clhLoadContact = clhLoadContact;
	}

	@Column(name = "CLH_LOAD_TEL", length = 200)
	public String getClhLoadTel() {
		return this.clhLoadTel;
	}

	public void setClhLoadTel(String clhLoadTel) {
		this.clhLoadTel = clhLoadTel;
	}

	@Column(name = "CLH_EXPECT_LOAD_DATETIME", length = 11)
	public Timestamp getClhExpectLoadDatetime() {
		return this.clhExpectLoadDatetime;
	}

	public void setClhExpectLoadDatetime(Timestamp clhExpectLoadDatetime) {
		this.clhExpectLoadDatetime = clhExpectLoadDatetime;
	}

	@Column(name = "CLH_EXPECT_LOAD_DATE", length = 7)
	public Timestamp getClhExpectLoadDate() {
		return this.clhExpectLoadDate;
	}

	public void setClhExpectLoadDate(Timestamp clhExpectLoadDate) {
		this.clhExpectLoadDate = clhExpectLoadDate;
	}

	@Column(name = "CLH_UNLOAD_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getClhUnloadOrgId() {
		return this.clhUnloadOrgId;
	}

	public void setClhUnloadOrgId(BigDecimal clhUnloadOrgId) {
		this.clhUnloadOrgId = clhUnloadOrgId;
	}

	@Column(name = "CLH_UNLOAD_PLACE_NAME", length = 200)
	public String getClhUnloadPlaceName() {
		return this.clhUnloadPlaceName;
	}

	public void setClhUnloadPlaceName(String clhUnloadPlaceName) {
		this.clhUnloadPlaceName = clhUnloadPlaceName;
	}

	@Column(name = "CLH_UNLOAD_UNIT_NAME", length = 200)
	public String getClhUnloadUnitName() {
		return this.clhUnloadUnitName;
	}

	public void setClhUnloadUnitName(String clhUnloadUnitName) {
		this.clhUnloadUnitName = clhUnloadUnitName;
	}

	@Column(name = "CLH_UNLOAD_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getClhUnloadAreaId() {
		return this.clhUnloadAreaId;
	}

	public void setClhUnloadAreaId(BigDecimal clhUnloadAreaId) {
		this.clhUnloadAreaId = clhUnloadAreaId;
	}

	@Column(name = "CLH_UNLOAD_POST_CODE", length = 80)
	public String getClhUnloadPostCode() {
		return this.clhUnloadPostCode;
	}

	public void setClhUnloadPostCode(String clhUnloadPostCode) {
		this.clhUnloadPostCode = clhUnloadPostCode;
	}

	@Column(name = "CLH_UNLOAD_ADDRESS", length = 400)
	public String getClhUnloadAddress() {
		return this.clhUnloadAddress;
	}

	public void setClhUnloadAddress(String clhUnloadAddress) {
		this.clhUnloadAddress = clhUnloadAddress;
	}

	@Column(name = "CLH_UNLOAD_CONTACT", length = 200)
	public String getClhUnloadContact() {
		return this.clhUnloadContact;
	}

	public void setClhUnloadContact(String clhUnloadContact) {
		this.clhUnloadContact = clhUnloadContact;
	}

	@Column(name = "CLH_UNLOAD_TEL", length = 200)
	public String getClhUnloadTel() {
		return this.clhUnloadTel;
	}

	public void setClhUnloadTel(String clhUnloadTel) {
		this.clhUnloadTel = clhUnloadTel;
	}

	@Column(name = "CLH_EXPECT_UNLOAD_DATETIME", length = 11)
	public Timestamp getClhExpectUnloadDatetime() {
		return this.clhExpectUnloadDatetime;
	}

	public void setClhExpectUnloadDatetime(Timestamp clhExpectUnloadDatetime) {
		this.clhExpectUnloadDatetime = clhExpectUnloadDatetime;
	}

	@Column(name = "CLH_EXPECT_UNLOAD_DATE", length = 7)
	public Timestamp getClhExpectUnloadDate() {
		return this.clhExpectUnloadDate;
	}

	public void setClhExpectUnloadDate(Timestamp clhExpectUnloadDate) {
		this.clhExpectUnloadDate = clhExpectUnloadDate;
	}

	@Column(name = "CLH_DISTANCE", precision = 18, scale = 6)
	public Double getClhDistance() {
		return this.clhDistance;
	}

	public void setClhDistance(Double clhDistance) {
		this.clhDistance = clhDistance;
	}

	@Column(name = "CLH_DIRECTION", precision = 22, scale = 0)
	public BigDecimal getClhDirection() {
		return this.clhDirection;
	}

	public void setClhDirection(BigDecimal clhDirection) {
		this.clhDirection = clhDirection;
	}

	@Column(name = "CLH_ROUND", precision = 22, scale = 0)
	public BigDecimal getClhRound() {
		return this.clhRound;
	}

	public void setClhRound(BigDecimal clhRound) {
		this.clhRound = clhRound;
	}

	@Column(name = "CLH_REDELIVER_CAUSE_ID", precision = 22, scale = 0)
	public BigDecimal getClhRedeliverCauseId() {
		return this.clhRedeliverCauseId;
	}

	public void setClhRedeliverCauseId(BigDecimal clhRedeliverCauseId) {
		this.clhRedeliverCauseId = clhRedeliverCauseId;
	}

	@Column(name = "CLH_RELEGATE_TO")
	public String getClhRelegateTo() {
		return this.clhRelegateTo;
	}

	public void setClhRelegateTo(String clhRelegateTo) {
		this.clhRelegateTo = clhRelegateTo;
	}

	@Column(name = "CLH_CARRIER_ID", precision = 22, scale = 0)
	public BigDecimal getClhCarrierId() {
		return this.clhCarrierId;
	}

	public void setClhCarrierId(BigDecimal clhCarrierId) {
		this.clhCarrierId = clhCarrierId;
	}

	@Column(name = "CLH_TRUCK_ID", precision = 22, scale = 0)
	public BigDecimal getClhTruckId() {
		return this.clhTruckId;
	}

	public void setClhTruckId(BigDecimal clhTruckId) {
		this.clhTruckId = clhTruckId;
	}

	@Column(name = "CLH_TRUCK_LICENSE_NO", length = 80)
	public String getClhTruckLicenseNo() {
		return this.clhTruckLicenseNo;
	}

	public void setClhTruckLicenseNo(String clhTruckLicenseNo) {
		this.clhTruckLicenseNo = clhTruckLicenseNo;
	}

	@Column(name = "CLH_TRUCK_CODE", length = 80)
	public String getClhTruckCode() {
		return this.clhTruckCode;
	}

	public void setClhTruckCode(String clhTruckCode) {
		this.clhTruckCode = clhTruckCode;
	}

	@Column(name = "CLH_PRIMARY_DRIVER_ID", precision = 22, scale = 0)
	public BigDecimal getClhPrimaryDriverId() {
		return this.clhPrimaryDriverId;
	}

	public void setClhPrimaryDriverId(BigDecimal clhPrimaryDriverId) {
		this.clhPrimaryDriverId = clhPrimaryDriverId;
	}

	@Column(name = "CLH_PRIMARY_DRIVER", length = 200)
	public String getClhPrimaryDriver() {
		return this.clhPrimaryDriver;
	}

	public void setClhPrimaryDriver(String clhPrimaryDriver) {
		this.clhPrimaryDriver = clhPrimaryDriver;
	}

	@Column(name = "CLH_PRIMARY_TEL", length = 200)
	public String getClhPrimaryTel() {
		return this.clhPrimaryTel;
	}

	public void setClhPrimaryTel(String clhPrimaryTel) {
		this.clhPrimaryTel = clhPrimaryTel;
	}

	@Column(name = "CLH_PRIMARY_ID_NO", length = 200)
	public String getClhPrimaryIdNo() {
		return this.clhPrimaryIdNo;
	}

	public void setClhPrimaryIdNo(String clhPrimaryIdNo) {
		this.clhPrimaryIdNo = clhPrimaryIdNo;
	}

	@Column(name = "CLH_PRIMARY_LICENSE_NO", length = 200)
	public String getClhPrimaryLicenseNo() {
		return this.clhPrimaryLicenseNo;
	}

	public void setClhPrimaryLicenseNo(String clhPrimaryLicenseNo) {
		this.clhPrimaryLicenseNo = clhPrimaryLicenseNo;
	}

	@Column(name = "CLH_PRIMARY_BIZ_NO", length = 200)
	public String getClhPrimaryBizNo() {
		return this.clhPrimaryBizNo;
	}

	public void setClhPrimaryBizNo(String clhPrimaryBizNo) {
		this.clhPrimaryBizNo = clhPrimaryBizNo;
	}

	@Column(name = "CLH_SECONDARY_DRIVER_ID", precision = 22, scale = 0)
	public BigDecimal getClhSecondaryDriverId() {
		return this.clhSecondaryDriverId;
	}

	public void setClhSecondaryDriverId(BigDecimal clhSecondaryDriverId) {
		this.clhSecondaryDriverId = clhSecondaryDriverId;
	}

	@Column(name = "CLH_SECONDARY_DRIVER", length = 200)
	public String getClhSecondaryDriver() {
		return this.clhSecondaryDriver;
	}

	public void setClhSecondaryDriver(String clhSecondaryDriver) {
		this.clhSecondaryDriver = clhSecondaryDriver;
	}

	@Column(name = "CLH_SECONDARY_TEL", length = 200)
	public String getClhSecondaryTel() {
		return this.clhSecondaryTel;
	}

	public void setClhSecondaryTel(String clhSecondaryTel) {
		this.clhSecondaryTel = clhSecondaryTel;
	}

	@Column(name = "CLH_SECONDARY_ID_NO", length = 200)
	public String getClhSecondaryIdNo() {
		return this.clhSecondaryIdNo;
	}

	public void setClhSecondaryIdNo(String clhSecondaryIdNo) {
		this.clhSecondaryIdNo = clhSecondaryIdNo;
	}

	@Column(name = "CLH_SECONDARY_LICENSE_NO", length = 200)
	public String getClhSecondaryLicenseNo() {
		return this.clhSecondaryLicenseNo;
	}

	public void setClhSecondaryLicenseNo(String clhSecondaryLicenseNo) {
		this.clhSecondaryLicenseNo = clhSecondaryLicenseNo;
	}

	@Column(name = "CLH_SECONDARY_BIZ_NO", length = 200)
	public String getClhSecondaryBizNo() {
		return this.clhSecondaryBizNo;
	}

	public void setClhSecondaryBizNo(String clhSecondaryBizNo) {
		this.clhSecondaryBizNo = clhSecondaryBizNo;
	}

	@Column(name = "CLH_ESCORT_STAFF_ID", precision = 22, scale = 0)
	public BigDecimal getClhEscortStaffId() {
		return this.clhEscortStaffId;
	}

	public void setClhEscortStaffId(BigDecimal clhEscortStaffId) {
		this.clhEscortStaffId = clhEscortStaffId;
	}

	@Column(name = "CLH_ESCORT_STAFF", length = 200)
	public String getClhEscortStaff() {
		return this.clhEscortStaff;
	}

	public void setClhEscortStaff(String clhEscortStaff) {
		this.clhEscortStaff = clhEscortStaff;
	}

	@Column(name = "CLH_ESCORT_TEL", length = 200)
	public String getClhEscortTel() {
		return this.clhEscortTel;
	}

	public void setClhEscortTel(String clhEscortTel) {
		this.clhEscortTel = clhEscortTel;
	}

	@Column(name = "CLH_ESCORT_ID_NO", length = 200)
	public String getClhEscortIdNo() {
		return this.clhEscortIdNo;
	}

	public void setClhEscortIdNo(String clhEscortIdNo) {
		this.clhEscortIdNo = clhEscortIdNo;
	}

	@Column(name = "CLH_ESCORT_BIZ_NO", length = 200)
	public String getClhEscortBizNo() {
		return this.clhEscortBizNo;
	}

	public void setClhEscortBizNo(String clhEscortBizNo) {
		this.clhEscortBizNo = clhEscortBizNo;
	}

	@Column(name = "CLH_LOAD_OPERATOR_ID", precision = 22, scale = 0)
	public BigDecimal getClhLoadOperatorId() {
		return this.clhLoadOperatorId;
	}

	public void setClhLoadOperatorId(BigDecimal clhLoadOperatorId) {
		this.clhLoadOperatorId = clhLoadOperatorId;
	}

	@Column(name = "CLH_UNLOAD_OPERATOR_ID", precision = 22, scale = 0)
	public BigDecimal getClhUnloadOperatorId() {
		return this.clhUnloadOperatorId;
	}

	public void setClhUnloadOperatorId(BigDecimal clhUnloadOperatorId) {
		this.clhUnloadOperatorId = clhUnloadOperatorId;
	}

	@Column(name = "CLH_SIGN_OPERATOR_ID", precision = 22, scale = 0)
	public BigDecimal getClhSignOperatorId() {
		return this.clhSignOperatorId;
	}

	public void setClhSignOperatorId(BigDecimal clhSignOperatorId) {
		this.clhSignOperatorId = clhSignOperatorId;
	}

	@Column(name = "CLH_SIGN_RESULT", length = 100)
	public String getClhSignResult() {
		return this.clhSignResult;
	}

	public void setClhSignResult(String clhSignResult) {
		this.clhSignResult = clhSignResult;
	}

	@Column(name = "LINE1", length = 100)
	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@Column(name = "CLH_ASSIGNED_LOAD_OPERATOR_ID", precision = 22, scale = 0)
	public BigDecimal getClhAssignedLoadOperatorId() {
		return this.clhAssignedLoadOperatorId;
	}

	public void setClhAssignedLoadOperatorId(BigDecimal clhAssignedLoadOperatorId) {
		this.clhAssignedLoadOperatorId = clhAssignedLoadOperatorId;
	}

	@Column(name = "CLH_VENDOR_ID", precision = 22, scale = 0)
	public BigDecimal getClhVendorId() {
		return this.clhVendorId;
	}

	public void setClhVendorId(BigDecimal clhVendorId) {
		this.clhVendorId = clhVendorId;
	}

	@Column(name = "CLH_CUSTOMER_ID", precision = 22, scale = 0)
	public BigDecimal getClhCustomerId() {
		return this.clhCustomerId;
	}

	public void setClhCustomerId(BigDecimal clhCustomerId) {
		this.clhCustomerId = clhCustomerId;
	}

	@Column(name = "CLH_EXPECT_LOAD_DATETIME_U", length = 11)
	public Timestamp getClhExpectLoadDatetimeU() {
		return this.clhExpectLoadDatetimeU;
	}

	public void setClhExpectLoadDatetimeU(Timestamp clhExpectLoadDatetimeU) {
		this.clhExpectLoadDatetimeU = clhExpectLoadDatetimeU;
	}

	@Column(name = "CLH_EXPECT_LOAD_DATE_U", length = 7)
	public Timestamp getClhExpectLoadDateU() {
		return this.clhExpectLoadDateU;
	}

	public void setClhExpectLoadDateU(Timestamp clhExpectLoadDateU) {
		this.clhExpectLoadDateU = clhExpectLoadDateU;
	}

	@Column(name = "CLH_EXPECT_UNLOAD_DATETIME_U", length = 11)
	public Timestamp getClhExpectUnloadDatetimeU() {
		return this.clhExpectUnloadDatetimeU;
	}

	public void setClhExpectUnloadDatetimeU(Timestamp clhExpectUnloadDatetimeU) {
		this.clhExpectUnloadDatetimeU = clhExpectUnloadDatetimeU;
	}

	@Column(name = "CLH_EXPECT_UNLOAD_DATE_U", length = 7)
	public Timestamp getClhExpectUnloadDateU() {
		return this.clhExpectUnloadDateU;
	}

	public void setClhExpectUnloadDateU(Timestamp clhExpectUnloadDateU) {
		this.clhExpectUnloadDateU = clhExpectUnloadDateU;
	}

	@Column(name = "CLH_GNL_DISPATCHORG", precision = 22, scale = 0)
	public BigDecimal getClhGnlDispatchorg() {
		return this.clhGnlDispatchorg;
	}

	public void setClhGnlDispatchorg(BigDecimal clhGnlDispatchorg) {
		this.clhGnlDispatchorg = clhGnlDispatchorg;
	}

	@Column(name = "CARGOLOADTYPE", precision = 22, scale = 0)
	public BigDecimal getCargoloadtype() {
		return this.cargoloadtype;
	}

	public void setCargoloadtype(BigDecimal cargoloadtype) {
		this.cargoloadtype = cargoloadtype;
	}

	@Column(name = "CLH_IS_RETURN_GNL_DISP_ORG", precision = 22, scale = 0)
	public BigDecimal getClhIsReturnGnlDispOrg() {
		return this.clhIsReturnGnlDispOrg;
	}

	public void setClhIsReturnGnlDispOrg(BigDecimal clhIsReturnGnlDispOrg) {
		this.clhIsReturnGnlDispOrg = clhIsReturnGnlDispOrg;
	}

	@Column(name = "CLH_TOTAL_REJECT_QTY", precision = 18, scale = 6)
	public Double getClhTotalRejectQty() {
		return this.clhTotalRejectQty;
	}

	public void setClhTotalRejectQty(Double clhTotalRejectQty) {
		this.clhTotalRejectQty = clhTotalRejectQty;
	}

	@Column(name = "CLH_YCLX", length = 100)
	public String getClhYclx() {
		return this.clhYclx;
	}

	public void setClhYclx(String clhYclx) {
		this.clhYclx = clhYclx;
	}

	@Column(name = "CLH_ZHLC", length = 100)
	public String getClhZhlc() {
		return this.clhZhlc;
	}

	public void setClhZhlc(String clhZhlc) {
		this.clhZhlc = clhZhlc;
	}

	@Column(name = "CLH_SHLC", length = 100)
	public String getClhShlc() {
		return this.clhShlc;
	}

	public void setClhShlc(String clhShlc) {
		this.clhShlc = clhShlc;
	}

	@Column(name = "CLH_JSPC", length = 100)
	public String getClhJspc() {
		return this.clhJspc;
	}

	public void setClhJspc(String clhJspc) {
		this.clhJspc = clhJspc;
	}

	@Column(name = "CLH_JSCX", precision = 22, scale = 0)
	public BigDecimal getClhJscx() {
		return this.clhJscx;
	}

	public void setClhJscx(BigDecimal clhJscx) {
		this.clhJscx = clhJscx;
	}

	@Column(name = "CLH_JSSL", precision = 16)
	public Double getClhJssl() {
		return this.clhJssl;
	}

	public void setClhJssl(Double clhJssl) {
		this.clhJssl = clhJssl;
	}

	@Column(name = "BEIZHU", length = 100)
	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	@Column(name = "CLH_JS", precision = 16, scale = 4)
	public Double getClhJs() {
		return this.clhJs;
	}

	public void setClhJs(Double clhJs) {
		this.clhJs = clhJs;
	}

	@Column(name = "CLH_JFZFYF", precision = 22, scale = 0)
	public BigDecimal getClhJfzfyf() {
		return this.clhJfzfyf;
	}

	public void setClhJfzfyf(BigDecimal clhJfzfyf) {
		this.clhJfzfyf = clhJfzfyf;
	}

	@Column(name = "CLH_EXPECT_LOAD_DATETWO", length = 7)
	public Timestamp getClhExpectLoadDatetwo() {
		return this.clhExpectLoadDatetwo;
	}

	public void setClhExpectLoadDatetwo(Timestamp clhExpectLoadDatetwo) {
		this.clhExpectLoadDatetwo = clhExpectLoadDatetwo;
	}

	@Column(name = "CLH_EXPECT_LOAD_DATE_UTWO", length = 7)
	public Timestamp getClhExpectLoadDateUtwo() {
		return this.clhExpectLoadDateUtwo;
	}

	public void setClhExpectLoadDateUtwo(Timestamp clhExpectLoadDateUtwo) {
		this.clhExpectLoadDateUtwo = clhExpectLoadDateUtwo;
	}

	@Column(name = "CLH_EXPECT_UNLOAD_DATETWO", length = 7)
	public Timestamp getClhExpectUnloadDatetwo() {
		return this.clhExpectUnloadDatetwo;
	}

	public void setClhExpectUnloadDatetwo(Timestamp clhExpectUnloadDatetwo) {
		this.clhExpectUnloadDatetwo = clhExpectUnloadDatetwo;
	}

	@Column(name = "CLH_EXPECT_UNLOAD_DATETIMETWO", length = 7)
	public Timestamp getClhExpectUnloadDatetimetwo() {
		return this.clhExpectUnloadDatetimetwo;
	}

	public void setClhExpectUnloadDatetimetwo(Timestamp clhExpectUnloadDatetimetwo) {
		this.clhExpectUnloadDatetimetwo = clhExpectUnloadDatetimetwo;
	}

	@Column(name = "CLH_CWFXXL", precision = 22, scale = 0)
	public BigDecimal getClhCwfxxl() {
		return this.clhCwfxxl;
	}

	public void setClhCwfxxl(BigDecimal clhCwfxxl) {
		this.clhCwfxxl = clhCwfxxl;
	}

	@Column(name = "CLH_BEILIAODANHAO", length = 100)
	public String getClhBeiliaodanhao() {
		return this.clhBeiliaodanhao;
	}

	public void setClhBeiliaodanhao(String clhBeiliaodanhao) {
		this.clhBeiliaodanhao = clhBeiliaodanhao;
	}

}