package com.gfg.string.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramsInArray {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> resultMap = new HashMap<>();
		String[] arr = new String[] { "geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs" };
		for(String str :arr) {
			String signature = StringCommonUtils.stringSignature(str);
			ArrayList<String> arrList;
			if(resultMap.containsKey(signature)) {
				arrList = resultMap.get(signature);
				arrList.add(str);
			}else {
				arrList = new ArrayList<>();
				arrList.add(str);
			}
			resultMap.put(signature, arrList);
		}
		for(Map.Entry<String, ArrayList<String>> entry: resultMap.entrySet()) {
			ArrayList<String> list = entry.getValue();
			if(list.size()>1) {
				System.out.println(list);
			}
		}
	}
}
