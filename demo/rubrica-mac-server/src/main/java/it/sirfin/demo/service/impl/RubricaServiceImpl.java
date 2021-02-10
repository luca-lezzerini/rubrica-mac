/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.service.impl;

import it.sirfin.demo.controller.dto.RubricaReqDto;
import it.sirfin.demo.service.RubricaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service
public class RubricaServiceImpl implements RubricaService {

    private List<RubricaReqDto> contatto;

    @Override
    public List<RubricaReqDto> aggiungiContatto(/*int i,String n, String c, String t*/) {
        return this.contatto;
    }

    @Override
    public List<RubricaReqDto> rimuoviContatto() {
        return this.contatto;
    }

    @Override
    public List<RubricaReqDto> recuperaContatto() {
        return this.contatto;
    }

    @Override
    public List<RubricaReqDto> svuotaRubrica() {
        return this.contatto;
    }

}
