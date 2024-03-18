public class Empresa extends Funcionario{

    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    Funcionario [] funcionarios = new Funcionario[3];


    // Metodo para mostrar informacoes da empresa
    void mostraInfo(){

        System.out.println("Nome da Empresa: " + nome);
        System.out.println("CNPJ da Empresa: " + cnpj);
        System.out.println("Endereco da Empresa: " + endereco);

        System.out.println("A Empresa: " + this.nome + " possui os seguintes Funcionarios:");
        for (Funcionario funcionario : funcionarios) {
            if(funcionario != null) //Verifica se existe funcionario antes de imprimir
                System.out.println(funcionario.nome);
        }
    }


    // Metodo para adicionar funcionario
    void adicionarFuncionario(Funcionario funcionario){
            for(int i = 0; i < funcionarios.length; i++){ //Varrendo o array de funcionarios
                if(funcionarios[i] == null){ //Verifica se não existe funcionario
                    funcionarios[i] = funcionario;
                    break; //Adiciona e sai do metodo
                }
            }
        }


    // Metodo para alocar funcionario
    void alocarFuncionario(){
        System.out.println();
    }

    // Metodo para contar quantidade de funcionarios disponiveis
    float contarFuncionariosDisponiveis (Funcionario funcionario){
        System.out.println("Quantidade de funcionarios: " + funcionarios.length);
        return 0;
    }
}
