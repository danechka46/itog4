import java.util.Scanner;

public class itog4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("��������� �������: ����� ���, �� ��� ��� ����, ��� ��� ���������, ��� ����� ���������");
        System.out.println("� ��� 3 �������. �� ������ ������� � ��� ���� 1 ���������, ����� ��� 2 � 3 ������� ������ ����������.");
        String answer;
        int k = 0;
        boolean pop = false;
        while(k<3){
            answer = s.nextLine();
            if(answer.equals("���������")&&k==0){
                k+=10;
                System.out.println("���������: 1 ����� ����������������, � ��� ������ ��� ����� �� ������!");
                answer = s.nextLine();
                if(!answer.equals("���������������� �����"))
                    pop = true;
            }else if(answer.equals("���������")&&k!=0) {
                System.out.println("��������� ��� ����������, ��� ��� ����� ����� ������ � ");
                k--;
            }

            if(answer.equals("���������������� �����")) {
                pop = false;
                System.out.println("���������!");
                break;
            }else {
                if(k<2){
                    System.out.println("������� ���");
                    k++;
                    pop = true;
                    }else
                        break;
                }
        }
        if(pop == true){
            System.out.println("������, ������� � ������ ���");
        }
    }
}