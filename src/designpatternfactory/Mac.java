/*
 Kalıtım alan Mac firmasının class'ı
 */
package designpatternfactory;

/**
 *
 * @author oguz.turkaslan
 */
public class Mac implements Computer {

    @Override
    public void name() {
        System.out.println("Computer name is Mac");
    }

    @Override
    public void since(int year) {
        System.out.println("This PC selled since " + year);
    }

}
