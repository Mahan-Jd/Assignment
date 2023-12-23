public class Assignment1 {

    public static void test1(String s, int x) {
        int n = s.length();
        int sh = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + x - 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && j - i + 1 >= x) {
                    if (j - i + 1 < sh) {
                        sh = j - i + 1;
                        System.out.println(s.substring(i, j + 1));
                    } else if (j - i + 1 == sh) {
                        System.out.println(s.substring(i, j + 1));
                    }
                }
            }
        }
        if (sh == Integer.MAX_VALUE) {
            System.out.println("not present");
        }
    }

    public static void main(String[] args) {
        String s = "CodeJavaCode";

        int[] u = {3, 4, 5, 6, 7, 8};

        for (int x : u) {
            System.out.println("x = " + x);
            test1(s, x);
            System.out.println();
        }
    }
}