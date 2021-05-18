/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcheggio_franzoni;

import java.io.Serializable;
import java.time.*;

/**
 *
 * @author STUDENTE
 */
public class Auto implements Serializable
{
  //attibuti
    private String nome;
    private String cognome;
    private int numeroTarga;
    private int codiceID;
    private LocalDateTime entrata;
    private LocalDateTime uscita;
    
  
    
/**
 * Costruttore della classe Auto
 * @param nome 
 * @param cognome 
 * @param numeroTarga 
 * @param codiceID
 */
    public Auto(String nome,String cognome,int numeroTarga, int codiceID)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.numeroTarga=0;
        setNumeroTarga(numeroTarga);
    }

    private void setNumeroTarga(numeroTarga);
            
}
  