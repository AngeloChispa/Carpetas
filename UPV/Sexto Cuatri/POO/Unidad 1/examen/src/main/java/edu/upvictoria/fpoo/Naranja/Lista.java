package edu.upvictoria.fpoo.Naranja;

public class Lista {

    public int size = 0;
    Naranja root = null;

    public void add(Naranja nueva) {

        if (root == null) {
            root = nueva;
        } else {

            Naranja actual = root;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nueva;
        }
        this.size += 1;
    }

    public void show() {

        Naranja actual = this.root;

        while (actual != null) {
            System.out.println(actual.size + " " + actual.time);
            actual = actual.siguiente;
        }

    }

    public void remove(int[] pistones) {
        Naranja actual = this.root;
        Naranja anterior = null;
    
        while (actual.siguiente != null) {
            actual.time -= 50;
            if (actual.time <= 0) {
                pistones[actual.size-1] = 1;
                if (anterior != null) {
                    anterior.siguiente = actual.siguiente;
                } else {
                    this.root = actual.siguiente;
                }
                this.size -= 1;
            } else {
                anterior = actual;
            }
            actual = actual.siguiente;
        }
    }

}
