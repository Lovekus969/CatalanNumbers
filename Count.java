public class Count {
    public static int countBst(int n) {
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
public static int mountainrange(int n){
    int dp[] = new int [n+1];
    dp[0] =1;
    dp[1] =1;
    for( int i=2; i<n+1;i++){
        //for n pair how many mountain ranges are there  = Ci

        for(int j=0; j<i; j++){
            int inside = dp[j]; 
            int outside = dp[i-j-1];
            dp[i] +=inside* outside;

        }
    }
    return dp[n];
}

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of BSTs with " + n + " nodes: " + mountainrange(n));
    }
}
