/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.controller;

import it.sirfin.demo.controller.dto.RubricaReqDto;
import it.sirfin.demo.controller.dto.RubricaResDto;
import it.sirfin.demo.service.RubricaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
 //@Autowired
 //RubricaService rubricaService
public class RubricaController {

    ArrayList<RubricaReqDto> contatto = new ArrayList<>();
    int ID = 0;

    @RequestMapping("/aggiungiContatto")
    @ResponseBody
    public  List<RubricaReqDto> aggiungiContatto(@RequestBody RubricaReqDto dto) {
        //List<RubricaReqDto> c= RubricaService.aggiungiContatto();
        dto.setId(ID);
        ID++;
        contatto.add(dto);
        System.out.println("Restituisco dto" + contatto);
        return this.contatto;
    }

    @RequestMapping("/rimuoviContatto")
    @ResponseBody
    public List<RubricaReqDto> rimuoviContatto(@RequestBody RubricaReqDto dto) {
        /*this.contatto = new ArrayList();
        this.ID = 0;
         */
        contatto.removeIf(cs -> cs.getId() == dto.getId());
        return this.contatto;
    }

    @RequestMapping("/recuperaContatto")
    @ResponseBody
    public List<RubricaReqDto> recuperaContatto() {
        return this.contatto;
    }

    @RequestMapping("/svuotaRubrica") 
    @ResponseBody
    public List<RubricaReqDto> svuotaRubrica() {
        this.contatto.clear(); //svuoto la rubrica
        this.ID = 0; //azzero l'id
        return this.contatto;
    }

}
