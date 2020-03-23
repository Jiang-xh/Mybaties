package cn.justweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    /**
     * 部门id
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String deptName;
}