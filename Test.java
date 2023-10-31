import java.util.Arrays;
public class Test{
    public static int flipper(String t){
        char curr = '0';
        int ct = 0;
        for (int i=0;i<t.length();i++) {
            if (t.charAt(i)!=curr) {
                ct++;
                curr = (char)(((curr + 1)%2)+48);
            }
        }
        return ct;
    }
 
    public static void main(String args[]){
        String t = "010110000000011111111111111111100101001010101111";
        System.out.println(flipper(t));
    }
}