package com.oliver.partybuilder.builders;

import com.oliver.partybuilder.PartyBuilder;
import com.oliver.partybuilder.businessobjects.BusinessPartnerBO;

public class BusinessPartnerBuilder extends PartyBuilder<BusinessPartnerBO> {

    BusinessPartnerBO businessPartner = new BusinessPartnerBO();
    
    @Override
    public void buildAddressInformation() {
      super.buildMailingAddress();
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
