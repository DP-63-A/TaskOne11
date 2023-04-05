package Task;

public class BusinessTrip {
    private double dailyRateEuro;
    private String account;
    private double transportCostEuro;
    private int numberOfDays;


    public BusinessTrip(double dailyRateEuro, String account, double transportCostEuro, int numberOfDays) {
        this.dailyRateEuro = dailyRateEuro;
        this.account = account;
        this.transportCostEuro = transportCostEuro;
        this.numberOfDays = numberOfDays;
    }

    public BusinessTrip() {
    }

    public double getTotal() {
        return transportCostEuro + dailyRateEuro * numberOfDays;
    }

    public void show() {
        System.out.println("dailyRateEuro=" + dailyRateEuro);
        System.out.println("account=" + account);
        System.out.println("transportCostEuro=" + transportCostEuro);
        System.out.println("numberOfDays=" + numberOfDays);
    }

    public double getDailyRateEuro() {
        return dailyRateEuro;
    }

    public void setDailyRateEuro(double dailyRateEuro) {
        this.dailyRateEuro = dailyRateEuro;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getTransportCostEuro() {
        return transportCostEuro;
    }

    public void setTransportCostEuro(double transportCostEuro) {
        this.transportCostEuro = transportCostEuro;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return account + ";" + transportCostEuro + ";" + numberOfDays + ";" + dailyRateEuro + ";" + getTotal();
    }


}