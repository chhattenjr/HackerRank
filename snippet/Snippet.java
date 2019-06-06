package snippet;

public class Snippet {
	public static void main(String[] args) {
		if(n > 0 && n <= 100) {
					for(int i = 0; i < n; i++) {
						for(int j = 0; j < (n-1) - i; j++) {
							System.out.print(" ");
						}
						for(int j = 0; j <= i; j++) {
							System.out.print("#");
						}
						System.out.println();
					}
					System.out.println();
				}
	}
}

