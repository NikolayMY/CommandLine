package dispatcher;

import constructor.Constructor;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;

import java.awt.*;

public class PortScannerDispatcher implements Disp {

    public void toDispatch(String[] args){
        if (args.length > 5 || args.length < 3){
            System.out.println("Enter the proper command or use 'help'...");
        }
        ApplicationContext ctx = CtxUtil.getContext();
        Constructor constructor = (Constructor) ctx.getBean("constructor");
        if (args.length == 3 ){
            try {
                constructor.scanPorts(args[1], Integer.parseInt(args[2]));
            } catch (NumberFormatException ex){
                constructor.scanPorts(args[1], args[2]);
            }
        }
        if (args.length == 4){
            try {
                constructor.scanPorts(args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]), "nope");
            } catch (NumberFormatException ex){
                System.out.println("Incorrect numeric format");
            }
        }
        if (args.length == 5){
            try {
                constructor.scanPorts(args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]), args[4]);
            } catch (NumberFormatException ex){
                System.out.println("Incorrect numeric format");
            }
        }
        new Main().mainCircle();
    }
}
