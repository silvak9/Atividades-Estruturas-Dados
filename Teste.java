    public class Teste {
        public static void main(String[] args) {
            int[] vetor = {1, 2, 3, 0, 5, 0, 7};
    
            // Chamando o método de inserção
            inserirElemento(vetor, 4);
    
            // Imprimindo o vetor após a inserção
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
    
        // Método para inserir um elemento no vetor
        public static void inserirElemento(int[] vetor, int elemento) {
            // Percorre o vetor para encontrar a primeira posição vazia (com valor 0)
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == 0) {
                    // Encontrou posição vazia, insere o elemento e encerra o método
                    vetor[i] = elemento;
                    return;
                }
            }
    
            // Se o vetor estiver cheio, você pode redimensioná-lo ou tomar alguma ação adequada.
            System.out.println("O vetor está cheio. Não foi possível inserir o elemento.");
        }
    }
    
    

