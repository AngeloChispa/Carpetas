public class Uno {
    /**
     * 
     * @param i
     * @throws RuntimeException
     */
    public Uno(int i)throws RuntimeException{

        if(i%2 != 0){
            throw new RuntimeException();
        }

    }

    public static void f1(){

        Dos objeto = new Dos();
        objeto.f2();

    }

}
