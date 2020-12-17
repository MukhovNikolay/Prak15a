package Prak14;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestWord {
    public static void main(String[]args){
        Word w1 = new Word();
        Scanner sc1 = new Scanner(System.in);
        try (FileReader r1 = new FileReader(sc1.nextLine()/*C:\\Users\\коля\\Desktop\\New file.txt*/)){
            char[] buf = new char[256];
            int flag;
            while((flag = r1.read(buf))>1) {
                if(flag<256) {
                    buf = Arrays.copyOf(buf,flag);
                }
            }
            StringBuilder sb1 = new StringBuilder(buf.length);
            for(Character c: buf){
                sb1.append(c.charValue());
            }
            String st1 = sb1.toString();
            w1.sort(st1);
            }
        catch (IOException e){
            System.out.println("Файл не найден");
        }
    }
}
