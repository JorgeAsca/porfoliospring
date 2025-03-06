package com.jorge.porfoliospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PorfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Inicio");
        return "www/site/index";
    }

    @GetMapping("/curriculum")
    public String curriculum(Model model) {
        model.addAttribute("title", "Curriculum");
        return "www/site/curriculum";
    }

    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("title", "Contacto");
        return "www/site/contacto";
    }
}
