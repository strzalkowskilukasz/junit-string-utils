public class StringUtils {

	public boolean isValidZipCode(String zipCode) {
		if (!zipCode.contains("-")) {
			return false;
		}

		String[] numbers = zipCode.split("-");

		if (numbers.length != 2) {
			return false;
		}

		if (numbers[0].length() != 2) {
			return false;
		}

		if (numbers[1].length() != 3) {
			return false;
		}

		int counter = 0;
		for (char temp : numbers[0].toCharArray()) {
			if (temp >= '0' && temp <= '9') {
				counter++;
			}
		}
		for (char temp : numbers[1].toCharArray()) {
			if (temp >= '0' && temp <= '9') {
				counter++;
			}
		}

		if (counter != (numbers[0].toCharArray().length + numbers[1].toCharArray().length)){
			return false;
		}
			return true;
		}
		public String toUpperCase (String word){
			char[] array = word.toCharArray();

			for (int i = 0; i < array.length; i++) {
				if (array[i] >= 'a' && array[i] <= 'z') {
					array[i] = (char) (array[i] - 32);
				}
			}

			return new String(array);
		}

		public String toLowerCase (String word){
			char[] array = word.toCharArray();

			for (int i = 0; i < array.length; i++) {
				if (array[i] >= 'A' && array[i] <= 'Z') {
					array[i] = (char) (array[i] + 32);
				}
			}
			return new String(array);
		}

		public boolean isFemaleName (String name){
			return name.endsWith("a");
		}

		public String replaceSpacesWithUnderscore (String sentence){
			char[] array = sentence.toCharArray();

			for (int i = 0; i < array.length; i++) {
				if (array[i] == ' ') {
					array[i] = '_';
				}
			}

			return new String(array);
		}

		public int countWordsInSentence (String sentence){
			String[] words = sentence.split(" ");
			return words.length;
		}
	}
