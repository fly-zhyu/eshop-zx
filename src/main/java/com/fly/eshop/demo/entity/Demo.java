package com.fly.eshop.demo.entity;

import java.io.Serializable;

/**
 * (Demo)实体类
 *
 * @author zhaohuayu
 * @since 2020-03-12 10:53:42
 */
public class Demo implements Serializable {
    private static final long serialVersionUID = -43690571241595218L;
    
    private Integer id;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}