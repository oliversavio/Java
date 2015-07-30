package com.oliver.partybuilder;

public abstract class PartyBuilder<T> {

    
    public void buildBasicInformation() {
       System.out.println("Building Basic Info");
    }
    
    public abstract void buildAddressInformation();
    
    public abstract void buildContactInformation();
    
    public abstract void buildIndetificationInformation();
    
    public abstract T getParty();
    
    
    protected void buildMailingAddress() {
        System.out.println("Helper building Mailing Address");
    }
    
    protected void buildResidentialAddress() {
        System.out.println("Helper building Residential Address");
    }
    
    
    
}
