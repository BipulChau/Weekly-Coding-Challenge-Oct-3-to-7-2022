public class CheckPin {
    public static void main(String[] args) {
        System.out.println(checkPin("12345"));
        System.out.println(checkPin("1234"));
        System.out.println(checkPin("123456"));
        System.out.println(checkPin("1234567"));

    }

    public static boolean checkPin(String pin){
       int stringLen = pin.length();
       if (stringLen == 4 || stringLen == 6){
           return true;
       }
       return false;
    }
}
