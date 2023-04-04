package StrategyPattern;

public class TestStrategyPattern {
    public static void main(String[] args) {
        Article article1 = new Article("Ordinateur portable", 1000);
        article1.setPaiementStrategy(new PaiementParCarte("Jean Dupont", "1234567890", "06/24", "123"));
        article1.payer();

        Article article2 = new Article("Smartphone", 500);
        article2.setPaiementStrategy(new PaiementParPaypal("johndoe@gmail.com", "password"));
        article2.payer();
    }
}

