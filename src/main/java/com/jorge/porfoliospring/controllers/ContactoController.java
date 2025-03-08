package com.jorge.porfoliospring.controllers;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/contacto")

public class ContactoController {

    @PostMapping
    public String procesarFormulario() {
        // Metodo para aguardar los Datos del formulario
        return "redirect:/contacto?success=true"; // Redirecciona con un mensaje de éxito
    }
    
}
