package dsa.cognizant.java;

public class DecryptMessage {

    public static void main(String[] args) {
        decrypt("abc2a345g");
    }
    public static void decrypt(String str) {

        boolean flag = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if(flag && str.charAt(i) >= 'a' && str.charAt(i) <= 'z' && str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9') {
                sb.append(str.charAt(i));
                sb.append(str.charAt(i + 1));
                i++;
                flag = false;
            }else if(!flag && str.charAt(i) >= '0' && str.charAt(i) <= '9' && str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z'){
                sb.append(str.charAt(i));
                sb.append(str.charAt(i + 1));
                i++;
                flag = true;
            }
        }
        System.out.println(sb.toString());
    }
}
