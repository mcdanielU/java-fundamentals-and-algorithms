package leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {

        StringBuilder mergedString = new StringBuilder();
        StringBuilder overflow = new StringBuilder();
        StringBuilder ucheString = new StringBuilder("cdf");
        StringBuilder amaraString = new StringBuilder("a");

        if(ucheString.length() > amaraString.length())
        {
            overflow.append(ucheString.substring(amaraString.length()));
        } else if (amaraString.length() > ucheString.length()) {
            overflow.append(amaraString.substring(ucheString.length()));
        }
        for(int i=0;i<ucheString.length() && i < amaraString.length();i++)
        {
            mergedString.append(ucheString.charAt(i));
            mergedString.append(amaraString.charAt(i));
        }

        if (overflow.length() > 0)
            mergedString.append(overflow);

        System.out.println(mergedString);
    }
}
