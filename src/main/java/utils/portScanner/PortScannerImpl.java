package utils.portScanner;

import exceptions.OutOfRangeException;
import utils.portScanner.PortScanner;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PortScannerImpl implements PortScanner {

    @Override
    public void scan(String hostname, int from, int to, boolean verbose) throws OutOfRangeException {
        if (from < 1 || 65535 < to){
            throw new OutOfRangeException();
        }
        List<Integer> openPorts = new ArrayList<>();

        for (int i=from; i < to; i++){
            Socket socket = new Socket();
            InetSocketAddress isa = new InetSocketAddress(hostname, i);
            try {
                socket.connect(isa, 20);
                openPorts.add(i);
                if (verbose) {
                    System.out.println("Port №" + i + " is opened!");
                }
                socket.close();
            } catch (Exception ex){
                if (verbose){
                    System.out.println("Port №" + i + " is closed...");
                }
            }
        }
        for (Integer p : openPorts){
            System.out.println("Port №" + p + " is opened.");
        }
    }



    @Override
    public void scan(String hostname, int port, boolean verbose) throws OutOfRangeException {
        if (port < 1 || 65535 < port){
            throw new OutOfRangeException();
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
    public void scan(String hostname, boolean verbose) {
        List<Integer> openPorts = new ArrayList<>();
        for (int i = 1; i < 65535; i++){
            Socket socket = new Socket();
            InetSocketAddress isa = new InetSocketAddress(hostname, i);
            try {
                socket.connect(isa, 20);
                openPorts.add(i);
                if (verbose){
                    System.out.println("Port №" + i + " is opened");
                }
                socket.close();
            } catch (Exception ex){
                if (verbose){
                    System.out.println("Port №" + i + " is closed");
                }
            }

            for (Integer p : openPorts){
                System.out.println("Port №" + p + " is opened.");
            }

        }
    }
}
