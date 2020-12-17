package Prak14;

public class Test {
    public static void main(String[] args){
        Person p1 = new Person("Мухов Николай Николаевич");
        System.out.println(p1.getPerson());
        p1 = new Person("Царев Павел");
        System.out.println(p1.getPerson());
    }
}
