package org.spring.timekeeping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;


@Alias(value = "tbUser")
public class UserEntity extends ModelBase {
	/** User Name **/
	private String userName;
	
	/** Password **/
	private String password;
	
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
	
	/** id Department **/
	private String idDepartment;
	
	/** Status User **/
	private int statusUser;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(String userName) {
		super();
		this.userName = userName;
	}
	//Getter&Setter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getStatusUser() {
		return statusUser;
	}
	public void setStatusUser(int statusUser) {
		this.statusUser = statusUser;
	}
}
