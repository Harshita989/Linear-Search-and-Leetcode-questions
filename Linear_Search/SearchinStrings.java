
public class SearchinStrings {
    public static void main(String[] args) {
        String name = "Harshita";
        char target = 's';
        boolean ans = Search(name, target);
        System.out.println(ans);
    }

    static boolean Search(String name, char target) {
        if (name.length() == 0) {
            return false;

        } else {
            for (int i = 0; i < name.length(); i++) {
                if (target == name.charAt(i)) {
                    return true;
                }
            }
            return false;
        }
    }

    static boolean Search2(String name, char target) {
        if (name.length() == 0) {
            return false;

        } else {
            for (char c : name.toCharArray()) {

                if (target == c) {
                    return true;
                }
            }
            return false;
        }
    }
}
