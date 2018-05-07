package com.pc.boot.bootCore.entity.security;

import java.io.Serializable;

/**
 * Created by PC on 2017/8/5.
 */
public class SysRole implements Serializable {

    private static final long serialVersionUID = 7271583085930978311L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
