public class StringMethods {
    public static void main(String[] args) {
        // String Methods
        String god = "Sai Ram";
        System.out.println("God Name is - "+god);
        // Length
        System.out.println("God name length is - "+god.length());
        // Convert Lower and Upper case
        System.out.println("God name in lower case is - "+god.toLowerCase());
        System.out.println("God name in upper case is - "+god.toUpperCase());
        // Find value index position in string
        System.out.println("God name in 'a' index is - "+god.indexOf('a'));
        System.out.println("God name in 'S' index is - "+god.indexOf('S'));
        // Prints index position value in string
        System.out.println("God name in 0th index position value is - "+god.charAt(0));
        // Gives uniccode num based on provided index position character
        System.out.println("God name in 0th index position value 'S' unicode is - "+god.codePointAt(0));
        // Gives unicode num based on provided index position before characters
        System.out.println("God name in 0th index position value 'a' uniccode is - "+god.codePointBefore(1));
        // Compare two strings if equal gives 0 or else other than 0
        System.out.println(god.compareTo("Sai Ram"));
        System.out.println(god.compareTo("Sai Ram!"));
        // Compare two strings ignore case
        System.out.println(god.compareToIgnoreCase("sai ram"));
        // Concatenates the string
        System.out.println(god.concat(" Sai Karthikeyan"));
        // check whether string contains give values or not
        System.out.println(god.contains("sai"));
        System.out.println(god.contains("Sai"));
        System.out.println(god.contains("a"));
        System.out.println(god.contains(" "));
        // it makes string from characters array
        char[] data = {'H', 'E', 'L', 'L', 'O'};
        String mystr = "";
        mystr = mystr.copyValueOf(data, 0, 5);
        System.out.println("Char array length is - "+data.length);
        for (int i=0; i<data.length; i++) {
            System.out.println("Index is - "+i+" and Value is - "+data[i]);
        }
        for (char i : data) {
            System.out.println("Value is - "+i);
        }
        System.out.println(mystr);
        int[] vals = {1, 2, 3, 4, 5};
        System.out.println(vals);
        int total=0;
        for (int i : vals){
            total += i;
        }
        System.out.println("Vals total is - "+total);
        // checking endswith character
        System.out.println("God name is ends with 'm' character - "+god.endsWith("m"));
        // checking startswith character
        System.out.println("God name is starts with 'S' character - "+god.startsWith("S"));
        // checking two strings whether equal or not
        System.out.println("checking two strings are equal or not - "+god.equals("Sai Ram"));
        // checking two strings whether equal or not with ignore case
        System.out.println("checking two strings with ignore case - "+god.equalsIgnoreCase("sai ram"));
        // format string
        System.out.println("God name is - {}".format(god));
        // check whether strig is empty or not
        System.out.println("God name is empty or not - "+god.isEmpty());
        if(god.isEmpty()){
            System.out.println("God value is empty");
        } else {
            System.out.println("God value is not empty");
        }
        // to get value last index from string
        System.out.println("God name in 'a' last index position is - "+god.lastIndexOf("a"));
        // Replacing the given value
        System.out.println("God name in \"Ram\" is replacing with \"karthikeyan\" - "+god.replace("Ram", "Karthikeyan"));
        System.out.println("God name is - "+god);
        // splits the string
        System.out.println("God name is splitting - "+god.split(" "));
        // Trims the string
        System.out.println("God name is - "+"    Sai Ram     ".trim());
    }
}