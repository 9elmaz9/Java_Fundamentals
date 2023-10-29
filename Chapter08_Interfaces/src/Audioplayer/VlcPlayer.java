package Audioplayer;

public class VlcPlayer  implements AdvancedMediaPlayer{ // Класс для воспроизведения формата Vlc
//Audioplayer.VlcPlayer implementeert de methoden van Audioplayer.AdvancedMediaPlayer Maar geeft
//enkel de methode playVlc een implementatie namelijk een sysout:
//System.out.println(“Playing vlc file. Name: ” + fileName);
    @Override
    public void playVlc(String fileName) {

        System.out.println("Playing vlc file.Name:" + fileName );

    }

    @Override
    public void playMp4(String fileName) {
        // не поддерживает формат mp4
    }
}
