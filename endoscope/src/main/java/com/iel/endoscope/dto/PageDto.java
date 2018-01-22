package com.iel.endoscope.dto;

import com.iel.endoscope.util.Page;

public class PageDto {
	
	private int pageNum;
	
	private int pageSize;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public Page buildPage() {
		return new Page(pageNum, pageSize);
	}

	public static Page buildPage(int pageNum, int pageSize) {
		return new Page(pageNum, pageSize);
	}
	
}
