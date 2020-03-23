package cn.justweb.dao;

import cn.justweb.pojo.Employee;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    /**
     *
     * @mbggenerated 2019-10-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-10-18
     */
    int insert(Employee record);

    /**
     *
     * @mbggenerated 2019-10-18
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-10-18
     */
    List<Employee> selectAll();

    /**
     *
     * @mbggenerated 2019-10-18
     */
    int updateByPrimaryKey(Employee record);
}