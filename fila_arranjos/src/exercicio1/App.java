public class App {
    public static void main(String[] args){
        FilaArranjo fila = new FilaArranjo();
        try{
            fila.enfileirar(1);
            fila.enfileirar(2);
            fila.enfileirar(3);
            fila.desenfileirar();
            fila.desenfileirar();
            fila.enfileirar(4);
            fila.enfileirar(5);
            fila.enfileirar(6); 
            fila.desenfileirar();
            fila.desenfileirar();           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(fila.fim);
        System.out.println(fila.inicio);
        
    }
}
