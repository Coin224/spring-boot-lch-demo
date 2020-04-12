package com.lch.service;

import com.lch.bean.Guest;

import java.util.List;

public interface GuestService {

    /**
     * 查询所有的人和角色
     * @return
     */
    List<Guest> list();


    void add(Guest guest);

    void update(Guest guest);


    void delete(String name);
}
