package com.hongjia.mapper;

import com.hongjia.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询所有的部门数据
     *
     * @return
     */
    // 方式一：手动结果映射
//    @Results({
//                    @Result(column = "create_time", property = "createTime"),
//                    @Result(column = "update_time", property = "updateTime")
//            })
    // 方式二：起别名
//    @Select("select id, name, create_time createTime, update_time updateTime from dept order by update_time desc;")
    // 方式三：在yml中配置启用驼峰命名
    @Select("select id, name, create_time , update_time from dept order by update_time desc;")
    List<Dept> findAll();

    /**
     * 根据ID删除部门
     *
     * @param id
     */
    // @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     *
     * @param dept
     */
    // @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    /**
     * 根据ID查询部门数据
     *
     * @param id
     * @return
     */
    // @Select("select id, name, create_time, update_time from dept where id = #{id}")
    Dept getById(Integer id);

    /**
     * 更新部门
     *
     * @param dept
     */
    // @Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
}
