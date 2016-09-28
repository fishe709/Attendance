package cn.itkt.core.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 分页操作对象
 * @author Wang
 * @param <T> 数据对象类型
 */
public interface IPageModel<T extends Serializable> {

	/**
	 * 获取一页显示多少条数据的值
	 * @return
	 */

	int getPageSize();

	/**
	 * 获取总页数的值
	 * @return
	 */
	int getTotalPages();

	/**
	 * 获取当前页号
	 * @return
	 */
	int getPageNumber();

	/**
	 * 获取首页
	 * @return
	 */
	int getTopPageNumber();

	/**
	 * 获得前一页
	 * @return
	 */
	int getPreviousPageNumber();

	/**
	 * 获得下一页
	 * @return
	 */
	int getNextPageNumber();

	/**
	 * 获得尾页
	 * @return
	 */
	int getBottomPageNumber();

	/**
	 * 获取该页第一条数据的行号
	 * @return
	 */
	int getFirstResult();

	/**
	 * 获取该页数据
	 * @return
	 */
	List<T> getData();

	/**
	 * 获取数据总数量
	 * @return
	 */
	int getDataTotalCount();

	/**
	 * 是否是首页
	 * @return
	 */
	boolean isFirstPage();

	/**
	 * 是否是尾页
	 * @return
	 */
	boolean isLastPage();

	/**
	 * 设置一页显示多少条数据
	 * @param value
	 */
	void setPageSize(int value);

	/**
	 * 设置总页数
	 * @param value
	 */
	void setTotalPages(int value);

	/**
	 * 设置当前页号
	 * @param value
	 */
	void setPageNumber(int value);

	/**
	 * 设置该页第一条数据的行号
	 * @param value
	 */
	void setFirstResult(int value);

	/**
	 * 设置该页数据
	 * @param data
	 */
	void setData(List<T> data);

	/**
	 * 设置数据总数量
	 * @param data
	 */
	void setDataTotalCount(int value);
}