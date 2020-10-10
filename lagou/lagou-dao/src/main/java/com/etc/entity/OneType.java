package com.etc.entity;

import java.util.List;

//一级分类
public class OneType {

	private Integer onetypeId;
	private String onetypeName;
	private List<TwoType> list;//包含的二级分类集合

	public OneType() {
	}

	public OneType(Integer onetypeId, String onetypeName, List<TwoType> list) {
		this.onetypeId = onetypeId;
		this.onetypeName = onetypeName;
		this.list = list;
	}

	public Integer getOnetypeId() {
		return onetypeId;
	}

	public void setOnetypeId(Integer onetypeId) {
		this.onetypeId = onetypeId;
	}

	public String getOnetypeName() {
		return onetypeName;
	}

	public void setOnetypeName(String onetypeName) {
		this.onetypeName = onetypeName;
	}

	public List<TwoType> getList() {
		return list;
	}

	public void setList(List<TwoType> list) {
		this.list = list;
	}

}
