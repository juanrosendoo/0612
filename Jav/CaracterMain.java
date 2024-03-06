import java.util.Scanner;

public class CaracterMain{
        
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char z;
        
        System.out.println("Insira o texto a ter a frequencia exibida:");
        String texto=sc.nextLine();        
        

        Caracter[] c= new Caracter[texto.length()];

        c[0]=new Caracter(texto.charAt(0));
        c[0].acresceAparicoes();
        
        for(int i=1; i<texto.length(); i++){
            int abc=0;
            z=texto.charAt(i);
            for(int j=0; j<i; j++){
                if(z==texto.charAt(j)){
                    abc++;
                }
            }   
            if(abc==0){
                c[i]=new Caracter(z);
                c[i].acresceAparicoes();
            }
            else{
                c[i].acresceAparicoes();
            }
        }
        
        for(int i=0; i<c.length; i++){
            System.out.println(c[i].tecla + ": " + c[i].exibeAparicoes());
        }
    
        sc.close();
    }
}