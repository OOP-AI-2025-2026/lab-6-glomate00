package org.example.model;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedRectangle extends DrawShape {

    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        return new RoundRectangle2D.Double(
                Math.min(startPoint.x, endPoint.x),
                Math.min(startPoint.y, endPoint.y),
                Math.abs(endPoint.x - startPoint.x),
                Math.abs(endPoint.y - startPoint.y),
                30, 30
        );
    }
}
