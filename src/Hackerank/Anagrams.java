package Hackerank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	
	public static void main(String[] args) {

		String a = "anagramm";
		String b = "marganaa";
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}
	static boolean isAnagram(String a, String b) {
		boolean result = false;
		if(a.length() == b.length()) {
			
			String[] array1 = a.toLowerCase().split(",");
			String[] array2 = b.toLowerCase().split(",");
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			Map<Character, Integer> array1Map = countKeyByValue(array1);
			Map<Character, Integer> array2Map = countKeyByValue(array2);
			
			result=array1Map.equals(array2Map);
			
			
		}else {
			return result;
		}
		return result;
	}
	
	
	public static Map<Character, Integer> countKeyByValue(String[] array){
		Map<Character, Integer> finalMap = new HashMap<>();
		 
		for(String s : array) {
			
			for(int i =0;i<s.length();i++) {
				
				if(finalMap.containsKey(s.charAt(i))) {
					finalMap.put(s.charAt(i), finalMap.get(s.charAt(i))+1);
				}else {
					finalMap.put(s.charAt(i), 1);
				}
			}
			
			
		}
		
		return finalMap;
	}
	
	
	

}
