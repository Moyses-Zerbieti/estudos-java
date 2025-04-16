public class App {
    public static void main(String[] args) throws Exception {
        runMusic (new Computador());
        runVideo(new Computador());

    }
    public static void runVideo (VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }
    public static void runMusic (MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    } 
}
