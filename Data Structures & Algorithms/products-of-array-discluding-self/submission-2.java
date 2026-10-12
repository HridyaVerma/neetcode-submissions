class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0)return null;
        int[]resultado=new int[nums.length];
        resultado[0]=1;
        for(int i=1;i<nums.length;i++){
            resultado[i]=resultado[i-1]*nums[i-1];
        }
        int sufijo=1;
        for(int i=resultado.length-1;i>=0;i--){
            resultado[i]=resultado[i]*sufijo;
            sufijo=sufijo*nums[i];
        }
        return resultado;
    }
}  

