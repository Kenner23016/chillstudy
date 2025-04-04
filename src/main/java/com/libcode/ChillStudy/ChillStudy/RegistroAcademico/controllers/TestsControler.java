package com.libcode.ChillStudy.ChillStudy.RegistroAcademico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestsControler {
    @GetMapping("/test")
    public String test() {
        return "form-registro-academico";
    }
    
}
