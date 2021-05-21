/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcheggio_franzoni;

import eccezioni.*;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author STUDENTE
 */
public class Main 
{
    
    public static void main(String[] args) 
    {
          
        Scanner tastiera=new Scanner(System.in);
        
        String[] vociMenu=new String[8];
        int sceltaUtente=-1;
        
      
        Auto auto;
        
        String nomeFileTesto="parcheggi.txt";
        String nomeFileBinario="parcheggi.bin";
        
        Parcheggio p=new Parcheggio();
        
        vociMenu[0]="Esci";  
        vociMenu[1]="Aggiungi auto";
        vociMenu[2]="Registra uscita";
        vociMenu[3]="Elimina auto";
        vociMenu[4]="Vedi parcheggi auto(Per data)";
        vociMenu[5]="Vedi auto presenti";
        vociMenu[6]="Esporta in formato CSV";
        vociMenu[7]="Salva";          
             
