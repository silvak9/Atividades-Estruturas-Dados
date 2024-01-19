public class Professor extends FilaBase{
    int cpf;
    String nome;
    Professor prox;

    public Professor(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.prox = null;
    }
    public void setProximo(FilaBase el){
        this.prox = (Professor)el;
    }
    public FilaBase getProximo(){
        return this.prox;
    }
    
}
