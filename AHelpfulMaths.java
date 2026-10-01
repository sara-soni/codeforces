import java.util.*;
public class AHelpfulMaths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String s = sc.next();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        boolean first= true;
        for(int i=0;i <ch.length;i++){
            if(ch[i] != '+'){
                if(!first){''
                    System.out.print('+');
                }
            System.out.print(ch[i]);
            first =false;
            }
        }
    }
}