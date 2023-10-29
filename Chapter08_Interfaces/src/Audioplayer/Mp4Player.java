package Audioplayer;

public class Mp4Player implements AdvancedMediaPlayer {// Класс для воспроизведения формата Mp4
//Audioplayer.Mp4Player op zijn beurt laat de implementatie van de methode playVlc leeg en
//implementeert enkel de methode playMp4 met de volgdende sysout:
//System.out.println(“Playing mp4 file. Name: “ + fileName)

    @Override
    public void playVlc(String fileName) {
        // не поддерживает формат vlc
    }
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);

    }


}
