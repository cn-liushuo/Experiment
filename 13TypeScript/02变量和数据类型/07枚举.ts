// 枚举是一种数据类型,可以让数据更加简洁易读
/* 
    1.数字枚举
    2.字符枚举
    3.复合枚举

*/

// 1.数字枚举 不指定默认值 从0开始
enum obj {
    mouse,
    pig,
    rabbit,
    dragon,
    tigger,
}

console.log(obj[0]);
console.log(obj.dragon);

// 指定默认值
enum obj2 {
    mouse = 4,
    pig, //5
    rabbit, //6
    dragon, //6
    tigger, //7
}

console.log(obj2);

// 2.字符枚举: 没有递增的特性,需要明确赋值

enum obj3 {
    no = "n",
    yes = "y",
}

console.log(obj3);

// 3.复合枚举 不是一种类型的枚举,会破坏枚举本意,所以用的少
enum obj4 {
    no = 0,
    yes = "点头",
}

console.log(obj4.no);

enum state {
    boy,
    girl,
    no,
}

function sex(hh: state) {
    if (hh == 0) {
        console.log("去男厕所");
    } else if (hh == 1) {
        console.log("去女厕所");
    } else {
        console.log("尿裤子");
    }
}

sex(state.boy);
