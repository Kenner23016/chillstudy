package com.libcode.ChillStudy.ChillStudy.RegistroAcademico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libcode.ChillStudy.ChillStudy.RegistroAcademico.entities.RegistroAcademico;
import com.libcode.ChillStudy.ChillStudy.RegistroAcademico.repository.RegistroAcademicoRepository;

@Controller
@RequestMapping("/")
public class RegistroAcademicoController {
    
    @Autowired
    private RegistroAcademicoRepository registroacademicorepositori;

    @GetMapping("/registro-academico")
    public String listUsers(Model model){
        model.addAttribute("estudiante", registroacademicorepositori.findAll());
        return "lista-registro-academico";
    }

    @GetMapping("/crear")
    public String formularioNuevoUser(Model model)
    {
        model.addAttribute("usuario", new RegistroAcademico());

        return "form-registro-academico";
    }

    @PostMapping("/crear")
    public String guardarUser(@ModelAttribute RegistroAcademico user)
    {
        registroacademicorepositori.save(user);

        return "redirect:/registro-academico";
    }

    @GetMapping("/modificar/{id}")
    public String formularioEditarUser(Model model, @PathVariable Long id)
    {
        RegistroAcademico usuario = registroacademicorepositori.findById(id).get();
        model.addAttribute("usuario", usuario);

        return "form-registro-academico";
    }

    @GetMapping("/borrar/{id}")
    public String eliminarUser(@PathVariable Long id)
    {
        registroacademicorepositori.delete(new RegistroAcademico(id));

        return "redirect:/registro-academico";
    }
}
