package Audioplayer;

public class AdapterPatternDemo {
//Maak de klasse Audioplayer.AdapterPatternDemo en neem onderstaand vb over:
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp3","teddy swims.mp3");

        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("mp4","adele,easy on me.mp4");

        audioPlayer.play("vlc","far away.vlc");
        audioPlayer.play("vlc","sea,elastic heart.vlc");

        audioPlayer.play("avi","mind me.avi");
        audioPlayer.play("avi","stan teylor.avi");
    }
}
