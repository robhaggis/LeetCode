package easy;

public class P1672 {
	public static int maximumWealth(int[][] accounts) {
		int maxWealth = 0;
		
		for(int c = 0;c<accounts.length;c++) {
			int total = 0;
			for(int b=0;b<accounts[0].length;b++) {
				total += accounts[c][b];
			}
			maxWealth = Math.max(maxWealth, total);
		}
		return maxWealth;
	}
	
	public static void main(String[] args) {
		
		int[][] t1 = {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(t1));
	}

}
