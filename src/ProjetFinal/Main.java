package ProjetFinal;

import ProjetFinal.Classes.Amis;
import ProjetFinal.Classes.Collegue;
import ProjetFinal.Classes.Personne;

import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * The type Main.
 */
public class Main {

    /**
     * Ajouter amis.
     *
     * @param nom   the nom
     * @param amiss the amiss
     */
// Méthode d'ajout d'amis
    public static void ajouterAmis(Scanner nom, Set amiss){
        System.out.print("Entrez le nom de votre ami : ");
        String nomA = nom.nextLine();
        System.out.print("Entrez le contact de votre Ami : ");
        String contactA = nom.nextLine();
        System.out.print("Entrez la ville où votre ami habite : ");
        String villeA = nom.nextLine();
        amiss.add(new Amis(nomA, contactA, villeA));
    }

    /**
     * Ajouter collegue.
     *
     * @param nom       the nom
     * @param colleguee the colleguee
     */
// Méthode d'ajout de collègue
    public static void ajouterCollegue(Scanner nom, Set colleguee){
        System.out.print("Entrez le nom de votre collegue : ");
        String nomC = nom.nextLine();
        System.out.print("Entrez le contact de votre collegue : ");
        String contactC = nom.nextLine();
        System.out.print("Entrez le département de votre collegue : ");
        String departementC = nom.nextLine();
        colleguee.add(new Collegue(nomC, contactC, departementC));
        System.out.println("Votre collegue a été ajouté avec succès");
    }

    /**
     * Recherche damis.
     *
     * @param nom   the nom
     * @param amiss the amiss
     */
// Méthode recherche d'amis
    public static void rechercheDamis(Scanner nom, Set<Amis> amiss){
        System.out.print("Entrez la ville : ");
        String villeR = nom.nextLine();
        System.out.println("liste d'amis dans cette ville : ");
        for(Amis mesAmis : amiss ){
            mesAmis.recherche(villeR);
        }
    }

    /**
     * Recherche damis depart.
     *
     * @param nom       the nom
     * @param colleguee the colleguee
     */
// Méthode de recherche par département
    public static void rechercheDamisDepart(Scanner nom, Set<Collegue> colleguee){
        System.out.print("Entrez le departement de votre collegue : ");
        String departementCol = nom.nextLine();
        System.out.println("liste d'amis dans ce département : ");
        for(Collegue mesAmis : colleguee ){
            mesAmis.recherche(departementCol);
        }
    }

    /**
     * Envoie msg.
     *
     * @param nom       the nom
     * @param amiss     the amiss
     * @param colleguee the colleguee
     */
// Envoie message
    public static void envoieMsg(Scanner nom, Set<Amis> amiss, Set<Collegue> colleguee){
        System.out.print("Entrez le nom de la personne à qui vous voulez envoyer un message : ");
        String nomSms1 = nom.nextLine();
        Amis goodAmis = new Amis();
        Collegue goodCollegue= new Collegue();
        for(Amis mespot : amiss){
            if(mespot.getName().contains(nomSms1)){
                goodAmis = mespot;
            }
        }
        for(Collegue mesCollegue : colleguee){
            if(mesCollegue.getName().contains(nomSms1)){
                goodCollegue = mesCollegue;
            }
        }
        if(goodAmis.getName()!= null){
            goodAmis.envoiMessage(nomSms1);
        }else{
            goodCollegue.envoiMessage(nomSms1);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

	System.out.println("                 --------------------------------------- Début du Programme : ----------------------------------------------" +"\n");

        Set<Amis> amiss = new HashSet<>();
        Set<Collegue> colleguee = new HashSet<>();
        List amisss= new ArrayList<Amis>(amiss);
        Scanner nom = new Scanner(System.in);

        System.out.println("Voulez vous executez le programme?" +"\n" +
                "1: Oui" +"\n" +
                "2: NON"+"\n");
        int Execute =parseInt(String.valueOf(nom.nextInt()));
        if(Execute == 2){
            System.exit(0);
        }
        //Afficher liste de choix
        while (Execute==1) {
            System.out.println("Merci de bien vouloir faire un choix"+"\n");
            System.out.println( "1: Ajouter un ami "+ "\n" +
                    "2: Ajouter un collegue " + "\n" +
                    "3: Chercher des amis par ville " + "\n" +
                    "4: Chercher des collegues par departement " + "\n" +
                    "5: Envoi Message" + "\n" +
                    "6: Fin du programme" +"\n");
            int choix1 = nom.nextInt();
            int choix2 = parseInt(String.valueOf(choix1));

            nom.nextLine();
            switch (choix2){
                case 1:
                    int i=0;
                    while(i<4){
                    ajouterAmis(nom, amiss);
                    i++;
                    }
                    break;
                case 2:
                    int aC = 0;
                    while(aC<4){
                    ajouterCollegue(nom, colleguee);
                    }
                    break;
                case 3:
                    rechercheDamis(nom, amiss);
                    break;
                case 4:
                    rechercheDamisDepart(nom, colleguee);
                    break;

                case 5:
                    envoieMsg(nom, amiss, colleguee);
                    break;

                case 6:
                    System.out.println("Merci et Aurevoir" +"\n");
            }
        }
        nom.close();
    }
}
