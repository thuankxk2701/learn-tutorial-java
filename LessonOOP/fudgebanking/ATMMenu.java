package fudgebanking;

public enum ATMMenu {
    Deposit("d"), Withdrawl("w"), Balance("b"),Quit("q");

    private final String choice;

    ATMMenu(String choice) {
        this.choice = choice;
    }

    public String Value() {
        return this.choice;
    }
}
