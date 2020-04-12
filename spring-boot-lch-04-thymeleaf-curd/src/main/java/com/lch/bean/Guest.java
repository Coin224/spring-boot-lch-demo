package com.lch.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//全参构造器
@AllArgsConstructor
public class Guest {


    private String name;
    private String role;
}
