package com.oliver.dataaccesslayer.dao.datafetch;

/**
 * This is the Abstract factory that is responsible for providing the
 * appropriate version of the DataFetch interface.
 * 
 * @author olivermascarenhas
 * 
 */
public interface DataFetchObjectFactory {

	public AccidentDataFetch getAccidentDataFetch();

}
