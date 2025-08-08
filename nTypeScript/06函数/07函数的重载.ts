/* 

    重载： 函数名相同，而参数不同的多个函数

    方法可以接收两个string类型的参数进行拼接，也可以接收两个number类型的进行相加
*/

function add(x: string | number, y: string | number): string | number {
    if (typeof x == "string" && typeof y === "string") {
        return x + y;
    } else if (typeof x == "number" && typeof y === "number") {
        return x + y;
    } else {
        return "";
    }
}

console.log(add("德华", "帅"));
console.log(add(666, 6));
console.log(add("霍霍", 6));
