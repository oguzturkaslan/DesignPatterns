/*
    İstemci tarafından verilen bilgilere göre nesne oluşumunu soyutlayarak merkezi bir yerden kontrol etmemizi sağlar.
    Sistemde belli özelliklere sahip sınıfları sürekli 'new' operatörünü kullanarak türetmek yerine bu sınıfları bir sınıf üzerinden soyutlayarak yaratmak amacıyla kullanılır.
*/
package designpatternfactory;

/**
 *
 * @author oguz.turkaslan
 */
public class DesignPatternFactory {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
        asus.since(2012);
        asus.name();

        Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
        mac.since(2016);
        mac.name();
    }

}
