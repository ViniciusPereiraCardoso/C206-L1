import java.sql.SQLOutput;

public class Funcionario extends Pessoa {

    int matricula;

    Pessoa[] pessoas = new Pessoa[3];


    // Metodo para mostrar informacoes de funcionarios
    void mostraInfo() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null) //Verifica se existe funcionario antes de imprimir
                System.out.println("O funcionario: " + this.nome + " possui a seguinte matricula: " + this.matricula);
        }
    }
}
