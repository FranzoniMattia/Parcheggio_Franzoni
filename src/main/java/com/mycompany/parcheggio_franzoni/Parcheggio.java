/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcheggio_franzoni;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.FileException;
import file.TextFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author STUDENTE
 */
public class Parcheggio implements Serializable
{
    private Auto[] auto;
    private static final int NUM_AUTO_MAX=100;
    private static int AUTO;
    
     public Parcheggio()
   {
       auto=new Auto[NUM_AUTO_MAX];
       
       for (int i=0;i<NUM_AUTO_MAX;i++)
       {
           auto[i]=new Auto();
       }
       
       AUTO=0;
   }
     
    /**
    * Restituisce un auto del parcheggio
    * @param auto Il numero che identifica l'auto nel parcheggio
    * @return l'auto
    */
   public Auto getAuto(int automobile) throws EccezionePosizioneNonValida
   {
       Auto a;
       try
       {
            a=auto[automobile];
            return a;
       }
       catch(ArrayIndexOutOfBoundsException e1)
       {
           throw new EccezionePosizioneNonValida(automobile,0);
       }
  
   }
   
   /**
    * Inserisce un auto nel parcheggio
    * @param automobile Il numero che identifica l'auto nel parcheggio
    */
   public void setAuto(Auto automobile) throws EccezionePosizioneNonValida
   {
       try
       {
            auto[AUTO]=automobile;
            AUTO++;
            System.out.println(AUTO);
       }
       catch(ArrayIndexOutOfBoundsException e1)
       {
           throw new EccezionePosizioneNonValida(AUTO,0);
       }
  
   }
   
    /**
    * Elimina un auto nel parcheggio
    * @param automobile Il numero che identifica l'auto nel parcheggio
    */
   public void eliminaAuto(int automobile) throws EccezionePosizioneNonValida
   {
       try
       {
            for(int i=automobile;i<NUM_AUTO_MAX;i++)
            {
                if(i==NUM_AUTO_MAX-1)
                {
                    auto[i]=new Auto();
                }
                else
                    auto[i]=auto[i+1];
            }
            AUTO--;
       }
       catch(ArrayIndexOutOfBoundsException e1)
       {
           throw new EccezionePosizioneNonValida(AUTO,0);
       }
  
   }
   
}
