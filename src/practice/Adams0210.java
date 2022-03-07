package practice;

public class Adams0210 {

    int solution(int[]A){
        int ans = Integer.MAX_VALUE;
        //or: int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i]<ans){
                ans=A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int sss = Integer.MAX_VALUE;
        System.out.println(sss);

        System.out.println("1:");
        int[] testtt = {1,2,3,-5};
        Adams0210 adams0210 = new Adams0210();
        System.out.println(adams0210.solution(testtt));
        System.out.println("2:");
        System.out.println(adams0210.solution(new int[]{1, 2, 3, -2}));
    }
}



