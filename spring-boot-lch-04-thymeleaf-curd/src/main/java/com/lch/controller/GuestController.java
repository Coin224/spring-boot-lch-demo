package com.lch.controller;

import com.lch.bean.Guest;
import com.lch.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/guest")
@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "/list";
    }

    @RequestMapping("/toAdd")
    public String add() {
        return "add";
    }


    @RequestMapping("/add")
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest/list";
    }
    @RequestMapping("/toUpdate")
    public String update(Model model,Guest guest){
        model.addAttribute("guest",guest);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest/list";
    }


    @RequestMapping("/delete")
    public String delete(String name) {
        guestService.delete(name);
        return "redirect:/guest/list";
    }
}
