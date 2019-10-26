package com.webank.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 * @author PaulFang
 * @date 2019/10/13
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

    private static final long serialVersionUID = 6339971953981797541L;

    private Long deptno;

    private String dname;

    private String db_source;
}
