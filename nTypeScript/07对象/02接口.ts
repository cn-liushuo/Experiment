export {};
// 直接在对象后面加类型注解的缺点： 1.代码不简洁 2.结构相同的对象无法复用
let obj2: {
    name?: string;
    age?: number;
    // ? 表示选填
    sex?: string;
} = {};

let obj3: {
    name?: string;
    age?: number;
    // ? 表示选填
    sex?: string;
} = {};

let obj4: {
    name?: string;
    age?: number;
    // ? 表示选填
    sex?: string;
} = {};

/* 
    创建接口
        interface I接口名字{

        }
*/

interface IUser {
    // readonly 只读 一旦赋值无法修改
    readonly id: number;
    name: string;
    sex: string;
    sayHi?: (x: number) => number;
}

// 使用
let p1: IUser = {
    id: 1,
    name: "张三",
    sex: "男",
};

let p2: IUser = {
    id: 2,
    name: "李四",
    sex: "女",
    sayHi: function (x) {
        console.log("霍霍");
        return 66 + x;
    },
};
console.log(p1.name, p2.name, p2.sayHi(11));

function fnn(obj: IUser): void {
    console.log(obj);
}

fnn({
    id: 3,
    name: "王五",
    sex: "男",
});
