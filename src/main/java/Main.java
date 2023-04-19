import ru.netology.services.ServiceCount;

public class Main {
    public static void main(String[] args) {
ServiceCount serviceCount= new ServiceCount();
int count = serviceCount.calculate(100_000,60_000, 150_000);
System.out.println(count);
    }
}
