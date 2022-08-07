package highlevel;

public class EndsWith {
	public static void main(String[] args) {
		char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
		char[] post = {'в', 'е', 'т'};
		char[] post2 = {'в', 'е', 'д'};
		System.out.println(endsWith(word, post));
		System.out.println(endsWith(word, post2));
	}


	public static boolean endsWith(char[] word, char[] post) {
		boolean result = true;

		for (int i = 1; i <= post.length - 1; i++) {
			int wordIndex = word.length - post.length + i;
			int postIndex = i;

			if (word[wordIndex] != post[postIndex]) {
				result = false;
			}
		}
		return result;
	}
}