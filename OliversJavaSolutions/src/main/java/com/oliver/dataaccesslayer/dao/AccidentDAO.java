package com.oliver.dataaccesslayer.dao;

import java.util.List;

import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

/**
 * Problem: The Accident data will initially be received via a web service,
 * later on it will switch to a Database. The Consuming layers should not be
 * affected by the changes of the datasources.
 * 
 * Constraint: Only Fetching data will switch sources, saving and updating will
 * always be done to t single source.
 * 
 * 
 * @author olivermascarenhas
 * 
 */
public interface AccidentDAO {

	public Accident findById(long id);

	public List<Accident> findAll();

	public void save(Accident accident);

	public void update(Accident accident);

}
