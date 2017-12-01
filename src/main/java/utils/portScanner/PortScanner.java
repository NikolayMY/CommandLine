package utils.portScanner;



public interface PortScanner {


    public void scan(String hostname, int from, int to, String verbose);

    public void scan(String hostname, int port);

    public void scan(String hostname, String verbose);


}
