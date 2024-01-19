package exercicio1;

public class Fila1 {
    public Professor cabeca; 
    public Professor cauda;
    public int tamanho = 0;

    public void enfileirar(Professor professor) throws Exception{
        if(tamanho==0){
            cauda.setProximo(professor);
        }else
            cabeca = professor;
        cauda = professor;
        tamanho++;
    }

    public Professor desenfileirar() throws Exception{
        if(isVazia())
            throw new Exception("Fila vazia.");
        Professor professor = cabeca;
        cabeca = professor.getProximo();
        tamanho--;
        return professor;
        
    }

    public boolean isVazia(){
        return tamanho==0;
    }
}
