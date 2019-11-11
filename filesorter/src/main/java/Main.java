import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String rootPath = "C:\\Users\\svetl\\Downloads";
        final File folder = new File(rootPath);

        List<File> mp4Array = new ArrayList();
        List<File> docArray = new ArrayList();
        List<File> jpegArray = new ArrayList();
        List<File> pdfArray = new ArrayList();
        List<File> mtsArray = new ArrayList();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.getName().endsWith(".mp4")) {
                mp4Array.add(fileEntry);
            }
            if (fileEntry.getName().endsWith(".doc")) {
                docArray.add(fileEntry);
            }
            if (fileEntry.getName().endsWith(".jpeg")) {
                jpegArray.add(fileEntry);
            }
            if (fileEntry.getName().endsWith(".pdf")) {
                pdfArray.add(fileEntry);
            }
            if (fileEntry.getName().endsWith(".MTS") || fileEntry.getName().endsWith(".mts")) {
                mtsArray.add(fileEntry);
            }
        }
        //тут ты дальше обрабатываешь уже заполнные массивы mp4, doc, jpeg, pdf
        // если массив не пустой (т.е. есть файлы с таким расширением) то создай пустую папку для низ
        for (final File file : docArray) {
            System.out.println(file.getName() + " я в доке");
        }
        for (final File file : jpegArray) {
            System.out.println(file.getName() + " я картинка");
        }
        for (final File file : mp4Array) {
            System.out.println(file.getName() + " я видео");
        }
        //создаем директорию для мтс
        File directory = new File(rootPath + "/mts");
        if (!directory.exists()) {
            directory.mkdir();
        }
        for (final File file : mtsArray) {
            System.out.println(file.getName() + " я видео руками");
            file.renameTo(new File(rootPath + "/mts/" + file.getName()));
        }
        for (final File file : pdfArray) {
            System.out.println(file.getName() + " я пдф");
        }
    }
}
