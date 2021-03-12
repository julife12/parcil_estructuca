/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial_estructura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JULIAN
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Digite el tamaño de l matriz");
        int n = Integer.parseInt(entrada.readLine());
        int m = Integer.parseInt(entrada.readLine());
        int posicionE [] = null;
        String posicion = "";
        List estring_final = new List();

        
        
        
        String matriz[][] = new String[99][99];
        
        while (true) {
        
            for (int i = 0; i < n; i++) {
                
                String linea = entrada.readLine();
                
                String[] parts = linea.split(" ");
                
                for (int j = 0; j < m; j++) {
                    
                    matriz[n][m] = parts[j];
                    System.out.println(parts[j]);
 
                }
                
                
            }
          
        
            for (int k = 0; k < n; k++) {
                
                for (int l = 0; l < m; l++) {
                    
                    if (matriz[n][m].equals("m")) {
                        
                        posicionE[0] = k;
                        posicionE[1] = l;
                        posicion = posicion+" ["+k+","+l+"] ";

                        
                    }
                    
                }
                
                
            }
        
            while (true) {
                
                if (matriz[posicionE[0]+1][posicionE[1]].equals("0")) {
                    
                    posicionE[0] = posicionE[0]+1;
                    posicion = posicion+" ["+posicionE[0]+","+posicionE[1]+"] ";
                    
                    
                }else if (matriz[posicionE[0]][posicionE[1]-1].equals("0")) {
                    
                    posicionE[1] = posicionE[1]-1;
                    posicion = posicion+" ["+posicionE[0]+","+posicionE[1]+"] ";
                    
                }else if (matriz[posicionE[0]-1][posicionE[1]].equals("0")) {
                    
                    posicionE[0] = posicionE[0]-1;
                    posicion = posicion+" ["+posicionE[0]+","+posicionE[1]+"] ";
                    
                }else if (matriz[posicionE[0]][posicionE[1]+1].equals("0")) {
                    posicionE[0] = posicionE[0]-1;
                    posicion = posicion+" ["+posicionE[0]+","+posicionE[1]+"] ";
                    
                }
                
                if (matriz[posicionE[0]][posicionE[1]].equals("e")) {
                    
                    System.out.println(posicion);
                    break;
                }
                
                
            }
        
        
        
        
        
        }
    }
    
}
