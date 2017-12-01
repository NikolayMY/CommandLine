package utils.portScanner;

import exceptions.OutOfRangeException;

public interface PortScanner {


    public void scan(String hostname, int from, int to, boolean verbose) throws OutOfRangeException;

    public void scan(String hostname, int port, boolean verbose) throws OutOfRangeException;

    public void scan(String hostname, boolean verbose);


}
