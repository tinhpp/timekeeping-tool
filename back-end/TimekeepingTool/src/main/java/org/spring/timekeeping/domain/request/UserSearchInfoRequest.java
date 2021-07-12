package org.spring.timekeeping.domain.request;

import org.spring.timekeeping.domain.ModelBase;

public class UserSearchInfoRequest extends ModelBase{
	/** User Name **/
	private String userName;
	
	/** Address Mail **/
	private String addressMail;
	
	/** Full Name **/
	private String fullName;
	
	/** Date of Birth **/
	private String dateOfBirth;
	
	/** Sex **/
	private String sex;
	
	/** Id Department **/
	private String idDepartment;
	
	/** StatusUser **/
	private String statusUser;

	//Getter&Setter
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddressMail() {
		return addressMail;
	}

	public void setAddressMail(String addressMail) {
		this.addressMail = addressMail;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getStatusUser() {
		return statusUser;
	}

	public void setStatusUser(String statusUser) {
		this.statusUser = statusUser;
	}
}
