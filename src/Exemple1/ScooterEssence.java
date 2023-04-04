package Exemple1;

public class ScooterEssence extends Scooter {
    public ScooterEssence(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter à essence de modèle " + model + ", de couleur " + color + " et de puissance " + power);
    }
}
