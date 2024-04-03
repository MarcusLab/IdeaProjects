public class Tasks_2_3 {

    public static void main(String[] args) {

        int totalLoot = 500; //пиастры
        int crewSize = 25; //пираты

        int ownersShare = totalLoot / 2;
        int captainsSare = (totalLoot - ownersShare) / 2;
        int commonShare = (totalLoot - ownersShare - captainsSare) / crewSize;

        int totalDistributed = ownersShare + captainsSare + commonShare * crewSize;

        System.out.println("Рядовому пирату");
        System.out.println(commonShare);
        System.out.println("Капитану");
        System.out.println(captainsSare + commonShare);
        System.out.println("Владельцу");
        System.out.println(ownersShare);
        System.out.println("ИТОГО:");
        System.out.println(totalDistributed);
        System.out.println("Осталось:");
        System.out.println(totalLoot - totalDistributed);


    }


}
