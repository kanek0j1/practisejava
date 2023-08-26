import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,d,totall=0;
        d=sc.nextInt();


        for(x=1;x<=7;x=x+1){
            
            if(x%d==0){
              totall=totall+x;
            }
        };
        
        System.out.println(totall);
        sc.close();

    }
}
