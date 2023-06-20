package regexprob;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSolver {
    public static void main(String[] args) {
        String s = "<h1>Nayeem loves counseling</h1>";
        String s1 = "<SA premium>Imtiaz has a secret crush</SA premium>";
        String s2 = "<Amee>safat codes like a ninja</amee>";
        String s3 = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

        String regex = "<[^>]*>";
        Pattern pattern = Pattern.compile(regex);
        String[] arr = {s,s1,s2,s3};
        for(int i=0;i<arr.length;i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            if(matcher.find())
            {
                if(matcher.group(1).equals(matcher.group(3))){
                    System.out.println(matcher.group(2));
                }
            }
        }
    }
}
