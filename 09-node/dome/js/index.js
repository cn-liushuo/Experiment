var tap = document.querySelectorAll(".tap > p");
var from = document.querySelectorAll("form");
let inp = document.querySelectorAll(".inp > input")[0];
let inp1 = document.querySelectorAll(".inp > input")[1];
let inp2 = document.querySelectorAll(".inp > input")[2];
let inp3 = document.querySelectorAll(".inp > input")[3];
let spxa = document.querySelectorAll(".tisi");
let jizm = document.querySelector(".jizm");
let jizhu = document.querySelector(".jizhu > input");

// top切换
for (let i = 0; i < tap.length; i++) {
    tap[i].onclick = function () {
        if (i % 2 == 1) {
            from[0].className = "form1";
            from[1].className = "form2 xian";
            inp.value = "admin";
            inp1.value = "admin";
            inp.className = "";
            inp1.className = "";
            spxa[0].className = "tisi weizhi";
            spxa[1].className = "tisi weizhi1";
        } else {
            from[0].className = "form1 xian";
            from[1].className = "form2";
            inp2.value = "";
            inp3.value = "";
        }
    };
}

// 判断是否为空
inp.onfocus = function () {
    inp.className = "huojiao";
};
inp.onblur = function () {
    inp.className = "";
    if (inp.value == "") {
        spxa[0].className = "tisi weizhi tisixian";
        inp.className = "jingshi";
    } else {
        spxa[0].className = "tisi weizhi";
    }
};
inp1.onfocus = function () {
    inp1.className = "huojiao";
};
inp1.onblur = function () {
    inp1.className = "";
    if (inp1.value == "") {
        spxa[1].className = "tisi weizhi1 tisixian";
        inp1.className = "jingshi";
    } else {
        spxa[1].className = "tisi weizhi1";
    }
};
