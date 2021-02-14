/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.service.impl;

import it.sirfin.demo.model.ContattoJPA;
import it.sirfin.demo.repository.RubricaRepository;
import it.sirfin.demo.service.RubricaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service

public class RubricaServiceImpl implements RubricaService {

     @Autowired
    RubricaRepository rubricaRepository;

      @Override
    public void inserisciContatto(ContattoJPA c) {
        rubricaRepository.save(c);
    }

    @Override
    public void cancellaContatto(ContattoJPA p) {
        rubricaRepository.delete(p);
    }

    @Override
    public void svuotaRubrica() {
        rubricaRepository.deleteAllInBatch();
    }

    @Override
    public List<ContattoJPA> recuperaContatti() {
        return rubricaRepository.findAll();
    }

}
