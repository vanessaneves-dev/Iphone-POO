public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando as ações do Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        // Testando as ações do Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando as ações do Navegador na Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
