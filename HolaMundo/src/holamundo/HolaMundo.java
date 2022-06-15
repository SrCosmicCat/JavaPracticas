package holamundo;

public class HolaMundo {


    public static void main(String[] args) {
       
        int numero1 = 5, numero2 = 10;
        boolean resultado;
        
        if (numero1 < numero2) {
            System.out.println("El numero 1 es menor");
        }
        else {
            System.out.println("El numero 2 es menor");
        }
        
        String resultado2 = numero1 < numero2 ? "El numero 1 es menor" : "El numero 2 es menor";
        
    }
}
