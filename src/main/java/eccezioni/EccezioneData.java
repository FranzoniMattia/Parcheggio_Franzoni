/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eccezioni;

/**
 *
 * @author Mattia
 */
public class EccezioneData extends Exception
{
    private String message;
    
    public EccezioneData(String message)
    {
        this.message=message;
    }

    public String toString()
    {
        return message;
    }
    
}