package exceptions;


public class OutOfRangeException extends Exception {

    public OutOfRangeException(){
        System.out.println("The entered port should lie in 1-65535 range!");
    }
}
