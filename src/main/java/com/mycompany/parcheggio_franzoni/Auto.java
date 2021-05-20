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
    
    public Auto(Auto l)
    {
        nome=l.getNome();
        cognome=l.getCognome();
        numeroTarga=l.getNumeroTarga();
    }
    
    
    public Auto()
    {
        nome="";
        cognome="";
        numeroTarga=0;
        codiceID=0;
    }

       public String getNome()
    {
        return nome;
    }
       
       public void setnome(String nome)
    {
        this.nome=nome;
    }
            
       public int getNumeroTarga()
    {
        return numeroTarga;
    }
       
        public void setNumeroTarga(int numeroTarga)
    {
        if (numeroTarga>0)
            this.numeroTarga=numeroTarga;
    }
    
}
  