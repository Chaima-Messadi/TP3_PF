package Exemple1;

public interface FabriqueVehicule {
    Automobile creerAutomobile(String model, String color, int power, int space);
    Scooter creerScooter(String model, String color, int power);
}
