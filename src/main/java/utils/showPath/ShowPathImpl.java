package utils.showPath;

import java.io.File;

public class ShowPathImpl implements ShowPath {

    @Override
    public void showPath() {
        System.out.println(new File("").getAbsolutePath());
    }
}
