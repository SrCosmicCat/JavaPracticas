package thegame;

import Eventos.EnemigoEvento;
import Eventos.SiguienteSala;
import Eventos.Evento;
import Personajes.Jugador;
import Items.Inventory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheGame {
    
    //BufferedReader
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static Jugador jugador;
    static Inventory inventario;
    static int contadorSala;
    static int opcionSala1, opcionSala2;
    static Evento[] eventos;
    static Evento[] opcionesSala;
    
    public static void main(String[] args) throws IOException {
        jugador = new Jugador("Juancho",2, 1);
        inventario = new Inventory(jugador);
        inventario.actualizar();
        
        Evento[] ev = {new SiguienteSala(0,"Saltar a la siguiente sala", jugador), new EnemigoEvento(1,"Hay un enemigo", jugador)};
        eventos = ev;
        
        eventos[1].setJugador(jugador);
        contadorSala = 1;
        opcionSala1 = 0;
        opcionSala2 = 0;
        
        //Opción
        int opcion = 0;
        //Ciclo de juego
            
        while (opcion != 4 && !jugador.muerte()) {
            generarSala();
            System.out.println("\n-------------------------------------------\n==================SALAS====================\nIzquierda: " + opcionesSala[0].getDescripcion()+"\nDerecha: "+opcionesSala[1].getDescripcion()+"\n-------------------------------------------\nSala: "+Integer.toString(contadorSala)+" | Vida: "+Integer.toString(jugador.getVida())+" | Ataque: "+Integer.toString(jugador.getAtaque())+"\n=================OPCIONES==================\n1. Mover izquierda \n2. Mover derecha \n3. Inventario \n4. Salir del juego \n-------------------------------------------\n");
            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1: moverJugador("izquierda"); break;
                case 2: moverJugador("derecha"); break;
                case 3: inventario(); break;
                case 4: break;
                default: System.out.println("Opción no válida");
            }
        }
        String lineaFinal = "-------------------------------------------\n=JUEGO TERMINADO!=\n";
        lineaFinal = jugador.muerte() ? lineaFinal + jugador.getNombre() + " ha muerto dejando sus cosas desparramadas en el suelo...\n" : lineaFinal;
        System.out.println(lineaFinal + "PUNTUACIÓN: "+contadorSala+"\n-------------------------------------------");
    }
    
    public static void generarSala() {
        //Generar los dos número aleatorios
        opcionSala1 = (int)(Math.random()*eventos.length);
        opcionSala2 = (int)(Math.random()*eventos.length);
        
        //Asignar el evento de acuerdo al número
        Evento[] op = {eventos[opcionSala1], eventos[opcionSala2]};
        opcionesSala = op;
    }
    
    public static void moverJugador(String direccion) {
        if (direccion.equalsIgnoreCase("izquierda")) {
            System.out.println("Movimiento izquierda");
            //Activar evento izquierda
            opcionesSala[0].activarEvento();
            System.out.println(opcionesSala[0].getRespuesta());
        }
        else {
            System.out.println("Movimiento derecha");
            //Activar evento derecha
            opcionesSala[1].activarEvento();
            System.out.println(opcionesSala[1].getRespuesta());
        }
        contadorSala++;
    }
    
    public static void inventario() throws IOException {
        System.out.println(inventario.getInventory() + "\n-------------------------------------------\n1. Usar item \n2. Regresar\n-------------------------------------------\n");
        int opcion = 0;
        while (opcion != 2) {
            opcion = Integer.parseInt(leer.readLine());
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione un item (0 - "+ Integer.toString(inventario.getAllItems().length-1) +")");
                    int item = Integer.parseInt(leer.readLine());
                    usarItem(item);
                    opcion = 2;
                    break;
                case 2: break;
                default: System.out.println("Opción no válida");
            }
        }
    }
    
    public static void usarItem(int id) {
        if (Integer.parseInt(inventario.getItem(id)[1]) > 0) {
            inventario.quitarItem(id);
            System.out.println("Usaste "+inventario.getItem(id)[0] + " ahora tienes " + inventario.getItem(id)[1]);
            inventario.getAllItems()[id].usarItem();
        }
        else {
            System.out.println("No puedes usar este objeto!");
        }
    }
}
