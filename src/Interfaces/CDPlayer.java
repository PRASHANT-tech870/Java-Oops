package Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("media player started");
    }

    @Override
    public void stop() {
        System.out.println("Media player stopped");
    }
}
