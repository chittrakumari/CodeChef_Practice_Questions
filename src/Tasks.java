import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t; i++) {
            int n=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[n];
            int s=0;
            int p=0;
            for (int j = 0; j <n; j++) {
                arr1[j]= sc.nextInt();
            }
            for (int j = 0; j <n; j++) {
                arr2[j]= sc.nextInt();
            }
            for (int j = 0; j <n; j++) {
                if(j%2==0){
                    s=s+arr1[j];
                    p=p+arr2[j];
                }
                if(j%2!=0){
                    s=s+arr2[j];
                    p=p+arr1[j];
                }
            }
            if(s>=p){
                System.out.println(p);
            }
            else{
                System.out.println(s);
            }
        }
    }
}
