package com.optimissa.holidayreader;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TO_TRADE_HOLIDAYS")
public class To_trade_holidays {
	
	
	@Id
	private int idcalendar;
	private Date date;
	
	
	public To_trade_holidays(int idcalendar, Date date) {
		super();
		this.idcalendar = idcalendar;
		this.date = date;
	}


	public To_trade_holidays() {
		super();
	}


	public int getIdcalendar() {
		return idcalendar;
	}


	public void setIdcalendar(int idcalendar) {
		this.idcalendar = idcalendar;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "To_trade_holidays [idcalendar=" + idcalendar + ", date=" + date + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, idcalendar);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		To_trade_holidays other = (To_trade_holidays) obj;
		return Objects.equals(date, other.date) && idcalendar == other.idcalendar;
	}

	
	
}
