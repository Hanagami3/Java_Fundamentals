package be.brussel.Project1.AudioPlayer;

public class MediaAdapter implements MediaPlayer{

        //AdvancedMediaPlayer advancedMediaPlayer =
    public MediaAdapter(String audioType){
        if (audioType.equals("vlc")) {
            VlcPlayer vlcPlayer = new VlcPlayer();
        }
        else if (audioType.equals("mp4")) {
            Mp4Player mp4Player = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

    }
}
