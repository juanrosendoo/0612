import java.util.Scanner;

public class CaracterMain{
        
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tamanhoC = 0;
        
        System.out.println("Insira o texto a ter a frequencia exibida:");
        String texto=sc.nextLine();        
        

        Caracter[] c= new Caracter[texto.length()];
        
        for(int i=0; i<texto.length(); i++){
            boolean abc=true;
            for(int j=0; j<tamanhoC; j++){
                if(texto.charAt(i)==c[j].tecla){
                    c[j].acresceAparicoes();
                    abc=false;
                    break;
                }
            }   
            if(abc==true){
                c[tamanhoC]=new Caracter(texto.charAt(i));
                c[tamanhoC].acresceAparicoes();
                tamanhoC++;
            }
        }
        
        for(int i=0; i<tamanhoC; i++){
            System.out.println(c[i].tecla+": "+c[i].exibeAparicoes());
        }
    
        sc.close();
    }
}