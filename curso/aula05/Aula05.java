package O_jogo.curso.aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();

        conta1.setNumConta(747);
        conta1.setDono("Kevin");
        conta1.abrirConta("corrente");
        conta1.estadoAtual();

    }
}