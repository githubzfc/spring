package com.etc.entity;

//三级分类
public class ThreeType {

	private Integer threetypeId;
	private String threetypeName;
	private TwoType twoType;//二级分类对应表中的外键

	public ThreeType() {
	}

	public ThreeType(Integer threetypeId, String threetypeName, TwoType twoType) {
		this.threetypeId = threetypeId;
		this.threetypeName = threetypeName;
		this.twoType = twoType;
	}

	public Integer getThreetypeId() {
		return threetypeId;
	}

	public void setThreetypeId(Integer threetypeId) {
		this.threetypeId = threetypeId;
	}

	public String getThreetypeName() {
		return threetypeName;
	}

	public void setThreetypeName(String threetypeName) {
		this.threetypeName = threetypeName;
	}

	public TwoType getTwoType() {
		return twoType;
	}

	public void setTwoType(TwoType twoType) {
		this.twoType = twoType;
	}

}
