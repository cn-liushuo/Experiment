import request from "../utils/request"

export function login(data: any) {
  return request({
    method: "post",
    url: "/login",
    // post参数放data里
    data: data
  })
}
