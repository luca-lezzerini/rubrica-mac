/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.service;

import it.sirfin.demo.model.ContattoJPA;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service
public interface RubricaService {

    void inserisciContatto(ContattoJPA c);

    void cancellaContatto(ContattoJPA p);

    void svuotaRubrica();

    List<ContattoJPA> recuperaContatti();

}
