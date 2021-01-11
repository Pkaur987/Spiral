package spiral;

public class CreateSpiral extends Spiral {
	char[][] spiral;

	CreateSpiral(int n) {
		this.spiral = new char[n][n];
	}

	// saving the Spiral in a character array.
	void createSpiral(int n) {
		int count = n, dir = 4;
		int[] row = { 0, 1, 0, -1 };
		int[] column = { 1, 0, -1, 0 };
		int r = 0, c = 0;
		spiral[0][0] = '*';
		while (count > 0) {
			int temp = count - 1;
			dir = dir % 4;
			while (temp > 0) {
				r += row[dir];
				c += column[dir];
				spiral[r][c] = '*';
				temp--;
			}
			count--;
			dir++;
		}
		setSpiral(spiral);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(spiral[i][j] + " ");
			}
			System.out.println();
		}

	}

	char[][] getSpiral() {
		return spiral;
	}

	void setSpiral(char[][] spiral) {
		this.spiral = spiral;
	}

}
