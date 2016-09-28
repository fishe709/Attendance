package cn.itkt.hotel.local.dao.sysmsg;

import java.util.List;

import cn.itkt.core.dao.IBaseDao;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.pojo.sysmsg.SysDispatchMsg;

/**
 * 
 * @author chenqiushi
 * 处理后响应第三方系统dao
 */
public interface SysDispatchMsgDao extends IBaseDao<String> {
	
	/**
	 * 查询处理响应报文列表
	 * @param conditions
	 * @param page
	 * @return
	 */
	public List<SysDispatchMsg> listDispatchMsg(List<Condition> conditions, Pagination page);
	
}
