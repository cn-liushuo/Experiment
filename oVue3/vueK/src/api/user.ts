import request from "../utils/request"

export function userList(params: object) {
  return request({
    method: "get",
    url: "/admin",
    params
  })
}

// 新增
export function userAdd(data: object) {
  return request({
    method: "post",
    url: "/admin",
    data
  })
}

// 编辑
export function userEdit(data: object) {
  return request({
    method: "put",
    url: "/admin",
    data
  })
}

// shanchu
export function userdel(data: object) {
  return request({
    method: "delete",
    url: "/admin",
    data
  })
}
