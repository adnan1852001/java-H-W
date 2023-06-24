import java.util.ArrayList;

class App {
    public static void main(String[] args) {
        
        for (String string : "ab#12#453".split("#")) {
            System.out.println(string);
        }

        System.out.println("--------------------------------");
        for (String s : split("a?b?gf#e", "[?#]")) {
            System.out.println(s);
        }
    }

    public static String[] split(String s, String regex) {
        String[] splited = s.split(regex);
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < splited.length; i++) {
            int f,e;
            if (i+1 == splited.length) {
                strings.add(splited[i]);
                continue;
            } else {
                f = s.indexOf(splited[i]) + splited[i].length();
                e = s.indexOf(splited[i+1]);
            }
            strings.add(splited[i]);
            strings.add(s.substring(f, e));
        }

        return strings.toArray(new String[]{});
    }
}