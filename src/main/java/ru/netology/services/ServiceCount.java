package ru.netology.services;

public class ServiceCount {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {

            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
                System.out.println("месяц " + month + " Пойду отдыхать! После отдыха денег " + money);
            } else {
                money = money + income - expenses;
                System.out.println("месяц " + month + " денег " + money + " заработал " + income + " потратил " + expenses);
            }
        }
        return count;
    }
}
