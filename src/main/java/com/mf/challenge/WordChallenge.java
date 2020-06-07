package com.mf.challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordChallenge
{

	public String[] findMaxWords(final String input, final int maxwordCount)
	{
		if (input == null)
		{
			return new String[] {};
		}
		final String cleanedString = input.replaceAll("'(?=s{2,})|[^\\w' ]", "").toLowerCase();


		final String[] inputArr = cleanedString.split(" ");
		// Create HashMap to store word and it's count
		final HashMap<String, Integer> unsortedMap = new HashMap<>();

		// Iterate through array of words
		for (int i = 0; i < inputArr.length; i++)
		{
			// If the  word already exists in HashMap then increase the count by 1
			final String word = inputArr[i].toLowerCase();
			if (!word.isEmpty())
			{
				if (unsortedMap.containsKey(word))
				{
					unsortedMap.put(word, unsortedMap.get(word) + 1);
				}
				// Otherwise add the word to HashMap by the the count with 1
				else
				{
					unsortedMap.put(word, 1);
				}
			}
		}


		final int size = (unsortedMap.size() < maxwordCount) ? unsortedMap.size() : maxwordCount;
		final List<String> outputList = new ArrayList<>(maxwordCount);

		unsortedMap.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(entry -> outputList.add(entry.getKey()));
		final String[] outputArray = new String[size];
		return outputList.subList(0, size).toArray(outputArray);
	}


}
