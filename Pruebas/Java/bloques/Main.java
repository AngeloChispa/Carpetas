public class Main {
    
    public static void main(String[] args) {
        
        bloqueInstancia objeto = new bloqueInstancia();

        System.out.println(objeto.numero);

        objeto = new bloqueInstancia(true);

        System.out.println(objeto.numero);

    }

}
