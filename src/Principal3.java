import br.com.exercicio.modelos3.Animal;
import br.com.exercicio.modelos3.Cachorro;

public class Principal3 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        Animal animalCachorro = new Cachorro();
        if (animal instanceof Cachorro) {
            Cachorro cachorroAnimal = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
