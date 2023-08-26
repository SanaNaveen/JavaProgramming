package Backtracking;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static List<String> letterCombination(String digits) {
        LinkedList<String> output = new LinkedList<>();
        String[] strMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.length() == 0) {
            return output;
        }
        output.add("");

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (output.peek().length() == i) {
                String data = output.remove();
                for (char ch : strMap[index].toCharArray()) {
                    output.add(data + ch);
                }
            }
        }


        return output;
    }

}

public class LetterComOfPhoneNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.next();

        System.out.println(Solution.letterCombination(digits));

    }

}
