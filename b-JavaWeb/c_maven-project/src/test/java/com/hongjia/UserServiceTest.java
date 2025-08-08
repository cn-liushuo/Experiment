package com.hongjia;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 测试类
 */
@DisplayName("用户信息的测试类")
public class UserServiceTest {

    @BeforeAll // 在所有的单元测试方法之前，运行一次
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll // 在所有的单元测试方法之后，运行一次
    public static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach // 在每个单元测试方法之前，都运行一次
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach // 在每个单元测试方法之后，都运行一次
    public void afterEach() {
        System.out.println("afterEach");
    }

    @Test
    public void testGetAge() {
        UserService userService = new UserService();
        Integer age = userService.getAge("430682199901011234");
        System.out.println(age);
    }

    @Test
    public void testGetGender() {
        UserService userService = new UserService();
        String gender = userService.getGender("430682199901011234");
        System.out.println(gender);
    }

    /**
     * 断言
     */
    @Test
    public void testGetGenderWithAssert() {
        UserService userService = new UserService();
        String gender = userService.getGender("430682199901011234");
        // 断言
        Assertions.assertEquals("男", gender, "性别获取错误有问题");
    }

    @Test
    public void testGetGenderWithAssert2() {
        UserService userService = new UserService();
        // 断言
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.getGender(null);
        });
    }

    /**
     * 参数化测试
     */
    @DisplayName("测试用户性别")
    @ParameterizedTest
    @ValueSource(strings = {"430682199901011214", "430682199901011235", "430682199901011256"})
    public void testGetGender2(String idCard) {
        UserService userService = new UserService();
        String gender = userService.getGender(idCard);
        // 断言
        Assertions.assertEquals("男", gender);
    }
}
