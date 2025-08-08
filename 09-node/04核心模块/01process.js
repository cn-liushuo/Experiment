/* 
    核心模块：node中自带的模块，可以在node里直接使用

    process 表示当前进程


*/

// console.log(window)  node没有window
console.log(global); ///global相当于window

console.log(1111111);
// process.exit() //结束当前进行  中止node
console.log(2222222);
console.log(3333333);

setTimeout(() => {
    console.log(1);
});

// tick任务队列 相当于之前的微任务队列
process.nextTick(() => {
    console.log(2);
});

// 微任务
queueMicrotask(() => {
    console.log(3);
});

console.log(4);
