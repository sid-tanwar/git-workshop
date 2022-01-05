public class Main {

    public static String removeChars(String s, char[] arr) {

        StringBuilder st = new StringBuilder(s);
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < st.length(); j++) {

                if (arr[i] == st.charAt(j)) {

                    st = st.deleteCharAt(j);
                }
            }
        }
        String ab = new String(st);
        return ab;
    }

    public static void main(String[] args) {
        String str = "Steve Jobs";
        char[] a = { 't', 'v' };
        System.out.println(removeChars(str, a));

    }
}