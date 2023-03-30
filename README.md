# PatronBuilder

¿Cual es la función de este patrón?

Permitirnos crear objetos complejos paso a paso.

¿Como es su Diagrama de clases? Realiza en el readme el diagrama

```mermaid
classDiagram

    class Main{
    +Main()
    }
    
    class Pizzas{
    String masa;
    boolean relleno;
    int tipo;
    boolean salsa;
    String tipoSalsa;
    boolean cebolla;
    boolean sinGluten;
    boolean extQueso;
    boolean pina;
    boolean champinones;
    boolean jamon;
    }
    
    class BuilderPizzas{
    }
      
     Main <-- Pizzas
     Main <-- BuilderPizzas
```

¿Podríamos combinarlo con el patrón Factory?

Sí. podríamos crear una Factory dentro del propio Patron Builder para complementarlos uno con el otro.
