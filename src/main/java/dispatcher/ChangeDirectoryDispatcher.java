package dispatcher;

import constructor.Constructor;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;

import java.awt.*;

public class ChangeDirectoryDispatcher implements Disp {

    public void toDispatch(String[] args){
        if (args.length != 2 ){
            System.out.println("Enter the proper command or use 'help'...");
        } else {
            ApplicationContext ctx = CtxUtil.getContext();
            Constructor constructor = (Constructor) ctx.getBean("constructor");
            constructor.changeDirectory(args[1]);
        }
        new Main().mainCircle();
    }
}
