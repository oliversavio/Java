package com.oliver.partybuilder.builders;

import com.oliver.partybuilder.PartyBuilder;
import com.oliver.partybuilder.businessobjects.ExternalParty;
import com.oliver.partybuilder.businessobjects.IndividualBO;
import com.oliver.partybuilder.businessobjects.PartyBuilderContext;

/**
 * This is a concrete {@link PartyBuilder} implementation that will be
 * responsible for building {@link IndividualBO}
 * 
 * @author olivermascarenhas
 * 
 */
public class IndividualBuilder extends PartyBuilder<IndividualBO> {

	IndividualBO individual = null;

	public IndividualBuilder(PartyBuilderContext context) {

		if (context == null) {
			throw new IllegalArgumentException(
					"party builder context should not be null");
		}

		this.context = context;
		this.individual = new IndividualBO();
		this.context.setPartyBO(individual);
	}

	@Override
	public void buildAddressInformation() {
		ExternalParty eParty = context.getParty();
		if (eParty != null) {
			individual.setMailingAddress(eParty.getMailingAddress());
			individual.setResidentialAddress(eParty.getResidentialAddress());
		}
	}

	@Override
	public void buildContactInformation() {
		ExternalParty eParty = context.getParty();
		if (eParty != null) {
			individual.setHomephone(eParty.getHomephone());
			individual.setBusinessphone(eParty.getBusinessphone());
			individual.setCellphone(eParty.getCellphone());
		}
	}

	@Override
	public void buildIndetificationInformation() {
		ExternalParty eParty = context.getParty();
		if (eParty != null) {
			individual.setIdentification(eParty.getIdentificationInfo());
		}

	}

	@Override
	public IndividualBO getParty() {
		return individual;
	}

}
