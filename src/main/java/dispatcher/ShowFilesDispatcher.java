package dispatcher;

import constructor.Constructor;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;

public class ShowFilesDispatcher implements Disp {

    public void toDispatch(String[] args){
        if (args.length != 1){
            System.out.println("Enter 'ls' command properly!");
            new Main().mainCircle();
        } else {
        ApplicationContext ctx = CtxUtil.getContext();
        Constructor constructor = (Constructor) ctx.getBean("constructor");
        constructor.showFiles();
        new Main().mainCircle();
        }
    }
}
