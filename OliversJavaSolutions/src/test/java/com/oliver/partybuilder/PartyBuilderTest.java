package com.oliver.partybuilder;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.oliver.partybuilder.builders.IndividualBuilder;
import com.oliver.partybuilder.businessobjects.ExternalParty;
import com.oliver.partybuilder.businessobjects.IndividualBO;
import com.oliver.partybuilder.businessobjects.PartyBuilderContext;

public class PartyBuilderTest {

	ExternalParty p = null;

	@BeforeClass
	public void initTestData() {
		p = new ExternalParty("Mailing Address", "Some Residential Address");
		p.setId("001");
		p.setSourceSystem("LEGACY_SYSTEM");
	}

	@Test
	public void partyBuilder() {

		PartyBuilderContext context = new PartyBuilderContext();
		context.setParty(p);

		IndividualBuilder builder = new IndividualBuilder(context);
		PartyBODirector<IndividualBO> individualDirector = new PartyBODirector<IndividualBO>(
				builder);
		IndividualBO individual = individualDirector.buildIndividual();

		assertEquals(individual.getMailingAddress(), p.getMailingAddress());
		assertEquals(individual.getSourceSystem(), p.getSourceSystem());

	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testExceptionForNullBuilderContext() {
		IndividualBuilder builder = new IndividualBuilder(null);
		builder.buildAddressInformation();
	}

}
