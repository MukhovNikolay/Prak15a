package Prak14;

public class Word {
    public void sort(String words){
        String str[] = words.split(" ",0);
        int j=0;
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+"  ");
            if(i!=str.length)
            for(j=i+1;j< str.length;j++) {
                if (str[i].charAt(str[i].length()-1) == str[j].charAt(0)) {
                    String a = str[i+1];
                    str[i+1]=str[j];
                    str[j]=a;
                    j=str.length;
                }
            }
        }
    }
}
