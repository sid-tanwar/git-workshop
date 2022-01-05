public class Main {

    public static String deleteChars(String s, char[] arr) {

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
        String str = "Siddharth Tanwar";
        char[] a = { 'd', 'a' };
        System.out.println(deleteChars(str, a));

    }
}