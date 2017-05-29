package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {
	public static int NUMBER_LETTERS = 26;
	
	private static int numberNeeded(String first, String second) {
		int [] charCount1 = getCharCounts(first);
		int [] charCount2 = getCharCounts(second);
		return getDelta(charCount1, charCount2);
	}
	private static int getDelta(int[] charCount1, int[] charCount2){
		if(charCount1.length != charCount2.length){
			return -1;
		}
		int delta = 0;
		for (int i=0; i < charCount1.length; i++){
			delta += Math.abs(charCount1[i] - charCount2[i]);
		}
		return delta;
	}
	private static int[] getCharCounts(String first) {
		int [] letters =  new int[NUMBER_LETTERS];
		for (int i=0; i < first.length(); i++){
			int index = Integer.valueOf(first.charAt(i)) - (int) 'a'; // 97 = a
			letters[index] += 1;
		}
		return letters;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first;	
		first = br.readLine();
		String second = br.readLine();
		System.out.println(numberNeeded(first, second));
	}

	
}
