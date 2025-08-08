package com.java.demo8api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        // java提供的获取时间的方案
        // JDK 8 之间的方案： Data 获取此刻时间日期 老项目还有。
        Date d = new Date();
        System.out.println(d);

        // 格式化 SimpleDateFormat 简单日期格式化，格式化日期对象成为我们喜欢的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String str = sdf.format(d);
        System.out.println(str);

        // JDK 8 之后的方案： LocalDate LocalTime LocalDateTime 获取此刻时间日期 新项目推荐。
        // 获取此刻日期时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());

        LocalDateTime now2 = now.plusSeconds(60); // 60秒后
        System.out.println(now);
        System.out.println(now2);

        // 格式化：DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EEE a");
        // 格式化now对象的时间
        String result2 = dtf.format(now2);
        System.out.println(result2);
    }
}
