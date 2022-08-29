var numIslands = function(grid) {
    var nIslands = 0;
    for(var i=0;i<grid.length;i++){
        for(var j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                 nIslands += dfs(grid,i,j)
               }
        }
    }
      
    return nIslands
};

  function dfs(grid,i,j){
         if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0
            }
      
         grid[i][j]=0;
         dfs(grid,i+1,j);
         dfs(grid,i-1,j);
         dfs(grid,i,j+1);
         dfs(grid,i,j-1);
         return 1

     }