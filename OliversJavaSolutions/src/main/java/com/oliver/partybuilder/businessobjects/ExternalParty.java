package com.oliver.partybuilder.businessobjects;

/**
 * Generic Party bean. This will be set as part of the
 * {@link PartyBuilderContext} object for testing purposes.
 * 
 * @author olivermascarenhas
 * 
 */
public class ExternalParty {

	private String id;
	private String sourceSystem;
	private String mailingAddress;
	private String residentialAddress;
	private String homephone;
	private String businessphone;
	private String cellphone;
	private String identificationInfo;

	public ExternalParty(String mailingAddress, String residentialAddress) {
		super();
		this.mailingAddress = mailingAddress;
		this.residentialAddress = residentialAddress;
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

	public String getIdentificationInfo() {
		return identificationInfo;
	}

	public void setIdentificationInfo(String identificationInfo) {
		this.identificationInfo = identificationInfo;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
