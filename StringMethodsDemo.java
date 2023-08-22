public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";

        // Concatenation
        String concatStr = str.concat(" Welcome");
        System.out.println("Concatenated String: " + concatStr);

        // Length
        int length = str.length();
        System.out.println("Length of the String: " + length);

        // Character Extraction
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        String subStr = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + subStr);

        // Searching
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);

        int lastIndex = str.lastIndexOf("l");
        System.out.println("Last index of 'l': " + lastIndex);

        // Case Conversion
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // Trimming
        String trimmed = str.trim();
        System.out.println("Trimmed String: " + trimmed);

        // Replacing
        String replaced = str.replace("Hello", "Hi");
        System.out.println("Replaced String: " + replaced);

        // Splitting
        String[] parts = str.split(", ");
        System.out.println("Split String:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Comparing
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is equal to 'Hello, World!': " + isEqual);

        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);

        boolean endsWith = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWith);

        // Formatting
        String formatted = String.format("Formatted: %s - %d", str, length);
        System.out.println(formatted);

        // Checking Emptyness
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        // Substring Search
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Regular Expressions
        boolean matches = str.matches("[A-Za-z, ]+");
        System.out.println("Matches pattern: " + matches);

        // Character Array Conversion
        char[] charArray = str.toCharArray();
        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
