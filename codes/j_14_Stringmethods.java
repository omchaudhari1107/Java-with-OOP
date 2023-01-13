public class j_14_Stringmethods {
    public static void main(String[] args) {
        String name = "Hello World!!";
        // string is unmutable
        System.out.println(name);
        System.out.println("String length " + name.length());
        System.out.println("In lower case: " + name.toLowerCase());
        System.out.println("In upper case: " + name.toUpperCase());
        System.out.println("on trim: " + name.trim());// return a string by removing non used spaces
        System.out.println("In substring: " + name.substring(6));
        System.out.println("In substring: " + name.substring(0, 5));
        System.out.println("by Replacing " + name.replace("H", "F"));// use to repcae character and return it to output
        System.out.println("by start with & return boolean " + name.startsWith("He"));
        System.out.println("by end with & return boolean " + name.endsWith("!!"));
        System.out.println("using CharAt " + name.charAt(2));// return a character at given index
        System.out.println("using Indexof " + name.indexOf("l"));// if it cant search then it retrun -1
        System.out.println("using equal " + name.equals("Hello World!!"));// compare orignal string to this string if
                                                                          // equal then return true else
                                                                          // false(Case-sensitive)
        System.out.println("using equal by ignoring case " + name.equalsIgnoreCase("hello world!!"));

        // Escape sequence character
        // \n,\t,\',\\,etc...

    }
}