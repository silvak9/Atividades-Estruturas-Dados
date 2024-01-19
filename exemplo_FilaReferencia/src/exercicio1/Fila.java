package exercicio1;

public class Fila {
    public Paciente cabeca;
    public Paciente cauda;
    public int tamanho = 0;

    public void enfileirar(Paciente paciente){
        if(tamanho!=0)
            cauda.setProximo(paciente);
        else
            cabeca = paciente;
        cauda = paciente;
        tamanho++;
    }

    public Paciente desenfileirar() throws Exception{
        if(isVazia())
            throw new Exception("A fila esta vazia.");
        Paciente paciente = cabeca;
        cabeca = cabeca.getProximo();
        tamanho--;
        return paciente;
    }


    public boolean isVazia(){
        return tamanho==0;
    }
}
