import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Hasta que suceción desea ir: ");
        int hasta = entrada.nextInt();
        int var_permanencia = 0;
        int count1 = 0; int count2 = 1; int temp = 0;


        while(var_permanencia < hasta){
            
            if(var_permanencia == 0){
                System.out.println(count1 + "\n" + count2);
            }else{
                temp = count2;
                count2 = count1 + count2;
                count1 = temp;
                System.out.println(count2);
            }

            var_permanencia++;

        }
    }

}