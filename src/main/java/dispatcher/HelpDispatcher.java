package dispatcher;

import constructor.Constructor;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;

public class HelpDispatcher implements Disp{

    public void toDispatch(String[] args){
        if (args.length != 1){
            System.out.println("Enter command properly!");
            new Main().mainCircle();
        } else {
            ApplicationContext ctx = CtxUtil.getContext();
            Constructor constructor = (Constructor) ctx.getBean("constructor");
            constructor.help();
            new Main().mainCircle();
        }
    }
}
