package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritersEx {
    public static void main(String[] args) throws IOException {

        String rubai = " Много лет размышлял я над жизнью земной. \n" +
                "Непонятного нет для меня под луной. \n" +
                "Мне известно, что мне ничего неизвестно! \n" +
                "Вот последняя правда, открытая мной. \n";

        String s = "Привет";

        FileWriter writer = null;
        try {
            writer = new FileWriter("text.txt");
            for(int i = 0; i<rubai.length();i++){
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }


    }
}
