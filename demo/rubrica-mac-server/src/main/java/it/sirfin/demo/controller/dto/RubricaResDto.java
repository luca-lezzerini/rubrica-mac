/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.demo.controller.dto;

/**
 *
 * @author 39392
 */
public class RubricaResDto {
    private String rubricaSvuotata;

   
    public String getRubricaSvuotata() {
        return rubricaSvuotata;
    }

    public void setRubricaSvuotata(String rubricaSvuotata) {
        this.rubricaSvuotata = rubricaSvuotata;
    }

    public RubricaResDto() {
    }

    public RubricaResDto(String rubricaSvuotata) {
        this.rubricaSvuotata = rubricaSvuotata;
    }

    @Override
    public String toString() {
        return "RubricaResDto{" + "rubricaSvuotata=" + rubricaSvuotata + '}';
    }
    
    
}
