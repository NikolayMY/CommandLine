package utils.changeDirectory;

import java.io.File;

public class ChangeDirectoryImpl implements ChangeDirectory {

    @Override
    public void changeDirectory(String path) {
        String[] mas = path.split("");
        for (int i=0; i<=mas.length-1; i++){
            if (mas[i].equals("/") || mas[i].equals("\\")){
                mas[i] = "//";
            }

        }
        System.setProperty("user.dir", path);

    }
}
