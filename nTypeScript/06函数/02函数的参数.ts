// 1.形参加上类型
function fn1(str: string | number, num: number) {
    console.log(str, num);
}

// 形参和实参必须一一对应
fn1("德华", 666);

// num? 参数可能不传
// function():string  返回值的类型
let getFn = function (str: string, num?: number): string {
    return str + "真帅" + num;
};
console.log(getFn("霍霍", 666));
