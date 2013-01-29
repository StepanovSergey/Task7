package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class Country {
    private int id;
    private String name;

    public Country() {
    }

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Country [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append("]");
	return builder.toString();
    }


}
