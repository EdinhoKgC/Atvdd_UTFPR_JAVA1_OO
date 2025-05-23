/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author edilson
 */
public class Leitura {
    
    public String entDados(String rotulo){
        
        System.out.println(rotulo);
        
        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);
        
        String ret = "";
        
        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("Erro no sistema");
        }
    
        return ret;
    }
    
}
