public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
      System.out.println("A caixa de musica está tocando música");
    }
   
    @Override
    public void pauseMusic() {
      System.out.println("A caixa de musica está pausando a música");
    }
   
    @Override
    public void closeMusic() {
      System.out.println("A caixa de musica fechou o player de musica");
    }
}
