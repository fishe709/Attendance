package cn.itkt.core.dao.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.itkt.core.dao.IPageModel;

@Component
public class PageModel<T extends Serializable> implements IPageModel<T> {

	/** 分页数据 */
	private List<T> data;

	/** 数据总数 */
	private int dataTotalCount;

	/** 页号 */
	private int pageNumber;

	/** 总页 */
	private int totalPages;

	/** 每页大小 */
	private int pageSize;

	/** 分页起始位 */
	private int firstResult;

	@Override
	public int getPageSize() {
		return pageSize;
	}

	@Override
	public int getTotalPages() {
		return totalPages;
	}

	@Override
	public int getPageNumber() {
		return pageNumber;
	}

	@Override
	public int getTopPageNumber() {
		return 1;
	}

	@Override
	public int getPreviousPageNumber() {
		if (this.pageNumber <= 1) {
			return 1;
		} else {
			return this.pageNumber - 1;
		}
	}

	@Override
	public int getNextPageNumber() {
		if (this.pageNumber >= this.getBottomPageNumber()) {
			return this.getBottomPageNumber();
		} else {
			return this.pageNumber + 1;
		}
	}

	@Override
	public int getBottomPageNumber() {
		return this.getTotalPages();
	}

	@Override
	public int getFirstResult() {
		return firstResult;
	}

	@Override
	public List<T> getData() {
		return data;
	}

	@Override
	public int getDataTotalCount() {
		return dataTotalCount;
	}

	@Override
	public boolean isFirstPage() {
		if (this.pageNumber == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isLastPage() {
		if (this.pageNumber == this.getTotalPages()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setPageSize(int value) {
		this.pageSize = value;
	}

	@Override
	public void setTotalPages(int value) {
		this.totalPages = value;
	}

	@Override
	public void setPageNumber(int value) {
		this.pageNumber = value;
	}

	@Override
	public void setFirstResult(int value) {
		this.firstResult = value;
	}

	@Override
	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public void setDataTotalCount(int value) {
		this.dataTotalCount = value;
	}
}
