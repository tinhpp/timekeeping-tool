import React, { Component } from "react";
import { FaInfoCircle, FaEdit, FaTrashAlt } from "react-icons/fa";
import {
  LIST_USER_SEX_ITEM,
  LIST_USER_STATUS_WORK_ITEM,
} from "../../../constants/UserManagement/ListUser/ListUser";
import { getValueOfMapByKey, formatDate } from "../../Common/utils.js";

class UserItem extends Component {
  getDataMap(datas, item) {
    let result = "";
    datas.map((data) => {
      if (data.key === item) {
        result = data.value;
      }
      return data;
    });
    return result;
  }

  render() {
    const { userData, ordinalNumber } = this.props;
    return (
      <React.Fragment>
        <tr>
          <td className="row">
            <div className="custom-control custom-checkbox">
              <input
                type="checkbox"
                className="custom-control-input"
                value={userData.userName}
                id={"cbUser" + ordinalNumber}
              />
              <label
                className="custom-control-label"
                htmlFor={"cbUser" + ordinalNumber}
              ></label>
            </div>
          </td>
          <td>
            {userData.firstName}&nbsp;{userData.lastName}
          </td>
          <td className="textCenter">{userData.userName}</td>
          <td className="textCenter">{formatDate(userData.dateOfBirth)}</td>
          <td className="textCenter">
            {getValueOfMapByKey(LIST_USER_SEX_ITEM, userData.sex)}
          </td>
          <td className="textCenter">{userData.departmentName}</td>
          <td className="textCenter">
            {getValueOfMapByKey(
              LIST_USER_STATUS_WORK_ITEM,
              userData.statusUser
            )}
          </td>
          <td className="textCenter">
            <button
              type="button"
              className="btn btn-info"
              title="View"
              data-toggle="tooltip"
            >
              <FaInfoCircle />
            </button>
            &nbsp;
            <button
              type="button"
              className="btn btn-primary"
              title="Edit"
              data-toggle="tooltip"
            >
              <FaEdit />
            </button>
            &nbsp;
            <button
              type="button"
              className="btn btn-danger"
              title="Delete"
              data-toggle="tooltip"
            >
              <FaTrashAlt />
            </button>
          </td>
        </tr>
      </React.Fragment>
    );
  }
}

export default UserItem;
