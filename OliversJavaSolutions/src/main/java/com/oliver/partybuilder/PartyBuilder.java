package com.oliver.partybuilder;

import com.oliver.partybuilder.businessobjects.ExternalParty;
import com.oliver.partybuilder.businessobjects.PartyBO;
import com.oliver.partybuilder.businessobjects.PartyBuilderContext;

public abstract class PartyBuilder<T> {

	protected PartyBuilderContext context;

	public void buildBasicInformation() {

		ExternalParty eParty = context.getParty();
		PartyBO party = context.getPartyBO();
		if (eParty != null) {
			party.setId(eParty.getId());
			party.setSourceSystem(eParty.getSourceSystem());
		}

	}

	public abstract void buildAddressInformation();

	public abstract void buildContactInformation();

	public abstract void buildIndetificationInformation();

	public abstract T getParty();

}
