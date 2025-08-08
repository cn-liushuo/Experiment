export {};

// any 表示 允许存储不同类型的元素，如果不知道后台返回了个啥类型的，可以用any
let arr: any[] = [1, "霍霍", true, undefined, null];

let num: any = "11";

// 元组: 在已知数据类型和元素数量的数组,可以使用元组

let t1: [number, string, string];

t1 = [1, "hi", "hello"];
