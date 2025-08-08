// 命名函数
function add(x: number): number {
    return x;
}

// 函数表达式
let add2 = (x: number): number => {
    return x;
};

// (x: number) => number 函数的签名， 箭头右边是返回值的类型  左边是参数的类型
let add3: (x: number) => number = function (x) {
    return x;
};

// 三种写法效果一样
console.log(add(1));
console.log(add2(1));
console.log(add3(1));
