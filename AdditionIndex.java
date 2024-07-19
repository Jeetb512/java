import java.util.Scanner;
class AdditionIndex{
    public static void main(String[] args){
        int i=0,j,k,l,n=10;
        int a[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("enter array element:");
        for(i=0;i<n;i++){
        a[i] = s.nextInt();}

        System.out.println("enter the 1st index:");
        j=s.nextInt();
        
        System.out.println("enter the 1st index:");
        l=s.nextInt();
        k=a[j]+a[l];
        System.out.println("sum of tyhe two given index value:"+k);

        /*for(i=0;i<n;i++){
            a[i] = s.nextInt();*/
    }

}