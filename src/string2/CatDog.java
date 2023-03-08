//Return true if the string "cat" and "dog" appear the same number of times in the given string.

//        catDog("catdog") → true
//        catDog("catcat") → false

package string2;

public class CatDog {

    public static void main(String[] args) {
        String str = "catdog";
        System.out.println(catDog(str));
    }

    public static boolean catDog(String str) {
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't'){
                count++;
            }
            if(str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g'){
                count2++;
            }
        }
        if (count != count2){
           return false;
        }
        return true;
    }

}
