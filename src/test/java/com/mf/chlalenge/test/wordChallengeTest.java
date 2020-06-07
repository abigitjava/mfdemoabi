package com.mf.chlalenge.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.mf.challenge.WordChallenge;


public class wordChallengeTest
{
	@Test
	public void sampleTests()
	{
		final WordChallenge challenge = new WordChallenge();
		final String temp1 =
				"In a village of La Mancha, the name of which I have no desire to call to mind, there lived not long since one of those gentlemen that keep a lance"
						+
						"in the lance-rack, an old buckler, a lean hack, and a greyhound for" +
						"coursing. An olla of rather more beef than mutton, a salad on most" +
						"nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra" +
						" on Sundays, made away with three-quarters of his income.";

		final String temp2 = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";

		final String emptyText = "";

		final String temp3 = "  //wont won't won't";

		final String[] temp1Result = new String[] { "a", "of", "on" };
		final String[] temp2Result = new String[] { "e", "ddd", "aa" };
		final String[] temp3Result = new String[] { "won't", "wont" };



		assertEquals(temp1Result.length, challenge.findMaxWords(temp1, 3).length);


		assertEquals(temp2Result.length, challenge.findMaxWords(temp2, 3).length);

		assertEquals(temp3Result.length, challenge.findMaxWords(temp3, 3).length);

		assertEquals(2, challenge.findMaxWords(temp3, 2).length);
		assertEquals("won't", challenge.findMaxWords(temp3, 2)[0]);
		assertEquals(0, challenge.findMaxWords(emptyText, 2).length);

		assertEquals(0, challenge.findMaxWords(emptyText, 2).length);


	}
}
