## Step-by-step execution guide for the MVC program in Java

This program implements the Model-View-Controller (MVC) pattern to calculate the perimeter and area of a circle, requesting the radius from the user and displaying the results.

---

### 1. Program start

- The main class `Main` is executed.
- An instance of the view is created:

CirculoView view = new CirculoView();

- An instance of the controller is created, passing the view to it:

CirculoController controller = new CirculoController(view);

- The `start()` method is called to begin the flow:

controller.start();

---

### 2. Initial interaction in the controller (`start()` method)

- The controller asks the view to request the circle radius from the user:

double radius = view.requestRadius();

- The view displays a message and reads the value from the console using a `Scanner`.

---

### 3. Creation and use of the model (`Circulo`)

- The controller creates a `Circulo` object with the provided radius:

Circulo circle = new Circulo(radius);

- The perimeter and area are calculated by calling the model methods:

double perimeter = circle.calculatePerimeter();
double area = circle.calculateArea();

---

### 4. Displaying results through the view

- The controller sends the results to the view to be displayed:

view.showResults(perimeter, area);

- The view prints the perimeter and area in a properly formatted way on the console.

---

### 5. End or continuation

- Optionally, the controller may perform additional actions, such as saving the circle to a database.
- In this example, the program ends after displaying the results.

---

## Summary of responsibilities by component

| Component                 | Main responsibility                              | Key methods                           |
|----------------------------|--------------------------------------------------|---------------------------------------|
| **Model (Circulo)**        | Manages data and logic (radius, calculations)    | `calculatePerimeter()`, `calculateArea()` |
| **View (CirculoView)**     | Interacts with the user (request and display)    | `requestRadius()`, `showResults()`    |
| **Controller (CirculoController)** | Coordinates logic and communication between model and view | `start()`                            |

---
[⬅️ Back to Index](../readme.md#table-of-contents)
