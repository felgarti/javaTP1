package exercice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        String user = sc.nextLine() ;
        String pass = sc.nextLine() ;
        String samepass = sc.nextLine() ;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/pwd.txt"));
            String line=reader.readLine(); ;
            boolean found =false ;
           do{
             if(line.contains(user)  && line.contains(pass) && line.contains(samepass))
             {found=true ;}
               line = reader.readLine();
           } while (line != null) ;
           if(found)
               System.out.println("Authentification done ");
           else {
               System.out.println(" Problem in Authentification process ");
           }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
