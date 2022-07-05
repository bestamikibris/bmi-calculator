import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        double height, index;
        int weight;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu KG Cinsinden Giriniz: ");
        weight = inp.nextInt();
        
        System.out.print("Boyunuzu MT Cinsinden Giriniz: ");
        height = inp.nextDouble();
        
        index = weight / (height * height);
        System.out.println("Vucut Kitle Indeksiniz: " + index);
    }
}