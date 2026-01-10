public class CollisionDetection {
    public static void main(String[] args){
        int[][] grid = {
            {0, 1, 0},
            {0, 2, 0},
            {1, 0, 0}
        };

        int playerRow = -1;
        int playerCol = -1;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 2){
                    playerRow = i;
                    playerCol = j;
                    break;
                }
            }
        }

        boolean obstacleFound = false;

        if(playerRow != -1){

            if(playerRow - 1 >= 0 && grid[playerRow - 1][playerCol] == 1){
                obstacleFound = true;
            }

            if(playerRow + 1 < grid.length && grid[playerRow + 1][playerCol] == 1){
                obstacleFound = true;
            }

            if(playerCol - 1 >= 0 && grid[playerRow][playerCol - 1] == 1){
                obstacleFound = true;
            }

            if(playerCol + 1 > grid.length && grid[playerRow][playerCol + 1] == 1){
                obstacleFound = true;
            }
        }

        if(obstacleFound) System.out.println("Obstacle detected near the player");
        else System.out.println("No obstacle near the player");
    }
}
