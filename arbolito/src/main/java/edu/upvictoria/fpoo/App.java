package edu.upvictoria.fpoo;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ManejoArchivo cosa = new ManejoArchivo();
        System.out.println(cosa.fileToString("hola.txt"));

    }
}
