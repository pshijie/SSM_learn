package com.psj.mybatis.mapper;

import com.psj.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 使用choose查询员工信息
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     *
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除
     *
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);

    /**
     * 查询所有员工信息
     *
     */
    List<Emp> getAllEmp();
}
