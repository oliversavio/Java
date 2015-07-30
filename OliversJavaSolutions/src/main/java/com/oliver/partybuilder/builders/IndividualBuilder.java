package com.oliver.partybuilder.builders;

import com.oliver.partybuilder.PartyBuilder;
import com.oliver.partybuilder.businessobjects.IndividualBO;

public class IndividualBuilder extends PartyBuilder<IndividualBO> {

    IndividualBO individual = new IndividualBO();
    
    @Override
    public void buildAddressInformation() {
        super.buildMailingAddress();
        super.buildResidentialAddress();
        System.out.println("Address Info for Individual Built");
    }

    @Override
    public void buildContactInformation() {
        System.out.println("Build Home Phone");
        System.out.println("Build Business Phone");
        System.out.println("Build Cell Phone");
    }

    @Override
    public void buildIndetificationInformation() {
        System.out.println("Build MAID");
        System.out.println("Build MADL");
    }

    @Override
    public IndividualBO getParty() {
        return individual;
    }

}
