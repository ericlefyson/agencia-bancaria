public class AgenciaBancaria {
    private int agencyNumber;
    private ContaBancaria[] accounts;

    public AgenciaBancaria(int agencyNumber, int numberOfAccounts) {
        this.agencyNumber = agencyNumber;
        this.accounts = new ContaBancaria[numberOfAccounts];
    }

    public void addAccount(ContaBancaria account) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] == null) {
                this.accounts[i] = account;
                break;
            }
        }
    }

    public void removeAccount(int accountNumber) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] != null && this.accounts[i].getAccountNumber() == accountNumber) {
                this.accounts[i] = null;
                break;
            }
        }
    }

    public ContaBancaria getAccount(int accountNumber) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] != null && this.accounts[i].getAccountNumber() == accountNumber) {
                return this.accounts[i];
            }
        }
        return null;
    }

    public int getAgencyNumber() {
        return this.agencyNumber;
    }

    public void transfer(int accountNumber1, int accountNumber2, double value) {
        ContaBancaria account1 = this.getAccount(accountNumber1);
        ContaBancaria account2 = this.getAccount(accountNumber2);

        if (account1 != null && account2 != null) {
            account1.withdraw(value);
            account2.deposit(value);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Conta(s) inválida(s)!");
        }

    }

    public void depositIntoAccount(int accountNumber, double value) {
        ContaBancaria account = this.getAccount(accountNumber);

        if (account != null) {
            account.deposit(value);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Conta inválida!");
        }
    }

    public void withdrawFromAccount(int accountNumber, double value) {
        ContaBancaria account = this.getAccount(accountNumber);

        if (account != null) {
            account.withdraw(value);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Conta inválida!");
        }
    }

}