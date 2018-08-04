package com.example.june.controller;

import com.example.june.form.SlideForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SlideController {
    @ModelAttribute
    SlideForm setUpForm() {
        return new SlideForm();
    }

    @GetMapping("/index")
    public String index() {
        return "slide/index";
    }

    @GetMapping("/create")
    public String create() {
        return "slide/create";
    }

    @GetMapping("/store")
    public String store() {
        return "store";
    }
}
