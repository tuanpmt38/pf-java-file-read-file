import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFile {
    public static void main(String[] args) {
        File file = new File("D:\\codegym\\Exercise-java\\exception\\word.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String currentLine;
            String currentsplit = ",";
            //read fine to line and print
            while ((currentLine = br.readLine()) != null) {
                String[] country = currentLine.split(currentsplit);
                System.out.println("country " + country[4] + " name " + country[5]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
