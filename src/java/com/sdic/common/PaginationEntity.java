package com.sdic.common;

public class PaginationEntity {
	

	//综合文本或查询
	private String textOrSearch=null;
	//当前页号
	private Integer page;
	//当前显示记录数
	private Integer rows;
	
	
	public static Integer getPageCount(Integer count ,Integer length){
		
		if(count > 0){
			if(count < length){
				return 1;
			}
			else{
				if(count % length != 0){
					return count/length + 1;
				}else{
					return count/length;
				}
			}
		}
		
		return 0;
		
	}
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getTextOrSearch() {
		return textOrSearch;
	}
	public void setTextOrSearch(String textOrSearch) {
		this.textOrSearch = textOrSearch;
	}
	


}
