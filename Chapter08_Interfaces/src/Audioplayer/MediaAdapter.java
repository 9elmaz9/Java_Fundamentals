package Audioplayer;

public class MediaAdapter implements MediaPlayer {
    // Класс который позволяет воспроизводить различные форматы с помощьюAdvancedMediaPlayer
//Declareer een eigenschap van het type Audioplayer.AdvancedMediaPlayer
    private  AdvancedMediaPlayer advancedMusicPlayer ; // ei


   // De constructor heeft een String audioType als parameter en deze zal gebruikt
   // worden om te zien of je de eigenschap als een instantie van Audioplayer.VlcPlayer of
   //Mp4player moet aanmaken.
    public MediaAdapter(String audioType){// Конструктор, который определяет,
    // какой конкретный Audioplayer.AdvancedMediaPlayer использовать
    if (audioType.equalsIgnoreCase("vlc")){
        advancedMusicPlayer=new VlcPlayer();
    }else if ( audioType.equalsIgnoreCase("mp4")){
        advancedMusicPlayer=new Mp4Player();
    }


}

//Implementeer de methode play hierin maak je een keuze op basis van je
//argumenten om te zien of je de methode playVlc of playMp4 moet
//aangeroepen worden. Geef hieraan het argument fileName mee.
    @Override  // Реализация метода play интерфейса Audioplayer.MediaPlayer
    public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")){
        advancedMusicPlayer.playVlc(fileName);
    }else if (audioType.equalsIgnoreCase("mp4")){
        advancedMusicPlayer.playMp4(fileName);
    }

    }
}
