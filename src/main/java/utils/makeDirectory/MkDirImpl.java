package utils.makeDirectory;

import java.io.File;

public class MkDirImpl implements MkDir{

    @Override
    public void makeDirectory(String dirName) {
        new File(new File("").getAbsolutePath() +"" + dirName).mkdir();

    }
}
