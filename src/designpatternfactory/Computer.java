/*
İki farklı bilgisayar üreten firma düşünelim. Bu iki bilgisayarı işlev olarak düşündüğümüzde birbirlerine çok uzak değiller.
Bu interface bu firmalardaki benzerlikleri kalıtması için yazıldı.
 */
package designpatternfactory;

/**
 *
 * @author oguz.turkaslan
 */
public interface Computer {

    void name();

    void since(int year);
}
