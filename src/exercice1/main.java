package exercice1;

import java.io.*;

public class main {
    public static String car40(String s)
    {
        if (s.length()<=40) {
            System.out.println(s);
            return "";
        }  ;

        System.out.println(s.substring(0,40));
        return car40(s.substring(40)) ;

    }
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "src/text.txt"));
            String line = reader.readLine();
            int numero=1 ;
            while (line != null) {
                System.out.println(numero+")  "+line.substring(0,40));
               car40(line.substring(40)) ;
                // read next line
                line = reader.readLine();
                numero++ ;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
