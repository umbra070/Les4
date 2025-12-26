//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    //Ex1-2 variables
    static byte clientOS = 0;
    static final short clientDeviceYear = 2015;
    //Ex3 variables
    static short year = 2024;
    //Ex4 variables
    static byte daysForDelivery = 0;
    static byte deliveryDistance = 95;
    //Ex5 variables
    static byte monthNumber = 1;
    public static void main(String[] args) {
        //Ex1
        System.out.println("\n\rEx1\n\r");
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Не верные входные данные");

        }
        //Ex2
        System.out.println("\n\rEx2\n\r");
        System.out.println("\n\rEx2\n\r");
        if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }else if(clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else{
            System.out.println("Не верные входные данные");
        }
        //Ex3
        System.out.println("\n\rEx3\n\r");
        if((((year - 1584) % 4 == 0 || (year - 1584) % 400 == 0) && ((year - 1584) % 100 != 0) && year > 1584)){
            System.out.println(String.format("%d год является високосным", year));
        }else{
            System.out.println(String.format("%d год не является високосным", year));
        }
        //Ex4
        System.out.println("\n\rEx4\n\r");
        if(deliveryDistance < 20 && deliveryDistance > 0 ){
            System.out.println(String.format("Потребуется дней: %d", daysForDelivery + 1));
        }else if( deliveryDistance < 60){
            System.out.println(String.format("Потребуется дней: %d", daysForDelivery + 2));
        }else if( deliveryDistance < 100){
            System.out.println(String.format("Потребуется дней: %d", daysForDelivery + 3));
        }else if( deliveryDistance >= 100 ){
            System.out.println("Свыше 100 км доставки нет");
        }else{
            System.out.println("Не верные входные данные");
        }
        //Ex5
        System.out.println("\n\rEx5\n\r");
        System.out.println("\n\rEx5\n\r");
        switch (monthNumber){
            case(1):
                System.out.println(String.format("%d-й месяц (он же январь) принадлежит к сезону зима ", monthNumber));
                break;
            case(2):
                System.out.println(String.format("%d-й месяц (он же февраль) принадлежит к сезону зима", monthNumber));
                break;
            case(3):
                System.out.println(String.format("%d-й месяц (он же март) принадлежит к сезону весна", monthNumber));
                break;
            case(4):
                System.out.println(String.format("%d-й месяц (он же апрель) принадлежит к сезону весна", monthNumber));
                break;
            case(5):
                System.out.println(String.format("%d-й месяц (он же май) принадлежит к сезону весна", monthNumber));
                break;
            case(6):
                System.out.println(String.format("%d-й месяц (он же июнь) принадлежит к сезону лето", monthNumber));
                break;
            case(7):
                System.out.println(String.format("%d-й месяц (он же июль) принадлежит к сезону лето", monthNumber));
                break;
            case(8):
                System.out.println(String.format("%d-й месяц (он же август) принадлежит к сезону лето", monthNumber));
                break;
            case(9):
                System.out.println(String.format("%d-й месяц (он же сентябрь) принадлежит к сезону осень", monthNumber));
                break;
            case(10):
                System.out.println(String.format("%d-й месяц (он же октябрь) принадлежит к сезону осень", monthNumber));
                break;
            case(11):
                System.out.println(String.format("%d-й месяц (он же ноябрь) принадлежит к сезону осень", monthNumber));
                break;
            case(12):
                System.out.println(String.format("%d-й месяц (он же декабрь) принадлежит к сезону зима", monthNumber));
                break;
            default:
                break;
        }
    }
}