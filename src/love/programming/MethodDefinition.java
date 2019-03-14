package love.programming;

public class MethodDefinition {

    public static void main(String[] args) {

        String myString = "Kalyani";
        System.out.println(myString);

        String result;
        result = myString.toUpperCase();

        System.out.println(result);

        String myString1 = "ABCDEFGH";
        System.out.println(myString1);

        String lowercase;
        lowercase = myString1.toLowerCase();

        System.out.println(lowercase);

        String myname = "Kalyani Narapuram";
        System.out.println(myname);

        String str1 = "sachin tendulkar";
        String str2 = "amrood admin";
        String str3 = "AMROOD ADMIN";

        boolean retval1 = str2.equalsIgnoreCase(str1);
        boolean retval2 = str2.equalsIgnoreCase(str3);
        boolean retval3 = str2.equals(str3);

        System.out.println("str2 is equal to str1 = " + retval1);
        System.out.println("str2 is equal to str3 = " + retval2);
        System.out.println("str2 is equal to str3 = " + retval3);

        System.out.println(str1.length());

        System.out.println(str2.concat(str1));

        }

        }


