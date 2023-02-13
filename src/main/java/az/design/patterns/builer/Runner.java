package az.design.patterns.builer;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        User user = User.builder()
                .name("John")
                .lastname("Wick")
                .birthDate(LocalDate.now())
                .build();
        System.out.println(user);
    }
}
