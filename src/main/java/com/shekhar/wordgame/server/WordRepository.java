package com.shekhar.wordgame.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class WordRepository {

	private final static Map<String, Word> WORDS = new HashMap<String, Word>() {
		private static final long serialVersionUID = 1L;

		{
			put("rfdien", new Word("rfdien", "friend"));
			put("nealr", new Word("nealr", "learn"));
			put("leogog", new Word("leogog", "google"));
			put("hticts", new Word("hticts", "stitch"));
			put("vaaj", new Word("vaaj", "java"));
			put("graprom", new Word("graprom", "program"));
			put("saknth", new Word("saknth", "thanks"));
			put("nithk", new Word("nithk", "think"));
			put("weameso", new Word("weameso", "awesome"));
			put("nedo", new Word("nedo", "done"));
			put("welyol", new Word("welyol", "yellow"));
			put("poendint", new Word("poendint", "endpoint"));
			put("elocs", new Word("elocs", "close"));
			put("eans", new Word("eans", "sean"));
			put("tyon", new Word("tyon", "tony"));
			put("nnaa", new Word("nnaa", "anna"));
			put("kobo", new Word("kobo", "book"));
			put("tearg", new Word("tearg", "great"));
			put("fsamuo", new Word("fsamuo", "famous"));
			put("endiaclycope", new Word("endiaclycope", "encyclopedia"));
			put("veser", new Word("veser", "serve"));
			put("treaw", new Word("treaw", "water"));
			put("dwoinw", new Word("dwoinw", "window"));
			put("litgh", new Word("litgh", "light"));
			put("meag", new Word("Meag","Game"));
		}
	};

	private static final WordRepository INSTANCE = new WordRepository();

	private List<String> keys = new ArrayList<String>(WORDS.keySet());

	private Random random = new Random();

	private WordRepository() {

	}

	public static WordRepository getInstance() {
		return INSTANCE;
	}

	public Word getRandomWord() {
		return WORDS.get(keys.get(random.nextInt(keys.size())));
	}

	public Word getWord(String scrambledWord) {
		return WORDS.get(scrambledWord);
	}

}