package org.spring.timekeeping.domain.request;

import javax.validation.constraints.NotBlank;

import org.spring.timekeeping.domain.ModelBase;

public class ChangePasswordRequest extends ModelBase {
	/** User Name **/
	@NotBlank(message = "Username is required")
	private String userName;
	
	/** Password Old **/
	@NotBlank(message = "Password old field is required")
	private String passwordOld;
	
	/** Password New **/
	@NotBlank(message = "Password field is required")
	private String password;
	
	/** Confirm Password **/
	@NotBlank(message = "Comfirm Password field is required")
	private String confirmPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswordOld() {
		return passwordOld;
	}

	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
