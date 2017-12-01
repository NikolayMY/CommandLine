package dispatcher;

import main.Main;

public class ConfigDispatcher implements Disp{

    public void toDispatch(String[] args){
        if (args.length != 1){
            System.out.println("Enter commands properly!");
            new Main().mainCircle();
        }


    }
}
