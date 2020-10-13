package strings;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        leftMostNonRepeatingCharacter();
    }

    private static void leftMostNonRepeatingCharacter() {
        String str = "teststring";
//        No of character 256 - Total Number of character in ASCII table
        int hashArr[] = new int[256];
        for(int i=0;i<str.length();i++){
            hashArr[str.charAt(i)]++; // str.charAt(i) - will return integer value of character
        }

        for(int i=0;i<str.length();i++){
            if(hashArr[str.charAt(i)]==1){
//                System.out.println(" duplicate character " +i +" count " + charArr[i]);
                System.out.printf(" duplicate character %c count %d" ,str.charAt(i), hashArr[i]);
//                System.out.print((char)i);
                System.out.println();
                break;
            }
        }
    }
}
