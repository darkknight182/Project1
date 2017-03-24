package Proyecto1;

import java.awt.*;
import java.awt.image.ImageObserver;

//A Runnable is basically a type of class (Runnable is an Interface) that
// can be put into a thread, describing what the thread is supposed to do.
public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 640, HEIGHT = 550;

    public Game(){
        new Window(WIDTH,HEIGHT, "Game",this);
    }
   //The synchronized keyword is all about different threads
   // reading and writing to the same variables, objects and resources.
    public synchronized void start(){

    }
    public void run(){

    }

    public static void main(String args[]){
        new Game();

    }
}
