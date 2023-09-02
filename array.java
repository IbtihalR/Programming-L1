//Ibtihal
package array;
public class array {
    public static void main(String[] args) {
        int[][]arr1=arrInput();
        int[][]arr2=arrRandom();
        System.out.println("the element of arr1 is=");
        print(arr1);
        System.out.println("the total of arr1 is="+sum(arr1));
         System.out.println("the total of rows of arr1 is=");sumR(arr1);
         System.out.println("the total of colums of arr1 is=");sumC(arr1);
         System.out.println("_______________________________");
         System.out.println("the element of arr2 is=");
        print(arr2);
        System.out.println("the total of arr2 is="+sum(arr2));
         System.out.println("the total of rows of arr2 is=");sumR(arr2);
         System.out.println("the total of colums of arr2 is=");sumC(arr2);
    }
    public static int sum(int[][]arr){//1
        int total=0;
        for (int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                total+=arr[row][colum];
            }
        }
        return total;
    }
    public static void sumR(int[][]arr){//1
        int total=0;
        for (int row=0;row<arr.length;row++){
            total=0;
            for(int colum=0;colum<arr[row].length;colum++){
                total+=arr[row][colum];
            }
            System.out.println("The total of row "+(row+1)+" "+total);
    }
    }
    public static void sumC(int[][] arr){//1
        int total=0;
        for (int colum=0;colum<arr[0].length;colum++){
            total=0;
            for(int row=0;row<arr.length;row++){
                total+=arr[row][colum];
            }
            System.out.println("The total of colum "+(colum+1)+" "+total);   
    }
    }
    public static int[][] arrInput(){//1
        java.util.Scanner input=new java.util.Scanner(System.in);
        int arr[][]=new int[2][3];
        System.out.println("Enter "+(arr.length * arr[0].length)+" numbers: ");
        for(int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                arr[row][colum]=input.nextInt();
            }
        }
        return arr;
    }
    public static int[][] arrRandom(){
       int arr[][]=new int[2][3];
        for(int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                arr[row][colum]=(int)(Math.random()*100);
            }
        }
        return arr; 
    }
    public static void print(int[][] arr){//1
        for (int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                System.out.print(arr[row][colum]+" ");
            }
            System.out.println();
        }
        
    }
    
}
