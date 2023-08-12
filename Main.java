public class Main {
    public static void main(String[] args) {
        AgenciaBancaria bancoDoBrasil = new AgenciaBancaria(001, 10);
        AgenciaBancaria caixaEconomica = new AgenciaBancaria(104, 10);
        AgenciaBancaria bradesco = new AgenciaBancaria(237, 10);

        ContaBancaria conta1 = new ContaBancaria(1, "João", 1000);
        ContaBancaria conta2 = new ContaBancaria(2, "Maria", 2000);
        ContaBancaria conta3 = new ContaBancaria(3, "José", 3000);
        ContaBancaria conta4 = new ContaBancaria(4, "Ana", 4000);
        ContaBancaria conta5 = new ContaBancaria(5, "Carlos", 5000);
        ContaBancaria conta6 = new ContaBancaria(6, "Mariana", 6000);
        ContaBancaria conta7 = new ContaBancaria(7, "Pedro", 7000);
        ContaBancaria conta8 = new ContaBancaria(8, "Paula", 8000);
        ContaBancaria conta9 = new ContaBancaria(9, "Lucas", 9000);

        bancoDoBrasil.addAccount(conta1);
        bancoDoBrasil.addAccount(conta2);
        bancoDoBrasil.addAccount(conta3);

        caixaEconomica.addAccount(conta4);
        caixaEconomica.addAccount(conta5);
        caixaEconomica.addAccount(conta6);

        bradesco.addAccount(conta7);
        bradesco.addAccount(conta8);
        bradesco.addAccount(conta9);

        /* Testes de depósito */
        System.out.println("Saldo inicial da conta 1: " + conta1.getBalance());
        bancoDoBrasil.depositIntoAccount(1, 100);
        System.out.println("Saldo após depósito de 100 reais na conta 1: " + conta1.getBalance());

        System.out.println("Saldo inicial da conta 4: " + conta4.getBalance());
        caixaEconomica.depositIntoAccount(4, 300);
        System.out.println("Saldo após depósito de 300 reais na conta 4: " + conta4.getBalance());

        /* Testes de saque */
        System.out.println("Saldo inicial da conta 2: " + conta2.getBalance());
        bancoDoBrasil.withdrawFromAccount(2, 150);
        System.out.println("Saldo após saque de 150 reais na conta 2: " + conta2.getBalance());

        System.out.println("Saldo inicial da conta 5: " + conta5.getBalance());
        caixaEconomica.withdrawFromAccount(5, 350);
        System.out.println("Saldo após saque de 350 reais na conta 5: " + conta5.getBalance());

        /* Testes de transferência */
        System.out.println("Saldo inicial da conta 8: " + conta8.getBalance());
        System.out.println("Saldo inicial da conta 9: " + conta9.getBalance());
        bradesco.transfer(8, 9, 1000);
        System.out.println(
                "Saldo da conta 8 após transferência de 1000 reais da conta 8 para a conta 9: " + conta8.getBalance());
        System.out.println(
                "Saldo da conta 9 após transferência de 1000 reais da conta 8 para a conta 9: " + conta9.getBalance());

    }
}
