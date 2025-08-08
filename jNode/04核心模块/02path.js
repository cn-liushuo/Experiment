/* 
    path:
        -表示路径，要先引入
        -方法 path.resolve() 直接调用返回当前目录
        // E:\2407-c
        // E:\2407-c\09-node\04核心模块
        // 注意：不同的方式执行代码  工作目录可能会发生变化

        -如果将相对路径作为参数传入， 会转换成绝对路径

        -一般情况下，会将一个绝对路径作为第一个参数，一个相对路径作为第二个参数，这样就会计算出最终路径

*/

const path = require("node:path");

// const res = path.resolve("E:\\2407-c\\09-node\\04核心模块","./sun.txt")
// __dirname 获取当前模块的路径
const res = path.resolve(__dirname, "./sun.txt");
console.log(res);
