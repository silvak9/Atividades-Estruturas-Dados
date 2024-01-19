package exercicio1;

public class Professor {
    public int cpf;
    public String nome;
    public Professor prox;

    public Professor(int cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
        this.prox = null;
    }

    public void setProximo(Professor professor){
        this.prox = professor;
    }
    
    public Professor getProximo(){
        return this.prox;
    }
}
