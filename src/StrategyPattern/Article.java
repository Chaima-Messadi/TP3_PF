package StrategyPattern;

public class Article {
    private String nom;
    private int prix;
    private PaiementStrategy paiementStrategy;

    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPaiementStrategy(PaiementStrategy paiementStrategy) {
        this.paiementStrategy = paiementStrategy;
    }

    public void payer() {
        paiementStrategy.payer(this.prix);
    }
}

