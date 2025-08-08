export {};

// 静态属性 被静态属性修饰的属性 不在属于实例化对象，只属于这个类
class Person {
    static names: string;

    constructor(name: string) {
        Person.names = name;
    }
}

const stu = new Person("霍霍");
// console.log(stu.names);
console.log(Person.names);
