package Prak14;

public class TestAddress {
    public static void main(String []args){
    Address ad1 = new Address();
    String address = "Россия.Московская область;Москва-Улица Карачова,28,3;35";
    ad1.setAddress(address);
    System.out.println(ad1.getCountry());
    System.out.println(ad1.getAddress());
    address = "Россия-Тульская область,Тула.Переулок Водный-29,3,6";
    Address ad2 = new Address(address);
    }
}
