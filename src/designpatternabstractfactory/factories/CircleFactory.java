/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternabstractfactory.factories;

import designpatternabstractfactory.Shape;
import designpatternabstractfactory.model.Circle;

/**
 *
 * @author oguz.turkaslan
 */
public class CircleFactory implements ShapeAbstarctFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }

}
