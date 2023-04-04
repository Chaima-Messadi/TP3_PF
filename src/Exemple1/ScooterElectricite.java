package Exemple1;

public class ScooterElectricite extends Scooter {
    public ScooterElectricite(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter électrique de modèle " + model + ", de couleur " + color + " et de puissance " + power);
    }
}
