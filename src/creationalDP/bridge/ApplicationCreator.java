package creationalDP.bridge;

public class ApplicationCreator {
    public static void main(String[] args) {
        Application[] applications={
                new BankSystem(new JavaDeveloper()),
                new BankSystem(new KotlinDeveloper())
        };
        for (Application application : applications){
            application.developApplication();
        }

        System.out.println("");

        Application[] applications1={
                new StockExchange(new JavaDeveloper()),
                new StockExchange(new KotlinDeveloper())
        };

        for (Application application: applications1){
            application.developApplication();
        }
    }
}
