import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C://test//text.txt");

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File doesnt exists");
        }
        try {
            File file2 = new File("C:\\test\\tert.txt");
            if (file2.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("file exists");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        try {
            File file2 = new File("C:\\test\\tert.txt");
            Scanner sc = new Scanner(file2);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                break;
            }
            }
        catch(Exception e){
                System.out.println("Error");
            }
        try {
            FileWriter fileWriter = new FileWriter("C:\\test\\tert.txt");
            fileWriter.write("Santhoshkumar is the last");
            fileWriter.close();
            System.out.println("File correted");
        }
        catch (Exception e){
            System.out.println("Error");
        }


        }
    }