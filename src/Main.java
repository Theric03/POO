import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        int aux = 1;

        while (aux == 1) {
            menu();
            int op = sc.nextInt();
            switch (op) {

                //Criar
                case 1:
                    System.out.printf("Tamanho da lista: ");
                    int tam = sc.nextInt();
                    for (int i = 1; i <= tam; i++) {
                        System.out.println("Elemento " + i + ":");
                        int valor = sc.nextInt();
                        numeros.add(valor);
                    }
                    break;
                //Listar
                case 2:
                    for (int numero : numeros) {
                        System.out.println(numero);
                    }
                    break;
                //Tamanho
                case 3:
                    System.out.println("Tamanho do LinkedHashSet: " + numeros.size());
                    break;
                //Verificar
                case 4:
                    System.out.printf("Elemento: ");
                    int elemento=sc.nextInt();
                    System.out.println("O LinkedHashSet contém o elemento "
                            + elemento + "? " + numeros.contains(elemento));
                    break;
                //Excluir
                case 5:
                    System.out.printf("Elemento: ");
                    elemento = sc.nextInt();
                    numeros.remove(elemento);
                    System.out.println("Elementos do LinkedHashSet após a remoção:");
                    for (int numero : numeros) {
                        System.out.println(numero);
                    }
                    break;
                case 6:
                    numeros.clear();
                    System.out.println("O LinkedHashSet está vazio? " + numeros.isEmpty());
                    break;

            }
        }
    }

    public static void menu() {
        System.out.println("1 - Criar");
        System.out.println("2 - Listar");
        System.out.println("3 - Tamanho");
        System.out.println("4 - Verificar");
        System.out.println("5 - Excluir elemento");
        System.out.println("6 - Excluir lista");

    }
}