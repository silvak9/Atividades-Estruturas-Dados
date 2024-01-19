public class Paciente extends FilaBase{
    int codigo;
    String nome;
    String cor;
    Paciente prox;
    public Paciente(int codigo, String nome, String cor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cor = cor;
        this.prox = null;
    }
    public void setProximo(FilaBase el){
        this.prox = (Paciente)el;
    }
    public FilaBase getProximo(){
        return this.prox;
    }
    
}