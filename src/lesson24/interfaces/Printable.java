package lesson24.interfaces;

//интерфейсы косвенно абстрактны; не нужно писать абстракт, он присутствует по умолчанию
public interface Printable {
    //интерфейс это совокупность абстрактных методов, задающих какое-то поведение
    //все методы интерфейса косвенно и абстрактны и публичны
    void print();

    default void test(){
        System.out.println("Test");
    }

    static void testStatic(String str){
        System.out.println("Static method printable" + str);
    }
}
