import java.util.Scanner;

public class itog4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("У вас 3 попытки. На первой попытке у вас есть 1 подсказка, после нее 2 и 3 попытки станут недоступны.");
        String answer;
        int k = 0;
        boolean pop = false;
        while(k<3){
            answer = s.nextLine();
            if(answer.equals("Подсказка")&&k==0){
                k+=10;
                System.out.println("Подсказка: 1 слово Заархивированный, у вас больше нет права на ошибку!");
                answer = s.nextLine();
                if(!answer.equals("Заархивированный вирус"))
                    pop = true;
            }else if(answer.equals("Подсказка")&&k!=0) {
                System.out.println("Подсказка уже недоступна, так что введи ответ заново и ");
                k--;
            }

            if(answer.equals("Заархивированный вирус")) {
                pop = false;
                System.out.println("Правильно!");
                break;
            }else {
                if(k<2){
                    System.out.println("Подумай еще");
                    k++;
                    pop = true;
                    }else
                        break;
                }
        }
        if(pop == true){
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}