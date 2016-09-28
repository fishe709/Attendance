package cn.itkt.hotel.mongodb.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

import cn.itkt.core.dao.hibernate.BaseDaoII;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.mongodb.dao.BKDispatchInfoDao;
import cn.itkt.hotel.mongodb.dto.BKDispatchInfoDto;
import cn.itkt.hotel.mongodb.dto.BKOrderDetailDto;
import cn.itkt.hotel.mongodb.dto.BKOrderInfoDto;
import cn.itkt.hotel.mongodb.dto.MbTaskDetailDto;
import cn.itkt.hotel.mongodb.dto.MbTaskInfoDto;
import cn.itkt.hotel.util.SerialNumberUtil;

/**
 * 
 * @author chenqiushi
 * 调度单dao
 */
@Repository(value="bKDispatchInfoDao")
public class BKDispatchInfoDaoImpl extends BaseDaoII<String> implements BKDispatchInfoDao {

	@Override
	public List<BKDispatchInfoDto> listDispatchInfo(List<Condition> conditions, Pagination page) {
		if(conditions == null){
			conditions = new ArrayList<Condition>();
		}
		
		if(page == null){
			page = new Pagination();
		}
		
		StringBuilder sql = new StringBuilder();
		sql.append("select di.DH_DISPATCH_NO       dispatchNum,");
		sql.append("       list.name               vehicleNum,");
		sql.append("       di.DH_DISPATCH_DATETIME arrivalTime,");
		sql.append("       truck.name              vehicleType,");
		sql.append("       ark.name                warehouse,");
		sql.append("       ard.name                destination,");
		sql.append("       bu.name                 carrier");
		sql.append("  from TM_DISPATCH_H di");
		sql.append(" left join CP_TruckType truck on di.CX = truck.id");
		sql.append(" left join LS_TruckList list on list.id = di.DH_TRUCK_ID");
		sql.append(" left join CP_LogisticsNodes ark  on di.DH_START_AREA_ID = ark.id");
		sql.append(" left join CP_LogisticsNodes ard on di.Dh_End_Area_Id = ard.id");
		sql.append(" left join CP_BusinessEnterprise bu on di.DH_CARRIER_ID = bu.id");
		sql.append(" where dh_truck_id != -1");
		for(Condition condition : conditions){
			if("arrivalTimeA".equals(condition.getProperty())){
				sql.append(" and di.DH_DISPATCH_DATETIME >= to_date(:arrivalTimeA, 'yyyy-mm-dd hh24:mi:ss') ");
			}
		}
		sql.append(" order by di.DH_DISPATCH_DATETIME asc");
		Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString())
				.addScalar("dispatchNum", StandardBasicTypes.STRING)
				.addScalar("vehicleNum", StandardBasicTypes.STRING)
				.addScalar("arrivalTime", StandardBasicTypes.TIMESTAMP)
				.addScalar("vehicleType", StandardBasicTypes.STRING)
				.addScalar("warehouse", StandardBasicTypes.STRING)
				.addScalar("destination", StandardBasicTypes.STRING)
				.addScalar("carrier", StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(BKDispatchInfoDto.class));
		for(Condition condition : conditions){
			if("arrivalTimeA".equals(condition.getProperty())){
				query.setString("arrivalTimeA", condition.getValue().toString());
			}
		}
		this.appendPagingValue(query, page);
		return query.list();
	}

	@Override
	public Long countDispatchInfo(List<Condition> conditions) {
		if(conditions == null){
			conditions = new ArrayList<Condition>();
		}
		StringBuilder sql = new StringBuilder();
		sql.append("select count(1)");
		sql.append("  from TM_DISPATCH_H di");
		sql.append(" left join CP_TruckType truck on di.CX = truck.id");
		sql.append(" left join LS_TruckList list on list.id = di.DH_TRUCK_ID");
		sql.append(" left join CP_LogisticsNodes ark  on di.DH_START_AREA_ID = ark.id");
		sql.append(" left join CP_LogisticsNodes ard on di.Dh_End_Area_Id = ard.id");
		sql.append(" left join CP_BusinessEnterprise bu on di.DH_CARRIER_ID = bu.id");
		sql.append(" where dh_truck_id != -1");
		for(Condition condition : conditions){
			if("arrivalTimeA".equals(condition.getProperty())){
				sql.append(" and di.DH_DISPATCH_DATETIME >= to_date(:arrivalTimeA, 'yyyy-mm-dd hh24:mi:ss') ");
			}
		}
		Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString());
		
		for(Condition condition : conditions){
			if("arrivalTimeA".equals(condition.getProperty())){
				query.setString("arrivalTimeA", condition.getValue().toString());
			}
		}
		return ((BigDecimal) query.uniqueResult()).longValue();
	}

	@Override
	public List<MbTaskInfoDto> listTaskInfos(String dispatchNo, String dispatchId) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select bu.name customerName,");
		sql.append(" tm.Clh_Consigner_No orderNum, ");
		sql.append(" tm.Clh_Load_Address seoutAddress,  ");
		sql.append(" tm. CLH_UNLOAD_ADDRESS arriveAddress,  ");
		sql.append(" tm.CLH_UNLOAD_CONTACT receiverName,  ");
		sql.append(" tm.Clh_Unload_Tel receiverMobile,  ");
		sql.append(" tm.CLH_TOTAL_PACKS setoutCity,  ");
		sql.append(" ark.name setoutCity,  ");
		sql.append(" ard.name arriveCity,  ");
		sql.append(" tm.CLH_TOTAL_PACKS totalNum,  ");
		sql.append(" tm.Clh_Total_Cubage totalVolume, ");
		sql.append(" :dispatchId dispatchId, ");
		sql.append(" tm.Clh_Cargo_Load_No taskNum ");
		sql.append(" from TM_CARGO_LOAD_H tm ");
		sql.append(" left join CP_LogisticsNodes ark  on tm.CLH_LOAD_AREA_ID = ark.id ");
		sql.append(" left join CP_LogisticsNodes ard on tm.Clh_Unload_Area_Id = ard.id ");
		sql.append(" left join CP_BusinessEnterprise bu on tm.CLH_CONSIGNER_ID = bu.id ");
		sql.append(" left join TM_DISPATCH_H di on tm.Clh_Dispatch_Header_Id = di.billid ");
		sql.append(" where di.Dh_Dispatch_No = :dispatch_No ");
		Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString())
				.addScalar("customerName", StandardBasicTypes.STRING)
				.addScalar("orderNum", StandardBasicTypes.STRING)
				.addScalar("seoutAddress", StandardBasicTypes.STRING)
				.addScalar("arriveAddress", StandardBasicTypes.STRING)
				.addScalar("receiverName", StandardBasicTypes.STRING)
//				.addScalar("destination", StandardBasicTypes.STRING)
				.addScalar("receiverMobile", StandardBasicTypes.STRING)
				.addScalar("setoutCity", StandardBasicTypes.STRING)
				.addScalar("arriveCity", StandardBasicTypes.STRING)
				.addScalar("totalNum", StandardBasicTypes.BIG_DECIMAL)
				.addScalar("totalVolume", StandardBasicTypes.BIG_DECIMAL)
				.addScalar("taskNum", StandardBasicTypes.STRING)
				.addScalar("dispatchId", StandardBasicTypes.STRING)
				.setString("dispatch_No", dispatchNo)
				.setString("dispatchId", dispatchId)
				
				.setResultTransformer(Transformers.aliasToBean(MbTaskInfoDto.class));
		return query.list();
	}

	@Override
	public List<MbTaskDetailDto> listTaskDetails(String taskNo, String taskId) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select l.CLL_MATERIAL_CODE materialCode,");
		sql.append(" :id id,");
		sql.append(" l.CLL_MATERIAL_NAME materialName, ");
		sql.append(" l.CLL_CONSIGN_QTY quantity,  ");
		sql.append(" :taskId taskId  ");
		sql.append(" from 	TM_CARGO_LOAD_L l ");
		sql.append(" left join TM_CARGO_LOAD_H h on h.billid = l.billid ");
		sql.append(" where h.CLH_CARGO_LOAD_NO = :taskNo ");
		Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString())
				.addScalar("materialName", StandardBasicTypes.STRING)
				.addScalar("quantity", StandardBasicTypes.LONG)
				.addScalar("taskId", StandardBasicTypes.STRING)
				.addScalar("id", StandardBasicTypes.STRING)
				.setString("id", SerialNumberUtil.getId())
				.setString("taskId", taskId)
				.setString("taskNo", taskNo)
				.setResultTransformer(Transformers.aliasToBean(MbTaskDetailDto.class));
		return query.list();
	}

	@Override
	public BKOrderInfoDto listOrderInfo(String orderNum) {
			StringBuilder sql = new StringBuilder();
			sql.append(" select h.LOH_OWNER_NO orderNum,");
			sql.append(" tms.name orderType,");
			sql.append(" ark.name setoutCity, ");
			sql.append(" ard.name arriveCity,  ");
			sql.append(" h.LOH_UNLOAD_ADDRESS arriveAddress,  ");
			sql.append(" h.LOH_UNLOAD_CONTACT receiverName,  ");
			sql.append(" h.LOH_UNLOAD_TEL receiverMobile,  ");
			sql.append(" h.LOH_LOAD_ADDRESS arriveAddress,  ");
			sql.append(" h.zongzhengjianshu totalNum,  ");
			sql.append(" h.LOH_TOTAL_CUBAGE totalVolume,  ");
			sql.append(" h.LOH_EXPECT_UNLOAD_DATETIME earliestDeliveryTime,  ");
			sql.append(" h.LOH_EXPECT_LOAD_DATETIME_U lateDeliveryTime,  ");
			sql.append(" h.LOH_EXPECT_UNLOAD_DATETIME earliestArrivalTime,  ");
			sql.append(" h.LOH_EXPECT_UNLOAD_DATETIME_U lateArrivalTime,  ");
			sql.append(" bu.name customerName  ");
			sql.append(" from   OM_LOGISTICS_ORDER_H h ");
			sql.append(" left join CP_TMS_DeliveryMode tms on tms.id = h.LOH_DeliveryModeID ");
			sql.append(" left join CP_LogisticsNodes ark  on h.LOH_LOAD_AREA_ID = ark.id ");
			sql.append(" left join CP_LogisticsNodes ard on h.LOH_UNLOAD_AREA_ID = ard.id ");
			sql.append(" left join CP_BusinessEnterprise bu on h.LOH_OWNER_ID = bu.id ");
			sql.append(" where h.LOH_OWNER_NO = :orderNum ");

			Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString())
					.addScalar("orderNum", StandardBasicTypes.STRING)
					.addScalar("orderType", StandardBasicTypes.STRING)
					.addScalar("setoutCity", StandardBasicTypes.STRING)
					.addScalar("arriveCity", StandardBasicTypes.STRING)
					.addScalar("arriveAddress", StandardBasicTypes.STRING)
					.addScalar("receiverName", StandardBasicTypes.STRING)
					.addScalar("receiverMobile", StandardBasicTypes.STRING)
					.addScalar("arriveAddress", StandardBasicTypes.STRING)
					.addScalar("totalNum", StandardBasicTypes.BIG_DECIMAL)
					.addScalar("totalVolume", StandardBasicTypes.BIG_DECIMAL)
					.addScalar("earliestDeliveryTime", StandardBasicTypes.TIMESTAMP)
					.addScalar("lateDeliveryTime", StandardBasicTypes.TIMESTAMP)
					.addScalar("earliestArrivalTime", StandardBasicTypes.TIMESTAMP)
					.addScalar("lateArrivalTime", StandardBasicTypes.TIMESTAMP)
					.addScalar("customerName", StandardBasicTypes.STRING)
					.setString("orderNum", orderNum)
					.setResultTransformer(Transformers.aliasToBean(BKOrderInfoDto.class));
			return (BKOrderInfoDto)query.uniqueResult();
	}

	@Override
	public List<BKOrderDetailDto> listOrderDetail(String orderNum) {
			StringBuilder sql = new StringBuilder();
			sql.append(" select l.LOL_MATERIAL_CODE materialCode,");
			sql.append(" l.LOL_MATERIAL_NAME materialName,");
			sql.append(" l.LOL_EXPECT_QTY quantity, ");
			sql.append(" h.LOH_OWNER_NO orderNum  ");
			sql.append(" from OM_LOGISTICS_ORDER_L l ");
			sql.append(" left join OM_LOGISTICS_ORDER_H h on h.billid = l.billid ");
			sql.append(" where h.LOH_OWNER_NO = :orderNum ");

			Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString())
					.addScalar("materialCode", StandardBasicTypes.STRING)
					.addScalar("materialName", StandardBasicTypes.STRING)
					.addScalar("quantity", StandardBasicTypes.LONG)
					.addScalar("orderNum", StandardBasicTypes.STRING)
					.setString("orderNum", orderNum)
					.setResultTransformer(Transformers.aliasToBean(BKOrderDetailDto.class));
			return query.list();
	}

	@Override
	public BKDispatchInfoDto getDispatchInfo(String dispatch_num) {
		StringBuilder sql = new StringBuilder();
		sql.append("select di.DH_DISPATCH_NO       dispatchNum,");
		sql.append("       list.name               vehicleNum,");
		sql.append("       di.DH_DISPATCH_DATETIME arrivalTime,");
		sql.append("       truck.name              vehicleType,");
		sql.append("       ark.name                warehouse,");
		sql.append("       ard.name                destination,");
		sql.append("       bu.name                 carrier");
		sql.append("  from TM_DISPATCH_H di");
		sql.append(" left join CP_TruckType truck on di.CX = truck.id");
		sql.append(" left join LS_TruckList list on list.id = di.DH_TRUCK_ID");
		sql.append(" left join CP_LogisticsNodes ark  on di.DH_START_AREA_ID = ark.id");
		sql.append(" left join CP_LogisticsNodes ard on di.Dh_End_Area_Id = ard.id");
		sql.append(" left join CP_BusinessEnterprise bu on di.DH_CARRIER_ID = bu.id");
		sql.append(" where dh_truck_id != -1 and di.DH_DISPATCH_NO = :dispatchNum ");
		Query query = this.sessionFactory2.getCurrentSession().createSQLQuery(sql.toString())
				.addScalar("dispatchNum", StandardBasicTypes.STRING)
				.addScalar("vehicleNum", StandardBasicTypes.STRING)
				.addScalar("arrivalTime", StandardBasicTypes.TIMESTAMP)
				.addScalar("vehicleType", StandardBasicTypes.STRING)
				.addScalar("warehouse", StandardBasicTypes.STRING)
				.addScalar("destination", StandardBasicTypes.STRING)
				.addScalar("carrier", StandardBasicTypes.STRING)
				.setString("dispatchNum", dispatch_num)
				.setResultTransformer(Transformers.aliasToBean(BKDispatchInfoDto.class));
		return (BKDispatchInfoDto) query.uniqueResult();
	}


}
