/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsingleton;

/**
 *
 * @author oguz.turkaslan
 */
public class DesignPatternSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        singletonDemo.showMessage();
    }

}
