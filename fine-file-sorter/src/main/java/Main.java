import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rootPath = reader.readLine();
        File folder = new File(rootPath);
        if (!folder.exists()) {
            System.out.println(folder.getAbsolutePath() + " папка не существует");
            return;
        }
        File[] files = folder.listFiles();
        FileWorker fileWorker = new FileWorker();
        List mp4 = fileWorker.metod1("mp4", files);
        List doc = fileWorker.metod1("doc", files);
        List pdf = fileWorker.metod1("pdf", files);
        List jpg = fileWorker.metod1("jpg", files);
        List MTS = fileWorker.metod1("MTS", files);
        List zip = fileWorker.metod1("zip", files);
        List exe = fileWorker.metod1("exe", files);
        List pptx = fileWorker.metod1("pptx", files);
        List jar= fileWorker.metod1("jar", files);
        List msi = fileWorker.metod1("msi", files);
        List flv = fileWorker.metod1("flv", files);

        fileWorker.metod2("/mp4/",rootPath,mp4);
        fileWorker.metod2("/doc/",rootPath,doc);
        fileWorker.metod2("/jpg/",rootPath,jpg);
        fileWorker.metod2("/pdf/",rootPath,pdf);
        fileWorker.metod2("/MTS/",rootPath,MTS);
        fileWorker.metod2("/exe/",rootPath,exe);
        fileWorker.metod2("/zip/",rootPath,zip);
        fileWorker.metod2("/pptx/",rootPath,pptx);
        fileWorker.metod2("/jar/",rootPath,jar);
        fileWorker.metod2("/msi/",rootPath,msi);
        fileWorker.metod2("/flv/",rootPath,flv);
    }
}
