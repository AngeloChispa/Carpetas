package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 */
public class Input {

    public final BufferedReader entradaBuffered(){

        return new BufferedReader(new InputStreamReader(System.in));

    }

    public double entradaDouble(){

        double a = 0;
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {

            try{

                bandera = false;
                a = Double.parseDouble(obj.readLine());
    
            }catch(IOException | NumberFormatException e){
    
                bandera = true;
                System.out.println("\n=======================");
                System.out.println("Solo se aceptan números");
                System.out.println("=======================\n");
            }
            
        }

        return a;

    }

    public String entradaString(){

        String a =  "";
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {

            try{

                bandera = false;
                a = obj.readLine();
    
            }catch(IOException e){
    
                bandera = true;
                System.out.println("\n====================");
                System.out.println("Error algo salio mal");
                System.out.println("====================\n");
            }
            
        }

        return a;

    }

    public long entradaLong(){

        long a = 0;
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {
            try{

                bandera = false;
                a = Long.parseLong(obj.readLine());
    
            }catch(IOException | NumberFormatException e){
    
                bandera = true;
                System.out.println("\n===============================");
                System.out.println("Solo se aceptan números enteros");
                System.out.println("===============================\n");
            }
            
        }

        return a;

    }

    public double entradaDouble(String mensaje){

        double a = 0;
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {
            System.out.print(mensaje);

            try{

                bandera = false;
                a = Double.parseDouble(obj.readLine());
    
            }catch(IOException | NumberFormatException e){
    
                bandera = true;
                System.out.println("\n=======================");
                System.out.println("Solo se aceptan números");
                System.out.println("=======================\n");
            }
            
        }

        return a;

    }

    public long entradaLong(String mensaje){

        long a = 0;
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {
            System.out.print(mensaje);
            try{

                bandera = false;
                a = Long.parseLong(obj.readLine());
    
            }catch(IOException | NumberFormatException e){
    
                bandera = true;
                System.out.println("\n===============================");
                System.out.println("Solo se aceptan números enteros");
                System.out.println("===============================\n");
            }
            
        }

        return a;

    }

    public String entradaString(String mensaje){

        String a =  "";
        boolean bandera = true;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        while (bandera) {
            System.out.print(mensaje);

            try{

                bandera = false;
                a = obj.readLine();
    
            }catch(IOException e){
    
                bandera = true;
                System.out.println("\n====================");
                System.out.println("Error algo salio mal");
                System.out.println("====================\n");
            }
            
        }

        return a;

    }

    public boolean validar(long a,long min, long max){

        boolean bandera = false;

        if (a< min || a>max){

            bandera = true;
            System.out.println("======================");
            System.out.println("El número no es valido");
            System.out.println("======================");

        }

        return bandera;
    }

}