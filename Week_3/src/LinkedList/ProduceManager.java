package LinkedList;

import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class ProduceManager {
    Scanner scanner = new Scanner(System.in);
    List<Produce> produceList;

    public ProduceManager() {
        produceList = new LinkedList<>();
    }

    public static void showMenu() {
        System.out.printf("MENU ➤ ");
        System.out.printf(" 1.Add Produce |");
        System.out.printf(" 2.Edit produce info |");
        System.out.printf(" 3.Delete produce |");
        System.out.printf(" 4.Show produce |");
        System.out.printf(" 5.Search produce |");
        System.out.printf(" 6.Sort produce |");
        System.out.println(" 0.Exit |");
        System.out.printf("-------------------------");
        System.out.printf("--------------------------");
        System.out.printf("--------------------------");
        System.out.printf("--------------------------");
        System.out.println("-------------------------");
        System.out.printf("Choice : ");
    }

    public void addProduce() {
        System.out.printf("Enter produce ID : ");
        int idProduce = scanner.nextInt();
        System.out.printf("Enter produce name : ");
        String nameProduce = scanner.next();
        System.out.printf("Enter produce price : ");
        int priceProduce = scanner.nextInt();
        Produce produce = new Produce(idProduce, nameProduce, priceProduce);
        produceList.add(produce);
    }

    public void showProduceInfo() {
        for (Produce produce : produceList) {
            System.out.println(produce);
        }
        System.out.println();
    }

    public void deleteProduce() {
        System.out.printf("Enter id wanted delete !");
        int id = scanner.nextInt();
        Produce produce = null;
        for (int i = 0; i < produceList.size(); i++) {
            if (produceList.get(i).getId() == id) {
                produce = produceList.get(i);
                break;
            }
        }
        if (produce != null) {
            produceList.remove(produce);
        } else
            System.out.println("Produce not existed !");
    }

    public void searchProduce() {
        System.out.println("Enter produce name :");
        String name = scanner.next();
        boolean check = false;
        int i;
        for (i = 0; i < produceList.size(); i++) {
            if (name.equals(produceList.get(i).getNameProduce())) {
                System.out.println(produceList.get(i).toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Produce not existed");

        }
    }

    public void sortProduce() {
        System.out.println("1.Price ↑ 2.Price ↓");
        System.out.println("Choice : ");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                Collections.sort(produceList, ((o1, o2) -> (o1.getPrice() - o2.getPrice())));
                for (Produce produce : produceList) {
                    System.out.println(produce);
                }
                break;
            case 2:
                Collections.sort(produceList, (o1, o2) -> (o2.getPrice() - o1.getPrice()));
                for (Produce produce : produceList) {
                    System.out.println(produce);
                }
                break;
        }

    }

    public void editProduce() {
        Produce produce = null;
        boolean check = false;
        while (!check) {
            System.out.printf("Enter Id : ");
            int id = scanner.nextInt();
            for (int i = 0; i < produceList.size(); i++) {
                if (id == produceList.get(i).getId()) {
                    produce = produceList.get(i);
                    check = true;
                }
            }
            if (!check)
                System.out.println("Id wrong ! Try again ");
        }
        if (check) {
            System.out.printf("Enter produce name : ");
            String nameProduce = scanner.next();
            System.out.printf("Enter produce price : ");
            int priceProduce = scanner.nextInt();
            produce.setNameProduce(nameProduce);
            produce.setPrice(priceProduce);
        }
    }
}
