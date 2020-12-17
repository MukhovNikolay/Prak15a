package Prak14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Address {
    String country,region,town,street,house,corpus,flat;
    public Address() {
    }
    public Address(String address){
        System.out.print(Arrays.toString(address.split("[,.;-]+",0)));
    }
    public void setAddress(String address){
        String [] str = address.split("[,.;-]+",0);
        this.country = str[0];
        this.region = str[1];
        this.town = str[2];
        this.street = str[3];
        this.house = str[4];
        this.corpus = str[5];
        this.flat = str[6];
    }
    public String getAddress(){
        return "Страна: "+getCountry()+"\nРегион: "+getRegion()+"\nГород: "+getTown()+"\nУлица: "+getStreet()+"\nДом: "
                +getHouse()+"\nКорпус: "+getCorpus()+"\nКвартира: "+getFlat();
    }
    public String getCountry(){
        return country;
    }
    public String getRegion(){
        return region;
    }
    public String getTown(){
        return town;
    }
    public String getStreet(){
        return street;
    }
    public String getHouse(){
        return house;
    }
    public String getCorpus(){
        return corpus;
    }
    public String getFlat(){
        return flat;
    }
}
