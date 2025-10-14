package edu.cifo.controller;

import edu.cifo.model.Circle;
import edu.cifo.view.CircleView;

public class CircleController {
    private CircleView view;

    public CircleController(CircleView view) {
        this.view = view;
    }

    public void start() {
        double radius = view.requestRadius();
        Circle circle = new Circle(radius);

        double perimeter = circle.calculatePerimeter();
        double area = circle.calculateArea();

        view.displayResults(perimeter, area);

        // Later: save to database
        // saveToDB(circle);
    }
}
