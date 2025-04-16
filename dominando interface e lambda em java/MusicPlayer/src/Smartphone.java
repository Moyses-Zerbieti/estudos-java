public class Smartphone implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando a música");
    }

    @Override
    public void closeMusic() {
        System.out.println("O smartphone fechou o player");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está reproduzindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando o video");
    }
    @Override
    public void closeVideo() {
        System.out.println("O smartphone fechou o player de video");
    }
}
