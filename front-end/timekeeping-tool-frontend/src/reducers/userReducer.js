import { GET_LIST_USER } from "../actions/types";

const initialState = {
  listUserData: [],
  userData: {},
};

export default function userReducer(state = initialState, action) {
  switch (action.type) {
    case GET_LIST_USER:
      return {
        ...state,
        listUserData: action.payload,
      };
    default:
      return state;
  }
}
