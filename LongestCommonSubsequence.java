/**
 * Dynamic Programming of LCS problem
 * @author gerson
 *
 */
public class LongestCommonSubsequence {

	/**
	 * Return length of LCS
	 * @param x
	 * @param y
	 * @param m
	 * @param n
	 * @return
	 */
	int lcs(char[] x, char[] y, int m, int n) {
		int L[][] = new int[m+1][n+1];
		for(int i = 0; i <= m ; i++) {
			for(int j = 0; j <= n; j++) {
				if( i == 0 || j == 0) {
					L[i][j] = 0;
				} else if(x[i-1] == y[j-1]) {
					L[i][j] = L[i-1][j-1] + 1;
				} else {
					L[i][j] = max(L[i-1][j],L[i][j-1]);
				}
			}
		}
		return L[m][n];
	}

	/**
	 * Utility function to return max of two integer
	 * @param a
	 * @param b
	 * @return max of two
	 */
	int max(int a, int b) {
		return (a > b)? a: b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String S = "AGGTAB";
		String Y = "GXTXAYB";
		char[] s = S.toCharArray();
		char[] y = Y.toCharArray();
		int m = S.length();
		int n = Y.length();

		System.out.println(lcs.lcs(s, y, m, n));
	}

}
