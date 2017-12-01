package dispatcher;

import main.Main;
import utils.portScanner.PortScanner;

public class Dispatcher implements Disp{

    public void toDispatch(String[] args){
        if (args[0].equals("scan")){
            new PortScannerDispatcher().toDispatch(args);
            } else if (args[0].equals("mkdir")){
                new MkDirDispatcher().toDispatch(args);
                } else if (args[0].equals("pwd")){
                    new ShowPathDispatcher().toDispatch(args);
                    } else if (args[0].equals("cd")){
                        new ChangeDirectoryDispatcher().toDispatch(args);
                        } else if (args[0].equals("ls")){
                            new ShowFilesDispatcher().toDispatch(args);
                            } else if (args[0].equals("config")){
                                new OSDispatcher().toDispatch(args);
                                } else if (args[0].equals("exit") || args[0].equals("bye")){
                                    System.exit(0);
                                    } else if (args[0].equals("help")){
                                        new HelpDispatcher().toDispatch(args);
                                        }  else {
                                                System.out.println("Enter commands properly!");
                                                new Main().mainCircle();
                                    }
        }

}

