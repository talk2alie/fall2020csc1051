package loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesWithLoops {
    public static void main(String[] args) throws Exception {
        System.out.println();
        try {
            File file = new File("PremiereLeagueTeams.txt");
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()) {
                System.out.print(reader.nextLine() + " ");
            }

            reader.close();

            String[] names = new String[2];
            for(int i = 0; i <= names.length; ++i) {
                System.out.println(names[i]);
            }
        }
        catch(FileNotFoundException error) {
            System.out.println("File Error.");
            System.out.println(error.getMessage());
        }
        catch(Exception error) {
            System.out.println("Other Errors.");
            System.out.println(error.getMessage());
        }

        
        


        System.out.println();
        System.out.println();
    }
}
