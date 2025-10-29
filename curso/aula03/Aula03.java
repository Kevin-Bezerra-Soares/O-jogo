package O_jogo.curso.aula03;

public class Aula03 {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.ponta = 0.05f;
        c1.carga = 3;
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.status();

        
    }
}
