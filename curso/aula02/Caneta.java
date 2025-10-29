package O_jogo.curso.aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    void status(){
        System.out.println("\n Modelo da caneta: " + this.modelo);
        System.out.println(" Cor: " + this.cor);
        System.out.println(" Ponta: " + this.ponta);
        System.out.println(" Carga: " + this.carga);
        System.out.println(" Está tampada? " + this.tampa);
    }

    void rabiscar(){

        if (this.carga > 0){
            if (this.tampa){
                System.out.println("\n ERRO. A caneta está tampada.");
            } else {
                System.out.println("\n Rabiscando! ");
                this.carga -=1;
            }
        } else {
            System.out.println("\n Caneta sem carga!");
        }

    }

    void destampar(){
        this.tampa = false;

    }

    void tampar(){
        this.tampa = true;
    }
    
}
