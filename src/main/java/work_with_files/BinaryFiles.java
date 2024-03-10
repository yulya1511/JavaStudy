package work_with_files;

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("/Users/julia/Desktop/париж.jpg");
             FileOutputStream outputStream = new FileOutputStream("pfoto.jpeg");
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
