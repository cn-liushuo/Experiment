package com.java.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 二维数组
        printArray();
        printArray2();
    }

    public static void printArray() {
        // 静态初始化二维数组
        String[][] classroom = {
                {"张无忌", "赵敏", "周芷若"},
                {"张三丰", "宋远桥", "殷梨亭"},
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},
                {"杨逍", "纪晓芙"}
        };

        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println(classroom[1][1]);
        System.out.println(classroom[2][2]);

        System.out.println(classroom.length);
        System.out.println(classroom[2].length);

        // 动态初始化二维数组
        int[][] arr = new int[3][5];
    }

    public static void printArray2() {
        String[][] classroom = {
                {"张无忌", "赵敏", "周芷若"},
                {"张三丰", "宋远桥", "殷梨亭"},
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},
                {"杨逍", "纪晓芙"}
        };

        for (int i = 0; i < classroom.length; i++) {
            String[] names = classroom[i];
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
