package cn.itkt.hotel.vo.phone;

import java.io.Serializable;

import cn.itkt.hotel.vo.BaseVo;

/**
 * @author bailu
 * @createdate 2012-9-19 上午10:28:29
 * @Description: 
 */
/**
 * 类: QueryCreditCardResultVo <br>
 * 描述: 信用卡担保查询结果Vo <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-4-15 下午1:13:46
 */
public class QueryCreditCardResultVo extends BaseVo implements Serializable {

	private static final long serialVersionUID = -390749487242712738L;

	/** 担保类型 0 不担保 1担保 */
	private int vouchSetType;
	/** 担保金额 */
	private double money;
	/** 担保条件 */
	private String descrip;
	/** 订单总额 */
	private double totalPrice;
	/** 返还畅达币数 */
	private int lcdCurrency;

	/**
	 * 返回: the vouchSetType <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final int getVouchSetType() {
		return vouchSetType;
	}

	/**
	 * 参数: vouchSetType to set the vouchSetType <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final void setVouchSetType(int vouchSetType) {
		this.vouchSetType = vouchSetType;
	}

	/**
	 * 返回: the money <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final double getMoney() {
		return money;
	}

	/**
	 * 参数: money to set the money <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final void setMoney(double money) {
		this.money = money;
	}

	/**
	 * 返回: the descrip <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final String getDescrip() {
		return descrip;
	}

	/**
	 * 参数: descrip to set the descrip <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	/**
	 * 返回: the totalPrice <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * 参数: totalPrice to set the totalPrice <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * 返回: the lcdCurrency <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final int getLcdCurrency() {
		return lcdCurrency;
	}

	/**
	 * 参数: lcdCurrency to set the lcdCurrency <br>
	 * 时间: 2013-5-29 下午5:20:44
	 */
	public final void setLcdCurrency(int lcdCurrency) {
		this.lcdCurrency = lcdCurrency;
	}
}
