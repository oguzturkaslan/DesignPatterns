/*
 Kalıtım alan Asus firmasının class'ı
 */
package designpatternfactory;

/**
 *
 * @author oguz.turkaslan
 */
public class Asus implements Computer {

    @Override
    public void name() {
        System.out.println("Computer name is Asus");
    }

    @Override
    public void since(int year) {
        System.out.println("This PC selled since " + year);
    }

}
