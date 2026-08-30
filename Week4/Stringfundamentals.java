public class StringFundamentals {

static boolean hasText(String value) {
    return value != null && !value.isBlank();
}

static String normalizeCourseCode(String code) {
    if (code == null) {
        return null;
    }

    return code.trim().toUpperCase();
}

static int countOccurrences(String text, char target) {
    if (text == null) {
        return 0;
    }

    int count = 0;

    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == target) {
            count++;
        }
    }

    return count;
}

static int lengthOfLastWord(String text) {
    if (text == null) {
        return 0;
    }

    int i = text.length() - 1;

    while (i >= 0 && text.charAt(i) == ' ') {
        i--;
    }

    int length = 0;

    while (i >= 0 && text.charAt(i) != ' ') {
        length++;
        i--;
    }

    return length;
}

static void reverseString(char[] characters) {
    if (characters == null) {
        return;
    }

    int left = 0;
    int right = characters.length - 1;

    while (left < right) {
        char temp = characters[left];
        characters[left] = characters[right];
        characters[right] = temp;

        left++;
        right--;
    }
}

public static void main(String[] args) {
    System.out.println(hasText(null));
    System.out.println(hasText(""));
    System.out.println(hasText("   "));
    System.out.println(hasText("Java"));

    System.out.println(normalizeCourseCode("  cs101  "));
    System.out.println(normalizeCourseCode(null));

    System.out.println(countOccurrences("banana", 'a'));
    System.out.println(countOccurrences("", 'a'));
    System.out.println(countOccurrences(null, 'a'));

    System.out.println(lengthOfLastWord("Hello World"));
    System.out.println(lengthOfLastWord("Hello World   "));
    System.out.println(lengthOfLastWord("Java"));
    System.out.println(lengthOfLastWord(""));
    System.out.println(lengthOfLastWord(null));

    char[] chars1 = {'h', 'e', 'l', 'l', 'o'};
    reverseString(chars1);
    System.out.println(chars1);

    char[] chars2 = {'a'};
    reverseString(chars2);
    System.out.println(chars2);
}

}
