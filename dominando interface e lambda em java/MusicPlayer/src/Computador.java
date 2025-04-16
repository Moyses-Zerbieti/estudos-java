 public class Computador implements VideoPlayer, MusicPlayer{

  @Override
  public void playMusic() {
    System.out.println("O computador está tocando música");
  }
 
  @Override
  public void pauseMusic() {
    System.out.println("O computador está pausando a música");
  }
 
  @Override
  public void closeMusic() {
    System.out.println("O computador fechou o player de musica");
  }
 
  @Override
  public void playVideo() {
    System.out.println("O computador está reproduzindo o video");
  }
 
  @Override
  public void pauseVideo() {
    System.out.println("O computador está pausando o video");
  }
  @Override
  public void closeVideo() {
    System.out.println("O computador fechou o player de video");
  }
 
}
