package com.lch.dao;

import com.lch.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {


    static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("黄小明","店长"));
        guestList.add(new Guest("青海路","好兄弟"));
        guestList.add(new Guest("林大厨","厨师长"));
        guestList.add(new Guest("杨紫","前台"));
        guestList.add(new Guest("王俊凯","小弟弟"));
    }


    public List<Guest> list() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    private Guest get(String name) {
        for(Guest oldGuest : guestList) {
            if(name.equals(oldGuest.getName())) return oldGuest;
        }
        return new Guest("","");
    }


    public void update(Guest guest) {
        get(guest.getName()).setRole(guest.getRole());
    }

    public void delete(String name){
        guestList.remove(get(name));
    }
}
