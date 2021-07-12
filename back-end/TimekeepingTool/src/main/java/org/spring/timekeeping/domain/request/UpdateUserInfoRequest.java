package org.spring.timekeeping.domain.request;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.spring.timekeeping.domain.ModelBase;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UpdateUserInfoRequest extends ModelBase{
	/** User Name **/
	@NotBlank(message = "Username is required")
	private String userName;
	
	/** Address Mail **/
	@Email(message = "Incorrect email format")
	private String addressMail;
	
	/** First Name **/
	private String firstName;
	
	/** LastName **/
	private String lastName;
	
	/** Date of Birth **/
	@JsonFormat(pattern="dd/mm/yyyy")
	private Date dateOfBirth;
	
	/** Date of joining The Company **/
	@JsonFormat(pattern="dd/mm/yyyy")
	private Date dateOfJoiningTheCompany;
	
	/** Sex **/
	private int sex;
	
	/** id Department **/
	@NotBlank(message = "Department is required")
	private String idDepartment;

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
}
