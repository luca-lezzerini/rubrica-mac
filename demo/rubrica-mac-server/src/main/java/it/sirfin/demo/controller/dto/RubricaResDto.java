/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.controller.dto;

public class RubricaResDto {

    private double contatto;

    public RubricaResDto() {
    }

    public double getRisultato() {
        return contatto;
    }

    public void setRisultato(double risultato) {
        this.contatto = contatto;
    }

    @Override
    public String toString() {
        return "RubricaResDto{" + "contatto=" + contatto + '}';
    }

}
