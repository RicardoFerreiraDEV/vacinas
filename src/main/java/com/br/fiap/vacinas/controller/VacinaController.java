package com.br.fiap.vacinas.controller;

import com.br.fiap.vacinas.model.Vacinas;
import com.br.fiap.vacinas.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VacinaController {

    @Autowired
    private VacinaRepository vacinaRepository;

    @RequestMapping("/")
    String index() {
        return "Vacina - Backend";
    }

    @RequestMapping("/vacinas")
    public List<Vacinas> vacinas(){
        return vacinaRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Vacinas vacinas) {
        vacinaRepository.save(vacinas);
    }

}
