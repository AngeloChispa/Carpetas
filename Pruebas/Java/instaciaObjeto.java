/**
 * instaciaObjeto
 */
public class instaciaObjeto {

    public static void main(String[] args) {
        
        Dog Velez = new Dog();

        try {
            
            Dog VelezDos = (Dog)Velez.clone();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    
}

class Dog implements Cloneable{

    String name;
    String age;
    String color;
    String breed;

    public Object clone()throws CloneNotSupportedException{

        return super.clone();

    }

}