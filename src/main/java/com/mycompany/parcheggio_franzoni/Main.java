/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcheggio_franzoni;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author STUDENTE
 */
public class Main {
    public static void main(String[] args) 
    {
     
        String[] vociMenu=new String[11];
        int sceltaUtente=-1;
        Scanner tastiera=new Scanner(System.in);
        Piazzale p1=new Piazzale();
        Parcheggio parcheggio;
        int esitoOperazione,fila,posizione;
        String caricamentoDaFileOK;
        String nomeFileTesto="listaParcheggi.txt";
        String nomeFileBinario="parcheggi.bin";
        
        
        vociMenu[0]="Esci";
        vociMenu[1]="Registra nuovo parcheggio";
        vociMenu[2]="Registrare uscita dal parcheggio";
        vociMenu[3]="Elimina i dati relativi ad un parcheggio";
        vociMenu[4]="Visualizza tutti i parcheggi effettuati in un determinato giorno in ordine alfabetico della targa dell'auto";
        vociMenu[5]="Visualizza le auto attualmente presenti nel parcheggio";
        vociMenu[6]="Esporta i dati di tutti i parcheggi avvenuti su file CSV";
        vociMenu[7]="Salva dati";
        
        
        try 
        {
            s1=s1.caricaParcheggio(nomeFileBinario);
            System.out.println("Dati caricati correttamente");
        } 
        catch (IOException ex) 
        {
            System.out.println("Impossibile accedere al file in lettura. I dati non sono stati caricati");
        } 
        catch (FileException ex) 
        {
            System.out.println(ex.toString());
        }
        
        Menu menu= new Menu(vociMenu);
        
        do
        {
            try
            {
                sceltaUtente=menu.sceltaMenu();
                switch(sceltaUtente)
                {
                    case 0:
                    {
                        System.out.println("L'applicazione verrà terminata");
                        break;
                    }
                    
                    case 1:
                    {
                        
                    }
                                     
                    
                    
                    
                    
                    
            }
        }
