package com.example.demo.controller;

import com.example.demo.dto.SolicitareResponse;
import com.example.demo.model.SolicitareEntity;
import com.example.demo.service.SolicitareService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/angajat")
public class AngajatController {
    private final SolicitareService service;

    public AngajatController(SolicitareService service) {
        this.service = service;
    }
    @GetMapping("/solicitari")
    public String listSolicitari(Model model){
        List<SolicitareResponse> lista=service.getAll();
        model.addAttribute("solicitari",lista);
        return "angajat-solicitari";
    }
}
