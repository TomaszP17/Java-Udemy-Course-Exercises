public class cos {
    public static void main(String[] args){
        int myValue = 1000;

        byte SomethingByte = 32;
        short SomethingShort = 144;
        int SomethingInteger = 5;
        long SomethingLong = (long)(50000 + 10*(SomethingByte + SomethingShort + SomethingInteger));

        System.out.println("Answer: " + SomethingLong);

        //float and double
        float cos = 5f;
        double coss = 6d;

        double Pounds = 200;
        double Kilograms = Pounds*0.45359237;
        double Result = Kilograms;
        System.out.println(Result);
    }
}
