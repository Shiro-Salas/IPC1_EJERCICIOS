package com.mycompany.poo;

/**
 *
 * @author Shiro Salas 202401374
 */

// Clase base
class Comida {
    public void comidaGuate(){
        System.out.println("Comidas guatemaltecas.\n");
    }
}

// Primera sobreescritura
class Pepian extends Comida {
    @Override
    public void comidaGuate() {
        System.out.println("Pepián: Guiso espeso de carne.");
    }
}

// Segunda sobreescritura
class Jocon extends Comida {
    @Override
    public void comidaGuate () {
        System.out.println("Jocón: Pollo cocido en salsa verde.");
    }
}

/* Clase principal donde se llama al metodo aplicando polimorfismo, es decir
    llamando al mismo metodo en un mismo contexto */
public class Poo {

    public static void main(String[] args) {
        Comida c0 = new Comida();
        Comida c1 = new Pepian();
        Comida c2 = new Jocon();
        
        System.out.print("La clase base es: ");
        c0.comidaGuate();
        System.out.println("Las nuevas sobre-escrituras son:");
        c1.comidaGuate();
        c2.comidaGuate();
    }
}
