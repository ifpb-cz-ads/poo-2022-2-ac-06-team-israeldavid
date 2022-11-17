import java.util.Scanner;
class CBBAtividadePratica6{
    public static void main(String[] args){
    
        int i;
        int cont = 0;
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for(i = 0; i<numeros.length; i++){
        System.out.println("Insira um número: ");
        int number = input.nextInt();
        numeros[i] = number;
        }
        for(int j =0; j <numeros.length;j++){
        System.out.print(numeros[j] + " ");
        if(numeros[j]>cont){
        cont = numeros[j];
        }
        }
        System.out.println("\n O maior número é: " + cont);
    }
}