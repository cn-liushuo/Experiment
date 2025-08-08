package com.hongjia.controller;

import com.hongjia.pojo.User;
import com.hongjia.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息Controller
 */
@RestController // @ResponseBody -> 作用：将controller返回值的数据作为响应体的数据直接响应；返回值是对象/集合 -> json -> 响应
public class UserController {

    /*@RequestMapping("/list")
    public List<User> list() throws Exception {
        // 1.加载并读取user.txt文件，获取用户数据
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

        // 2.解析用户信息，封装为user对象 -> list集合
        List<User> userList = lines.stream()
                .map(line -> {
                    String[] parts = line.split(",");
                    Integer id = Integer.parseInt(parts[0]);
                    String username = parts[1];
                    String password = parts[2];
                    String name = parts[3];
                    Integer age = Integer.parseInt(parts[4]);
                    LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    return new User(id, username, password, name, age, updateTime);
                })
                .collect(Collectors.toList());

        // 3.返回数据（json）
        return userList;
    }*/

    // 方式一：属性注入 追求简介
    /*@Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;*/

    @Resource(name = "userServiceImpl2")
    private UserService userService;

    // 方式二：构造器注入 追求规范
    /*private final UserService userService;
    // @Autowired --> 如果当前类中只存在一个构造函数，@Autowired可以省略
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    // 方式三：setter注入
    /*private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    @RequestMapping("/list")
    public List<User> list() throws Exception {
        // 1.调用service，获取数据
        List<User> userList = userService.findAll();

        // 2.返回数据（json）
        return userList;
    }
}
