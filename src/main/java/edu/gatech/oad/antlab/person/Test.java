
public class Test {

    public static void main(String args[]) {

        System.out.println(calc("abc123"));
    }

    private static String calc(String input) {
          //Person 4 put your implementation here
        StringBuilder sb = new StringBuilder();
            int j;
            for (int i = 0; i < input.length(); i++) {
                j = (int) input.charAt(i) + 1;
                sb.append((char) j);
            }

        return sb.toString();
    }

}