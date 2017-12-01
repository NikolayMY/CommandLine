package dispatcher;

import constructor.Constructor;
import exceptions.OutOfRangeException;
import main.Main;
import org.springframework.context.ApplicationContext;
import systemUtil.CtxUtil;

import java.awt.*;

public class PortScannerDispatcher implements Disp {

    public void toDispatch(String[] args){
        if (args.length>5){
            System.out.println("Enter command properly!");
            new Main().mainCircle();
        }

        ApplicationContext ctx = CtxUtil.getContext();
        Constructor constructor = (Constructor) ctx.getBean("constructor");
        if (args.length == 3){
            if (args[2].equals("v")){
                constructor.scanPorts(args[1], true);
            } else {
            constructor.scanPorts(args[1], false);
            }
        }
        if (args.length == 4){
            if (args[3].equals("v")){
                try {
                    constructor.scanPorts(args[2], Integer.parseInt(args[3]), true);
                } catch (OutOfRangeException ex ){
                    System.out.println(ex);
                }
            } else {
            try {
                constructor.scanPorts(args[2], Integer.parseInt(args[3]), false);
            } catch (OutOfRangeException ex){
                System.out.println(ex);
            }}
        }

        if (args.length == 5){
            if (args[4].equals("v")){
                try {
                    constructor.scanPorts(args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]), true);
                } catch (OutOfRangeException ex){
                    System.out.println(ex);
                }
            }
            try {
                constructor.scanPorts(args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]), false);
            } catch (OutOfRangeException ex){
                System.out.println(ex);
            }
        }
        new Main().mainCircle();
    }
}
