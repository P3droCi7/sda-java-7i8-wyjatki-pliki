package pliki;

import java.io.*;

public class PlikiIntro {
    private static final String PATH_TO_FILE = "C:\\Users\\Pedro\\Desktop\\Java_programs_2018\\sda-java-7i8-wyjatki-pliki\\src\\lorem-ipsum.txt";

    public static void main(String[] args) {

        //
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            String line;
            //najpierw odzcytujemy zawartośc linii
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Nie udało sie otworzyc pliku" + e.getMessage());
        }
    }
}
