import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        var arrayTurma = new ArrayList<Turma>();
        var arrayEst = new ArrayList<Estudantes>();

        Scanner scanner = new Scanner(System.in);
        var opcao = 0;

        while (opcao != 5){

        System.out.println("\nMenu Principal");
        System.out.println("---------------");
        System.out.println("1 - Cadastrar turma");
        System.out.println("2 - Cadastrar estudantes");
        System.out.println("3 - Listar turmas");
        System.out.println("4 - Listar estudantes");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = Integer.parseInt(scanner.nextLine());


        if (opcao == 1){
            System.out.println("Qual o código da turma: ");
            String codigo = scanner.nextLine();
            System.out.println("Qual o nome da turma: ");
            String nome = scanner.nextLine();
            System.out.println("Qual a capacidade da turma: ");
            int capacidade = Integer.parseInt(scanner.nextLine());

            Turma turma = new Turma(codigo, nome, capacidade);

            arrayTurma.add(turma);

        } else if (opcao == 2) {
            System.out.println("Qual o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Qual o telefone: ");
            String telefone = scanner.nextLine();
            System.out.println("Qual o endereco: ");
            String endereco = scanner.nextLine();
            System.out.println("Qual o nome do responsavel: ");
            String responsavel = scanner.nextLine();

            Estudantes estudantes = new Estudantes(nome, telefone, endereco, responsavel);

            arrayEst.add(estudantes);

        } else if (opcao == 3) {

            for (var turma : arrayTurma) {
                System.out.println("codigo: " + turma.getCodigo());
                System.out.println("nome: " + turma.getNome());
                System.out.println("capacidade: " + turma.getCapacidade());
            }
        } else if (opcao == 4) {
            for (var estudante : arrayEst ){
                System.out.println("nome: " + estudante.getNome());
                System.out.println("telefone: " + estudante.getTelefone());
                System.out.println("endereco: " + estudante.getEndereco());
                System.out.println("responsavel: " + estudante.getResponsavel());
            }
    }else {
            System.out.println("OPCAO NAO DISPONIVEL INFORME OUTRA");
        }

        }

    }

}


