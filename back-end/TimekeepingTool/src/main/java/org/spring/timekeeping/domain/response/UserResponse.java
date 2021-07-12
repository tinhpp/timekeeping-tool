package org.spring.timekeeping.domain.response;

import java.util.Date;

import org.spring.timekeeping.domain.ModelBase;

public class UserResponse extends ModelBase {
	/** User Name **/
	private String userName;
	
	/** Address Mail **/
	private String addressMail;
	
	/** First Name **/
	private String firstName;
	
	/** LastName **/
	private String lastName;
	
	/** Date of Birth **/
	private Date dateOfBirth;
	
	/** Date of joining The Company **/
	private Date dateOfJoiningTheCompany;
	
	/** Sex **/
	private int sex;
	
	/** Department Name **/
	private String departmentName;
	
	/** ID Department **/
	private String idDepartment;
	
	/** StatusUser **/
	private int statusUser;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfJoiningTheCompany() {
		return dateOfJoiningTheCompany;
	}
	public void setDateOfJoiningTheCompany(Date dateOfJoiningTheCompany) {
		this.dateOfJoiningTheCompany = dateOfJoiningTheCompany;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdDepartment() {
		return idDepartment;
	}
	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getStatusUser() {
		return statusUser;
	}
	public void setStatusUser(int statusUser) {
		this.statusUser = statusUser;
	}
}
