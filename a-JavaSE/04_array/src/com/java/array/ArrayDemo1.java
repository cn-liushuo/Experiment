package com.java.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        randomCall();
    }

    public static void randomCall() {
        // 静态初始化数组：定义数据的时候，数据已经确定好了
        String[] names = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十"};
        // String[] names = new String[] {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十"};
        int index = (int) (Math.random() * names.length);
        String name = names[index];
        System.out.println(name);
    }
}
