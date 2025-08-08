export {};
console.log(1 + "2"); //12

// console.log(10 - "3"); //ts 减法不支持两边数据类型不一样

// 解决1：
// 在字符串前加 + 会将字符串转成数字类型
console.log(10 - +"3");

// 解决2：
console.log(10 - Number("3"));

// 一元运算符 ++ --
// 逻辑运算符 && || ！
// 比较运算符 > < >= <= == === != !==
// 赋值运算符 += -= *=  /= %=

// 三元运算符
var num: number = 59;
var res: string = num > 60 ? "吃海底捞" : "补考";
console.log(res);
