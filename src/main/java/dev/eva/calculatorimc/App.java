package dev.eva.calculatorimc;

import java.util.Scanner;

import dev.eva.calculatorimc.models.Imc;
import dev.eva.calculatorimc.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // instancia para leer los datos introducidos:
        Scanner reading = new Scanner(System.in);

        System.out.println("Introduce tu peso en kilogramos: ");        
        double kilograms = reading.nextDouble();

        System.out.println("Introduce tu estatura en metros: ");       
        double metres = reading.nextDouble();
        
        Person person = new Person(kilograms, metres);
        Imc imcCaculator = new Imc();
        String state = imcCaculator.calculateIMC(person);
        double imcValue = person.getWeight() / Math.pow(person.getHeight(), 2);
        
        System.out.println ("Tu IMC es: " + imcValue + state);
        reading.close();
    }
    
}
