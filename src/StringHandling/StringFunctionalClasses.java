package StringHandling;

public class StringFunctionalClasses {
    public static void main(String[] args) {
        String str = "GOWTHAM";
//        System.out.println(str.charAt(2)); // STRING CHARAT() WILL ACCEPT ONLY ONE PARAMETER
//        System.out.println(str.equalsIgnoreCase("gowtham")); // STRING
//         EQUALSIGNORECASE IS USED FOR NEGLECT THE UPPPERCASE AND LOWERCASE STRINGS
           String str1 = " REDDY ";
           System.out.println(str.concat(str1));
        String str2 = str.concat(str1); // CONCATING TWO STRINGS AND INSTALISNG TO str2
        System.out.println(str2.length()); // FINDING THE LENGTH OF THE STRING str2
        System.out.println(str2.replace("OWTHAM REDDY", "owtham Reddy")); // REPLACING
//        // THE STRING srt2 WITH FALLOWING STRING PARAMETERS
        String str3 = "1234564789";
        System.out.println(str3.substring(4)); // SPLITTING THE STRING
//        // INTO TWO STRINGS BY USING SUBSTRING
        System.out.println(str3.substring(2, 9));
//        System.out.println(str2.toLowerCase()); // CONVERTING THE STRING INTO LOWERCASE
//        System.out.println(str2.toUpperCase()); // CONVERTING THE STRING INTO UPPERCASE
        int num = 25;
        float fl = 37.6589f;
        char ch = 'w';
        String s1 = String.valueOf(num); // CONVERTING THE PRIMITIVE DATA TYPES INTO STRING
        String s2 = String.valueOf(fl);
        String s3 = String.valueOf(ch);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("TYPE OF NUMBER IS " + s1.getClass().getName());
//        System.out.println(str1.trim()); // TRIM THE WHITE SPACES IN THE STRING
        boolean yesOrNo = str2.contains("REDDY"); // CHECK WHETHER THE STRING str2
//        // CONTAINS THE GIVEN STRING OR NOT BY PASSING BOOLEAN EXPRESSION
        System.out.println(yesOrNo);
//        String name = "Skillbride.com";
//        String name1 = "GOWTHAM";
//        String name2 = "LILLY";
//        System.out.println(str2.endsWith("y")); // CHECKS THAT WHETHER GIVEN
//        // STRING IS ENDS WITH SUFFIX OR NOT
//        System.out.println(str2.endsWith("REDDY"));
//        System.out.println(name.endsWith("m"));
//        System.out.println(name.endsWith("com"));
//        System.out.println(name1.endsWith("M"));
//        System.out.println(name2.endsWith("Y"));
//        byte[] getBy = str2.getBytes(); // GETTING THE BYTES OF THE STRING
//        for (int i = 0; i < getBy.length; i++) {
//            System.out.println(getBy[i]);
//        }
//        System.out.println(str2.isEmpty()); // RETURNS STRING CONTAINS THE STRING OR NOT
//        String s = String.join("*","HELLO WORLD");
//        System.out.println(s);
//        String date1 = String.join("/","23","01","2020");
//        System.out.println("Date: "+date1);
//        String time1 = String.join(":", "10","59","59");
//        System.out.println("Time: "+time1);
//        System.out.println(str2.startsWith("G"));
//        System.out.println(str2.startsWith("GOWTHAM"));
//        System.out.println(str2.startsWith("R"));
//        System.out.println(str2.startsWith("REDDY"));
//        System.out.println(str.indexOf('W',3));
    }
}
