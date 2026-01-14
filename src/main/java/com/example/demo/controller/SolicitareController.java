package com.example.demo.controller;

import com.example.demo.dto.SolicitareRequest;
import com.example.demo.model.StadiuSolicitareEnum;
import com.example.demo.service.SolicitareService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/solicitari")
public class SolicitareController {

    private final SolicitareService solicitareService;

    public SolicitareController(SolicitareService solicitareService) {
        this.solicitareService = solicitareService;
    }

    @GetMapping
    public String listaSolicitari(Model model) {
        model.addAttribute("solicitari", solicitareService.getAll());
        return "solicitari/index";
    }

    @GetMapping("/adauga")
    public String adaugaSolicitare(Model model) {
        model.addAttribute("solicitare", new SolicitareRequest());
        return "solicitari/edit";
    }

    @PostMapping("/salveaza")
    public String salveaza(@ModelAttribute SolicitareRequest request) {
        solicitareService.creareSolicitare(request);
        return "redirect:/solicitari";
    }

    @GetMapping("/filtru")
    public String filtrare(@RequestParam StadiuSolicitareEnum stadiu, Model model) {
        model.addAttribute("solicitari", solicitareService.filtrareDupaStadiu(stadiu));
        return "solicitari/index";
    }

    @PostMapping("/{id}/analiza")
    public String analiza(@PathVariable Long id,
                          @RequestParam boolean urgenta,
                          @RequestParam(required = false) int timpEstimat) {
        solicitareService.analizaSolicitare(id, urgenta, timpEstimat);
        return "redirect:/solicitari";
    }

    @PostMapping("/{id}/plecare")
    public String plecareEchipaj(@PathVariable Long id) {
        solicitareService.echipajPlecat(id);
        return "redirect:/solicitari";
    }
}
