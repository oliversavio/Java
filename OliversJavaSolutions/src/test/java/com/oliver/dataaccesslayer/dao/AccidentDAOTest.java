package com.oliver.dataaccesslayer.dao;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.oliver.dataaccesslayer.dao.datafetch.DataFetchObjectFactoryImpl;
import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

public class AccidentDAOTest {

	@Test
	public void testAccidentDAO() {
		AccidentDAO accidentDAO = new AccidentDAOImpl(
				DataFetchObjectFactoryImpl.getInstance().getAccidentDataFetch());
		
		Accident accident = accidentDAO.findById(1l);
		Assert.assertEquals(accident.getSource(), "DATABASE");
	}

}
