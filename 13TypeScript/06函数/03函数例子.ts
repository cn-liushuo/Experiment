export {};

// 函数 传数组
function getArr(arr: any[]) {
    for (const key in arr) {
        console.log(key);
    }
}

getArr(["王国华", "刘德华", "霍骅"]);
