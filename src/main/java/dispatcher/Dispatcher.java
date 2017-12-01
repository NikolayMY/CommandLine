package dispatcher;

import main.Main;
import utils.osConfig.OSConfig;
import utils.portScanner.PortScanner;

public class Dispatcher implements Disp{

    public void toDispatch(String[] args){
        if (args[0].equals("ls")){
            new ShowFilesDispatcher().toDispatch(args);
        }
        if (args[0].equals("pwd")){
            new ShowPathDispatcher().toDispatch(args);
        }
        if (args[0].equals("cd")){
            new ChangeDirectoryDispatcher().toDispatch(args);
        }
        if (args[0].equals("scan")){
            new PortScannerDispatcher().toDispatch(args);
        }
        if (args[0].equals("help")){
            new HelpDispatcher().toDispatch(args);
        }
        if (args[0].equals("exit") || args[0].equals("bye")){
            System.out.println("Exiting from Command Line...///");
            System.exit(0);
        }
        if (args[0].equals("config")){
            new OSDispatcher().toDispatch(args);
        }
        if (args[0].equals("mkdir")){
            new MkDirDispatcher().toDispatch(args);
        }
        if (!(args[0].equals("ls") || args[0].equals("cd") || args[0].equals("pwd") || args[0].equals("scan")
                || args[0].equals("help") || args[0].equals("exit") || args[0].equals("bye") || args[0].equals("config")
                || args[0].equals("mkdir"))){
            System.out.println("Enter the proper command or use 'help'...");
            new Main().mainCircle();
        }
    }

}

