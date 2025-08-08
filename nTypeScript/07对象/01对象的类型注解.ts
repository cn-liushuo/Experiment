export {};
let obj = {
    name: "zs",
};

// 对象的类型注解，这里的{}表示 的就是对象的类型注解，用分号间隔，表示给对象添加约束，从而约束对象的结构 分号可省略

let obj2: {
    name: string;
    age: number;
    // ? 表示选填
    sex?: string;
};

// 这里是对象的赋值
obj2 = {
    name: "阿三",
    age: 66,
    // sex: "nan"
};

// 对象方法的类型注解
let obj3: {
    // void表示返回值是空
    sayHi: (x: number) => void;
};

obj3 = {
    sayHi: function (x) {
        console.log(x);
    },
};
obj3.sayHi(666);

//

let obj4: {
    // 没有参数 返回值的类型是number
    say: () => number;
} = {
    say: function () {
        return 666;
    },
};
