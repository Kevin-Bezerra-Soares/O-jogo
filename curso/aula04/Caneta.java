package O_jogo.curso.aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public Caneta(String m, String c, float p){
        tampar();
        this.cor = m;
        this.modelo = c;
        this.ponta = p;
    }


    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo (String m){
        this.modelo = m;
    }

    public float getPonta (){
        return this.ponta;
    }

    public void setPonta (float p){
        this.ponta = p;
    }

    public String getCor (){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }


    public void status (){
        System.out.println("\n\t Informações da caneta: \n\n");
        System.out.println(" Modelo: " + this.modelo);
        System.out.println(" Ponta: " + this.ponta);
        System.out.println(" Cor: " + this.cor);
        System.out.println(" Está tampada? " + this.tampada);
    }
}