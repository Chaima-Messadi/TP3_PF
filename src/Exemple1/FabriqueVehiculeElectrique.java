package Exemple1;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String model, String color, int power, int space) {
        return new AutomobileElectricite(model, color, power, space);
    }

    @Override
    public Scooter creerScooter(String model, String color, int power) {
        return new ScooterElectricite(model, color, power);
    }
}
