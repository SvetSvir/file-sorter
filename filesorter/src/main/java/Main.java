import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rootPath = reader.readLine();
        final File folder = new File(rootPath);
        if (!folder.exists()) {
            System.out.println(folder.getAbsolutePath() + " папка не существует");
            return;
        }
        //     public static void ArrayList (String[] ArrayList)
        {
            List<File> mp4Array = new ArrayList();
            List<File> docArray = new ArrayList();
            List<File> jpegArray = new ArrayList(); //
            List<File> pdfArray = new ArrayList();
            List<File> mtsArray = new ArrayList();
            for (final File fileEntry : folder.listFiles()) {
                System.out.println(fileEntry.getName());
                if (fileEntry.getName().endsWith(".MP4") || fileEntry.getName().endsWith(".mp4")) {
                    mp4Array.add(fileEntry);
                }
                if (fileEntry.getName().endsWith(".DOC") || fileEntry.getName().endsWith(".doc")) {
                    docArray.add(fileEntry);
                }
                if (fileEntry.getName().endsWith(".JPG") || fileEntry.getName().endsWith(".jpg")) {
                    jpegArray.add(fileEntry);
                }
                if (fileEntry.getName().endsWith(".PDF") || fileEntry.getName().endsWith(".pdf")) {
                    pdfArray.add(fileEntry);
                }
                if (fileEntry.getName().endsWith(".MTS") || fileEntry.getName().endsWith(".mts")) {
                    mtsArray.add(fileEntry);
                }

            }


            File directory2 = new File(rootPath + "/myDoc/");
            if (!directory2.exists()) {
                directory2.mkdir();
            }
            for (final File file : docArray) {
                System.out.println(file.getName() + " я в доке");
                file.renameTo(new File(rootPath + "/myDoc/" + file.getName()));
            }
            File directory3 = new File(rootPath + "/myPic/");
            if (!directory3.exists()) {
                directory3.mkdir();
            }
            for (final File file : jpegArray) {
                System.out.println(file.getName() + " я картинка");
                file.renameTo(new File(rootPath + "/myPic/" + file.getName()));
            }
            File directory4 = new File(rootPath + "/myFilms/");
            if (!directory4.exists()) {
                directory4.mkdir();
            }
            for (final File file : mp4Array) {
                System.out.println(file.getName() + " я видео");
                file.renameTo(new File(rootPath + "/myFilms/" + file.getName()));
            }
            //создаем директорию для мтс
            File directory = new File(rootPath + "/Rucami/");
            if (!directory.exists()) {
                directory.mkdir();
            }
            for (final File file : mtsArray) {
                System.out.println(file.getName() + " я видео руками");
                file.renameTo(new File(rootPath + "/Rucami/" + file.getName()));
            }
            File directory1 = new File(rootPath + "/myPdf/");
            if (!directory1.exists()) {
                directory1.mkdir();
            }
            for (final File file : pdfArray) {
                System.out.println(file.getName() + " я пдф");
                file.renameTo(new File(rootPath + "/myPdf/" + file.getName()));
            }
            System.out.println("Программа завершена успешно!");

        }
    }
}

//Раскидать программу по классам и методам






// создать класс в котором будет 2 метода 1. принимает пустой массив  (файл воркинг)