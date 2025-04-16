package aplicativos;

public class MsnMessenger extends ServicodeMensagem {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
       System.out.println("Enviando mensagem pelo MSN");   
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }  
}

