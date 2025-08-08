package com.java.demo;

import java.util.Scanner;

// 电影操作类
public class MovieOperator {

    private Movie[] movies; // 记住一个电影对象的数组

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    // 打印全部电影信息
    public void printAllMovies() {
        System.out.println("=全部电影信息如下=");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }
    }

    // 根据ID查询电影
    public void searchMovieById() {
        System.out.println("请输入要查询的电影ID：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
