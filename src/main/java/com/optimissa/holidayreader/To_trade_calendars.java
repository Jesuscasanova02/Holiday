package com.optimissa.holidayreader;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TO_TRADE_CALENDARS")
public class To_trade_calendars {

	@Id
	@Column(name="idcalendar")
	private int  idcalendar;
	
	@Column(name="name")
	private String name;

	public To_trade_calendars(int idcalendar, String name) {
		super();
		this.idcalendar = idcalendar;
		this.name = name;
	}

	public To_trade_calendars() {
		super();
	}

	public int getIdcalendar() {
		return idcalendar;
	}

	public void setIdcalendar(int idcalendar) {
		this.idcalendar = idcalendar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "To_trade_calendars [idcalendar=" + idcalendar + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idcalendar, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		To_trade_calendars other = (To_trade_calendars) obj;
		return idcalendar == other.idcalendar && Objects.equals(name, other.name);
	}
	
	
	
	
}
