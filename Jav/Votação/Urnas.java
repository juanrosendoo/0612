import java.util.Scanner;

public class Urnas {

    Scanner sc = new Scanner(System.in);

    Candidato candidato1 =  new Candidato("Juan", 10, "Presidente");
    Candidato candidato2 =  new Candidato("Arthur", 11, "Presidente");
    Candidato candidato3 =  new Candidato("Pedro", 12, "Presidente");

    Candidato candidato4 =  new Candidato("Amanda", 20, "Governador");
    Candidato candidato5 =  new Candidato("Iara", 21, "Governador");
    Candidato candidato6 =  new Candidato("Gi", 22, "Governador");

    Candidato candidato7 =  new Candidato("Bandeira", 30, "Prefeito");
    Candidato candidato8 =  new Candidato("Davi", 31, "Prefeito");
    Candidato candidato9 =  new Candidato("PV", 32, "Prefeito");

    public void zeraVotos() {

        candidato1.zeraVotos();
        candidato2.zeraVotos();
        candidato3.zeraVotos();
        candidato4.zeraVotos();
        candidato5.zeraVotos();
        candidato6.zeraVotos();
        candidato7.zeraVotos();
        candidato8.zeraVotos();
        candidato9.zeraVotos();
    }

    public void urnaVotar(){

        int x = 1, count=1;

        while(true){
            
            switch(x){
                case 0:
                    urnaAuditoria();
                    return;
                case 1:
                    while(true){
                        System.out.println("**Eleitor" + count + "**");
                        System.out.println("Escolha o candidato a presidente com base no seu numero");
                        candidato1.imprimeCandidato();
                        candidato2.imprimeCandidato();
                        candidato3.imprimeCandidato();
                        x=sc.nextInt();
                        if(x==10){
                            candidato1.acresceVotos();
                            break;
                        }
                        else if(x==11){
                            candidato2.acresceVotos();
                            break;
                        }
                        else if(x==12){
                            candidato3.acresceVotos();
                            break;
                        }
                        else
                        {
                            System.out.println("Digite um numero valido! BURRO");
                            continue;
                        }
                    }       
                    while(true){
                        System.out.println("Escolha o candidato a governador com base no seu numero");
                        candidato4.imprimeCandidato();
                        candidato5.imprimeCandidato();
                        candidato6.imprimeCandidato();
                        x=sc.nextInt();
                        if(x==20){
                            candidato4.acresceVotos();
                            break;
                        }
                        else if(x==21){
                            candidato5.acresceVotos();
                            break;
                        }
                        else if(x==22){
                            candidato6.acresceVotos();
                            break;
                        }
                        else
                        {
                            System.out.println("Digite um numero valido! BURRO");
                            continue;
                        }
                    }       
                    while(true){
                        System.out.println("Escolha o candidato a prefeito com base no seu numero");
                        candidato7.imprimeCandidato();
                        candidato8.imprimeCandidato();
                        candidato9.imprimeCandidato();
                        x=sc.nextInt();
                        if(x==30){
                            candidato7.acresceVotos();
                            break;
                        }
                        else if(x==31){
                            candidato8.acresceVotos();
                            break;
                        }
                        else if(x==32){
                            candidato9.acresceVotos();
                            break;
                        }
                        else
                        {
                            System.out.println("Digite um numero valido! BURRO");
                            continue;
                        }
                    }       
                break;
                
                default:
                    System.out.println("Digite uma opcao valida, IDIOTA!");
                    continue;
            }
            
            System.out.println("0 - Encerrar votação");
            System.out.println("1 - Proximo eleitor");
            x = sc.nextInt();
            count+=1;
        }
    }

    public void urnaAuditoria(){

        //Presidente

        if (candidato1.votos >= candidato2.votos && candidato1.votos >= candidato3.votos) {
            System.out.println("O presidente eleito é: "  + candidato1.imprimeNome() + "!");
        }
        else if (candidato2.votos > candidato1.votos && candidato2.votos >= candidato3.votos) {
            System.out.println("O presidente eleito é: "  + candidato2.imprimeNome() + "!");
        }
        else if (candidato3.votos > candidato1.votos && candidato3.votos > candidato2.votos) {
            System.out.println("O presidente eleito é: "  + candidato3.imprimeNome() + "!");
        }
    
        //Governador

        if (candidato4.votos >= candidato5.votos && candidato4.votos >= candidato6.votos) {
            System.out.println("O governador eleito é: "  + candidato4.imprimeNome() + "!");
        }
        else if (candidato5.votos > candidato4.votos && candidato5.votos >= candidato6.votos) {
            System.out.println("O governador eleito é: "  + candidato5.imprimeNome() + "!");
        }
        else if (candidato6.votos > candidato4.votos && candidato6.votos > candidato5.votos) {
            System.out.println("O governador eleito é: "  + candidato6.imprimeNome() + "!");
        }

        //Prefeito

        if (candidato7.votos >= candidato8.votos && candidato7.votos >= candidato9.votos) {
            System.out.println("O prefeito eleito é: "  + candidato7.imprimeNome() + "!");
        }
        else if (candidato8.votos > candidato7.votos && candidato8.votos >= candidato9.votos) {
            System.out.println("O prefeito eleito é: "  + candidato8.imprimeNome() + "!");
        }
        else if (candidato9.votos > candidato7.votos && candidato9.votos > candidato8.votos) {
            System.out.println("O prefeito eleito é: "  + candidato9.imprimeNome() + "!");
        }
        
    }

}