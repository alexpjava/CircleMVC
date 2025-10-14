package edu.cifo;

import edu.cifo.controller.CircleController;
import edu.cifo.model.Circle;
import edu.cifo.view.CircleView;



public class App 
{
    public static void main( String[] args )
    {
        //Circle c1 = new Circle(25);
        //System.out.println(c1);

        CircleView view = new CircleView();
        CircleController controller = new CircleController(view);
        controller.start();


    }
}
