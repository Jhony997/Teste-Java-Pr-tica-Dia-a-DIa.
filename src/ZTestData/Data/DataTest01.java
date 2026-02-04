package ZTestData.Data;

import java.time.LocalDate;

public class DataTest01 {
    public static void main(String[] args) {
        LocalDate ld  = LocalDate.of(2027,8,16);
        LocalDate today = LocalDate.now();
        LocalDate ldMax = LocalDate.MAX;

        System.out.println("Máximo Variável LocalDate : " + ldMax);
        System.out.println(ld);
        System.out.println(ld.getDayOfMonth());
        System.out.println(today.getDayOfMonth());
    }
}
