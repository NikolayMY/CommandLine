package utils.portScanner;

import main.Main;
import utils.portScanner.PortScanner;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PortScannerImpl implements PortScanner {

    @Override
    public void scan(String hostname, int from, int to, String verbose){
        if (from < 1 || from > 65535 || to < from || to > 65535){
            System.out.println("Acceptable range is '1-65535'");
            new Main().mainCircle();
        }
        List<Integer> openPorts = new ArrayList<>();

        for (int i=from; i < to; i++){
            Socket socket = new Socket();
            InetSocketAddress isa = new InetSocketAddress(hostname, i);
            try {
                socket.connect(isa, 20);
                openPorts.add(i);
                if (verbose.equals("v")) {
                    System.out.println("Port №" + i + " is opened!");
                }
                socket.close();
            } catch (Exception ex){
                if (verbose.equals("v")){
                    System.out.println("Port №" + i + " is closed...");
                }
            }
        }
        for (Integer p : openPorts){
            System.out.println("Port №" + p + " is opened.");
        }
    }



    @Override
    public void scan(String hostname, int port) {
        if (port < 1 || port > 65535){
            System.out.println("Acceptable range is '1-65535'");
            new Main().mainCircle();
        }
        Socket socket = new Socket();
        InetSocketAddress isa = new InetSocketAddress(hostname,port);
        try {
            socket.connect(isa, 50);
            socket.close();
            System.out.println("Port №" + port + " is opened");
        } catch (Exception ex){
            System.out.println("Current port is closed!");
        }

    }

    @Override
    public void scan(String hostname, String verbose) {
        List<Integer> openPorts = new ArrayList<>();
        for (int i = 1; i < 65535; i++){
            Socket socket = new Socket();
            InetSocketAddress isa = new InetSocketAddress(hostname, i);
            try {
                socket.connect(isa, 20);
                openPorts.add(i);
                if (verbose.equals("v")){
                    System.out.println("Port №" + i + " is opened");
                }
                socket.close();
            } catch (Exception ex){
                if (verbose.equals("v")){
                    System.out.println("Port №" + i + " is closed");
                }
            }
        }
        for (Integer p : openPorts){
            System.out.println("Port №" + p + " is opened.");
        }
    }
}
