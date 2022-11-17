import java.util.Scanner;
class CBBAtividadePratica5{
    public static void main(String[] args){
    
        int i;
        Scanner input = new Scanner(System.in);
        String[] dias = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
        System.out.println("Insira um número de 1 a 7 correspondente a um dia na semana: ");
        int number = input.nextInt();
        for(i = 0; i<dias.length; i++){
            System.out.println(dias[number-1]);
            break;
        }
    }
}