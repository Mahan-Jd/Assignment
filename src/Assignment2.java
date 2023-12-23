public class Assignment2 {

    public static String test2(String s) {
        char[] mod = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);

            if (ascii % 2 == 0 && i < s.length() - 1 && mod[i + 1] != '\u0000') {
                // Increment the next character by (ASCII_value % 7)
                int newValue = mod[i + 1] + (ascii % 7);
                mod[i + 1] = (char) (newValue > 127 ? 83 : newValue);
            } else if (ascii % 2 == 1 && i > 0 && mod[i - 1] != '\u0000') {
                // Decrement the previous character by (ASCII_value % 5)
                int newValue = mod[i - 1] - (ascii % 5);
                mod[i - 1] = (char) (newValue < 0 ? 83 : newValue);
            }
        }

        return new String(mod);
    }

    public static void main(String[] args) {
        String a = "KqIpZ?";
        String b = test2(a);

        System.out.println("Original String: " + a);
        System.out.println("Modified String: " + b);
    }
}
