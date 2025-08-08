// 泛型在定义函数、接口、类的时候，不预先指定类型，而是使用的时候再指定
// <T>表示的是一个泛型函数  T是一个类型参数,可以是任何类型
function getAdd<T>(val: T, num: number): T {
    return val;
}

// 使用的时候赋值类型
const res = getAdd<number>(200, 10);
console.log(res);

const res2 = getAdd<string>("hi", 10);
console.log(res2);

function two<K, V>(a: K, b: V): K {
    return a;
}

console.log(two<number, string>(10, "德华"));

// 接口
interface Imsg<T, K, U> {
    name: T;
    age: K;
    sex: U;
}

let mi: Imsg<string, number, boolean> = {
    name: "德华",
    age: 50,
    sex: true,
};
