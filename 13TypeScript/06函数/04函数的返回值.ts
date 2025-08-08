export {};

// function getFn(): number{}  指定返回值类型
function getFn(num: number): number {
    return num;
}

console.log(getFn(66));

// 没有返回值 类型是void
function fn(): void {
    console.log("🐒");
}

fn();

function fn2(obj: object): object {
    return obj;
}

console.log(
    fn2({
        name: "德华",
    })
);
