package Ch1;

public class Exercise {
    public static void main(String[] args) {
        int x=0;
        while(x<4){
            System.out.print("a");
            if(x<1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x>1){
                System.out.print("oyester");
                x=x+2;
            }
            if(x==1){
                System.out.print("noys");
            }
            if(x<1){
                System.out.print("oise");
            }
            System.out.println();
            x=x+1;
        }
    }
}
