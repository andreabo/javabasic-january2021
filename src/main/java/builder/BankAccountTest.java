package builder;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccountA accountA = new BankAccountA(456L, "Marge", "Springfield", 100.00, 2.5);
        BankAccountA anotherAccountA = new BankAccountA(789L, "Homer", null, 2.5, 100.00);


        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        BankAccount anotherAccount = new BankAccount.Builder(4567L)
                .withOwner("Homer")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();


    }


}
