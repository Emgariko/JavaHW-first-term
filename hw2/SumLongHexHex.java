public class SumLongHex{
    public static int get_Value(String s){
        int stringLength = s.length();
        Long result = 0;
        for (int i = 0; i < stringLength; i++) {
            int left = i, right = i;
            if (Character.isWhitespace(s.charAt(i))) {
                continue;
            }
            if (s.charAt(i) == '-') { 
                right++;
            }
            while (right < stringLength && (Character.isDigit(s.charAt(right)))) {
                right++;
            }
            if (left != right) {
                result += Long.parseLong(s.substring(left, right), 16);
            }
            i = right;
            if (i < stringLength && s.charAt(i) == '-') { 
                i--;
            }
        }
        return result;
    }
    public static void main(String[] args) { 
        int x = args.length;
        int ans = 0;
        for (int i = 0; i < x; i++) {
            ans += get_Value(args[i]);
        }
        System.out.println(ans);
    }
}
