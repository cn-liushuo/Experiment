package com.java.demo;

public class Test {
    public static void main(String[] args) {
        // 面向对象综合小案例
        // 1.设计电影类Movie，以便创建电影对象，封装电影数据。
        // 2.封装系统中的全部电影数据。（自己造一些数据）
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "星际穿越", 9.6, "安妮");
        movies[1] = new Movie(2, "速度与激情", 9.2, "费尔南多");
        movies[2] = new Movie(3, "哪吒2", 9.9, "饺子");
        movies[3] = new Movie(4, "十二生肖", 9.8, "成龙");
        movies[4] = new Movie(5, "战狼2", 9.7, "吴京");
        movies[5] = new Movie(6, "夏洛特烦恼", 9.0, "沈腾");

        // 3.创建电影操作对象出来，专门负责电影数据的业务操作。
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();
    }
}
