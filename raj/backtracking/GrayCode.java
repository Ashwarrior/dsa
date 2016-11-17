package com.raj.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<Integer>();

		if (n == 0) {
			result.add(0);
			return result;
		}

		List<Integer> lastGray = grayCode(n - 1);
		int addOnNum = 1 << (n - 1);

		result.addAll(lastGray);

		for (int i = lastGray.size() - 1; i >= 0; i--) {
			result.add(lastGray.get(i) + addOnNum);
		}

		return result;
	}

	public static void main(String[] args) {
		GrayCode obj = new GrayCode();

		List<Integer> result = null;
		result = obj.grayCode(3);
		System.out.println(result);
	}
}