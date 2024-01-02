package shop;

import detail.Workable;

public class Client {
    private String name;
    private MoneyClient moneyClient;
    private int dollars;
    private int cent;
    private static int countClient = 0;
    private static Client[] clients = new Client[0];

    public Client(String name, int dollars, int cent) {
        this.name = name;
        this.moneyClient = new MoneyClient(dollars, cent);
        countClient++;
        setClients();
    }

    public String getName() {
        return name;
    }

    public MoneyClient getMoneyClient() {
        return moneyClient;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCent() {
        return cent;
    }

    public void goCarWithClient(Workable workable) {
        System.out.println(name + " уезжает на купленном авто");
        System.out.println("------------------------------------------------------------------");
    }

    public void setClients() {
        Client [] copyTmp = new Client[countClient];
        if (clients.length != Client.countClient) {
            for (int i = 0; i < clients.length; i++) {
                copyTmp[i] = clients[i];
            }
        }
        clients = new Client[copyTmp.length];
        for (int i = 0; i < clients.length; i++) {
            clients[i] = copyTmp[i];
        }
        clients[countClient - 1] = this;
    }

    public static Client[] getClients() {
        return clients;
    }
}
