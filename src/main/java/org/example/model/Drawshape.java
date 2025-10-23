package org.example.model;

import java.awt.*;

public abstract class DrawShape {

    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    private Point startPoint;
    private Point endPoint;

    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public static DrawShape newInstance(int shapeType) {
        return switch (shapeType) {
            case SHAPE_RECTANGLE -> new RectangleShape();
            case SHAPE_ROUNDED_RECT -> new RoundedRectangleShape();
            case SHAPE_ELLIPSE -> new EllipseShape();
            default -> null;
        };
    }

    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    public abstract Shape getShape(Point startPoint, Point endPoint);

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
