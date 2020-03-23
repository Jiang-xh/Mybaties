package cn.justweb.dao;

import cn.justweb.pojo.Department;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {
    /**
     *
     * @mbggenerated 2019-10-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-10-18
     */
    int insert(Department record);

    /**
     *
     * @mbggenerated 2019-10-18
     */
    Department selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-10-18
     */
    List<Department> selectAll();

    /**
     *
     * @mbggenerated 2019-10-18
     */
    int updateByPrimaryKey(Department record);
}