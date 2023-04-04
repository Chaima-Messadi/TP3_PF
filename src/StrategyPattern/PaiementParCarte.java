package StrategyPattern;

public class PaiementParCarte implements PaiementStrategy{
    private String nom;
    private String numeroCarte;
    private String dateExpiration;
    private String codeSecurite;

    public PaiementParCarte(String nom, String numeroCarte, String dateExpiration, String codeSecurite) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.codeSecurite = codeSecurite;
    }

    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + " euros effectué par carte bancaire.");
    }
}
