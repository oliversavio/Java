package com.oliver.dataaccesslayer.dao;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oliver.dataaccesslayer.dao.datafetch.DataFetchObjectFactory;
import com.oliver.dataaccesslayer.dao.datafetch.DataFetchObjectFactoryImpl;
import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

public class AccidentDAOTest {

	@Test
	public void testAccidentDAO() {
		DataFetchObjectFactory factory = DataFetchObjectFactoryImpl
				.getInstance();

		AccidentDAO accidentDAO = new AccidentDAOImpl(
				factory.getAccidentDataFetch());

		Accident accident = accidentDAO.findById(1l);
		Assert.assertEquals(accident.getSource(), "DATABASE");
	}

}
