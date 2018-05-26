package com.sky.springcloud.entities;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain=true)
// entity --orm--- db_table
public class Dept implements Serializable
{
    private Long 	deptno;
    private String 	dname;
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        //支持链式调用
        dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
        System.out.println(dept.toString());
    }

}
