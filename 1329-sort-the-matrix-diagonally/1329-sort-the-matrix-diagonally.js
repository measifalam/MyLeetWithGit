/**
 * @param {number[][]} mat
 * @return {number[][]}
 */
const diagonalSort = (matrix) => {
    let counter = 0
    while (counter != matrix.length - 1) {
        for (let i = 0; i < matrix.length - 1; i++) {
            for (let j = 0; j < matrix[0].length - 1; j++) {
			
                if (matrix[i][j] > matrix[i + 1][j + 1]) {
                    let temp = matrix[i][j]
                    matrix[i][j] = matrix[i + 1][j + 1]
                    matrix[i + 1][j + 1] = temp
                }
				
            }
        }
        counter++
    }
    return matrix
};