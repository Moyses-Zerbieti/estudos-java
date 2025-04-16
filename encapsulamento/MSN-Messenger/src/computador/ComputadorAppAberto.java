package computador;

import aplicativos.Facebook;
import aplicativos.MsnMessenger;
import aplicativos.ServicodeMensagem;
import aplicativos.Telegram;

public class ComputadorAppAberto {
    public static void main(String[] args) {
     ServicodeMensagem smg = null;
     /*
     * Não se sabe qual app usar 
     * Mas qualquer um deverá envivar e receber mensagem
     */
     String appEscolhido = "fcb";

     if (appEscolhido.equals("msn"))
        smg = new MsnMessenger();
     else if (appEscolhido.equals("fcb"))
        smg = new Facebook();
     else if (appEscolhido.equals("tlg"))
        smg = new Telegram();

     smg.enviarMensagem();
     smg.receberMensagem();
    }   
} 