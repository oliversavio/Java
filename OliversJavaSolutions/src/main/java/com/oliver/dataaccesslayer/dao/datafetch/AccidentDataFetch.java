package com.oliver.dataaccesslayer.dao.datafetch;

import java.util.List;

import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

/**
 * This interface abstracts out the fetch operations since they switch sources
 * <br />
 * There are two implementations {@link AccidentDataFetchWSImpl} and {@link AccidentDataFetchDBImpl}
 * @author olivermascarenhas
 * 
 */
public interface AccidentDataFetch {

	public Accident findById(long id);

	public List<Accident> findAll();

}
