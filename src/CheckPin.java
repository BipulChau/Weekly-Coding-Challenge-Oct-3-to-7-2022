//(i)Create a function that will test if a string is a valid PIN or not via a regular expression.
//A valid PIN has:
//Exactly 4 or 6 characters
//Only numeric characters (0-9).
//No whitespace.
//Examples
//validate("121317") ➞ true
//validate("1234") ➞ true
//validate("45135") ➞ false
//validate("89abc1") ➞ false
//validate("900876") ➞ true
//validate(" 4983") ➞ false
//Notes
//Empty strings should return false when tested.


public class CheckPin {
    public static void main(String[] args) {
        System.out.println(checkPin("121317")); // true
        System.out.println(checkPin("1234")); // true
        System.out.println(checkPin("45135")); // false
        System.out.println(checkPin("89abc1")); // false
        System.out.println(checkPin("900876")); // true
        System.out.println(checkPin("4983")); // true
        System.out.println(checkPin("")); // false
    }

    public static boolean checkPin(String pin){
        String str = "0123456789";
       int stringLen = pin.length();
       if(stringLen == 0){
           return false;
       }
       for (int i = 0; i < stringLen; i++){
            if (stringLen == 4 || stringLen == 6){
               if(!str.contains(String.valueOf(pin.charAt(i)))){
                  return false;
               }
           } else {
                return false;
            }
       }
       return true;
    }
}
