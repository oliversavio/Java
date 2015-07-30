package com.oliver.dataaccesslayer.dao;

import java.util.List;

import com.oliver.dataaccesslayer.dao.datafetch.AccidentDataFetch;
import com.oliver.dataaccesslayer.dao.dataobjects.Accident;

/**
 * 
 * Since only fetching of data will switch sources, it has been abstracted out
 * into a separate {@link AccidentDataFetch} interface
 * 
 * 
 * @author olivermascarenhas
 * 
 */
public class AccidentDAOImpl implements AccidentDAO {

	private AccidentDataFetch dataFetch;

	public AccidentDAOImpl(AccidentDataFetch dataFetch) {
		this.dataFetch = dataFetch;
	}

	public Accident findById(long id) {
		return dataFetch.findById(id);
	}

	public List<Accident> findAll() {
		return dataFetch.findAll();
	}

	public void save(Accident accident) {
		// TODO Auto-generated method stub

	}

	public void update(Accident accident) {
		// TODO Auto-generated method stub

	}

}
