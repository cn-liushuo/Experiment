//
class Person {
    // 定义公共的字段属性
    name: string;
    age: number;
    gender: string;

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

//继承
class Monkey extends Person {
    constructor(name: string, age: number, gender: string) {
        // 调用父元素中的构造函数
        super(name, age, gender);
    }

    // 调用父类方法
    sayHi(str: string) {
        super.sayHi(str);
    }
}

const m = new Monkey("灰太狼", 30, "公");
m.sayHi("抓喜羊羊");
