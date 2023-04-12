package BackTracking;

public class KeypadCombinations {
    public static String generateDigitStr(int num) {
        if (num != 0 && num != 1) {
            switch (num) {
                case 2:
                    return "abc";
                case 3:
                    return "def";
                case 4:
                    return "ghi";
                case 5:
                    return "jkl";
                case 6:
                    return "mno";
                case 7:
                    return "pqrs";
                case 8:
                    return "tuv";
                case 9:
                    return "wxyz";
                default:
                    return "";
            }
        }
        return "";
    }

    public static void mapChar(char ch, String str) {
        for (int k = 0; k < str.length(); k++) {
            System.out.print(ch);
            System.out.print(str.charAt(k) + " ");
        }
    }
    
    public static void mapString(int startStr, int endStr, String[] arr) {
        for (int i = 0; i < arr[startStr].length(); i++) {
            mapChar(arr[startStr].charAt(i), arr[endStr]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "";
        String arr[] = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = generateDigitStr(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        
        for(int j=0; j<arr.length - 1; j++){
            mapString(j, j + 1, arr);
        }
    }
}
