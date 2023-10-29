package Audioplayer;

public class AudioPlayer implements MediaPlayer { //Creëer de concrete klasse die implementeert van de Audioplayer.MediaPlayer interface Geef deze de naam Audioplayer.AudioPlayer.

    //Declareer in deze klasse een eigenschap van het type Audioplayer.MediaAdapter.
    private MediaAdapter mediaAdapter;


    //Implementeer de methode play hier zodanig dat je op basis van je argumenten
    //(String audioType, String Filename) ofwel een sysout doet in het geval de
    //String audioType gelijk is aan mp3 of gebruik de eigenschap mediaAdapter
    //om de play methode aan te roepen (in het geval van mp4 of vlc).
    public void play(String audioType, String fileName) {// Реализация метода play интерфейса Audioplayer.MediaPlayer
        // Проверяем, является ли аудиоформат mp3
        if (audioType.equalsIgnoreCase("mp3")) { //проверка аудио форрмата,эта часть кода проверяет является ли АУДФОРм мп3, если да то  выводим первы текст
            System.out.println("Playing mp3 file.Name:" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            // если формат не мп3, создаем обьект МЕДИАДАПТЕР , его можно использовать для воспроизведения фрмата, отличного от мп3
            mediaAdapter = new MediaAdapter(audioType);
            // Вызываем метод play адаптера, который в свою очередь вызывает соответствующий метод Audioplayer.AdvancedMediaPlayer
            mediaAdapter.play(audioType, fileName);  // вызываем метод play() ,а он вызывает метод AdvancMediaPlayer
        } else {
            // если формат ни мп3, ни поддерживается форматом , выводим текст
            System.out.println("Invalid media" + audioType + " format not supposted");

            //метод play в классе Audioplayer.AudioPlayer  позволяет воспроиз форматы , используя метод Audioplayer.AdvancedMediaPlayer
        }
    }
}
