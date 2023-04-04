package Exemple1;

public class AutomobileElectricite extends Automobile {
    public AutomobileElectricite(String model, String color, int power, int space) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.space = space;
    }
    @Override
    public void afficherCaracteristiques() {
        System.out.println("Automobile électrique de modèle " + model + ", de couleur " + color + ", de puissance " + power + " et d'espace " + space);
    }
}
