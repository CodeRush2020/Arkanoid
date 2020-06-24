package Model;

import java.io.File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CrunchSound implements Observer {

    private Subject block;


    public CrunchSound(Subject block){
        this.block = block;
       block.registerObserver(this);
    }

    public void update() {
        try {

            Clip sonido = AudioSystem.getClip();

            sonido.open(AudioSystem.getAudioInputStream(new File("src/Model/Sound.wav")));

            sonido.start();

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}