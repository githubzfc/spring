package com.etc.entity;

//公司实体类6
public class Company {

	private Integer companyId;
	private String companyName;
	private String domain;
	private String stage;
	private String companyLogo;
	private String address;

	public Company() {
	}

	public Company(Integer companyId, String companyName, String domain, String stage, String companyLogo,
			String address) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.domain = domain;
		this.stage = stage;
		this.companyLogo = companyLogo;
		this.address = address;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
