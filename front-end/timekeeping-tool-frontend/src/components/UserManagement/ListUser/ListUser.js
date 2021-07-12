import React, { Component } from "react";
import { FaPlusCircle } from "react-icons/fa";
import {
  LIST_USER_TITLE,
  LIST_USER_TABLE_ITEM,
} from "../../../constants/UserManagement/ListUser/ListUser";
import "./ListUser.css";
import { getListUser } from "../../../actions/userAction";
import PropTypes from "prop-types";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import UserItem from "./UserItem";

class ListUser extends Component {
  constructor() {
    super();
    this.state = {
      searchInfo: {
        dateOfBirth: null,
        userName: null,
        password: null,
        confirmPassword: null,
        addressMail: null,
        firstName: null,
        lastName: null,
        dateOfJoiningTheCompany: null,
        sex: null,
        idDepartment: null,
        statusUser: null,
      },
    };
  }

  componentDidMount() {
    document.title = LIST_USER_TITLE;
    this.props.getListUser(this.state.searchInfo);
  }

  render() {
    const { listUserData } = this.props.userData;
    return (
      <div className="container">
        {/* input search START */}
        <div className="card card-primary">
          <div className="card-header">
            <h2 className="card-title">Thong tin tim kiem</h2>
          </div>
          {/* card-header */}
          {/* form start */}
          <form>
            <div className="row card-body">
              {/* ID Work Date Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="idWD">
                  ID Work Date
                </label>
                <input
                  type="text"
                  className="form-control"
                  id="idWD"
                  placeholder="ID Work Date"
                />
              </div>
              {/* ID Work Date End HERE */}
              {/* Account name Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="inputAccountName">
                  Account name
                </label>
                <input
                  type="text"
                  className="form-control"
                  id="inputAccountName"
                  placeholder="Account name"
                />
              </div>
              {/* Account name End HERE */}
              {/* Full name Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="fullName">
                  Full name
                </label>
                <input
                  type="text"
                  className="form-control"
                  id="fullName"
                  placeholder="Full name"
                />
              </div>
              {/* Full name End HERE */}
              {/* Date of Birth Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="inputDateOfBirth">
                  Date of Birth
                </label>
                <input
                  type="date"
                  className="form-control"
                  id="inputDateOfBirth"
                  placeholder="Date of Birth"
                />
              </div>
              {/* Date of Birth End HERE */}
              {/* Sex Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="inputSex">
                  Sex
                </label>
                <select id="inputSex" className="form-control">
                  <option defaultValue>(Chua chon)</option>
                  <option>Nam</option>
                  <option>Nu</option>
                  <option>Khac</option>
                </select>
              </div>
              {/* Sex End HERE */}
              {/* Department Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="inputDepartment">
                  Department
                </label>
                <select id="inputDepartment" className="form-control">
                  <option defaultValue>(Chua chon)</option>
                  <option>FDN.FIN2</option>
                  <option>Ke Toan Tong Hop</option>
                  <option>Khac</option>
                </select>
              </div>
              {/* Department End HERE */}
              {/* Check Times Start HERE */}
              <div className="form-group col-md-3 mb-3">
                <label className="font-weight-bold" htmlFor="inputCheckTimes">
                  Check Times
                </label>
                <input
                  type="date"
                  className="form-control"
                  id="inputCheckTimes"
                  placeholder="Check Times"
                />
              </div>
              {/* Check Times End HERE */}
            </div>
            {/* /.card-body */}
            <div className="card-footer">
              <div className="row">
                <div className="col-md-9"></div>
                <div className="col-md-3 justify-content-end">
                  <button type="button" className="btn btn-primary float-right">
                    Search
                  </button>
                </div>
              </div>
            </div>
          </form>
          {/* form End */}
        </div>

        {/* List User Infomation START */}
        <div className="table-responsive">
          <div className="table-wrapper">
            <div className="table-title">
              <div className="row">
                <div className="col-sm-5">
                  <h2>{LIST_USER_TITLE}</h2>
                </div>
                <div className="col-sm-7">
                  <Link
                    to="/usermanagement/createuserform"
                    className="btn btn-primary"
                  >
                    <FaPlusCircle />
                    &nbsp;<span>{LIST_USER_TABLE_ITEM.BTN_CREATE.label}</span>
                  </Link>
                </div>
              </div>
            </div>
            <table className="table table-striped table-hover">
              <thead>
                <tr>
                  <th scope="col">
                    <div className="custom-control custom-checkbox">
                      <input
                        type="checkbox"
                        className="custom-control-input"
                        id={LIST_USER_TABLE_ITEM.CHECK_USER.id}
                      />
                      <label
                        className="custom-control-label"
                        htmlFor={LIST_USER_TABLE_ITEM.CHECK_USER.id}
                      >
                        {LIST_USER_TABLE_ITEM.CHECK_USER.label}
                      </label>
                    </div>
                  </th>
                  <th scope="col">{LIST_USER_TABLE_ITEM.FULL_NAME.label}</th>
                  <th scope="col">{LIST_USER_TABLE_ITEM.ACCOUNT_NAME.label}</th>
                  <th scope="col">
                    {LIST_USER_TABLE_ITEM.DATE_OF_BIRTH.label}
                  </th>
                  <th scope="col">{LIST_USER_TABLE_ITEM.SEX.label}</th>
                  <th scope="col">{LIST_USER_TABLE_ITEM.DEPARTMENT.label}</th>
                  <th scope="col">{LIST_USER_TABLE_ITEM.STATUS_WORK.label}</th>
                  <th scope="col">{LIST_USER_TABLE_ITEM.ACCTION.label}</th>
                </tr>
              </thead>
              <tbody>
                {listUserData.map((userData, index) => (
                  <UserItem
                    key={userData.userName}
                    userData={userData}
                    ordinalNumber={index}
                  />
                ))}
              </tbody>
            </table>
            <div className="clearfix">
              <div className="hint-text">
                Showing <b>5</b> out of <b>25</b> entries
              </div>
              <ul className="pagination">
                <li className="page-item disabled">
                  <a href="/">Previous</a>
                </li>
                <li className="page-item">
                  <a href="/" className="page-link">
                    1
                  </a>
                </li>
                <li className="page-item">
                  <a href="/" className="page-link">
                    2
                  </a>
                </li>
                <li className="page-item active">
                  <a href="/" className="page-link">
                    3
                  </a>
                </li>
                <li className="page-item">
                  <a href="/" className="page-link">
                    4
                  </a>
                </li>
                <li className="page-item">
                  <a href="/" className="page-link">
                    5
                  </a>
                </li>
                <li className="page-item">
                  <a href="/" className="page-link">
                    Next
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        {/* List User Infomation END */}
      </div>
    );
  }
}

ListUser.propTypes = {
  userData: PropTypes.object.isRequired,
  getListUser: PropTypes.func.isRequired,
};

const mapStateToProps = (state) => ({
  userData: state.userData,
});

export default connect(mapStateToProps, { getListUser })(ListUser);
