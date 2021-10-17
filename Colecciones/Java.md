# Java Collections Framework

Una coleccion es como un contenedor que combina multiples artículos en una unidad.  
La colección en java es un marco que proporciona un arquitectura para almacenar y manipular el grupo de objetos.  

## Java Collection Framework  
 Es como se conoce a la librería de clases contenedoras de Java que podemos encontrar en el paquete estándar **java.util**  

![java.util](https://static.javatpoint.com/images/java-collection-hierarchy.png)  

**List, Queue y Set** 

**Interfaz List**  
Contiene las estructuras de datos que se utilizan para almacenar datos ordenados o de colección de objetos.  
Estas estructuras que implementen Lisit pueden tener o no valores duplicados.  
Contiene los metodos que se utilizan para acceder, insetar o eliminar elementos de los objetos de lista.  
Clases:  
+ ArrayList
+ LinkedList
+ Vector
+ Stack  


**Interfaz Queue**  
Mantiene el orden de primero en entrar, primero en salir (FIFO). Se puede definr como una lista ordenada que se utiliza para contener los elementos que estan a punto de ser procesados.  
Clases:  
+ PriorityQueue
+ Deque
+ ArrayDeque

**Interfaz Set**  
Representa el conjunto desordenado de elementos que no nos permte almacenar los elementos duplicados.  
Clases:  
+ HashSet
+ LinkedHashSet
+ TreeSet  

Bibliografía:  
[Colecciones en Java](https://www.javatpoint.com/collections-in-java)