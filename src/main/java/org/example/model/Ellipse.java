package org.example.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends DrawShape {

    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        return new Ellipse2D.Double(
                Math.min(startPoint.x, endPoint.x),
                Math.min(startPoint.y, endPoint.y),
                Math.abs(endPoint.x - startPoint.x),
                Math.abs(endPoint.y - startPoint.y)
        );
    }
}
