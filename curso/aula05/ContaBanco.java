package O_jogo.curso.aula05;

public class ContaBanco {
    public int numConta;
    String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        saldo = 0;
        status = false;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        if (t == "corrente"){
            setSaldo(50.00f);
        } else if (t == "poupanca"){
            setSaldo(150.00f);
        }

    }

    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("\n Conta com''' dinheiro, oparação cancelada!");
        } else if(this.saldo < 0){
            System.out.println("\n A conta está negativa, operação cancelada!");
        } else{
            System.out.println("\n Conta fechada com sucesso!\n Tem 30 dias corridos para reverter a operação.");
            setStatus(false);
        }

    }

    public void depositar(float v){
        if (getStatus()){
            setSaldo(getSaldo()+v);
        } else {
            System.out.println("\n A conta está inativa! ");
        }

    }

    public void sacar(float v){
        if (getStatus()){
            if (getSaldo() > 0){
                setSaldo(getSaldo()-v);
            } else {
            System.out.println("\n Saldo insuficiente: " + v);
            } 
        } else {
            System.out.println("\n Conta inativa! ");
        }

    }

    public void pagarMensal(){
        float v=0;
        if (getTipo() == "corrente"){
            v = 12;
        } else if(getTipo() == "poupanca"){
            v = 20;
        }

        if (getStatus()){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
            }
        }

    }

    public void estadoAtual(){
        System.out.println("-------------------------------------");
        System.out.println("\n Conta: " + this.getNumConta());
        System.out.println("\n Dono: " + this.getDono());
        System.out.println("\n Tipo: " + this.getTipo());
        System.out.println("\n Saldo: " + this.getSaldo());
        System.out.println("\n Status ativação da conta: " + this.getStatus());
        System.out.println("\n-------------------------------------");
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;
    }

}