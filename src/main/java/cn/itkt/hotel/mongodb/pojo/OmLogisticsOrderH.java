package cn.itkt.hotel.mongodb.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OmLogisticsOrderH entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "OM_LOGISTICS_ORDER_H", schema = "ERIJSHY")
public class OmLogisticsOrderH implements java.io.Serializable {

	// Fields    

	private BigDecimal billid;
	private BigDecimal billtype;
	private BigDecimal sequence;
	private BigDecimal ccid;
	private BigDecimal maker;
	private BigDecimal mender;
	private Timestamp makedate;
	private Timestamp editdate;
	private BigDecimal lohOrgId;
	private String lohLogisticsNo;
	private String lohType;
	private Timestamp lohOrderDatetime;
	private Timestamp lohOrderDate;
	private BigDecimal status;
	private BigDecimal lohOwnerId;
	private BigDecimal lohOutboundTxTypeId;
	private BigDecimal lohOutboundFlowHeaderId;
	private BigDecimal lohInboundTxTypeId;
	private BigDecimal lohInboundFlowHeaderId;
	private BigDecimal lohEmergencyDegreeId;
	private String lohOwnerNo;
	private BigDecimal lohVendorId;
	private BigDecimal lohCustomerId;
	private Timestamp lohExpectLoadDatetime;
	private Timestamp lohExpectLoadDate;
	private String lohLoadPlaceName;
	private BigDecimal lohLoadAreaId;
	private String lohLoadUnitName;
	private String lohLoadAddress;
	private String lohLoadPostCode;
	private String lohLoadContact;
	private String lohLoadTel;
	private String lohUnloadPlaceName;
	private BigDecimal lohUnloadAreaId;
	private String lohUnloadUnitName;
	private String lohUnloadAddress;
	private String lohUnloadPostCode;
	private String lohUnloadContact;
	private String lohUnloadTel;
	private Double lohTotalGrossWeight;
	private Double lohTotalNetWeight;
	private Double lohTotalCubage;
	private Double lohTotalAmount;
	private Double lohTotalPacks;
	private String lohOwnerSystemName;
	private BigDecimal lohIsPreorder;
	private String lohDeliveryMode;
	private BigDecimal lohLoadOrgId;
	private BigDecimal lohUnloadOrgId;
	private String lohRemark;
	private BigDecimal lohCollectOrgId;
	private BigDecimal lohDeliverOrgId;
	private String lohCashOnDelivery;
	private Double lohCodTotal;
	private Double lohCodByMachine;
	private Double lohCodByCash;
	private String lohWaveNo;
	private Timestamp lohActualDate;
	private Timestamp lohActualDatetime;
	private BigDecimal lohRouteId;
	private BigDecimal lohLoadSeq;
	private String lohEndPointCalcFlag;
	private Double lohCodCav;
	private String lohRefNo;
	private String lohExpectUnloadDateReq;
	private String lohExpectUnloadTimeReq;
	private BigDecimal lohCarrierId;
	private Double lohCodOriginalTotal;
	private Double lohDelivererTurnInPos;
	private Double lohDelivererTurnInCash;
	private Double lohOrgTurnInPos;
	private Double lohOrgTurnInCash;
	private Timestamp lohExpectLoadDatetimeU;
	private Timestamp lohExpectLoadDateU;
	private Timestamp lohExpectUnloadDatetime;
	private Timestamp lohExpectUnloadDate;
	private Timestamp lohExpectUnloadDatetimeU;
	private Timestamp lohExpectUnloadDateU;
	private BigDecimal lohTransportmodeid;
	private BigDecimal lohDeliverymodeid;
	private BigDecimal lohSettleMethodId;
	private BigDecimal lohGnlDispatchorg;
	private BigDecimal lohExDispatchorg;
	private BigDecimal lohPlant;
	private BigDecimal lohStaffId;
	private String yclx;
	private String zhlc;
	private String shlc;
	private Double jiesuanliang;
	private BigDecimal jinjichengdu;
	private Double jsl;
	private BigDecimal lohJscx;
	private String jiesuanpici;
	private BigDecimal lohSfws;
	private String xzzhd;
	private Double jssl;
	private BigDecimal jfzfyf;
	private BigDecimal cwfxxl;
	private BigDecimal lohXm;
	private String lohJsbzdh;
	private BigDecimal lohDailishang;
	private BigDecimal typeid;
	private String jsdno;
	private BigDecimal yewuleixing;
	private Double zongzhengjianshu;
	private BigDecimal zhuangxiefang;
	private String jigoubianhao;
	private String shouhuojigoubianhao;
	private BigDecimal truck;
	private String jstj;

	// Constructors

	/** default constructor */
	public OmLogisticsOrderH() {
	}

	/** minimal constructor */
	public OmLogisticsOrderH(BigDecimal billid) {
		this.billid = billid;
	}

	/** full constructor */
	public OmLogisticsOrderH(BigDecimal billid, BigDecimal billtype, BigDecimal sequence, BigDecimal ccid, BigDecimal maker,
			BigDecimal mender, Timestamp makedate, Timestamp editdate, BigDecimal lohOrgId, String lohLogisticsNo, String lohType,
			Timestamp lohOrderDatetime, Timestamp lohOrderDate, BigDecimal status, BigDecimal lohOwnerId, BigDecimal lohOutboundTxTypeId,
			BigDecimal lohOutboundFlowHeaderId, BigDecimal lohInboundTxTypeId, BigDecimal lohInboundFlowHeaderId,
			BigDecimal lohEmergencyDegreeId, String lohOwnerNo, BigDecimal lohVendorId, BigDecimal lohCustomerId,
			Timestamp lohExpectLoadDatetime, Timestamp lohExpectLoadDate, String lohLoadPlaceName, BigDecimal lohLoadAreaId,
			String lohLoadUnitName, String lohLoadAddress, String lohLoadPostCode, String lohLoadContact, String lohLoadTel,
			String lohUnloadPlaceName, BigDecimal lohUnloadAreaId, String lohUnloadUnitName, String lohUnloadAddress,
			String lohUnloadPostCode, String lohUnloadContact, String lohUnloadTel, Double lohTotalGrossWeight, Double lohTotalNetWeight,
			Double lohTotalCubage, Double lohTotalAmount, Double lohTotalPacks, String lohOwnerSystemName, BigDecimal lohIsPreorder,
			String lohDeliveryMode, BigDecimal lohLoadOrgId, BigDecimal lohUnloadOrgId, String lohRemark, BigDecimal lohCollectOrgId,
			BigDecimal lohDeliverOrgId, String lohCashOnDelivery, Double lohCodTotal, Double lohCodByMachine, Double lohCodByCash,
			String lohWaveNo, Timestamp lohActualDate, Timestamp lohActualDatetime, BigDecimal lohRouteId, BigDecimal lohLoadSeq,
			String lohEndPointCalcFlag, Double lohCodCav, String lohRefNo, String lohExpectUnloadDateReq, String lohExpectUnloadTimeReq,
			BigDecimal lohCarrierId, Double lohCodOriginalTotal, Double lohDelivererTurnInPos, Double lohDelivererTurnInCash,
			Double lohOrgTurnInPos, Double lohOrgTurnInCash, Timestamp lohExpectLoadDatetimeU, Timestamp lohExpectLoadDateU,
			Timestamp lohExpectUnloadDatetime, Timestamp lohExpectUnloadDate, Timestamp lohExpectUnloadDatetimeU,
			Timestamp lohExpectUnloadDateU, BigDecimal lohTransportmodeid, BigDecimal lohDeliverymodeid, BigDecimal lohSettleMethodId,
			BigDecimal lohGnlDispatchorg, BigDecimal lohExDispatchorg, BigDecimal lohPlant, BigDecimal lohStaffId, String yclx,
			String zhlc, String shlc, Double jiesuanliang, BigDecimal jinjichengdu, Double jsl, BigDecimal lohJscx, String jiesuanpici,
			BigDecimal lohSfws, String xzzhd, Double jssl, BigDecimal jfzfyf, BigDecimal cwfxxl, BigDecimal lohXm, String lohJsbzdh,
			BigDecimal lohDailishang, BigDecimal typeid, String jsdno, BigDecimal yewuleixing, Double zongzhengjianshu,
			BigDecimal zhuangxiefang, String jigoubianhao, String shouhuojigoubianhao, BigDecimal truck, String jstj) {
		this.billid = billid;
		this.billtype = billtype;
		this.sequence = sequence;
		this.ccid = ccid;
		this.maker = maker;
		this.mender = mender;
		this.makedate = makedate;
		this.editdate = editdate;
		this.lohOrgId = lohOrgId;
		this.lohLogisticsNo = lohLogisticsNo;
		this.lohType = lohType;
		this.lohOrderDatetime = lohOrderDatetime;
		this.lohOrderDate = lohOrderDate;
		this.status = status;
		this.lohOwnerId = lohOwnerId;
		this.lohOutboundTxTypeId = lohOutboundTxTypeId;
		this.lohOutboundFlowHeaderId = lohOutboundFlowHeaderId;
		this.lohInboundTxTypeId = lohInboundTxTypeId;
		this.lohInboundFlowHeaderId = lohInboundFlowHeaderId;
		this.lohEmergencyDegreeId = lohEmergencyDegreeId;
		this.lohOwnerNo = lohOwnerNo;
		this.lohVendorId = lohVendorId;
		this.lohCustomerId = lohCustomerId;
		this.lohExpectLoadDatetime = lohExpectLoadDatetime;
		this.lohExpectLoadDate = lohExpectLoadDate;
		this.lohLoadPlaceName = lohLoadPlaceName;
		this.lohLoadAreaId = lohLoadAreaId;
		this.lohLoadUnitName = lohLoadUnitName;
		this.lohLoadAddress = lohLoadAddress;
		this.lohLoadPostCode = lohLoadPostCode;
		this.lohLoadContact = lohLoadContact;
		this.lohLoadTel = lohLoadTel;
		this.lohUnloadPlaceName = lohUnloadPlaceName;
		this.lohUnloadAreaId = lohUnloadAreaId;
		this.lohUnloadUnitName = lohUnloadUnitName;
		this.lohUnloadAddress = lohUnloadAddress;
		this.lohUnloadPostCode = lohUnloadPostCode;
		this.lohUnloadContact = lohUnloadContact;
		this.lohUnloadTel = lohUnloadTel;
		this.lohTotalGrossWeight = lohTotalGrossWeight;
		this.lohTotalNetWeight = lohTotalNetWeight;
		this.lohTotalCubage = lohTotalCubage;
		this.lohTotalAmount = lohTotalAmount;
		this.lohTotalPacks = lohTotalPacks;
		this.lohOwnerSystemName = lohOwnerSystemName;
		this.lohIsPreorder = lohIsPreorder;
		this.lohDeliveryMode = lohDeliveryMode;
		this.lohLoadOrgId = lohLoadOrgId;
		this.lohUnloadOrgId = lohUnloadOrgId;
		this.lohRemark = lohRemark;
		this.lohCollectOrgId = lohCollectOrgId;
		this.lohDeliverOrgId = lohDeliverOrgId;
		this.lohCashOnDelivery = lohCashOnDelivery;
		this.lohCodTotal = lohCodTotal;
		this.lohCodByMachine = lohCodByMachine;
		this.lohCodByCash = lohCodByCash;
		this.lohWaveNo = lohWaveNo;
		this.lohActualDate = lohActualDate;
		this.lohActualDatetime = lohActualDatetime;
		this.lohRouteId = lohRouteId;
		this.lohLoadSeq = lohLoadSeq;
		this.lohEndPointCalcFlag = lohEndPointCalcFlag;
		this.lohCodCav = lohCodCav;
		this.lohRefNo = lohRefNo;
		this.lohExpectUnloadDateReq = lohExpectUnloadDateReq;
		this.lohExpectUnloadTimeReq = lohExpectUnloadTimeReq;
		this.lohCarrierId = lohCarrierId;
		this.lohCodOriginalTotal = lohCodOriginalTotal;
		this.lohDelivererTurnInPos = lohDelivererTurnInPos;
		this.lohDelivererTurnInCash = lohDelivererTurnInCash;
		this.lohOrgTurnInPos = lohOrgTurnInPos;
		this.lohOrgTurnInCash = lohOrgTurnInCash;
		this.lohExpectLoadDatetimeU = lohExpectLoadDatetimeU;
		this.lohExpectLoadDateU = lohExpectLoadDateU;
		this.lohExpectUnloadDatetime = lohExpectUnloadDatetime;
		this.lohExpectUnloadDate = lohExpectUnloadDate;
		this.lohExpectUnloadDatetimeU = lohExpectUnloadDatetimeU;
		this.lohExpectUnloadDateU = lohExpectUnloadDateU;
		this.lohTransportmodeid = lohTransportmodeid;
		this.lohDeliverymodeid = lohDeliverymodeid;
		this.lohSettleMethodId = lohSettleMethodId;
		this.lohGnlDispatchorg = lohGnlDispatchorg;
		this.lohExDispatchorg = lohExDispatchorg;
		this.lohPlant = lohPlant;
		this.lohStaffId = lohStaffId;
		this.yclx = yclx;
		this.zhlc = zhlc;
		this.shlc = shlc;
		this.jiesuanliang = jiesuanliang;
		this.jinjichengdu = jinjichengdu;
		this.jsl = jsl;
		this.lohJscx = lohJscx;
		this.jiesuanpici = jiesuanpici;
		this.lohSfws = lohSfws;
		this.xzzhd = xzzhd;
		this.jssl = jssl;
		this.jfzfyf = jfzfyf;
		this.cwfxxl = cwfxxl;
		this.lohXm = lohXm;
		this.lohJsbzdh = lohJsbzdh;
		this.lohDailishang = lohDailishang;
		this.typeid = typeid;
		this.jsdno = jsdno;
		this.yewuleixing = yewuleixing;
		this.zongzhengjianshu = zongzhengjianshu;
		this.zhuangxiefang = zhuangxiefang;
		this.jigoubianhao = jigoubianhao;
		this.shouhuojigoubianhao = shouhuojigoubianhao;
		this.truck = truck;
		this.jstj = jstj;
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

	@Column(name = "CCID", precision = 22, scale = 0)
	public BigDecimal getCcid() {
		return this.ccid;
	}

	public void setCcid(BigDecimal ccid) {
		this.ccid = ccid;
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

	@Column(name = "LOH_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getLohOrgId() {
		return this.lohOrgId;
	}

	public void setLohOrgId(BigDecimal lohOrgId) {
		this.lohOrgId = lohOrgId;
	}

	@Column(name = "LOH_LOGISTICS_NO", length = 80)
	public String getLohLogisticsNo() {
		return this.lohLogisticsNo;
	}

	public void setLohLogisticsNo(String lohLogisticsNo) {
		this.lohLogisticsNo = lohLogisticsNo;
	}

	@Column(name = "LOH_TYPE")
	public String getLohType() {
		return this.lohType;
	}

	public void setLohType(String lohType) {
		this.lohType = lohType;
	}

	@Column(name = "LOH_ORDER_DATETIME", length = 11)
	public Timestamp getLohOrderDatetime() {
		return this.lohOrderDatetime;
	}

	public void setLohOrderDatetime(Timestamp lohOrderDatetime) {
		this.lohOrderDatetime = lohOrderDatetime;
	}

	@Column(name = "LOH_ORDER_DATE", length = 7)
	public Timestamp getLohOrderDate() {
		return this.lohOrderDate;
	}

	public void setLohOrderDate(Timestamp lohOrderDate) {
		this.lohOrderDate = lohOrderDate;
	}

	@Column(name = "STATUS", precision = 22, scale = 0)
	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	@Column(name = "LOH_OWNER_ID", precision = 22, scale = 0)
	public BigDecimal getLohOwnerId() {
		return this.lohOwnerId;
	}

	public void setLohOwnerId(BigDecimal lohOwnerId) {
		this.lohOwnerId = lohOwnerId;
	}

	@Column(name = "LOH_OUTBOUND_TX_TYPE_ID", precision = 22, scale = 0)
	public BigDecimal getLohOutboundTxTypeId() {
		return this.lohOutboundTxTypeId;
	}

	public void setLohOutboundTxTypeId(BigDecimal lohOutboundTxTypeId) {
		this.lohOutboundTxTypeId = lohOutboundTxTypeId;
	}

	@Column(name = "LOH_OUTBOUND_FLOW_HEADER_ID", precision = 22, scale = 0)
	public BigDecimal getLohOutboundFlowHeaderId() {
		return this.lohOutboundFlowHeaderId;
	}

	public void setLohOutboundFlowHeaderId(BigDecimal lohOutboundFlowHeaderId) {
		this.lohOutboundFlowHeaderId = lohOutboundFlowHeaderId;
	}

	@Column(name = "LOH_INBOUND_TX_TYPE_ID", precision = 22, scale = 0)
	public BigDecimal getLohInboundTxTypeId() {
		return this.lohInboundTxTypeId;
	}

	public void setLohInboundTxTypeId(BigDecimal lohInboundTxTypeId) {
		this.lohInboundTxTypeId = lohInboundTxTypeId;
	}

	@Column(name = "LOH_INBOUND_FLOW_HEADER_ID", precision = 22, scale = 0)
	public BigDecimal getLohInboundFlowHeaderId() {
		return this.lohInboundFlowHeaderId;
	}

	public void setLohInboundFlowHeaderId(BigDecimal lohInboundFlowHeaderId) {
		this.lohInboundFlowHeaderId = lohInboundFlowHeaderId;
	}

	@Column(name = "LOH_EMERGENCY_DEGREE_ID", precision = 22, scale = 0)
	public BigDecimal getLohEmergencyDegreeId() {
		return this.lohEmergencyDegreeId;
	}

	public void setLohEmergencyDegreeId(BigDecimal lohEmergencyDegreeId) {
		this.lohEmergencyDegreeId = lohEmergencyDegreeId;
	}

	@Column(name = "LOH_OWNER_NO", length = 80)
	public String getLohOwnerNo() {
		return this.lohOwnerNo;
	}

	public void setLohOwnerNo(String lohOwnerNo) {
		this.lohOwnerNo = lohOwnerNo;
	}

	@Column(name = "LOH_VENDOR_ID", precision = 22, scale = 0)
	public BigDecimal getLohVendorId() {
		return this.lohVendorId;
	}

	public void setLohVendorId(BigDecimal lohVendorId) {
		this.lohVendorId = lohVendorId;
	}

	@Column(name = "LOH_CUSTOMER_ID", precision = 22, scale = 0)
	public BigDecimal getLohCustomerId() {
		return this.lohCustomerId;
	}

	public void setLohCustomerId(BigDecimal lohCustomerId) {
		this.lohCustomerId = lohCustomerId;
	}

	@Column(name = "LOH_EXPECT_LOAD_DATETIME", length = 11)
	public Timestamp getLohExpectLoadDatetime() {
		return this.lohExpectLoadDatetime;
	}

	public void setLohExpectLoadDatetime(Timestamp lohExpectLoadDatetime) {
		this.lohExpectLoadDatetime = lohExpectLoadDatetime;
	}

	@Column(name = "LOH_EXPECT_LOAD_DATE", length = 7)
	public Timestamp getLohExpectLoadDate() {
		return this.lohExpectLoadDate;
	}

	public void setLohExpectLoadDate(Timestamp lohExpectLoadDate) {
		this.lohExpectLoadDate = lohExpectLoadDate;
	}

	@Column(name = "LOH_LOAD_PLACE_NAME", length = 200)
	public String getLohLoadPlaceName() {
		return this.lohLoadPlaceName;
	}

	public void setLohLoadPlaceName(String lohLoadPlaceName) {
		this.lohLoadPlaceName = lohLoadPlaceName;
	}

	@Column(name = "LOH_LOAD_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getLohLoadAreaId() {
		return this.lohLoadAreaId;
	}

	public void setLohLoadAreaId(BigDecimal lohLoadAreaId) {
		this.lohLoadAreaId = lohLoadAreaId;
	}

	@Column(name = "LOH_LOAD_UNIT_NAME", length = 200)
	public String getLohLoadUnitName() {
		return this.lohLoadUnitName;
	}

	public void setLohLoadUnitName(String lohLoadUnitName) {
		this.lohLoadUnitName = lohLoadUnitName;
	}

	@Column(name = "LOH_LOAD_ADDRESS", length = 400)
	public String getLohLoadAddress() {
		return this.lohLoadAddress;
	}

	public void setLohLoadAddress(String lohLoadAddress) {
		this.lohLoadAddress = lohLoadAddress;
	}

	@Column(name = "LOH_LOAD_POST_CODE", length = 80)
	public String getLohLoadPostCode() {
		return this.lohLoadPostCode;
	}

	public void setLohLoadPostCode(String lohLoadPostCode) {
		this.lohLoadPostCode = lohLoadPostCode;
	}

	@Column(name = "LOH_LOAD_CONTACT", length = 200)
	public String getLohLoadContact() {
		return this.lohLoadContact;
	}

	public void setLohLoadContact(String lohLoadContact) {
		this.lohLoadContact = lohLoadContact;
	}

	@Column(name = "LOH_LOAD_TEL", length = 200)
	public String getLohLoadTel() {
		return this.lohLoadTel;
	}

	public void setLohLoadTel(String lohLoadTel) {
		this.lohLoadTel = lohLoadTel;
	}

	@Column(name = "LOH_UNLOAD_PLACE_NAME", length = 200)
	public String getLohUnloadPlaceName() {
		return this.lohUnloadPlaceName;
	}

	public void setLohUnloadPlaceName(String lohUnloadPlaceName) {
		this.lohUnloadPlaceName = lohUnloadPlaceName;
	}

	@Column(name = "LOH_UNLOAD_AREA_ID", precision = 22, scale = 0)
	public BigDecimal getLohUnloadAreaId() {
		return this.lohUnloadAreaId;
	}

	public void setLohUnloadAreaId(BigDecimal lohUnloadAreaId) {
		this.lohUnloadAreaId = lohUnloadAreaId;
	}

	@Column(name = "LOH_UNLOAD_UNIT_NAME", length = 200)
	public String getLohUnloadUnitName() {
		return this.lohUnloadUnitName;
	}

	public void setLohUnloadUnitName(String lohUnloadUnitName) {
		this.lohUnloadUnitName = lohUnloadUnitName;
	}

	@Column(name = "LOH_UNLOAD_ADDRESS", length = 400)
	public String getLohUnloadAddress() {
		return this.lohUnloadAddress;
	}

	public void setLohUnloadAddress(String lohUnloadAddress) {
		this.lohUnloadAddress = lohUnloadAddress;
	}

	@Column(name = "LOH_UNLOAD_POST_CODE", length = 80)
	public String getLohUnloadPostCode() {
		return this.lohUnloadPostCode;
	}

	public void setLohUnloadPostCode(String lohUnloadPostCode) {
		this.lohUnloadPostCode = lohUnloadPostCode;
	}

	@Column(name = "LOH_UNLOAD_CONTACT", length = 200)
	public String getLohUnloadContact() {
		return this.lohUnloadContact;
	}

	public void setLohUnloadContact(String lohUnloadContact) {
		this.lohUnloadContact = lohUnloadContact;
	}

	@Column(name = "LOH_UNLOAD_TEL", length = 200)
	public String getLohUnloadTel() {
		return this.lohUnloadTel;
	}

	public void setLohUnloadTel(String lohUnloadTel) {
		this.lohUnloadTel = lohUnloadTel;
	}

	@Column(name = "LOH_TOTAL_GROSS_WEIGHT", precision = 18, scale = 6)
	public Double getLohTotalGrossWeight() {
		return this.lohTotalGrossWeight;
	}

	public void setLohTotalGrossWeight(Double lohTotalGrossWeight) {
		this.lohTotalGrossWeight = lohTotalGrossWeight;
	}

	@Column(name = "LOH_TOTAL_NET_WEIGHT", precision = 18, scale = 6)
	public Double getLohTotalNetWeight() {
		return this.lohTotalNetWeight;
	}

	public void setLohTotalNetWeight(Double lohTotalNetWeight) {
		this.lohTotalNetWeight = lohTotalNetWeight;
	}

	@Column(name = "LOH_TOTAL_CUBAGE", precision = 18, scale = 6)
	public Double getLohTotalCubage() {
		return this.lohTotalCubage;
	}

	public void setLohTotalCubage(Double lohTotalCubage) {
		this.lohTotalCubage = lohTotalCubage;
	}

	@Column(name = "LOH_TOTAL_AMOUNT", precision = 18, scale = 6)
	public Double getLohTotalAmount() {
		return this.lohTotalAmount;
	}

	public void setLohTotalAmount(Double lohTotalAmount) {
		this.lohTotalAmount = lohTotalAmount;
	}

	@Column(name = "LOH_TOTAL_PACKS", precision = 18, scale = 6)
	public Double getLohTotalPacks() {
		return this.lohTotalPacks;
	}

	public void setLohTotalPacks(Double lohTotalPacks) {
		this.lohTotalPacks = lohTotalPacks;
	}

	@Column(name = "LOH_OWNER_SYSTEM_NAME", length = 200)
	public String getLohOwnerSystemName() {
		return this.lohOwnerSystemName;
	}

	public void setLohOwnerSystemName(String lohOwnerSystemName) {
		this.lohOwnerSystemName = lohOwnerSystemName;
	}

	@Column(name = "LOH_IS_PREORDER", precision = 22, scale = 0)
	public BigDecimal getLohIsPreorder() {
		return this.lohIsPreorder;
	}

	public void setLohIsPreorder(BigDecimal lohIsPreorder) {
		this.lohIsPreorder = lohIsPreorder;
	}

	@Column(name = "LOH_DELIVERY_MODE")
	public String getLohDeliveryMode() {
		return this.lohDeliveryMode;
	}

	public void setLohDeliveryMode(String lohDeliveryMode) {
		this.lohDeliveryMode = lohDeliveryMode;
	}

	@Column(name = "LOH_LOAD_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getLohLoadOrgId() {
		return this.lohLoadOrgId;
	}

	public void setLohLoadOrgId(BigDecimal lohLoadOrgId) {
		this.lohLoadOrgId = lohLoadOrgId;
	}

	@Column(name = "LOH_UNLOAD_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getLohUnloadOrgId() {
		return this.lohUnloadOrgId;
	}

	public void setLohUnloadOrgId(BigDecimal lohUnloadOrgId) {
		this.lohUnloadOrgId = lohUnloadOrgId;
	}

	@Column(name = "LOH_REMARK", length = 400)
	public String getLohRemark() {
		return this.lohRemark;
	}

	public void setLohRemark(String lohRemark) {
		this.lohRemark = lohRemark;
	}

	@Column(name = "LOH_COLLECT_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getLohCollectOrgId() {
		return this.lohCollectOrgId;
	}

	public void setLohCollectOrgId(BigDecimal lohCollectOrgId) {
		this.lohCollectOrgId = lohCollectOrgId;
	}

	@Column(name = "LOH_DELIVER_ORG_ID", precision = 22, scale = 0)
	public BigDecimal getLohDeliverOrgId() {
		return this.lohDeliverOrgId;
	}

	public void setLohDeliverOrgId(BigDecimal lohDeliverOrgId) {
		this.lohDeliverOrgId = lohDeliverOrgId;
	}

	@Column(name = "LOH_CASH_ON_DELIVERY", length = 100)
	public String getLohCashOnDelivery() {
		return this.lohCashOnDelivery;
	}

	public void setLohCashOnDelivery(String lohCashOnDelivery) {
		this.lohCashOnDelivery = lohCashOnDelivery;
	}

	@Column(name = "LOH_COD_TOTAL", precision = 10)
	public Double getLohCodTotal() {
		return this.lohCodTotal;
	}

	public void setLohCodTotal(Double lohCodTotal) {
		this.lohCodTotal = lohCodTotal;
	}

	@Column(name = "LOH_COD_BY_MACHINE", precision = 10)
	public Double getLohCodByMachine() {
		return this.lohCodByMachine;
	}

	public void setLohCodByMachine(Double lohCodByMachine) {
		this.lohCodByMachine = lohCodByMachine;
	}

	@Column(name = "LOH_COD_BY_CASH", precision = 10)
	public Double getLohCodByCash() {
		return this.lohCodByCash;
	}

	public void setLohCodByCash(Double lohCodByCash) {
		this.lohCodByCash = lohCodByCash;
	}

	@Column(name = "LOH_WAVE_NO", length = 80)
	public String getLohWaveNo() {
		return this.lohWaveNo;
	}

	public void setLohWaveNo(String lohWaveNo) {
		this.lohWaveNo = lohWaveNo;
	}

	@Column(name = "LOH_ACTUAL_DATE", length = 7)
	public Timestamp getLohActualDate() {
		return this.lohActualDate;
	}

	public void setLohActualDate(Timestamp lohActualDate) {
		this.lohActualDate = lohActualDate;
	}

	@Column(name = "LOH_ACTUAL_DATETIME", length = 11)
	public Timestamp getLohActualDatetime() {
		return this.lohActualDatetime;
	}

	public void setLohActualDatetime(Timestamp lohActualDatetime) {
		this.lohActualDatetime = lohActualDatetime;
	}

	@Column(name = "LOH_ROUTE_ID", precision = 22, scale = 0)
	public BigDecimal getLohRouteId() {
		return this.lohRouteId;
	}

	public void setLohRouteId(BigDecimal lohRouteId) {
		this.lohRouteId = lohRouteId;
	}

	@Column(name = "LOH_LOAD_SEQ", precision = 22, scale = 0)
	public BigDecimal getLohLoadSeq() {
		return this.lohLoadSeq;
	}

	public void setLohLoadSeq(BigDecimal lohLoadSeq) {
		this.lohLoadSeq = lohLoadSeq;
	}

	@Column(name = "LOH_END_POINT_CALC_FLAG", length = 100)
	public String getLohEndPointCalcFlag() {
		return this.lohEndPointCalcFlag;
	}

	public void setLohEndPointCalcFlag(String lohEndPointCalcFlag) {
		this.lohEndPointCalcFlag = lohEndPointCalcFlag;
	}

	@Column(name = "LOH_COD_CAV", precision = 10)
	public Double getLohCodCav() {
		return this.lohCodCav;
	}

	public void setLohCodCav(Double lohCodCav) {
		this.lohCodCav = lohCodCav;
	}

	@Column(name = "LOH_REF_NO", length = 80)
	public String getLohRefNo() {
		return this.lohRefNo;
	}

	public void setLohRefNo(String lohRefNo) {
		this.lohRefNo = lohRefNo;
	}

	@Column(name = "LOH_EXPECT_UNLOAD_DATE_REQ", length = 20)
	public String getLohExpectUnloadDateReq() {
		return this.lohExpectUnloadDateReq;
	}

	public void setLohExpectUnloadDateReq(String lohExpectUnloadDateReq) {
		this.lohExpectUnloadDateReq = lohExpectUnloadDateReq;
	}

	@Column(name = "LOH_EXPECT_UNLOAD_TIME_REQ", length = 20)
	public String getLohExpectUnloadTimeReq() {
		return this.lohExpectUnloadTimeReq;
	}

	public void setLohExpectUnloadTimeReq(String lohExpectUnloadTimeReq) {
		this.lohExpectUnloadTimeReq = lohExpectUnloadTimeReq;
	}

	@Column(name = "LOH_CARRIER_ID", precision = 22, scale = 0)
	public BigDecimal getLohCarrierId() {
		return this.lohCarrierId;
	}

	public void setLohCarrierId(BigDecimal lohCarrierId) {
		this.lohCarrierId = lohCarrierId;
	}

	@Column(name = "LOH_COD_ORIGINAL_TOTAL", precision = 10)
	public Double getLohCodOriginalTotal() {
		return this.lohCodOriginalTotal;
	}

	public void setLohCodOriginalTotal(Double lohCodOriginalTotal) {
		this.lohCodOriginalTotal = lohCodOriginalTotal;
	}

	@Column(name = "LOH_DELIVERER_TURN_IN_POS", precision = 10)
	public Double getLohDelivererTurnInPos() {
		return this.lohDelivererTurnInPos;
	}

	public void setLohDelivererTurnInPos(Double lohDelivererTurnInPos) {
		this.lohDelivererTurnInPos = lohDelivererTurnInPos;
	}

	@Column(name = "LOH_DELIVERER_TURN_IN_CASH", precision = 10)
	public Double getLohDelivererTurnInCash() {
		return this.lohDelivererTurnInCash;
	}

	public void setLohDelivererTurnInCash(Double lohDelivererTurnInCash) {
		this.lohDelivererTurnInCash = lohDelivererTurnInCash;
	}

	@Column(name = "LOH_ORG_TURN_IN_POS", precision = 10)
	public Double getLohOrgTurnInPos() {
		return this.lohOrgTurnInPos;
	}

	public void setLohOrgTurnInPos(Double lohOrgTurnInPos) {
		this.lohOrgTurnInPos = lohOrgTurnInPos;
	}

	@Column(name = "LOH_ORG_TURN_IN_CASH", precision = 10)
	public Double getLohOrgTurnInCash() {
		return this.lohOrgTurnInCash;
	}

	public void setLohOrgTurnInCash(Double lohOrgTurnInCash) {
		this.lohOrgTurnInCash = lohOrgTurnInCash;
	}

	@Column(name = "LOH_EXPECT_LOAD_DATETIME_U", length = 11)
	public Timestamp getLohExpectLoadDatetimeU() {
		return this.lohExpectLoadDatetimeU;
	}

	public void setLohExpectLoadDatetimeU(Timestamp lohExpectLoadDatetimeU) {
		this.lohExpectLoadDatetimeU = lohExpectLoadDatetimeU;
	}

	@Column(name = "LOH_EXPECT_LOAD_DATE_U", length = 7)
	public Timestamp getLohExpectLoadDateU() {
		return this.lohExpectLoadDateU;
	}

	public void setLohExpectLoadDateU(Timestamp lohExpectLoadDateU) {
		this.lohExpectLoadDateU = lohExpectLoadDateU;
	}

	@Column(name = "LOH_EXPECT_UNLOAD_DATETIME", length = 11)
	public Timestamp getLohExpectUnloadDatetime() {
		return this.lohExpectUnloadDatetime;
	}

	public void setLohExpectUnloadDatetime(Timestamp lohExpectUnloadDatetime) {
		this.lohExpectUnloadDatetime = lohExpectUnloadDatetime;
	}

	@Column(name = "LOH_EXPECT_UNLOAD_DATE", length = 7)
	public Timestamp getLohExpectUnloadDate() {
		return this.lohExpectUnloadDate;
	}

	public void setLohExpectUnloadDate(Timestamp lohExpectUnloadDate) {
		this.lohExpectUnloadDate = lohExpectUnloadDate;
	}

	@Column(name = "LOH_EXPECT_UNLOAD_DATETIME_U", length = 11)
	public Timestamp getLohExpectUnloadDatetimeU() {
		return this.lohExpectUnloadDatetimeU;
	}

	public void setLohExpectUnloadDatetimeU(Timestamp lohExpectUnloadDatetimeU) {
		this.lohExpectUnloadDatetimeU = lohExpectUnloadDatetimeU;
	}

	@Column(name = "LOH_EXPECT_UNLOAD_DATE_U", length = 7)
	public Timestamp getLohExpectUnloadDateU() {
		return this.lohExpectUnloadDateU;
	}

	public void setLohExpectUnloadDateU(Timestamp lohExpectUnloadDateU) {
		this.lohExpectUnloadDateU = lohExpectUnloadDateU;
	}

	@Column(name = "LOH_TRANSPORTMODEID", precision = 22, scale = 0)
	public BigDecimal getLohTransportmodeid() {
		return this.lohTransportmodeid;
	}

	public void setLohTransportmodeid(BigDecimal lohTransportmodeid) {
		this.lohTransportmodeid = lohTransportmodeid;
	}

	@Column(name = "LOH_DELIVERYMODEID", precision = 22, scale = 0)
	public BigDecimal getLohDeliverymodeid() {
		return this.lohDeliverymodeid;
	}

	public void setLohDeliverymodeid(BigDecimal lohDeliverymodeid) {
		this.lohDeliverymodeid = lohDeliverymodeid;
	}

	@Column(name = "LOH_SETTLE_METHOD_ID", precision = 22, scale = 0)
	public BigDecimal getLohSettleMethodId() {
		return this.lohSettleMethodId;
	}

	public void setLohSettleMethodId(BigDecimal lohSettleMethodId) {
		this.lohSettleMethodId = lohSettleMethodId;
	}

	@Column(name = "LOH_GNL_DISPATCHORG", precision = 22, scale = 0)
	public BigDecimal getLohGnlDispatchorg() {
		return this.lohGnlDispatchorg;
	}

	public void setLohGnlDispatchorg(BigDecimal lohGnlDispatchorg) {
		this.lohGnlDispatchorg = lohGnlDispatchorg;
	}

	@Column(name = "LOH_EX_DISPATCHORG", precision = 22, scale = 0)
	public BigDecimal getLohExDispatchorg() {
		return this.lohExDispatchorg;
	}

	public void setLohExDispatchorg(BigDecimal lohExDispatchorg) {
		this.lohExDispatchorg = lohExDispatchorg;
	}

	@Column(name = "LOH_PLANT", precision = 22, scale = 0)
	public BigDecimal getLohPlant() {
		return this.lohPlant;
	}

	public void setLohPlant(BigDecimal lohPlant) {
		this.lohPlant = lohPlant;
	}

	@Column(name = "LOH_STAFF_ID", precision = 22, scale = 0)
	public BigDecimal getLohStaffId() {
		return this.lohStaffId;
	}

	public void setLohStaffId(BigDecimal lohStaffId) {
		this.lohStaffId = lohStaffId;
	}

	@Column(name = "YCLX", length = 100)
	public String getYclx() {
		return this.yclx;
	}

	public void setYclx(String yclx) {
		this.yclx = yclx;
	}

	@Column(name = "ZHLC", length = 100)
	public String getZhlc() {
		return this.zhlc;
	}

	public void setZhlc(String zhlc) {
		this.zhlc = zhlc;
	}

	@Column(name = "SHLC", length = 100)
	public String getShlc() {
		return this.shlc;
	}

	public void setShlc(String shlc) {
		this.shlc = shlc;
	}

	@Column(name = "JIESUANLIANG", precision = 16)
	public Double getJiesuanliang() {
		return this.jiesuanliang;
	}

	public void setJiesuanliang(Double jiesuanliang) {
		this.jiesuanliang = jiesuanliang;
	}

	@Column(name = "JINJICHENGDU", precision = 22, scale = 0)
	public BigDecimal getJinjichengdu() {
		return this.jinjichengdu;
	}

	public void setJinjichengdu(BigDecimal jinjichengdu) {
		this.jinjichengdu = jinjichengdu;
	}

	@Column(name = "JSL", precision = 16)
	public Double getJsl() {
		return this.jsl;
	}

	public void setJsl(Double jsl) {
		this.jsl = jsl;
	}

	@Column(name = "LOH_JSCX", precision = 22, scale = 0)
	public BigDecimal getLohJscx() {
		return this.lohJscx;
	}

	public void setLohJscx(BigDecimal lohJscx) {
		this.lohJscx = lohJscx;
	}

	@Column(name = "JIESUANPICI", length = 100)
	public String getJiesuanpici() {
		return this.jiesuanpici;
	}

	public void setJiesuanpici(String jiesuanpici) {
		this.jiesuanpici = jiesuanpici;
	}

	@Column(name = "LOH_SFWS", precision = 22, scale = 0)
	public BigDecimal getLohSfws() {
		return this.lohSfws;
	}

	public void setLohSfws(BigDecimal lohSfws) {
		this.lohSfws = lohSfws;
	}

	@Column(name = "XZZHD", length = 100)
	public String getXzzhd() {
		return this.xzzhd;
	}

	public void setXzzhd(String xzzhd) {
		this.xzzhd = xzzhd;
	}

	@Column(name = "JSSL", precision = 16, scale = 4)
	public Double getJssl() {
		return this.jssl;
	}

	public void setJssl(Double jssl) {
		this.jssl = jssl;
	}

	@Column(name = "JFZFYF", precision = 22, scale = 0)
	public BigDecimal getJfzfyf() {
		return this.jfzfyf;
	}

	public void setJfzfyf(BigDecimal jfzfyf) {
		this.jfzfyf = jfzfyf;
	}

	@Column(name = "CWFXXL", precision = 22, scale = 0)
	public BigDecimal getCwfxxl() {
		return this.cwfxxl;
	}

	public void setCwfxxl(BigDecimal cwfxxl) {
		this.cwfxxl = cwfxxl;
	}

	@Column(name = "LOH_XM", precision = 22, scale = 0)
	public BigDecimal getLohXm() {
		return this.lohXm;
	}

	public void setLohXm(BigDecimal lohXm) {
		this.lohXm = lohXm;
	}

	@Column(name = "LOH_JSBZDH", length = 100)
	public String getLohJsbzdh() {
		return this.lohJsbzdh;
	}

	public void setLohJsbzdh(String lohJsbzdh) {
		this.lohJsbzdh = lohJsbzdh;
	}

	@Column(name = "LOH_DAILISHANG", precision = 22, scale = 0)
	public BigDecimal getLohDailishang() {
		return this.lohDailishang;
	}

	public void setLohDailishang(BigDecimal lohDailishang) {
		this.lohDailishang = lohDailishang;
	}

	@Column(name = "TYPEID", precision = 22, scale = 0)
	public BigDecimal getTypeid() {
		return this.typeid;
	}

	public void setTypeid(BigDecimal typeid) {
		this.typeid = typeid;
	}

	@Column(name = "JSDNO", length = 100)
	public String getJsdno() {
		return this.jsdno;
	}

	public void setJsdno(String jsdno) {
		this.jsdno = jsdno;
	}

	@Column(name = "YEWULEIXING", precision = 22, scale = 0)
	public BigDecimal getYewuleixing() {
		return this.yewuleixing;
	}

	public void setYewuleixing(BigDecimal yewuleixing) {
		this.yewuleixing = yewuleixing;
	}

	@Column(name = "ZONGZHENGJIANSHU", precision = 16)
	public Double getZongzhengjianshu() {
		return this.zongzhengjianshu;
	}

	public void setZongzhengjianshu(Double zongzhengjianshu) {
		this.zongzhengjianshu = zongzhengjianshu;
	}

	@Column(name = "ZHUANGXIEFANG", precision = 22, scale = 0)
	public BigDecimal getZhuangxiefang() {
		return this.zhuangxiefang;
	}

	public void setZhuangxiefang(BigDecimal zhuangxiefang) {
		this.zhuangxiefang = zhuangxiefang;
	}

	@Column(name = "JIGOUBIANHAO", length = 100)
	public String getJigoubianhao() {
		return this.jigoubianhao;
	}

	public void setJigoubianhao(String jigoubianhao) {
		this.jigoubianhao = jigoubianhao;
	}

	@Column(name = "SHOUHUOJIGOUBIANHAO", length = 100)
	public String getShouhuojigoubianhao() {
		return this.shouhuojigoubianhao;
	}

	public void setShouhuojigoubianhao(String shouhuojigoubianhao) {
		this.shouhuojigoubianhao = shouhuojigoubianhao;
	}

	@Column(name = "TRUCK", precision = 22, scale = 0)
	public BigDecimal getTruck() {
		return this.truck;
	}

	public void setTruck(BigDecimal truck) {
		this.truck = truck;
	}

	@Column(name = "JSTJ", length = 100)
	public String getJstj() {
		return this.jstj;
	}

	public void setJstj(String jstj) {
		this.jstj = jstj;
	}

}