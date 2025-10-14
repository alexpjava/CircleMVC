## Guion paso a paso de ejecución del programa MVC en Java

Este programa implementa el patrón Modelo-Vista-Controlador (MVC) para calcular el perímetro y área de un círculo, solicitando el radio al usuario y mostrando los resultados.

---

### 1. Inicio del programa

- Se ejecuta la clase principal `Main`.
- Se crea una instancia de la vista: 
  
CirculoView vista = new CirculoView();
  
- Se crea una instancia del controlador, pasándole la vista:
  
CirculoController controlador = new CirculoController(vista);
  
- Se llama al método `iniciar()` para arrancar el flujo:
 
controlador.iniciar();

---

### 2. Interacción inicial en el controlador (método `iniciar()`)

- El controlador solicita a la vista que pida al usuario el radio del círculo:
 
double radio = vista.pedirRadio();

- La vista muestra un mensaje y lee el valor desde la consola con un `Scanner`.

---

### 3. Creación y uso del modelo (`Circulo`)

- El controlador crea un objeto `Circulo` con el radio proporcionado:

Circulo circulo = new Circulo(radio);

- Se calculan el perímetro y el área llamando a los métodos del modelo:
- 
double perimetro = circulo.calcularPerimetro();
double area = circulo.calcularArea();

---

### 4. Mostrar resultados mediante la vista

- El controlador envía los resultados a la vista para que los muestre:
  
vista.mostrarResultados(perimetro, area);
  
- La vista imprime el perímetro y el área con formato adecuado en la consola.

---

### 5. Fin o continuación

- Opcionalmente el controlador puede realizar acciones adicionales, como guardar el círculo en base de datos.
- En este ejemplo, el programa finaliza al mostrar los resultados.

---

## Resumen de responsabilidades por componente

| Componente           | Responsabilidad principal                     | Métodos clave                           |
|----------------------|----------------------------------------------|---------------------------------------|
| **Modelo (Circulo)**   | Gestiona datos y lógica (radio, cálculos)    | `calcularPerimetro()`, `calcularArea()`|
| **Vista (CirculoView)** | Interactúa con el usuario (pedir y mostrar) | `pedirRadio()`, `mostrarResultados()`|
| **Controlador (CirculoController)** | Coordina la lógica y comunicación entre modelo y vista | `iniciar()`                           |

---
