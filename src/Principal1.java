import java.util.ArrayList;

import br.com.exercicio.modelos1.Produtos;

public class Principal1 {
    public static void main(String[] args) {
        
        Produtos produto1 = new Produtos("Coca-Cola", 5.00, 10);
        // produto1.setNome("Coca-Cola");
        // produto1.setPreco(5.00);
        // produto1.setQuantidade(10);

        Produtos produto2 = new Produtos("Guarana", 4.00, 15);
        // produto2.setNome("Guarana");
        // produto2.setPreco(4.00);
        // produto2.setQuantidade(15);

        Produtos produto3 = new Produtos("Fanta", 3.00, 20);
        // produto3.setNome("Fanta");
        // produto3.setPreco(3.00);
        // produto3.setQuantidade(20);

        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Numero de itens na lista: " + listaProdutos.size());
        System.out.println("Indice 1 -> " + listaProdutos.get(0));
        System.out.println("Indice 2 -> " + listaProdutos.get(1));
        System.out.println("Indice 3 -> " + listaProdutos.get(2));

        System.out.println(listaProdutos);
    }
}
