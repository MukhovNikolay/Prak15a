package Prak14;

public class Shirt {
    public Shirt(String shirt){
        System.out.println(toString(shirt));
    }
    private String toString(String shirt){
        String [] str = shirt.split("\\,+",0);
        return "Номер: "+str[0]+"   Название: "+str[1]+"   Цвет: "+str[2]+"   Размер: "+str[3];
    }
}
