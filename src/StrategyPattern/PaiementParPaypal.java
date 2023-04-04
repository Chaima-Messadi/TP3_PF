package StrategyPattern;

public class PaiementParPaypal implements PaiementStrategy{
    private String adresseEmail;
    private String motDePasse;

    public PaiementParPaypal(String adresseEmail, String motDePasse) {
        this.adresseEmail = adresseEmail;
        this.motDePasse = motDePasse;
    }

    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + " euros effectué par Paypal.");
    }
}
