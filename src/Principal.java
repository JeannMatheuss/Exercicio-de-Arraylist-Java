import java.util.ArrayList;

import br.com.exercicio.modelos.Pessoa;

public class Principal {
    public static void main(String[] args) {

        // criando a lista de pessoas com a classe Pessoa entre isso <> 
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jean");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Márcia");
        pessoa2.setIdade(12);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(25);
    }
}
