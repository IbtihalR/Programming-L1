//Ibtihal
package book2.pkg5;

public class Book25{
    public static void main(String[] args) {
      int i=5,j=2;
      System.out.println(max(i,j)+"oo"+max2(i,j));
    
}
    public static int max(int n1,int n2){
        int max=Math.max(n2, n1);
        return max;
    }
    public static int max2(int n1,int n2){
        int max;
        if(n1>n2)max=n1;
        else max=n2;
        return max;
    }
}