package com.java.demo5proxy2;

public class UserServiceImpl implements UserService {

    @Override
    public void login(String loginName, String passWord) throws Exception {
        if ("admin".equals(loginName) && "123456".equals(passWord)) {
            System.out.println("您登录成功，欢迎光临本系统~");
        } else {
            System.out.println("您登陆失败，用户名或密码错误~");
        }
        Thread.sleep(1000);
    }

    @Override
    public void deleteUsers() throws Exception {
        System.out.println("成功删除了1万个用户~");
        Thread.sleep(1500);
    }

    @Override
    public String[] selectUsers() throws Exception {
        System.out.println("查询出了3个用户~");
        String[] names = {"张三", "李四", "王五"};
        Thread.sleep(500);
        return names;
    }
}
