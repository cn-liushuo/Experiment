export {};
// 修饰符： 描述类中成员的可访问性
// public 公共的 任何位置都能访问
// private 私有的 只能在类中使用，外部无法访问  子类无法访问
// protected 受保护的 只能在子类和父类使用
class Person {
    // 定义公共的字段属性
    public name: string;
    private age: number;
    protected gender: string;

    // 构造函数
    constructor(name: string, age: number, gender: string) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 定义实例方法
    sayHi(str: string) {
        console.log(`大家好, 我叫${this.name},是个${this.age}岁的孩子,喜欢${str}`);
    }
}

// 实例化
const per = new Person("铠甲勇士", 6, "男");
per.sayHi("审判怪兽");
// console.log(per.age)  无法访问私有的
// console.log(per.gender); 无法访问

//继承
class Monkey extends Person {
    constructor(name: string, age: number, gender: string) {
        // 调用父元素中的构造函数
        super(name, age, gender);
    }

    // 调用父类方法
    sayHi(str: string) {
        // console.log(this.age)  age是私有属性  子类无法访问
        super.sayHi(str);
        console.log(this.gender);
    }
}

const m = new Monkey("灰太狼", 30, "公");
m.sayHi("抓喜羊羊");
