/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.service;

import it.sirfin.demo.controller.dto.RubricaReqDto;
import java.util.List;

/**
 *
 * @author marco
 */
public interface RubricaService {

    List<RubricaReqDto> aggiungiContatto();

    List<RubricaReqDto> rimuoviContatto();

    List<RubricaReqDto> recuperaContatto();

    List<RubricaReqDto> svuotaRubrica();

}
