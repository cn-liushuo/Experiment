package com.java.extends6constructor;

// 子类
public class Teacher extends People {
    private String skill; // 技术

    public Teacher() {
    }

    public Teacher(String name, String skill, char sex) {
        // 子类构造器调用父类构造器的应用场景
        // 可以把自子类继承自父类这部分的数据也完成初始化赋值。
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
