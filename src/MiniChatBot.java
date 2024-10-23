public class MiniChatBot {

    public void responderSaudacao() {
        System.out.println("Opa, vem de perguntinha não");
    }

    public void responderNome() {
        System.out.println("Eu sou o MiniChatbot, se me pagar bem sou seu assistente virtual!");
    }

    public void responderEstado() {
        System.out.println("Podia estar melhor, mas meu programador não é dos bons");
    }

    public void respostaPadrao() {
        System.out.println("Fala direito");
    }

    public void processarMensagem(String mensagem) {

        if (mensagem.contains("oi") || mensagem.contains("olá")) {
            responderSaudacao();
        } else if (mensagem.contains("qual seu nome")) {
            responderNome();
        } else if (mensagem.contains("como voce esta")) {
            responderEstado();
        } else {
            respostaPadrao();
        }
    }
}
