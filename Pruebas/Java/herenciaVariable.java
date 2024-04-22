public class herenciaVariable {
    

    public static void main(String[] args) {
        
        Felinos felino = new Leon();
        felino = new Gato();
        felino = new Puma();

    }

}

class Felinos{
    
    String nombre;
    int edad;
    
}

class Leon extends Felinos{

}

class Puma extends Felinos{

}

class Gato extends Felinos{

}
