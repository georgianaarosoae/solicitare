package com.example.demo.controller;

import com.example.demo.dto.SolicitareRequest;
import com.example.demo.mapper.SolicitareMapper;
import com.example.demo.service.SolicitareService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
    private final SolicitareService service;
    private final SolicitareMapper mapper;

    public ClientController(SolicitareService service, SolicitareMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping("/solicitari")
    public String showForm(Model model) {
        model.addAttribute("solicitare", new SolicitareRequest());
        return "client-solicitare";
    }

    // SALVARE ÎN BD
    @PostMapping("/solicitari")
    public String saveSolicitare(@ModelAttribute SolicitareRequest request) {

        System.out.println("ID CLIENT = " + request.getIdClient());
        System.out.println("ID ANIMAL = " + request.getIdAnimal());
        service.creareSolicitare(request);
        return "redirect:/client/solicitari";
    }

}
