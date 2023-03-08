//A sandwich is two pieces of bread with something in between.
// Return the string that is between the first and last appearance of "bread" in the given string,
// or return the empty string "" if there are not two pieces of bread.
//
//
//getSandwich("breadjambread") → "jam"
//getSandwich("xxbreadjambreadyy") → "jam
//getSandwich("xxbreadyy") → ""

package string2;

public class GetSandwich {

    public static String getSandwich(String str) {
        String sandwich = "";
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        if (firstBread != lastBread) {
            sandwich = str.substring(firstBread + 5, lastBread);
        }
        return sandwich;
    }

    public static void main(String[] args) {
        String sndw = "breadjambread";
        System.out.println(getSandwich(sndw));
    }
}
