package utils.showFiles;

import java.io.File;

public class ShowFilesImpl implements ShowFiles {

    @Override
    public void show() {
        File folder = new File(new File("").getAbsolutePath());
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            System.out.println(listOfFiles[i].getName());
        }

    }
}
