public class FilaArranjo {

    int[] vetor = new int[5];

    int tamanho = 0;
    int inicio = 0; 
    int fim = 0;

    public void enfileirar(int num) throws Exception{
        if(tamanho==vetor.length){
            throw new Exception("Vetor cheio");
        }
        vetor[fim] = num;
        fim++;
        if(fim==vetor.length)
            fim = 0;
        tamanho++;
    }

    public int desenfileirar() throws Exception{
        if(tamanho==0){
            throw new Exception("Fila vazia");
        }
        int num = vetor[inicio];
        inicio++;
        if(inicio==vetor.length)
            inicio = 0;
        tamanho--;
        return num;
    }

}
