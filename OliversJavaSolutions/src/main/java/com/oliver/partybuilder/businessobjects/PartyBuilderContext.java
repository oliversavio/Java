package com.oliver.partybuilder.businessobjects;

/**
 * Context object that hold all the data needed to build the required party
 * object.
 * 
 * @author olivermascarenhas
 * 
 */
public class PartyBuilderContext {

	private ExternalParty party;
	private PartyBO partyBO;

	public ExternalParty getParty() {
		return party;
	}

	public void setParty(ExternalParty party) {
		this.party = party;
	}

	public PartyBO getPartyBO() {
		return partyBO;
	}

	public void setPartyBO(PartyBO partyBO) {
		this.partyBO = partyBO;
	}

}
