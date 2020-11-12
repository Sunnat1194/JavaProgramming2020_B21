package day05_Concatenation;

public class Concatention {
    public static void main(String[] args) {
        int houseNumber =3265;
        String streetName = " Niagara sq ";
        String cityName = "Pittsburgh";
        String state = "PA";
        int zipcode = 15213;
        String fullAddress = houseNumber +" "+ streetName +", "+ state +", "+ zipcode;

        System.out.println(fullAddress);

        System.out.println("============================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String collar = "Black";

        // 2010 Toyota Camry, 55000 miles,Black, $18000
        String carInfo = year+" "+brand+" " +model+" ,"+mileage+" miles, "+collar+", $"+price;
        System.out.println(carInfo);






    }




}
