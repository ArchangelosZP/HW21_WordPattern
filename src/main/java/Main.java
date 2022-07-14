import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pattern >");
        String pattern  = scanner.nextLine();
        System.out.print("Enter string s >");
        String s  = scanner.nextLine();

        System.out.println(wordPattern(pattern,s)); ;

    }

    public static boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");

        if(arr.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String value = map.get(c);
                if(!value.equals(arr[i])){
                    return false;
                }
            }else if (map.containsValue(arr[i])){
                return false;
            }
            map.put(c, arr[i]);
        }

        return true;
    }

}
