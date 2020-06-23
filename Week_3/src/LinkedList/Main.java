package LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProduceManager produceManager = new ProduceManager();
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            produceManager.showMenu();
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    produceManager.addProduce();
                    break;
                case 2:
                    produceManager.editProduce();
                    break;
                case 3:
                    produceManager.deleteProduce();
                    break;
                case 4:
                    produceManager.showProduceInfo();
                    break;
                case 5:
                    produceManager.searchProduce();
                    break;
                case 6:
                    produceManager.sortProduce();
                    break;
                case 7:
            }

        } while (choise != 0);
    }
}
