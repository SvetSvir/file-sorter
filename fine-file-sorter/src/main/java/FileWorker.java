import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileWorker
{
    public List metod1(String filter,File[] allFiles)
    {
        List<File> tempArray = new ArrayList();
        for (int i=0; i < allFiles.length ;i++)
        {
            if (allFiles[i].getName().endsWith(filter)) {
                tempArray.add(allFiles[i]);
            }
        }
        return tempArray;
    }
    public void metod2(String direct, String path, List<File> files)
    {
        File directory = new File(path+direct);
        if (!directory.exists()) {
            directory.mkdir();
        }
        for (int j=0; j < files.size(); j++)
        {
            files.get(j).renameTo(new File(path + direct + files.get(j).getName()));
        }
    }

}




