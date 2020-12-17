package Prak14;

public class Person {
    String Name;
    public Person(String Name){
        this.Name = Name;
    }
    public String getPerson(){
        String [] str = Name.split("\\s+",0);
        if(str.length==3)
            return str[0]+" "+str[1].charAt(0)+"."+str[2].charAt(0)+".";
        if(str.length==2)
            return str[0]+" "+str[1].charAt(0)+".-.";
        return str[0]+" -.-.";
    }
}
