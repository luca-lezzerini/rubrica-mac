/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.controller;

import it.sirfin.demo.controller.dto.RubricaReqDto;
import it.sirfin.demo.controller.dto.RubricaResDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
/**
 *
 * @author 39392
 */
public class RubricaController {

    ArrayList<RubricaReqDto> contatto = new ArrayList<>();
    int ID = 0;

    @RequestMapping("/aggiungiContatto")
    @ResponseBody
    public List<RubricaReqDto> contatto(@RequestBody RubricaReqDto dto) {
        System.out.println("Ricevuto dto " + dto);
        int id = dto.getId();
        String nome = dto.getNome();
        String cognome = dto.getCognome();
        String telefono = dto.getTelefono();
        ID++;
        RubricaReqDto r = new RubricaReqDto();
        r.setNome(nome);
        r.setCognome(cognome);
        r.setTelefono(telefono);
        r.setId(id);
        contatto.add(r);
        System.out.println("Restituisco dto" + contatto);
        return null;
    }

    @RequestMapping("/rimuoviContatto")
    @ResponseBody
    public List<RubricaReqDto> rimuoviContatto() {
        this.contatto = new ArrayList();
        this.ID = 0;
        return this.contatto;
    }

    @RequestMapping("/recuperaContatto")
    @ResponseBody
    public List<RubricaReqDto> recuperaContatto() {
        return this.contatto;
    }
}
