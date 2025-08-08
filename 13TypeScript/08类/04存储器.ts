// 存储器

class Snow {
    firstName: string;
    lastName: string;

    constructor(firstName: string, lastName: string) {
        this.firstName = firstName;
        this.lastName = lastName; //化腾
    }

    // 读取取器
    get fullName() {
        return this.firstName + " " + this.lastName;
    }

    // 设置器
    set fullName(val) {
        console.log(val);
        // this.... = val
        this.firstName = val; //德华 老马
        console.log(this.firstName);
    }
}

const sun = new Snow("德华", "化腾");
console.log(sun.fullName);
sun.fullName = "德华 老马";
console.log(sun.fullName); //德华 老马 化腾
