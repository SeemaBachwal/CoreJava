package com.processbuilder;

import java.util.Map;
import java.util.Set;

public class EnvironmentVars {

	public static void main(String[] args) {
		
		ProcessBuilder pb = new ProcessBuilder();
		Map<String, String> envMap = pb.environment();
		Set<String> envKeys = envMap.keySet();
		for (String key : envKeys) {
			System.out.println(key + " : "+envMap.get(key));
			
		}
	}
}