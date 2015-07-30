package com.oliver.dataaccesslayer.dao.datafetch;

import java.util.HashMap;
import java.util.Map;

import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

public class DataFetchObjectFactoryImpl implements DataFetchObjectFactory {

	private static final DataFetchObjectFactory INSTANCE = new DataFetchObjectFactoryImpl();
	private Map<Class<?>, SOURCE> locationMap = new HashMap<Class<?>, SOURCE>();

	private DataFetchObjectFactoryImpl() {
		// Initial the location map for each DAO object.
		locationMap.put(Accident.class, SOURCE.DATABASE);
	}

	private enum SOURCE {
		DATABASE, WEBSERVICE
	};

	public static DataFetchObjectFactory getInstance() {
		return INSTANCE;
	}

	public AccidentDataFetch getAccidentDataFetch() {

		SOURCE source = locationMap.get(Accident.class);
		AccidentDataFetch dataFetch = null;

		switch (source) {
		case DATABASE:
			dataFetch = new AccidentDataFetchDBImpl();
			break;
		case WEBSERVICE:
			dataFetch = new AccidentDataFetchWSImpl();
			break;
		}

		return dataFetch;
	}

}
