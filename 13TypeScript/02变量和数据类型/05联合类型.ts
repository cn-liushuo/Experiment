// 这种可以赋值数字也可以赋值字符串的就叫联合类型
let num: number | string = 123;
num = "范存义爱吃饭";

console.log(typeof num);

// 2.定义数组
let arr: number[] = [1, 2, 4];

let arr2: (number | string | boolean)[] = [1, "孙悟空", true];
