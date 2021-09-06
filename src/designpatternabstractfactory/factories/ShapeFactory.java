/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternabstractfactory.factories;

import designpatternabstractfactory.Shape;

/**
 *
 * @author oguz.turkaslan
 */
public class ShapeFactory {

    public static Shape getShape(ShapeAbstarctFactory shapeAbstarctFactory) {
        return shapeAbstarctFactory.createShape();
    }
}
