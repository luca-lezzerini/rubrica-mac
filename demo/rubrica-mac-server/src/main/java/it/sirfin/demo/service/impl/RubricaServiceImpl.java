/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.service.impl;

import it.sirfin.demo.model.ContattoJPA;
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

    private List<ContattoJPA> contatto;

    @Override
    public List<ContattoJPA> aggiungiContatto(/*int i,String n, String c, String t*/) {
        return this.contatto;
    }

    @Override
    public List<ContattoJPA> rimuoviContatto() {
        return this.contatto;
    }

    @Override
    public List<ContattoJPA> recuperaContatto() {
        return this.contatto;
    }

    @Override
    public List<ContattoJPA> svuotaRubrica() {
        return this.contatto;
    }

}
