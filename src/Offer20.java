import java.awt.*;
import java.util.Scanner;

public class Offer20 {

    boolean sign_before_e=false;
    boolean sign_after_e=false;
    boolean hasE=false;
    boolean hasPoint=false;
    boolean unsigned=false;
    boolean noSpace=false;
    boolean number_before_point=false;
    boolean number_before_e=false;

    public boolean isNumber(String s) {
        int i=0;
        int len = s.length();
        while (i<len){
            char c=s.charAt(i);
            if (c==' '){
                if (noSpace)
                    return noMoreNum(s.substring(i+1));
                i++;
            }
            else if (c=='+'||c=='-'){
                if (hasE&&!sign_after_e){
                    sign_after_e=true;
                    noSpace=true;
                    if (i+1==len)
                        return false;
                    return isInteger(s.substring(i+1));
                }
                else if (!hasE&&!sign_before_e&&!unsigned){
                    noSpace=true;
                    sign_before_e=true;
                    if (i+1==len)
                        return false;
                    return isNumber(s.substring(i+1));
                }
                else
                    return false;
            }
            else if (c>='0'&&c<='9'){
                if (i==len-1){
                    return true;
                }
                noSpace=true;
                number_before_e=true;
                while (i<len){
                    c=s.charAt(i);
                    if (c>='0'&&c<='9'){
                        i++;
                        continue;
                    }
                    break;
                }
                if (i<len){
                    if (c=='e'||c=='E'){
                        hasE=true;
                        if (i+1==len)
                            return false;
                        if ((s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')||s.charAt(i+1)=='+'||s.charAt(i+1)=='-')
                            return isInteger(s.substring(i+1));
                        return false;
                    }
                    else if (c=='.'){
                        if (!hasPoint){
                            if (i+1==len)
                                return true;
                            else {
                                unsigned=true;
                                hasPoint=true;
                                number_before_point=true;
                                return isNumber(s.substring(i+1));
                            }
                        }
                        else
                            return false;
                    }
                    else if (c==' '){
                        return noMoreNum(s.substring(i+1));
                    }
                    else
                        return false;
                }
                else{
                    return true;
                }
            }
            else if (c=='.'){
                if (hasPoint)
                    return false;
                if (i+1<len&&(s.charAt(i+1)<'0'||s.charAt(i+1)>'9')){
                    return false;
                }
                if (i+1==len&&number_before_point)
                    return true;
                hasPoint=true;
                noSpace=true;
                return isNumber(s.substring(i+1));
            }
            else if (c=='e'||c=='E'){
                if (number_before_e){
                    hasE=true;
                    if (i+1==len)
                        return false;
                    if ((s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')||s.charAt(i+1)=='+'||s.charAt(i+1)=='-')
                        return isInteger(s.substring(i+1));
                    return false;
                }
                else
                    return false;
            }
            else return false;
        }

        return false;
    }

    //判断是否整数
    public boolean isInteger(String s){
        int len=s.length();
        for (int j=0;j<len;j++){
            char c=s.charAt(j);
            if (c=='+'||c=='-'){
                if (hasE){
                    if (sign_after_e)
                        return false;
                    else {
                        sign_after_e=true;
                        if (j+1==len)
                            return false;
                        continue;
                    }
                }
            }
            else if (c>='0'&&c<='9'){
                continue;
            }
            else if (c==' '){
                return noMoreNum(s.substring(j+1));
            }
            else
                return false;
        }
        return true;
    }

    public boolean noMoreNum(String s){
        int i=0;
        while (i<s.length()){
            if (s.charAt(i++)!=' ')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Offer20 offer20 = new Offer20();
        String s="";
        Scanner scanner = new Scanner(System.in);
        s=scanner.nextLine();
        System.out.println(offer20.isNumber(s));
    }
}
