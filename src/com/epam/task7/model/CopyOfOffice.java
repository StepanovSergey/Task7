package com.epam.task7.model;

/**
 * @author Siarhei_Stsiapanau
 * 
 */
public class CopyOfOffice {
    private OfficePK officePK;
    private Position position;

    public CopyOfOffice() {
    }

    /**
     * @return the officePK
     */
    public OfficePK getOfficePK() {
	return officePK;
    }

    /**
     * @param officePK
     *            the officePK to set
     */
    public void setOfficePK(OfficePK officePK) {
	this.officePK = officePK;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
	return position;
    }

    /**
     * @param position
     *            the position to set
     */
    public void setPosition(Position position) {
	this.position = position;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(officePK);
	builder.append(", ");
	builder.append(position);
	builder.append(" ");
	return builder.toString();
    }

}
