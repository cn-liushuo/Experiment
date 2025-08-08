package com.java.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        // 枚举类应用场景：做信息的分类和标志。
        // 需求：模拟上下左右移动图片
        // 第一种常量做信息表示和分类：参数值不受约束。
        move(Constant.UP);
        // 第二种是枚举做信息表示和分类：参数值受枚举类约束。
        move2(Direction.LEFT);
    }

    public static void move2(Direction direction) {
        // 根据这个方向做移动，上下左右。
        switch (direction) {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }

    public static void move(int direction) {
        // 根据这个方向做移动，上下左右。
        switch (direction) {
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }
}
