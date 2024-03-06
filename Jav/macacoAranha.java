import java.util.Scanner;

public class macacoAranha{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o texto a ter a frequencia exibida:");
        String texto=sc.nextLine();
        
        for(int i=0; i<texto.length(); i++){
            texto.charAt(i);
        }        
    
        sc.close();
    }
}