package edu.upvictoria.fpoo;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import edu.upvictoria.fpoo.Naranja.Lista;
import edu.upvictoria.fpoo.Naranja.Naranja;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        int[] pistones = new int[10];
        
        Lista lista = new Lista();
        while (true) {

            for(int i = 0; i<10; i++){
                pistones[i] = 0;
            }

            if (lista.size < 10) {
                Random r = new Random();
                Naranja nan1 = new Naranja(r.nextInt(0, 10) + 1);
                lista.add(nan1);
            }

            System.out.println("\nNaranjas:");

            lista.remove(pistones);

            lista.show();

            System.out.println("----------------");

            System.out.println("Vector:");

            for(int i = 0; i<10; i++){
                System.out.println("Piston " + (i+1) + " = " + pistones[i]);
            }

            TimeUnit.SECONDS.sleep(2);            

        }

    }
}
