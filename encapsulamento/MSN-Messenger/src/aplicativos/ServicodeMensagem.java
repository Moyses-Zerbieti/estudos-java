package aplicativos;

public abstract class ServicodeMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

  protected void validarConexaoInternet(){
    System.out.println("Validando se esta conectado com a internet");
  }
}
