package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * manejoArchivo
 */
public class ManejoArchivo {

    public boolean existeDirectorio(String path){

        File file = new File(path);
        return file.exists();

    }

    public void crearArchivo(String path, String nombreArchivo) throws IOException {
        if (!nombreArchivo.startsWith(File.separator)) {
            nombreArchivo = File.separator + nombreArchivo;
        }
        
        File file = new File(path + nombreArchivo);
        
        if (file.exists()) {
            throw new IOException("El archivo ya existe: " + file.getAbsolutePath());
        }
        
        if (!file.createNewFile()) {
            throw new IOException("No se pudo crear el archivo: " + file.getAbsolutePath());
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

    public String fileToStringConSalto(String file)throws IOException{
        String cadena = "", agregar;
        try(BufferedReader entrada = new BufferedReader(new FileReader(file))){
            while ((agregar= entrada.readLine()) != null) {
                
                cadena += agregar + "\n";

            }
        }catch(IOException e){
            System.out.println("No se encontro el archivo");
            throw new IOException();
        }
        return cadena;
    }

    public String primeraLinea(String file){
        String cadena = "";
        try(BufferedReader entrada = new BufferedReader(new FileReader(file));){
            cadena = entrada.readLine();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }catch(IOException e){
            e.getStackTrace();
        }
        return cadena;
    }   

   
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

    public void overwriteFile(String file, String cadena) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(file));
            escritor.write(cadena);
            escritor.close();
        } catch (IOException e) {
            System.out.println("\n====================================");
            System.out.println("Algo salió mal al momento de reescribir");
            System.out.println("====================================\n");
        }
    }
    

}