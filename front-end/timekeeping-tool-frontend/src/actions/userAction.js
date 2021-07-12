import axios from "axios";
import { GET_LIST_USER } from "./types";

axios.defaults.baseURL = "http://localhost:8080";
axios.defaults.headers.common["Content-Type"] = "application/json";

export const getListUser = (searchInfo) => async (dispatch) => {
  const res = await axios.post("/api/v1/user/getlistuser", searchInfo);
  dispatch({
    type: GET_LIST_USER,
    payload: res.data,
  });
};
