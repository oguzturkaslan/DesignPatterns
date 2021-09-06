/*
 Sınıftaki createComputer static class'ı Class türündeki nesneleri oluştururken her seferinde tekrarlamak yerine statik bir şekilde daha optimize olarak oluşturmaktadır.
 Metodun aldığı Class tipindeki parametre hangi sınıfı oluşturmak istediğimizi anlamak içindir.
 Ancak bu sınıf hangi firmanın oluşturulduğunu bilmiyor. Sadece Computer interface'inden türeyen bir sınıf olduğunu biliyor.
 */
package designpatternfactory;

/**
 *
 * @author oguz.turkaslan
 */
public class ComputerFactory {

    public static Computer createComputer(Class aClass) throws InstantiationException, IllegalAccessException {

        return (Computer) aClass.newInstance();

    }
}
