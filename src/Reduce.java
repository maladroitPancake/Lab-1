class Reduce {
	public static void main(String[] args) {
		// could be implemented in O(1) with LUT
		int i = 100;
		int res = 0;
		while (i != 0) {
			res ++;
			if (i % 2 == 0){
				i /=2;
			} else {
				i--;
			}
		}
		System.out.print(res);
	}
}
