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
public class SingletonDemo {

    //SingletonDemo class ından static bir nesne oluştur.
    private static SingletonDemo singletonDemo = new SingletonDemo();

    
    //Sınıftan herhangi bir nesne oluşturulmaması için access modifier ı private olan boş bir metod tanımlandı
    private SingletonDemo() {
    }

    //Oluşturulacak nesneye erişim için getter
    public static SingletonDemo getInstance() {
        return singletonDemo;
    }

    
    public void showMessage() {
        System.out.println("Singleton Pattern !!");
    }

}
