package constructor;

import exceptions.OutOfRangeException;
import utils.changeDirectory.ChangeDirectory;
import utils.changeDirectory.ChangeDirectoryImpl;
import utils.help.Help;
import utils.makeDirectory.MkDir;
import utils.osConfig.OSConfig;
import utils.portScanner.PortScanner;
import utils.showFiles.ShowFiles;
import utils.showPath.ShowPath;

public class Constructor {

   private PortScanner portScanner;
   private MkDir mkDir;
   private ShowPath path;
   private ChangeDirectory directory;
   private ShowFiles files;
   private Help help;
   private OSConfig config;

   public Constructor(PortScanner portScanner, MkDir mkDir, ShowPath path, ChangeDirectory directory, ShowFiles files, Help help, OSConfig config){
       this.portScanner = portScanner;
       this.mkDir = mkDir;
       this.path = path;
       this.directory = directory;
       this.files = files;
       this.help = help;
       this.config = config;
   }
   public Constructor(){}

   public void scanPorts(String host, int from, int to, boolean verbose) throws OutOfRangeException{
       portScanner.scan(host, from, to, verbose);
   }


   public void scanPorts(String host, int port, boolean verbose) throws OutOfRangeException{
       portScanner.scan(host, port, verbose);
   }

   public void scanPorts(String host, boolean verbose){
       portScanner.scan(host, verbose);
   }

   public void makeDirectory(String dirName){
       mkDir.makeDirectory(dirName);
   }

   public void showPath(){
        path.showPath();
   }

   public void changeDirectory(String newDirectory){
       directory.changeDirectory(newDirectory);
   }

   public void showFiles(){
       files.show();
   }

   public void help(){
       help.provideHelp();
   }

   public void getConfig(){
       config.provideInfo();
   }



}
