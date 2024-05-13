package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * manejoArchivo
 */
public class ManejoArchivo {

    public void existeDirectorio(String path) throws IOException{

        File file = new File(path);
        if(!(file.exists())){
            throw new IOException();
        }

    }

    public void crearArchivo(String path, String nombreArchivo) throws IOException{
        if(nombreArchivo.indexOf(File.separator) != 0){
            nombreArchivo = File.separator + nombreArchivo;
        }
        File file = new File(path + nombreArchivo);
        if(!(file.createNewFile())){
            throw new IOException();
        }
    }

    public InputStream fileToInputStream(String file){

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(file);

        if (inputStream != null){
            return inputStream;
        }else{
            return null;
        }

    }

    public BufferedReader fileToBuffered(String file){

        return new BufferedReader(new InputStreamReader(fileToInputStream(file), StandardCharsets.UTF_8));

    }

    public String fileToString(String file){

        String cadena = "", agregar;
        BufferedReader entrada = fileToBuffered(file);
        try{

            while ((agregar= entrada.readLine()) != null) {
                
                cadena += agregar;

            }

        }catch(IOException e){

            return null;

        }

        return cadena;

    }

    public String fileToStringConSalto(String file){

        String cadena = "", agregar;
        BufferedReader entrada = fileToBuffered(file);
        try{

            while ((agregar= entrada.readLine()) != null) {
                
                cadena += agregar + "\n";

            }

        }catch(IOException e){

            return null;

        }

        return cadena;

    }

    //Creo que esto no sirve
    public void addToFile(String file, String cadena) {
        try {
            BufferedWriter agregar = new BufferedWriter(new FileWriter(file, true));
            agregar.write(cadena);
            agregar.close();
        } catch (IOException e) {
            System.out.println("\n====================================");
            System.out.println("Algo salió mal al momento de agregar");
            System.out.println("====================================\n");
        }
    }

}