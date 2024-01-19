package exercicio1;

public class Paciente {
    public int codigo;
    public String nome; 
    public String cor;
    public Paciente prox;

    public Paciente(int codigo, String nome, String cor){
        this.codigo = codigo;
        this.nome = nome;
        this.cor = cor;
        this.prox = null;
    }
    public void setProximo(Paciente paciente){
        this.prox = paciente;
    }

    public Paciente getProximo(){
        return this.prox;
    }
}
