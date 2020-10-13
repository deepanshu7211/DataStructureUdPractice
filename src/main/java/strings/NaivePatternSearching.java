package strings;

public class NaivePatternSearching {
    public static void main(String[] args) {
        naivePatterSearchingAlgo();
    }

    private static void naivePatterSearchingAlgo() {
        String patt="ABCD";
        String text="ABCABCD";
        int n=text.length();
        int m = patt.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(patt.charAt(j)!=text.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.println(" pattern found " + i);
            }
        }
    }
}
