package day25_recap;

public class ChallengeEmer {
    /*
    if anyone wants a chalenge here is one!      Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */
    public static void main(String[] args) {
        String s = "BNNuysxyzjsdhsd";
        String firstHalf = s.substring(0, s.indexOf("xyz"));
        System.out.println(firstHalf);
        String lastHalf = s.substring(s.indexOf("xyz" )).replace("xyz","");
        System.out.println(lastHalf);
        if (firstHalf.length() - lastHalf.length() < 2 && firstHalf.length() - lastHalf.length() > -2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }}}

