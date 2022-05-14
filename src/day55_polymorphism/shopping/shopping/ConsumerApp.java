package day55_polymorphism.shopping.shopping;

public interface ConsumerApp extends Shipping,AllowUserToSell {
// we are passing the methods fromShipping interface and AllowUseToSEl interface to the ConsumerApp
}
//going t=from interface to interface is inheritance , so we use extends.Remember ther=se are interfaces, so they dont follow the same rules as classes. we can extend multiple interfaces
abstract class TestA implements Shipping,AllowUserToSell{
//the first example is if we implemented both of the original interface to a class directly
}
abstract  class TestB implements ConsumerApp{
// this example we use the ConsumerApp interface that had Shipping and AllowsToAell interfaces Inherited
}
