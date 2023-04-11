package personnages;

import java.util.Random;

public class Traitre extends Samourai {

    private int niveauTraitrise = 0;
    
    public Traitre(String seigneur, String nom, String boissonFav, int argent)
    {
        super(seigneur, nom, boissonFav, argent);
    }

    @Override
    public void direBonjour()
    {
        super.direBonjour();
        System.out.println(parler() + "Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
    }

    public void ranconner(Commercant commercant)
    {
        if (niveauTraitrise < 3)
        {
            int argentCommercant = commercant.getArgent();
            int argentRanconner = argentCommercant * 2 / 10;
            commercant.perdreArgent(argentRanconner);
            gagnerArgent(argentRanconner);
            niveauTraitrise++;
            System.out.println(parler() + "Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare à toi :");
            System.out.println(commercant.parler() + "Tout de suite" + getNom() + ".");
            
        }
        else
        {
            System.out.println(parler() + "Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
        }
    }

    public void faireLeGentil()
    {
        if (nbConnaissance < 1)
        {
            System.out.println(parler() + "Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
        }
        else
        {
            int don = getArgent() * 1 / 20;
            Random random = new Random();
            int r = random.nextInt(nbConnaissance - 1) + 1;
            String nomAmi = memoire[r].getNom();
            System.out.println(parler() + "Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
            System.out.println(parler() + "Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");

            memoire[r].gagnerArgent(don);
            perdreArgent(don);

            System.out.println(memoire[r].parler() + "Merci " + getNom() + ". VOus êtes quelqu'un de bien.");
            if (niveauTraitrise > 1)
            {
                niveauTraitrise -= 1;
            }
        }
    }
}
