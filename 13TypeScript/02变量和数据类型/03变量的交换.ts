export {};

let str1: string = "苹果";
let str2: string = "香蕉";

let str3: string;

str3 = str1;
str1 = str2;
str2 = str3;

console.log(str1, str2);
