package Interfaces;

public class NiceCar {
    private Engine engine = new ElectricEngine();
    private Media cdplayer = new CDPlayer();

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void playmusic(){
        cdplayer.start();
    }

    public void stopmusic(){
        cdplayer.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

    public void upgradeMedia(CDPlayer cdplayer){
        this.cdplayer = cdplayer;
    }


}
