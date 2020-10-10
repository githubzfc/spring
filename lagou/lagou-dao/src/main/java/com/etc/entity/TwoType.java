package com.etc.entity;

import java.util.List;

public class TwoType {

	private Integer twotypeId;
	private String twotypeName;
	private OneType onetype;// 一级分类，与外键对应
	private List<ThreeType> list;

	public TwoType() {
	}

	public TwoType(Integer twotypeId, String twotypeName, OneType onetype, List<ThreeType> list) {
		this.twotypeId = twotypeId;
		this.twotypeName = twotypeName;
		this.onetype = onetype;
		this.list = list;
	}

	public Integer getTwotypeId() {
		return twotypeId;
	}

	public void setTwotypeId(Integer twotypeId) {
		this.twotypeId = twotypeId;
	}

	public String getTwotypeName() {
		return twotypeName;
	}

	public void setTwotypeName(String twotypeName) {
		this.twotypeName = twotypeName;
	}

	public OneType getOnetype() {
		return onetype;
	}

	public void setOnetype(OneType onetype) {
		this.onetype = onetype;
	}

	public List<ThreeType> getList() {
		return list;
	}

	public void setList(List<ThreeType> list) {
		this.list = list;
	}

}
