package dispatcher;

import constructor.Constructor;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;
import utils.makeDirectory.MkDir;
import utils.makeDirectory.MkDirImpl;


public class MkDirDispatcher implements Disp {

    public void toDispatch(String[] args){
        if (args.length != 2){
            System.out.println("Enter this command with only one argument: ${DirectoryName}");
            new Main().mainCircle();
        } else {
        ApplicationContext ctx = CtxUtil.getContext();
        Constructor constructor = (Constructor) ctx.getBean("constructor");
        constructor.makeDirectory(args[1]);
        new Main().mainCircle();

        }
    }
}
