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

        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa1);

        System.out.println("Quantidade de pessoas na lista: " + listaDePessoas.size());
        System.out.println("Primeiro nome da lista: " + listaDePessoas.get(0).getNome());

        System.out.println(listaDePessoas);
    }
}
