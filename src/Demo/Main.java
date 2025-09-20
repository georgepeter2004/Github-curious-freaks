package Demo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String a ="tiger";
        String b ="ti";
        StringBuilder str = new StringBuilder();
        for(char aa:a.toCharArray()){
            if(b.indexOf(aa)==-1){
                str.append(aa);
            }
        }

        System.out.println(str.toString());


    }
}
