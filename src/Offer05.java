import java.util.Scanner;

public class Offer05 {
    public String replaceSpace(String s) {
        if (s == null)
            return s;
        int len = s.length();
        int spaceNum = 0;
        for (int i=0; i<len; i++){
            if (s.charAt(i) == ' ')
                spaceNum++;
        }
        int len1 = s.length() + spaceNum * 2;
        char[] s1 = new char[len1];
        int i = len - 1, j = len1 - 1;
        while(i >= 0 && j >= 0){
            if(s.charAt(i) == ' '){
                s1[j--] = '0';
                s1[j--] = '2';
                s1[j--] = '%';
                i--;
            }
            else{
                s1[j--] = s.charAt(i);
                i--;
            }
        }
        return String.valueOf(s1);
    }

    public static void main(String[] args){
        Offer05 offer05 = new Offer05();
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        System.out.println(offer05.replaceSpace(s));
    }
}
