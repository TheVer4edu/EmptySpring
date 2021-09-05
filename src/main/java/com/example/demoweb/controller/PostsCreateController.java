package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsCreateController {

    @Autowired
    PostService postsService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appName", "Моё супер приложение");
        return "create";
    }


    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postsService.create(text);
        return "redirect:/";
    }

}
