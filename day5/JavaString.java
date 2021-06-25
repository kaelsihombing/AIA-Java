package day5;

public class JavaString {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o',' ','w','o','r','l','d'};
        System.out.println(ch);
        String s = new String(ch);
        System.out.println(s);

        //check type
        Typetester t = new Typetester();
        t.printType(ch);
        t.printType(s);
    }
}
