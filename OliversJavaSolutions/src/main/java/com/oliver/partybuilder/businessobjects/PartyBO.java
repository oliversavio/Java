package com.oliver.partybuilder.businessobjects;

import java.io.Serializable;

/**
 * Parent Object. This hold common properties.
 * 
 * @author olivermascarenhas
 * 
 */
public class PartyBO implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	private String id;
	private String sourceSystem;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

}
