package O_jogo.curso.aula02;

public class Aula02 {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampa = false;
        c1.modelo = "BIC Cristal";
        c1.carga = 1;
        c1.status();
        c1.rabiscar();
        c1.rabiscar();
        c1.status();

        
    }
}
