import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner pedido = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        int escolha = pedido.nextInt();

        boolean running = true;

        while (running) {


            Empresa empresa1 = new Empresa();
            empresa1.nome = "Inatel";
            empresa1.endereco = "Avenida Inatel";
            empresa1.cnpj = "123.456";

            Funcionario funcionario1 = new Funcionario();
            funcionario1.nome = "Nome 1";
            funcionario1.matricula = Integer.parseInt("123");
            funcionario1.idade = Integer.parseInt("30");
            funcionario1.cpf = "12345";

            Funcionario funcionario2 = new Funcionario();
            funcionario1.nome = "Nome 2";
            funcionario1.matricula = Integer.parseInt("124");
            funcionario1.idade = Integer.parseInt("30");
            funcionario1.cpf = "12346";

            Funcionario funcionario3 = new Funcionario();
            funcionario1.nome = "Nome 3";
            funcionario1.matricula = Integer.parseInt("125");
            funcionario1.idade = Integer.parseInt("30");
            funcionario1.cpf = "12348";



        // Menu inicial
        System.out.println("\n---------- Bem vindo ao Menu! ----------");

        System.out.println("\n-> Digite '1' caso queira mostrar as informacoes da empresa");
        System.out.println("-> Digite '2' caso queira adicionar um funcionario");
        System.out.println("-> Digite '3' caso queira alocar um funcionario");
        System.out.println("-> Digite '4' caso queira contar funcionarios disponiveis");


            // critica de dados
            while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) { // critica de dados
                System.out.println("-> Opção Inválida. Digite um número compatível com uma das opções acima! ");
                escolha = pedido.nextInt();
            }

            switch (escolha) {
                case 1:
                    System.out.println("Voce escolheu a primeira opção!");
                    empresa.mostraInfo();
                    break;
                case 2:
                    System.out.println("Voce escolheu a segunda opção!");

                    System.out.println("Entre com nome do Funcionario: ");
                    String nomeNovoFuncionario = scanner.nextLine();

                    empresa.adicionarFuncionario(Funcionario funcionario);
                    break;
                case 3:
                    System.out.println("Voce escolheu a terceira opção!");
                    empresa.alocarFuncionario();
                    break;
                case 4:
                    System.out.println("Voce escolheu a quarta opção!");
                    empresa.contarFuncionariosDisponiveis(Funcionario funcionario);
                    break;

                default:
                    System.out.println("Opcao invalida.\n");
            }
            pedido.close();
        }
    }
}