import java.util.Arrays;

void main() {
    String[] grid = {" /", "/ "};
    System.out.println(regionsBySlashes(grid));
}

public int regionsBySlashes(String[] grid) {
    int row = grid.length, col = grid[0].length();
    int[][] matrix = new int[row * 3][col * 3];
    int region = 0;
    // Arrays.fill(matrix,0);
    Arrays.stream(matrix).forEach(a -> Arrays.fill(a, 0));
    for (int i = 0; i < row; i++)
        for (int j = 0; j < col; j++) {
            if (grid[i].charAt(j) == '/') {
                matrix[i * 3][j * 3 + 2] = 1;
                matrix[i * 3 + 1][j * 3 + 1] = 1;
                matrix[i * 3 + 2][j * 3] = 1;
            } else if (grid[i].charAt(j) == '\\') {
                matrix[i * 3][j * 3] = 1;
                matrix[i * 3 + 1][j * 3 + 1] = 1;
                matrix[i * 3 + 2][j * 3 + 2] = 1;
            }
        }
    // DFS
    for (int i = 0; i < row * 3; i++)
        for (int j = 0; j < col * 3; j++) {
            if (matrix[i][j] == 0) {
                numberOfRegionsDFS(matrix, i, j);
                region++;
            }
        }
    return region;
}

void numberOfRegionsDFS(int[][] matrix, int i, int j) {
    if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 1)
        return;
    matrix[i][j] = 1; // marked as visited
    numberOfRegionsDFS(matrix, i + 1, j);
    numberOfRegionsDFS(matrix, i - 1, j);
    numberOfRegionsDFS(matrix, i, j + 1);
    numberOfRegionsDFS(matrix, i, j - 1);
}