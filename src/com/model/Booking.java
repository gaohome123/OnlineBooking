package com.model;
// Generated 2016-5-26 21:17:33 by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * Booking generated by hbm2java
 */
public class Booking implements java.io.Serializable {

	private int id;
	private int uid;
	private int docId;
	private String visitTime;
	private boolean isOverdue;
	private int number;
	private Date bookTime;

	public Booking() {
	}

	public Booking(int id, int uid, int docId, String visitTime, boolean isOverdue, int number, Date bookTime) {
		this.id = id;
		this.uid = uid;
		this.docId = docId;
		this.visitTime = visitTime;
		this.isOverdue = isOverdue;
		this.number = number;
		this.bookTime = bookTime;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getDocId() {
		return this.docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

	public boolean isIsOverdue() {
		return this.isOverdue;
	}

	public void setIsOverdue(boolean isOverdue) {
		this.isOverdue = isOverdue;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getBookTime() {
		return this.bookTime;
	}

	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

}