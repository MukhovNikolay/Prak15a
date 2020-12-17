package Prak14;

public class Number {
    public Number (String number){
        System.out.println(setNumber(number));
    }
    private String setNumber(String number){
        String []str;
        str = new String[4];
        str[3]=number.substring(number.length()-4);
        str[2]=number.substring(number.length()-7,number.length()-4);
        str[1]=number.substring(number.length()-10,number.length()-7);
        if(number.indexOf("+")==0) {
            str[0] = number.substring(1, number.length() - 10);
        }
        else
            str[0] = number.substring(0,number.length() - 10);

        return "+"+str[0]+str[1]+"-"+str[2]+"-"+str[3];
    }
}
