import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-02-26.
 */
public class main {
    public static void main(String[] args) {

        int choix=0;
        Scanner sc=new Scanner(System.in);
        HashMap<String, Contact> map=new HashMap<>();

        System.out.println("LISTE DE CONTACTS");
        System.out.println("------------------------");
        while (choix!=4){
            System.out.println("1- Ajouter un contact");
            System.out.println("2- Modifier un contact");
            System.out.println("3- Afficher les contacts");
            System.out.println("4- Quitter");
            System.out.println("Que souhaitez-vous faire?");
            choix=sc.nextInt();
            switch (choix){
                case 1:
                    Contact contact=new Contact();


                    map.put(contact.getNom(),contact);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Bye! Bye!");
                    break;
                default:
                    System.out.println("Entrez une réponse valide SVP!");
            }
        }

    }
}
