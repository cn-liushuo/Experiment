package com.hongjia.mapper;

import com.hongjia.pojo.Emp;
import com.hongjia.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 员工信息
 */
@Mapper
public interface EmpMapper {

//    ----------------------------------- 原始分页查询实现方式 --------------------------------
    /**
     * 查询总记录数
     * @return
     */
    //@Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
    // public Long count();

    /**
     * 分页查询
     *
     * @return
     */
    //@Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc limit #{start},#{pageSize}")
    // public List<Emp> list(Integer start, Integer pageSize);
    // @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id where e.name like concat('%', #{name}, '%') and e.gender = #{gender} and e.entry_date between #{begin} and #{end} order by e.update_time desc")
    // public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);

    /**
     * 条件查询员工信息
     *
     * @param empQueryParam
     * @return
     */
    public List<Emp> list(EmpQueryParam empQueryParam);

    /**
     * 新增员工基本信息
     *
     * @param emp
     */
    // @Options(useGeneratedKeys = true, keyProperty = "id")//获取到生成的主键 -- 主键返回
    void insert(Emp emp);

    /**
     * 根据ID批量删除员工的基本信息
     *
     * @param ids
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 根据ID查询员工信息以及工作经历信息
     *
     * @param id
     * @return
     */
    Emp getByID(Integer id);

    /**
     * 根据ID更新员工的基本信息
     *
     * @param emp
     */
    void updateById(Emp emp);

    /**
     * 统计员工职位人数
     *
     * @return
     */
    @MapKey("pos")
    List<Map<String, Object>> countEmpJobData();

    /**
     * 统计员工性别人数
     */
    @MapKey("name")
    List<Map<String, Object>> countEmpGenderData();

    /**
     * 统计班级人数
     */
    @MapKey("class_ame")
    List<Map<String, Object>> countEmpStudentData();

    /**
     * 根据员工的用户名和密码查询员工信息
     *
     * @param emp
     * @return
     */
    @Select("select id,username,name from emp where username= #{username} and password = #{password}")
    Emp selectByUsernameAndPassword(Emp emp);
}
