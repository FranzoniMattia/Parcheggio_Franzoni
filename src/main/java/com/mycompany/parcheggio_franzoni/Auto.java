/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcheggio_franzoni;

import eccezioni.FileException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * La classe rappresenta un auto parcheggiata.
 * I suoi suoi attributi sono:<br>
 * targa <br>
 * nomeCliente <br>
 * cognomeCliente <br>
 * dataEOraIngresso <br>
 * dataEOraUscita <br>
 * @author Franzoni
 * @version 1.0
 */

public class Auto implements Serializable
{

        //attributi
	private String targa;
	private String nomeCliente;
	private String cognomeCliente;
	private Date dataEOraIngresso;
	private Date dataEOraUscita;


         /**
         * Restituisce la targa associata alla macchina parcheggiata
         * @return targa
         */
	public String getTarga() {
		return targa;
	}

        /**
        * Assegna il la targa associata alla macchina parcheggiata
        * @param targa targa della macchina pargheggiata
        */
	public void setTarga(String targa) {
		this.targa = targa;
	}

        /**
         * Restituisce il nome del proprietario associato alla macchina parcheggiata
         * @return nomeCliente
         */
	public String getNomeCliente() {
		return nomeCliente;
	}

        /**
        * Assegna il nome del proprietario della macchina parcheggiata
        * @param nomeCliente nome del proprietario della  macchina pargheggiata
        */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

         /**
         * Restituisce il cognome del proprietario associato alla macchina parcheggiata
         * @return cognomeCliente
         */
	public String getCognomeCliente() {
		return cognomeCliente;
	}

         /**
        * Assegna il cognome del proprietario della macchina parcheggiata
        * @param cognomeCliente cognome del proprietario della  macchina pargheggiata
        */
	public void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}

        /**
         * Restituisce la data in ingresso associata alla macchina parcheggiata
         * @return dataEOraIngresso
         */
	public Date getDataEOraIngresso() {
		return dataEOraIngresso;
	}

         /**
        * Assegna la data e ora di ingresso della macchina parcheggiata
        * @param dataEOraIngresso dataEOraIngresso ddella macchina parcheggiata
        */
	public void setDataEOraIngresso(Date dataEOraIngresso) {
		this.dataEOraIngresso = dataEOraIngresso;
	}

        /**
         * Restituisce la data in uscita associata alla macchina parcheggiata
         * @return dataEOraUscita
         */
	public Date getDataEOraUscita() {
		return dataEOraUscita;
	}

           /**
        * Assegna la data e ora di uscita della macchina parcheggiata
        * @param dataEOraUscita dataEOraUscita ddella macchina parcheggiata
        */
	public void setDataEOraUscita(Date dataEOraUscita) {
		this.dataEOraUscita = dataEOraUscita;
	}

	 /**
        * Restituisce una stringa che rappresenta la macchina parcheggiata
        * @return stringa con codiceNUmerico,targa,cognome,nome ,data di ingresso e uscita del proprietarii
        * della macchina parcheggiata
        */
	public String toString() {
		return "Auto [\nTarga="  + targa + "\nnomeCliente=" + nomeCliente + "\ncognomeCliente="
				+ cognomeCliente + "\nDataEOraIngresso=" + dataEOraIngresso + "\ndataEOraUscita="
				+ dataEOraUscita +  "\n]\n";
	}

	//metodo per la rappresentazione dell'oggetto in formato CSV
	public String toCSV() 
	{
		return  targa + ",\"" + nomeCliente + "\",\"" +cognomeCliente + "\",\""  + dataEOraIngresso + "\"," + dataEOraUscita +  "\n";
	}

}
 
  
