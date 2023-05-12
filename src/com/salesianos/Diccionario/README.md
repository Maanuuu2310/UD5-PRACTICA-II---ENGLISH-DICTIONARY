# Documentación de la aplicación "Duolingo Dictionary"



### Descripción

La aplicación "Duolingo Dictionary" es una herramienta que permite a los usuarios guardar y revisar las palabras en inglés que van aprendiendo cada día. La aplicación ha sido solicitada por la empresa Duolingo Inc.

La aplicación utiliza estructuras de datos adecuadas para una correcta funcionalidad y dispone de un menú mediante el que el usuario puede interactuar con el diccionario.

### Estructura de paquetes
La estructura de paquetes utilizada en la aplicación es la siguiente:


Dictionary.java

* com
* salesianos
* Diccionario

#### Clase Dictionary:
La clase Dictionary se encarga de almacenar las palabras clasificándolas por la inicial. Las palabras agrupadas por letra son únicas y no se repiten dentro de la colección.


## Constructores

* Dictionary(): crea un nuevo diccionario vacío.
Métodos

* void addWord(String word): agrega una nueva palabra al diccionario. La palabra se convierte a minúsculas y se elimina cualquier espacio en blanco al principio y al final antes de agregarla al diccionario.

* boolean deleteWord(String wordToDelete): elimina una palabra del diccionario. La palabra se convierte a minúsculas y se elimina cualquier espacio en blanco al principio y al final antes de buscarla en el diccionario. Si la palabra se encuentra y se elimina, devuelve true, de lo contrario devuelve false.

* boolean containsWord(String wordToFind): verifica si una palabra se encuentra en el diccionario. La palabra se convierte a minúsculas y se elimina cualquier espacio en blanco al principio y al final antes de buscarla en el diccionario. Si la palabra se encuentra, devuelve true, de lo contrario devuelve false.

* List<String> getWordsByInitial(char initial): devuelve una lista de todas las palabras en el diccionario que comienzan con la letra especificada.

* Set<Character> getInitials(): devuelve un conjunto de todas las letras iniciales que aparecen en el diccionario.

* void printAllWords(): imprime todas las palabras en el diccionario, ordenadas alfabéticamente por su letra inicial.







