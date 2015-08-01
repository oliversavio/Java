package com.oliver.partybuilder.businessobjects;

public class CustomerBO extends PartyBO {

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	private String homephone;
	private String businessphone;
	private String cellphone;
	private String mailingAddress;
	private String residentialAddress;
	private String identification;

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getBusinessphone() {
		return businessphone;
	}

	public void setBusinessphone(String businessphone) {
		this.businessphone = businessphone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

}
