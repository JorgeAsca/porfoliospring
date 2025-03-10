package com.jorge.porfoliospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.jorge.porfoliospring.model.Entity.FormularioC;
import com.jorge.porfoliospring.model.Services.FormularioCService;

@Controller
public class ContactoController {

    @Autowired
    private FormularioCService formularioCService;

    @GetMapping("/contacto-info")
    public String contacto() {
    return "/contacto";
    }

    @PostMapping("/contacto")
    public String postContacto(@RequestParam String nombre,
            @RequestParam String email,
            @RequestParam String mensaje,
            Model model) {
        FormularioC nuevoContacto = new FormularioC();
        nuevoContacto.setNombre(nombre);
        nuevoContacto.setEmail(email);
        nuevoContacto.setMensaje(mensaje);

        formularioCService.guardar(nuevoContacto);

        model.addAttribute("mensajeExito", "Mensaje enviado correctamente");

        return "www/site/contacto"; 
    }

}
