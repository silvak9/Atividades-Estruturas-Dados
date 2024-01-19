public class Fila<T extends FilaBase> {
    private T cabeca;
    private T cauda;
    private int tam = 0;
    public void enfileirar(T elemento){
        if (tam != 0){//tem gente?
            cauda.setProximo(elemento);
        } else {// ta vazio
            cabeca = elemento;
        }
        cauda = elemento;
        tam++;
    }
    
    @SuppressWarnings("unchecked")
    public T  desenfileirar() throws Exception{
        if (isVazia())
            throw new Exception("Fila vazia");
        T el = cabeca;
        cabeca = (T) cabeca.getProximo();
        tam--;
        return el;
    }
    public boolean isVazia(){
        return tam == 0;
    }
    
}
