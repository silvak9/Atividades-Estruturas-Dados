public class Main1 {
    /*  metodo de inserção no inicio, começo a variavel de apoio com zero, quando o ultimo for
    igual ao tamanho do vetor -1 devido o vetor iniciar de zero, ele esta cheio e lanco a exceção.
     */
    
    static int fim = 0;

    public static void inserirInicio(int[] vetor, int elemento) throws Exception{ 
        if(fim==vetor.length-1)
            throw new Exception("Vetor cheio.");
        for(int i = fim; i>0; i--)
            vetor[i] = vetor[i-1];
        vetor[0] = elemento;
        fim++;
    }


    public static void inserirFim(int[] vetor, int elemento)throws Exception{
        if(fim==vetor.length)
            throw new Exception("vetor cheio");
        vetor[fim] = elemento;
        fim++;
    }

    public static void inserirEntreElementos(int[] vetor, int elemento, int p) throws Exception{
        if(fim==vetor.length-1){
            throw new Exception("Erro");
        }
        for(int i = fim; i>p; i--){
            vetor[i] = vetor[i-1];
        }
        vetor[p] = elemento;
        fim++;
    }

    public static void excluirInicio(int[] vet) throws Exception{
        if(fim==0)
            throw new Exception("Vetor não existe");
        for(int i =1; i<fim; i++){
            vet[i-1] = vet[i];
        }
        fim--;   
    }

    public static void excluirFim(int[] vet) throws Exception{
        if(fim==0)
            throw new Exception("Vetor não existe");
        fim--;
    }

    public static void excluirEntreDuasPos(int[] vet, int p) throws Exception{
        if(fim==0)
            throw new Exception("vetor cheio.");
        if(p>fim)
            throw new Exception("posição vazia.");
        
            for(int i = p; i<fim-1; i++){
                vet[i] = vet[i+1];
            }
        fim--;
    }

    
    public static void main(String[] args){
        int vetor[] = new int[10];

        Main1 vet = new Main1();

        try{
            vet.inserirFim(vetor, 50);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println();
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }

        System.out.println();

        try{
            vet.inserirInicio(vetor, 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }

        System.out.println();

        try{
            vet.inserirInicio(vetor, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }

        System.out.println();

        try{
            vet.inserirFim(vetor, 51);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();     
        
        System.out.println(vet.fim);


        try{
            vet.inserirEntreElementos(vetor, 2, 2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();     
        
        System.out.println(vet.fim);


        try{
            vet.inserirEntreElementos(vetor, 49, 3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }


        System.out.println();
        System.out.println();
        // try{
        //     vet.excluirInicio(vetor);
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        // for(int i = 0; i<fim; i++){
        // System.out.print(vetor[i] + " ");
        // }


        System.out.println();
        System.out.println();

         try{
            vet.inserirFim(vetor, 51);
            vet.inserirFim(vetor, 52);
            vet.inserirFim(vetor, 53);
            vet.inserirFim(vetor, 54);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(fim);
        System.out.println(vetor.length);
        System.out.println();
        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }
        
        System.out.println();
        // try{
        //     vet.excluirFim(vetor);
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        // for(int i = 0; i<fim; i++){
        // System.out.print(vetor[i] + " ");
        // }
        // System.out.println(fim);
        // System.out.println();

        try{
            vet.excluirEntreDuasPos(vetor, 5);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i<fim; i++){
        System.out.print(vetor[i] + " ");
        }
 
        System.out.println(fim);
        System.out.println(vetor.length);
    }
}


        // int[] vet = new int[1];
        // vet[0]=2;
        
        // System.out.println(vet[0]);

        // inserir dados no vetor.
        // for(int i =0; i<6; i++){
        //     vetor[i] = i;
        // }

        // verificação da tarefa do metodo inseri na primeira posição
        // try{
        //     inserirInicio(vet, 50);
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
 
        // for(int i = 0; i<vetor.length; i++){
        //     System.out.print(vetor[i] + " ");
        // }