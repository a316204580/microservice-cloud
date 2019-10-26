package com.webank.springcloud.service;

import com.webank.springcloud.entities.Dept;

import java.util.List;

/**
 *
 * @author PaulFang
 * @date 2019/10/14
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept getById(Long id);

    public List<Dept> list();
}
