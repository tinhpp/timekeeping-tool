package org.spring.timekeeping.domain;

import java.util.Date;

public class ModelBase {

	/** Update At **/
	private Date updateAt;
	
	/** Create At **/
	private Date createAt;
	
	/** Action user **/
	private String actionUser;
	//Getter&Setter
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getActionUser() {
		return actionUser;
	}
	public void setActionUser(String actionUser) {
		this.actionUser = actionUser;
	}
}
