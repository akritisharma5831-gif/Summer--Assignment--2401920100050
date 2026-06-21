import java.util.Random;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// FirstClass
class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Please maintain silence and enjoy your journey.";
    }
}

// Ladies
class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers only.";
    }
}

// General
class General extends Compartment {
    public String notice() {
        return "General Compartment: Please cooperate with fellow passengers.";
    }
}

// Luggage
class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Passenger entry not allowed.";
    }
}

// Test class
public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int choice = random.nextInt(4) + 1;

            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;

                case 2:
                    compartments[i] = new Ladies();
                    break;

                case 3:
                    compartments[i] = new General();
                    break;

                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Polymorphism check
        System.out.println("Notice Messages:\n");

        for (int i = 0; i < compartments.length; i++) {
            System.out.println(
                "Compartment " + (i + 1) + ": " +
                compartments[i].notice()
            );
        }
    }
}
