package org.example.model;

import java.awt.*;

/*
 * Абстрактний клас "Фігура для малювання".
 * Містить базову логіку та координати початкової і кінцевої точок.
 */
public abstract class DrawShape {

    public static DrawShape newInstance(int shapeType) {
        DrawShape shape = null;
        if (shapeType == DrawShape.SHAPE_RECTANGLE) {
            shape = new Rectangle();
        } else if (shapeType == DrawShape.SHAPE_ROUNDED_RECT) {
            shape = new RoundedRectangle();
        } else if (shapeType == DrawShape.SHAPE_ELLIPSE) {
            shape = new Ellipse();
        }
        return shape;
    }

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

    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    // абстрактний метод — кожна фігура реалізує свій варіант
    public abstract Shape getShape(Point startPoint, Point endPoint);

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
