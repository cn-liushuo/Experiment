package com.hongjia;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserService {
    /**
     * 给定一个身份证号，计算出该用户的年龄
     *
     * @param idCard 身份证号
     */
    public Integer getAge(String idCard) {
        if (idCard == null || idCard.length() != 18) {
            throw new IllegalArgumentException("无效的身份证号");
        }
        String birthday = idCard.substring(6, 14);
        LocalDate pares = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return Period.between(pares, LocalDate.now()).getYears();
    }

    /**
     * 给定一个身份证号，计算出该用户的性别
     *
     * @param idCard 身份证号
     */
    public String getGender(String idCard) {
        if (idCard == null || idCard.length() != 18) {
            throw new IllegalArgumentException("无效的身份证号");
        }
        return Integer.parseInt(idCard.substring(16, 17)) % 2 == 1 ? "男" : "女";
    }
}
