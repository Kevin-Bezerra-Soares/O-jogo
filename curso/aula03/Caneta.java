package O_jogo.curso.aula03;

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampa;

    public void status(){
        System.out.println("\n Modelo da caneta: " + this.modelo);
        System.out.println(" Cor: " + this.cor);
        System.out.println(" Ponta: " + this.ponta);
        System.out.println(" Carga: " + this.carga);
        System.out.println(" Está tampada? " + this.tampa);
    }

    public void rabiscar(){

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

    public void destampar(){
        this.tampa = false;

    }

    public void tampar(){
        this.tampa = true;
    }
    
}
