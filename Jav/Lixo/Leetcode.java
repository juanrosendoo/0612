public class Leetcode {
    public static void main(String[] args) {
     
        int[]nums=new int [5];
        int goal=2, count=0;

        nums[0]=1;
        nums[1]=0;
        nums[2]=1;
        nums[3]=0;
        nums[4]=1;

        for(int i=0; i<nums.length; i++){
            int soma=0;
            for(int j=i; j<nums.length; j++){
                soma+=nums[j];
                if(soma==goal){
                    System.out.println(j);
                    count++;
                    break;
                }
                else if(soma>goal){
                    break;
                }
            }
        }

        System.out.println(count);
    }
}