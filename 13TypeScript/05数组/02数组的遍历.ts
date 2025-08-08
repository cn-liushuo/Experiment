export {};

let arr: string[] = ["你好", "德华", "彦祖", "菲菲", "饭存疑"];

for (var i: number = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

arr.forEach(function (item: any, index: number) {
    console.log(item, index);
});
