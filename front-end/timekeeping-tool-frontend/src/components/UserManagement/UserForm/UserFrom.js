import React, { Component } from "react";
import "./UserFrom.css";
import { FaSave, FaBan } from "react-icons/fa";
import {
  USER_FROM_TITLE,
  USER_FROM_NAME_ITEM,
  USER_FROM_URL_CREATE,
  USER_FROM_STATUS_WORK,
} from "../../../constants/UserManagement/UserForm/UserFrom";
import ListDepartment from "../../Common/ListDepartment";

class UserFrom extends Component {
  constructor(props) {
    super(props);
    this.state = {
      titleName: "",
    };
    let pathname = this.props.location.pathname;
    if (pathname === USER_FROM_URL_CREATE) {
      this.state.titleName = USER_FROM_TITLE.CREATE.title;
    } else {
      this.state.titleName = USER_FROM_TITLE.CREATE.title;
    }
  }
  componentDidMount() {
    document.title = this.state.titleName;
  }
  render() {
    return (
      <div className="container">
        <div className="card border-primary">
          <div className="card-header text-white bg-primary">
            <h3 className="card-title">{this.state.titleName}</h3>
          </div>
          <div className="card-body">
            <form className="needs-validation">
              {/* Account name Start HERE */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-6 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.ACCONT_NAME.id}>
                    {USER_FROM_NAME_ITEM.ACCONT_NAME.label}
                  </label>
                  <input
                    type="text"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.ACCONT_NAME.id}
                    placeholder={USER_FROM_NAME_ITEM.ACCONT_NAME.text}
                    required
                  />
                </div>
              </div>
              {/* Account name End HERE */}
              {/* Accout name Start HERE */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-3 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.FIRST_NAME.id}>
                    {USER_FROM_NAME_ITEM.FIRST_NAME.label}
                  </label>
                  <input
                    type="text"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.FIRST_NAME.id}
                    placeholder={USER_FROM_NAME_ITEM.FIRST_NAME.text}
                    required
                  />
                </div>
                <div className="form-group col-md-3 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.LAST_NAME.id}>
                    {USER_FROM_NAME_ITEM.LAST_NAME.label}
                  </label>
                  <input
                    type="text"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.LAST_NAME.id}
                    placeholder={USER_FROM_NAME_ITEM.LAST_NAME.text}
                    required
                  />
                </div>
              </div>
              {/* Accout name End HERE */}
              {/* Address Email Start HERE  */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-6 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.ADDRESS_EMAIL.id}>
                    {USER_FROM_NAME_ITEM.ADDRESS_EMAIL.label}
                  </label>
                  <input
                    type="text"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.ADDRESS_EMAIL.id}
                    placeholder={USER_FROM_NAME_ITEM.ADDRESS_EMAIL.text}
                    required
                  />
                </div>
              </div>
              {/* Address Email End HERE  */}
              {/* Date of birth Start HERE */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-3 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.DATE_OF_BIRTH.id}>
                    {USER_FROM_NAME_ITEM.DATE_OF_BIRTH.label}
                  </label>
                  <input
                    type="date"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.DATE_OF_BIRTH.id}
                    placeholder={USER_FROM_NAME_ITEM.DATE_OF_BIRTH.text}
                  />
                </div>
                <div className="form-group col-md-3 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.SEX.id}>
                    {USER_FROM_NAME_ITEM.SEX.label}
                  </label>
                  <select
                    id={USER_FROM_NAME_ITEM.SEX.id}
                    className="form-control"
                  >
                    <option defaultValue>(Chua chon)</option>
                    <option>Nam</option>
                    <option>Nu</option>
                    <option>Khac</option>
                  </select>
                </div>
              </div>
              {/* Date of birth End HERE  */}
              {/* Department Start HERE */}
              <ListDepartment />
              {/* Department End HERE  */}
              {/* DateOfJoiningTheCompany Start HERE */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-3 mb-3">
                  <label
                    htmlFor={USER_FROM_NAME_ITEM.DATE_OF_JOINING_THE_COMPANY.id}
                  >
                    {USER_FROM_NAME_ITEM.DATE_OF_JOINING_THE_COMPANY.label}
                  </label>
                  <input
                    type="date"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.DATE_OF_JOINING_THE_COMPANY.id}
                    placeholder={
                      USER_FROM_NAME_ITEM.DATE_OF_JOINING_THE_COMPANY.text
                    }
                  />
                </div>
                {/* Status Start HERE  */}
                <div className="form-group col-md-3 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.STATUS_WORK.id}>
                    {USER_FROM_NAME_ITEM.STATUS_WORK.label}
                  </label>
                  <div>
                    <div className="custom-control custom-radio custom-control-inline">
                      <input
                        type="radio"
                        id={USER_FROM_STATUS_WORK.STILL_WORKING.id}
                        name={USER_FROM_NAME_ITEM.STATUS_WORK.id}
                        value={USER_FROM_STATUS_WORK.STILL_WORKING.value}
                        className="custom-control-input"
                      />
                      <label
                        className="custom-control-label"
                        htmlFor={USER_FROM_STATUS_WORK.STILL_WORKING.id}
                      >
                        {USER_FROM_STATUS_WORK.STILL_WORKING.label}
                      </label>
                    </div>
                    <div className="custom-control custom-radio custom-control-inline">
                      <input
                        type="radio"
                        id={USER_FROM_STATUS_WORK.HAS_RETIRED.id}
                        name={USER_FROM_NAME_ITEM.STATUS_WORK.id}
                        value={USER_FROM_STATUS_WORK.HAS_RETIRED.value}
                        className="custom-control-input"
                      />
                      <label
                        className="custom-control-label"
                        htmlFor={USER_FROM_STATUS_WORK.HAS_RETIRED.id}
                      >
                        {USER_FROM_STATUS_WORK.HAS_RETIRED.label}
                      </label>
                    </div>
                  </div>
                </div>
                {/* Status End HERE  */}
              </div>
              {/* DateOfJoiningTheCompany End HERE  */}
              {/* Password Start HERE  */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-6 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.PASSWORD.id}>
                    {USER_FROM_NAME_ITEM.PASSWORD.label}
                  </label>
                  <input
                    type="password"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.PASSWORD.id}
                    placeholder={USER_FROM_NAME_ITEM.PASSWORD.text}
                    required
                  />
                </div>
              </div>
              {/* Password End HERE  */}
              {/* Comfirm Password Start HERE  */}
              <div className="form-row justify-content-md-center">
                <div className="form-group col-md-6 mb-3">
                  <label htmlFor={USER_FROM_NAME_ITEM.COMFIRM_PASSWORD.id}>
                    {USER_FROM_NAME_ITEM.COMFIRM_PASSWORD.label}
                  </label>
                  <input
                    type="password"
                    className="form-control"
                    id={USER_FROM_NAME_ITEM.COMFIRM_PASSWORD.id}
                    placeholder={USER_FROM_NAME_ITEM.COMFIRM_PASSWORD.text}
                    required
                  />
                </div>
              </div>
              {/* Comfirm Password End HERE  */}
              {/* Button Event Start HERE  */}
              <div className="form-row justify-content-end">
                <div className="form-group col-md-6">
                  <button type="button" className="btn btn-success">
                    <FaSave />
                    &nbsp; {USER_FROM_NAME_ITEM.BTN_SUBMIT.text}
                  </button>
                  &nbsp;
                  <button type="button" className="btn btn-danger">
                    <FaBan />
                    &nbsp; {USER_FROM_NAME_ITEM.BTN_CANCEL.text}
                  </button>
                </div>
              </div>
              {/* Button Event End HERE  */}
            </form>
          </div>
        </div>
      </div>
    );
  }
}

export default UserFrom;
