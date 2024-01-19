package exercicio1;

public class Main{
    public static void main(String[] args){

        Fila filaPaciente = new Fila();
        filaPaciente.enfileirar(new Paciente(6, "Samuel", "verde"));
        filaPaciente.enfileirar(new Paciente(1, "Leo","Verde"));
        filaPaciente.enfileirar(new Paciente(2, "Leopoldo","Verde"));
        filaPaciente.enfileirar(new Paciente(3, "Leonidas","Verde"));
        filaPaciente.enfileirar(new Paciente(4, "Leoncio","Verde"));
        filaPaciente.enfileirar(new Paciente(5, "Leovildo","Verde"));

        Paciente p;

        while (!filaPaciente.isVazia()) {
            try {
                p = filaPaciente.desenfileirar();
                System.out.printf("%d \t %s \n", p.codigo, p.nome);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        Fila1 filaProfessor = new Fila1();
        try {
            filaProfessor.enfileirar(new Professor(1, "samuel"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Professor prof;
        while(!filaProfessor.isVazia()){
            try {
                prof = filaProfessor.desenfileirar();
                System.out.printf("%d \t %s \n", prof.cpf, prof.nome);
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }

    }
}