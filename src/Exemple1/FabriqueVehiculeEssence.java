package Exemple1;

public class FabriqueVehiculeEssence implements FabriqueVehicule{
    @Override
    public Automobile creerAutomobile(String model, String color, int power, int space) {
        return new AutomobileEssence(model, color, power, space);
    }

    @Override
    public Scooter creerScooter(String model, String color, int power) {
        return new ScooterEssence(model, color, power);
    }
}
