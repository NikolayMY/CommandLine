package introPic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Pic {

    public static void toDraw() {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String currentLine = null;
        String path = new File("").getAbsolutePath();
        try {
            reader = new FileReader(path + "//pic.txt");
            bufferedReader = new BufferedReader(reader);
            while ((currentLine = bufferedReader.readLine()) != null){
                System.out.println(currentLine);
            }
        } catch (Exception ex){
            System.out.println(ex);
        }

    }
}