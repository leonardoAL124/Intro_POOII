
package com.itsqmet.Spring1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class PaginaController {
    
    @GetMapping("/")
    public String home(){
        return "home";
    }
    
    @GetMapping("/contacto")
    public String contact(){
        return "contactos";
    }
}
