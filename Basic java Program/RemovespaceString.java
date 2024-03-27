
public class RemovespaceString {

    public static void main(String[] args) {
        String name = "S u bhr an su";
        NAME(name);

    }

    static void NAME(String name) {
        char convert;

        for (int i = 0; i < name.length(); i++) {
            convert = name.charAt(i);
            if (convert == ' ') {
                continue;
            } else {
                System.out.print(convert);
            }
        }
    }
}
