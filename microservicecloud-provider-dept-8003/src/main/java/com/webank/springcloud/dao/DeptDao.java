package com.webank.springcloud.dao;

import com.webank.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author PaulFang
 * @date 2019/10/14
 */
@Mapper
public interface DeptDao {

    public Dept findById(Long deptno);

    public List<Dept> findAll();

    public boolean addDept(Dept dept);

}
