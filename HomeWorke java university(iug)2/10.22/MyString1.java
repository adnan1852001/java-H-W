
class MyString1 {
    char[] chars;
    MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] newStringChar = new char[end-begin];
        for(int x = begin, l = 0; x < end; x++, l++)
            newStringChar[l] = chars[x];

        return new MyString1(newStringChar);
    }

    public MyString1 toLowerCase() {
        char[] newChar = new char[chars.length];
        for (char c : newChar) {
            Character.toLowerCase(c);
        }
        return new MyString1(newChar);
    }

    public boolean equals(MyString1 s) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.chars[i]) return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(Integer.toString(i).toCharArray());
    }

    public String toString() {
        return String.valueOf(chars);
    }
}

class App {
    public static void main(String[] args) {
        System.out.println(MyString1.valueOf(34275943));
    }
}