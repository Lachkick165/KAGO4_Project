package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Ball extends InteractiveGraphicalObject {

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color (219, 184, 14));
        drawTool.drawFilledCircle(x, y, 100);
    }

    public void update(double dt){
        x += dt*60;
        y = -Math.sin(x/300) * 200 + 300;
        if(x>780){
            x = -180;
        }
    }
}
