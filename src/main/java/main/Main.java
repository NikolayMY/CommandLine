package main;

import dispatcher.Dispatcher;
import introPic.Pic;
import systemUtil.CtxUtil;

import java.awt.geom.IllegalPathStateException;
import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CtxUtil.getContext();

        System.out.println("\n\nType 'help' if you have any questions.");
        System.out.println("****************************************************************");
        Pic.toDraw();
        System.out.println("****************************************************************\nEnter the command below:");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] mas = s.split(" ");

        new Dispatcher().toDispatch(mas);
    }

    public void mainCircle(){
        System.out.println("_____________________________");
        System.out.println("Enter the command below:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] mas = s.split(" ");

        new Dispatcher().toDispatch(mas);
    }
}
