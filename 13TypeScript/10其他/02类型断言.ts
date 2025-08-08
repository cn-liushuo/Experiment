// 类型断言： 允许开发者指定某个值的类型，告诉编译器这是个什么类型的值
// 一旦发现断言的存在，ts就不会对这个值进行推论， 直接采纳断言结果

// 语法： 1. <类型>值
//         2. 值 as 类型

let str: any = "hello";

let len: number = (<string>str).length;

let len2: number = (str as string).length;

// 非空断言
function fn(x: number | null) {
    console.log(x!.toFixed()); //不加 ！ 会提示可能为空，报错
}

// fn(null)
