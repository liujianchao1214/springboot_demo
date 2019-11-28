package com.qf.connerller;

import com.qf.entity.user;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author LiuYangHe
 * @Date 2019/11/27
 */
@Controller
@RequestMapping("/stu")
public class userConterller {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/list")
    public  String list(Model mm){
        List<user> luser=iUserService.list();
        mm.addAttribute("luser" ,luser);
        return "asd ";
    }
    @RequestMapping("delect")
    public String delect(int id){
        iUserService.removeById(id);
        return "redirect:/stu/list";
    }
}
