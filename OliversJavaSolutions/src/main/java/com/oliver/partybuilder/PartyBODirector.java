package com.oliver.partybuilder;

public class PartyBODirector<T> {

    PartyBuilder<T> builder;
    
    public PartyBODirector(PartyBuilder<T> builder) {
        this.builder = builder;
    }
    
    public T buildBusinessPartner() {
        builder.buildBasicInformation();
        builder.buildAddressInformation();
        builder.buildContactInformation();
        builder.buildIndetificationInformation();
        return builder.getParty();
    }
    
    
    public T buildIndividual() {
        builder.buildBasicInformation();
        builder.buildAddressInformation();
        builder.buildContactInformation();
        builder.buildIndetificationInformation();
        return builder.getParty();
    }
    
    public T buildAuthenticatedUser() {
        builder.buildBasicInformation();
        return builder.getParty();
    }
    
}
