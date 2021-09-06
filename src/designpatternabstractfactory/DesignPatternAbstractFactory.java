/*
 Factory Design Pattern ile benzer özelliklere sahiptir. Farkı tek bir interface den değil, her ürün ailesi için farklı bir arayüzden nesne oluşturmasidır.
 Amacı birbiri ile ilişkili olan nesnelerin üretiminden sorumlu soyut fabrika sınıflarının tasarlanmasını sağlamaktır.
 */
package designpatternabstractfactory;

import designpatternabstractfactory.factories.CircleFactory;
import designpatternabstractfactory.factories.RectangleFactory;
import designpatternabstractfactory.factories.ShapeFactory;
import designpatternabstractfactory.model.Circle;
import designpatternabstractfactory.model.Rectangle;

/**
 *
 * @author oguz.turkaslan
 */
public class DesignPatternAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape(new RectangleFactory());
        ((Rectangle) rectangle).setWidth(15);
        ((Rectangle) rectangle).setHeight(5);

        Shape circle = ShapeFactory.getShape(new CircleFactory());
        ((Circle) circle).setRadius(5);

        System.out.println("Rectangle area: " + rectangle.getArea() + " and size: " + rectangle.getSize());
        System.out.println("Circle area: " + circle.getArea() + " and size: " + circle.getSize());
    }

}
