package strings;

public class StringQuestions {
    public static void main(String[] args) {
//        stringLength();
//        stringReverse();
//        stringPallindrome();
    }

    private static void stringPallindrome() {
        String str = "aaabaaa";
        char strArr[]= str.toCharArray();
        int i=0,j=strArr.length-1;
        boolean isPallindrome=true;

        while (i<j){
            if(strArr[i]!=strArr[j]){
                isPallindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(isPallindrome){
            System.out.println(" String is pallindrom ");
        }else {
            System.out.println(" String is not pallindrome");
        }
    }

    private static void stringReverse() {
        String str = "welcome";
        char strArr[]= str.toCharArray();
        int i=0,j=strArr.length-1;
        while (i<j){
            char ch = strArr[i];
            strArr[i]=strArr[j];
            strArr[j]=ch;
            i++;j--;
        }
        System.out.println(" " + String.valueOf(strArr));
    }

    private static void stringLength() {
        String str = "welcome";
        int count=0;
        for(char ch : str.toCharArray()){
            count++;
//            System.out.println(" " +ch);
        }
        System.out.println(" lenght using count " + count);
        System.out.println(" lenght using length func " + str.length());
    }
    
}
