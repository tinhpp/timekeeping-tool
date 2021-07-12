export function getValueOfMapByKey(datas, item) {
  let result = "";
  datas.map((data) => {
    if (data.key === item) {
      result = data.value;
    }
    return data;
  });
  return result;
}

export function formatDate(value) {
  let date = new Date(value);
  return new Intl.DateTimeFormat("en-GB").format(date);
}

export function formatDateTimes(value) {
  let date = new Date(value);
  return new Intl.DateTimeFormat("en-GB", {
    year: "numeric",
    month: "2-digit",
    day: "2-digit",
    hour: "2-digit",
    minute: "2-digit",
    second: "2-digit",
  }).format(date);
}
