package modelos;

import java.sql.Date;

public class Driver {
	private int driverId;
	private String driverRef;
	private int number;
	private String code;
	private String forename;
	private String surname;
	private Date dob;
	private String nationality;
	private String url;
	
	public Driver(int driverId, String driverRef, int number, String code, String forename, String surname, Date dob,
			String nationality, String url) {
		super();
		this.driverId = driverId;
		this.driverRef = driverRef;
		this.number = number;
		this.code = code;
		this.forename = forename;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.url = url;
	}
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverRef() {
		return driverRef;
	}
	public void setDriverRef(String driverRef) {
		this.driverRef = driverRef;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
    public String toString() {
        return String.format("%-10d %-15s %-10s %-5s %-15s %-15s %-10s %-15s %-30s",
                driverId, driverRef, number, code, forename, surname, dob, nationality, url);
    }
	
	
}