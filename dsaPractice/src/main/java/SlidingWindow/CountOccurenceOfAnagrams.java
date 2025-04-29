package SlidingWindow;

import java.lang.reflect.Array;
import java.util.*;

public class CountOccurenceOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabaabaa";
		String sb = "aaba";

		count(s, sb);

	}
	
	

	private static void count(String s, String sb) {
		// TODO Auto-generated method stub
		int k = sb.length();
		Map<Character, Integer> ref = new HashMap<>();
		for (int i = 0; i < k; i++) {
			char c = sb.charAt(i);
			ref.put(c, ref.getOrDefault(c, 0) + 1);
		}
		int count = ref.size();
		int res = 0;
		int i = 0, j = 0;
		while (j < s.length()) { // Calculation:

			char ch = s.charAt(j);

			if (ref.containsKey(ch)) {

				ref.put(ch, ref.get(ch) - 1);

				if (ref.get(ch) == 0) {

					count--;

				}

			}

			if (j - i + 1 < k) {

				j++;

			}

			else if (j - i + 1 == k) {

				if (count == 0) {

					res++;

				}

				char ch1 = s.charAt(i);

				if (ref.containsKey(ch1)) {

					ref.put(ch1, ref.get(ch1) + 1);

					if (ref.get(ch1) == 1) {

						count++;

					}

				}

				i++;

				j++;

			}
		}

		System.out.println("Result:" + res);
	}

}
