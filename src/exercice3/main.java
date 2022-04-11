package exercice3;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Date;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in) ;
            FileWriter f = new FileWriter("personnes.txt");
            f.write("Nom du fichier : personnes.txt \n");
System.out.println(" Typer number of people  :") ;
int nb_personnes =sc.nextInt();
            sc.nextLine() ;

int i=1 ;
while(i<1+nb_personnes)
{
    System.out.println("\nType first name : ");
     String prenom =  sc.nextLine() ;
    System.out.println("\nType last name : ");
    String nom = sc.nextLine() ;
    System.out.println("\nType birthdate : ");
    String dateDeNaissance = sc.nextLine() ;
    personne p =new personne(nom , prenom , dateDeNaissance) ;
    f.write(p.toString(i));
    i++;
}

            f.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
