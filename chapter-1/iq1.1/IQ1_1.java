///usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 17+

import static java.lang.System.*;

import java.util.Set;

public class IQ1_1 {

    public static void main(String... args) {

        var stringWithUniqueChars = "abcde";
        System.out.println("String with unique characters: " + uniqueChars(stringWithUniqueChars));

        stringWithUniqueChars = "aaaasdfasdfasdf";
        System.out.println("String with unique characters: " + uniqueChars(stringWithUniqueChars));
    }

    private static boolean uniqueChars(String someString) {
        char[] stringCharacters = someString.toCharArray();
        var uniqueStringCharactersSet = Set.of(stringCharacters);
        return stringCharacters.length == uniqueStringCharactersSet.size();
    }
}
