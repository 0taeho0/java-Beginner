public static int playGame() throws IOException {
		int x, y, z;
		Random rand = new Random();
		
		x = Math.abs(rand.nextInt() % 9) + 1;
		
		do {
			y = Math.abs(rand.nextInt() % 9) + 1;
		} while(y == x);
		do {
			z = Math.abs(rand.nextInt() % 9) + 1;
		}while((z == x) || (z == y));
		
		System.out.println(x + ", " + y + ", " + z);
		return playGame(x, y, z);
	}
