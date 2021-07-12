import React, { Component } from "react";

const LIST_DEPARTMENT = {
  id: "department",
  label: "Department",
};

class ListDepartment extends Component {
  render() {
    return (
      <div className="form-row justify-content-md-center">
        <div className="form-group col-md-6 mb-3">
          <label htmlFor={LIST_DEPARTMENT.id}>{LIST_DEPARTMENT.label}</label>
          <select id={LIST_DEPARTMENT.id} className="form-control">
            <option defaultValue>(Chua chon)</option>
            <option>FDN.FIN2</option>
            <option>Ke Toan Tong Hop</option>
            <option>Khac</option>
          </select>
        </div>
      </div>
    );
  }
}

export default ListDepartment;
