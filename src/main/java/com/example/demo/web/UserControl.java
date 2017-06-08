package com.example.demo.web;

import com.example.demo.vo.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/8.
 */
@Controller
public class UserControl {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg = new Msg("test","content","it is for admin");

        model.addAttribute("msg",msg);
        return "home";
    }
}
