import java.util.*;

/**
 * Created by ibada1731710 on 2018-02-26.
 */
public class main {
    public static void main(String[] args) {

        int choix=0;
        String nom;
        boolean ok=false;
        char rep;
        Queue<String> fileRappel= new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        HashMap<String, Contact> map=new HashMap<>();

        System.out.println("LISTE DE CONTACTS");
        while (choix!=7){
            System.out.println("------------------------");
            System.out.println("1- Ajouter un contact");
            System.out.println("2- Modifier un contact");
            System.out.println("3- Afficher les contacts");
            System.out.println("4- Supprimer un contact");
            System.out.println("5- Ajouter à la liste de rappel");
            System.out.println("6- Afficher la liste de rappel");
            System.out.println("7- Quitter");
            System.out.println("Que souhaitez-vous faire?");
            choix=sc.nextInt();
            switch (choix){
                case 1:
                    Contact contact=new Contact();
                    contact.ajouterContact();
                    map.put(contact.getNom().toLowerCase(),contact);
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("Entrez le nom de la personne a modifier.");
                    nom=sc.next().toLowerCase();
                    if (map.containsKey(nom)){
                        map.get(nom).modifierContact();

                        if (!nom.equals(map.get(nom).getNom())){
                            map.put(map.get(nom).getNom(),map.get(nom));
                            map.remove(nom);
                        }

                    }
                    else {
                        System.out.println("Contact inexistant :(");
                    }
                    break;
                case 3:
                    for (Contact contact1 : map.values()){
                        contact1.afficherContact();
                    }
                    break;
                case 4:
                    System.out.println("Entrez le nom de la personne a supprimer.");
                    nom=sc.next().toLowerCase();
                    if (map.containsKey(nom)){
                        map.remove(nom);
                    }
                    else {
                        System.out.println("Contact inexistant");
                    }

                    break;
                case 5:
                    System.out.println("Qui voulez-vous ajouter à la liste de rappel? (entrez le nom)");
                    nom=sc.next();
                    if (map.containsKey(nom)){
                        fileRappel.add(nom);
                    }
                    else {
                        System.out.println("Contact inexistant");
                    }
                    break;
                case 6:
                    int i=0;
                    if (!fileRappel.isEmpty()){
                        System.out.println("La personne a appeler en priorité est : "+fileRappel.peek());
                    }
                    while (!ok && !fileRappel.isEmpty()){
                        System.out.println(System.lineSeparator()+"Avez vous appelez le premier sur la liste? (o/n)");
                        rep=sc.next().toLowerCase().charAt(0);
                        if (rep=='o'){
                            ok=true;
                            fileRappel.poll();
                            System.out.println("Le premier nom a été retiré de la liste de rappel.");
                        }
                        else if (rep=='n'){
                            ok=true;
                        }
                        else {
                            System.out.println("Entrez oui ou non");
                        }
                    }
                    ok=false;

                    break;
                case 7:
                    System.out.println("Bye! Bye!");
                    break;
                default:
                    System.out.println("Entrez une réponse valide SVP!");
            }
        }

    }
}