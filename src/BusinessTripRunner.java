import Task.BusinessTrip;

import java.util.Arrays;

public class BusinessTripRunner {
    private int numberOfDays;
    private int secondNumberOfDays;

    public static void main(String[] args) {
        BusinessTrip light = new BusinessTrip();
        light.setDailyRateEuro(140);
        light.setAccount("Light Yagami");
        light.setTransportCostEuro(53);
        light.setNumberOfDays(6);

        BusinessTrip[] arr = new BusinessTrip[5];
        arr[0] = new BusinessTrip(120, "Lind L Taylor", 40, 7);
        arr[1] = new BusinessTrip(128, "Lind L Taylor", 88, 9);
        arr[2] = null;
        arr[3] = new BusinessTrip(70, "Lind L Taylor", 36, 3);
        arr[4] = light;
        BusinessTrip maxPrice = new BusinessTrip();


        for (BusinessTrip bt : arr) {
            if (bt != null) {
                bt.show();
                if (bt.getTotal() > maxPrice.getTotal()) {
                    maxPrice = bt;
                }
            }

        }
        System.out.println("Max price trip:");
        maxPrice.show();

        Arrays.stream(arr).forEach(System.out::println);
        arr[arr.length - 1].setTransportCostEuro(82);
        System.out.println(arr[4]);
        int result = Arrays.stream(arr).filter(b -> b.getAccount().equals("Lind L Taylor"))
                .limit(2).mapToInt(b -> b.getNumberOfDays()).sum();
        System.out.println(result);
    }

}