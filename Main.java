import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello world!");
    int tablica[] = {5,4,8,2,3,1,6,7,9};
    int tablicab[] = tablica.clone();
    for(int i=0; i<tablica.length;i++){
          System.out.print(tablicab[i]+" ");
    }

  }
}
