package com.redhat.patientrecord;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Checkup implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String doctor;
	private java.util.Date date;
	private java.lang.String diagnosis;

	public Checkup() {
	}

	public java.lang.String getDoctor() {
		return this.doctor;
	}

	public void setDoctor(java.lang.String doctor) {
		this.doctor = doctor;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.lang.String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(java.lang.String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Checkup(java.lang.String doctor, java.util.Date date,
			java.lang.String diagnosis) {
		this.doctor = doctor;
		this.date = date;
		this.diagnosis = diagnosis;
	}

}