package com.emp.entity;

public class Record {
	private Long cid;
	private String email;
	private String companyName;
	private Long eid;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public Record(Long cid, String email, String companyName, Long eid) {
		super();
		this.cid = cid;
		this.email = email;
		this.companyName = companyName;
		this.eid = eid;
	}

	public Record() {
		super();
	}

}
