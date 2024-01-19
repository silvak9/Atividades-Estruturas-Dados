public class App {
    public static void main(String[] args) throws Exception {
        Fila <Paciente> fila = new Fila<>();
        fila.enfileirar(new Paciente(1, "Leo","Verde"));
        fila.enfileirar(new Paciente(2, "Leopoldo","Verde"));
        fila.enfileirar(new Paciente(3, "Leonidas","Verde"));
        fila.enfileirar(new Paciente(4, "Leoncio","Verde"));
        fila.enfileirar(new Paciente(5, "Leovildo","Verde"));

        Paciente p;
        while (!fila.isVazia()){
            p = fila.desenfileirar();
            System.out.printf("%d \t %s \n", p.codigo, p.nome);
        }

        System.out.println("\n\n\n");

        Fila <Professor> fila2 = new Fila<>();
        fila2.enfileirar(new Professor(1, "Leo"));
        fila2.enfileirar(new Professor(3, "Rossini"));
        fila2.enfileirar(new Professor(4, "Antonio"));
        fila2.enfileirar(new Professor(2, "Loham"));
        Professor p2;
        while (!fila2.isVazia()){
            p2 = fila2.desenfileirar();
            System.out.printf("%d \t %s \n", p2.cpf, p2.nome);
        }


    }
}
