//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //если клиент пополняет счёт более чем на 1000 рублей,
        //то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

        int balance = 100;
        int replenishment = 1100;
        int bonus = 0;
        boolean isEnter = replenishment > 1000;
        if (isEnter) {
            bonus = balance + replenishment + replenishment / 100;
        } else {
            bonus = balance + replenishment;
        }

        System.out.println(bonus);
    }
}