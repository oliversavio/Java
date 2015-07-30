package com.oliver.dataaccesslayer.dao.datafetch;

import java.util.ArrayList;
import java.util.List;

import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

public class AccidentDataFetchDBImpl implements AccidentDataFetch {

	public Accident findById(long id) {
		Accident accident = new Accident();
		accident.setSource("DATABASE");
		return accident;
	}

	public List<Accident> findAll() {

		List<Accident> accidentList = new ArrayList<Accident>();
		Accident accident = new Accident();
		accident.setSource("DATABASE");
		accidentList.add(accident);

		return accidentList;
	}

}
