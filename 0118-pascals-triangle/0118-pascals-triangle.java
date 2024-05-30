class Solution {
  public static int nCr(int row, int col){
    int res=1;
    for(int i=0;i<col;i++){
      res=res*(row-i);
      res=res/(i+1);
    }
    return res;
  }
    public List<List<Integer>> generate(int numRows) {
          List<List<Integer>> list = new ArrayList<>();
          
          for(int row = 0; row< numRows; row++){
            List<Integer> templist = new ArrayList<>();
            for(int col=0; col<=row; col++){
              templist.add(nCr(row, col));
            }
            
            list.add(templist);
            }
      
      return list;
      
    }
}