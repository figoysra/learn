public class TipeDataNumber {
    public static void main(String[] args) {
//         -128 - 127
        byte iniByte = 127;

//         -32.768 - 32.767
        short iniShort = 1000;

//          < 2m
        int iniInt = 100000000;

//          > 2m
        long iniLong = 1000000L;

//          float
        float iniFloat = 10.10F;
        double iniDouble = 10.8;

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFF;
        int binaryDecimal = 0b101010101;

//        underscore
        long balance = 10_000_000_000L;
        int sum = 2_000_000;


    }
}
