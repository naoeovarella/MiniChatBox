import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniChatBot chatbot = new MiniChatBot();

        System.out.println("Sou o MiniChatbot, desembuxa logo!");

        while (true) {
            System.out.print("Diz logo: ");
            String mensagem = scanner.nextLine();

            if (mensagem.equalsIgnoreCase("sair")) {
                System.out.println("MiniChatbot: Tava na hora, ia passar o dia aqui.");
                break;
            }

            chatbot.processarMensagem(mensagem);
        }

        scanner.close();
    }
}