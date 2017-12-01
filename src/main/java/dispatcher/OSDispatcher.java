package dispatcher;

import constructor.Constructor;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;

public class OSDispatcher implements Disp {

    @Override
    public void toDispatch(String[] args) {
        if (args.length != 1){
            System.out.println("Enter commands properly!");
            new Main().mainCircle();
        } else {
            ApplicationContext ctx = CtxUtil.getContext();
            Constructor constructor = (Constructor) ctx.getBean("constructor");
            constructor.getConfig();
            new Main().mainCircle();
        }
    }
}
