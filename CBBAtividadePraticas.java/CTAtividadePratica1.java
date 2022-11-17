class CTAtividadePratica1{
    public static void main(String[] args){
    
        double[] notas = {100,70,50,45,67.8,100,98,55,67};
        double soma = 0;
        int acima = 0;
        int abaixo = 0;
        for(int i = 0; i<notas.length; i++){
            System.out.println("nota " + notas[i]);
            soma += notas[i];
        }
        double media = soma/10;
        System.out.println("A Média é " + media);
        for(int j = 0; j<notas.length; j++){
            if(notas[j]>media){
                acima ++; 
            }else{
                abaixo ++;
            }
        }
        System.out.print(acima + " Notas acima da média  e " +  abaixo + " Notas abaixo da média.");
    }
}