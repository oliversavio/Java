package com.oliver.partybuilder.builders;

import com.oliver.partybuilder.PartyBuilder;
import com.oliver.partybuilder.businessobjects.BusinessPartnerBO;
import com.oliver.partybuilder.businessobjects.PartyBuilderContext;

public class BusinessPartnerBuilder extends PartyBuilder<BusinessPartnerBO> {

	public BusinessPartnerBuilder(PartyBuilderContext context) {
		this.context = context;
	}

	BusinessPartnerBO businessPartner = new BusinessPartnerBO();

	@Override
	public void buildAddressInformation() {
		System.out.println("Address Info for Business Partner Built");
	}

	@Override
	public void buildContactInformation() {
		System.out.println("build business phone info");
	}

	@Override
	public void buildIndetificationInformation() {
		System.out.println("Build Board License number");
	}

	@Override
	public BusinessPartnerBO getParty() {
		return businessPartner;
	}

}
