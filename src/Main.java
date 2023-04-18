public class Main {
    public static void main(String[] args) {
        Hospital pacient1 = new Hospital("Иван",2);
        Hospital pacient2 = new Hospital("Дмитрий",3);
        Hospital pacient3 = new Hospital("Владимир",1);

        pacient1.heal();
        pacient2.heal();
        pacient3.heal();
    }
}