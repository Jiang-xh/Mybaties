package cn.justweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    /**
     * 员工id
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String lastName;

    /**
     * 员工性别
     */
    private Integer gender;

    /**
     * 员工描述
     */
    private String descr;

    /**
     * 部门 id
     */
    private Integer dId;
}