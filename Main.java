import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // int [] n = new int[10];
        // //variavel que faz referência para a posição 
        // int fim = 0;
        // // povoar o vetor com alguns elementos.
        // for(int i = 0; i<6; i++){
        //     n[i] = i;   
        //     fim++;
        // }
        
        // for(int i = 0; i<fim; i++){
        //     System.out.print(n[i] + " ");
        // }
        // System.out.println();
        // System.out.println(fim);
        // System.out.println();
        // System.out.println();
        // System.out.println(n[6]);


        /*tentar inserir na ultima posição do vetor, uma vez que já fiz inserção até a posição menor que 6,
        logo se o vetor estivesse fazio iniciaria na primeira posição;
        */
        // for(int i = fim; i<n.length; i++){
        //     n[i] = i;
        //     fim++;
        // }

        // for(int i = 0; i<fim; i++){
        //     System.out.print(n[i] + " ");
        // }
        // System.out.println();
        // System.out.println(fim);

        //inserir um elemento no inicio do vetor, se a posição 0 da variavel fim for ==0 insiro nela, se não todos pro lado e inserir na posição 0 o valor;
        // Scanner in = new Scanner(System.in);
        // System.out.println("Qual número deseja guardar?");
        // int valor = in.nextInt();;


        /*inserção no inicio, este for para no indice 1 a sempre cada posição atual do vetor n
        recebendo o valor da posição anterior, cheguei no indice 1 saio do vetor incremento mais 1
        no fim, e na posição zero que está vazia acrescento um valor.
        */
        // for(int i = n.length-1; i>0; i--){
        //     n[i] = n[i-1];
        // }
        // fim++;
        // n[0] = valor;

        // for(int i = 0; i<fim; i++){
        //     System.out.print(n[i] + " ");
        // }
        // System.out.println();
        // System.out.println(fim);
    /*---------------------------------------------------------------------------------------------------- */

    // Inserção no final
    int[] vetor = new int[1];

    vetor[0] = 1;

    int fin = 0;   

    // System.out.println(fin);
    // System.out.println(vetor.length);

    // if(fin==vetor.length-1)
    //     System.out.println(true);
    // else
    //     System.out.println(false);
    
    // inseri elementos até a posição menor que 6 do vetor
    // for(int i = 0; i<6; i++){
    //     vetor[i] = i;
    //     fin++;
    // }
    
    /*  tentei realizar um for, porém como já há o vetor e nele uma variavel fin com valor de zero
    que aponta para o primeiro indice vazio apos o ultimo que possui elemento jogo este novo valor
    para a posição que o vetor guarda, e acrescento mais um no fin e ele aponto para o proximo vazio.
    */

    Scanner in = new Scanner(System.in);
    System.out.println("Qual número deseja guardar?");
    int valor = in.nextInt();
    if(fin==vetor.length-1){
        System.out.println("vetor cheio");
    }else{
        vetor[fin] = valor;
        fin++;
    }
    
    System.out.println(fin);
    }
}