package cn.itkt.hotel.local.dao.sysmsg;

import java.util.List;

import cn.itkt.core.dao.IBaseDao;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.pojo.sysmsg.SysReceiveMsg;

/**
 * 
 * @author chenqiushi
 * 处理前接受第三方系统dao
 */
public interface SysReceiveMsgDao extends IBaseDao<String> {
	
	/**
	 * 查询接受报文列表
	 * @param conditions
	 * @param page
	 * @return
	 */
	public List<SysReceiveMsg> listReceiveMsg(List<Condition> conditions, Pagination page);
}
