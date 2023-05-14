import java.util.*;
import com.salesianos.Diccionario.Dictionary;
import com.salesianos.Utils.Util;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al diccionario de palabras por inicial.");

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Por favor, seleccione una opción:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Por favor, introduzca la palabra:");
                    String wordToAdd = scanner.nextLine();
                    dictionary.addWord(wordToAdd);
                    System.out.println("La palabra ha sido añadida al diccionario.");
                    break;
                case 2:
                    System.out.println("Por favor, introduzca la palabra que desea eliminar:");
                    String wordToDelete = scanner.nextLine();
                    if (dictionary.deleteWord(wordToDelete)) {
                        System.out.println(Util.ANSI_RED + "La palabra ha sido eliminada del diccionario.");
                    } else {
                        System.out.println("La palabra no estaba almacenada en el diccionario.");
                    }
                    break;
                case 3:
                    System.out.println("Por favor, introduzca la palabra que desea buscar:");
                    String wordToFind = scanner.nextLine();
                    if (dictionary.containsWord(wordToFind)) {
                        System.out.println("La palabra está en el diccionario.");
                    } else {
                        System.out.println("La palabra no está en el diccionario.");
                    }
                    break;
                case 4:
                    Set<Character> initials = dictionary.getInitials();
                    System.out.println("Iniciales disponibles:");
                    for (char initial : initials) {
                        System.out.println(initial);
                    }
                    break;
                case 5:
                    System.out.println("Por favor, introduzca la inicial que desea buscar:");
                    char initial = scanner.nextLine().charAt(0);
                    List<String> words = dictionary.getWordsByInitial(initial);
                    if (words.isEmpty()) {
                        System.out.println("No hay palabras almacenadas que empiecen por esa inicial.");
                    } else {
                        System.out.println("Palabras que empiezan por " + initial + ": " + words);
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }
        }

        System.out.println("¡Gracias por usar el diccionario de palabras por inicial!");
    }
}
