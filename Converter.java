package uaspl;
public class Converter {
    public static int DecToBin(int input){
        return Integer.parseInt(Integer.toString(input, 2));
    }
    public static int DecToOct(int input){
        return Integer.parseInt(Integer.toString(input, 8));
    }
    public static String DecToHex(int input){
        return Integer.toString(input, 16).toUpperCase();
    }
    public static int BinToDec(int input){
        return Integer.parseInt(String.valueOf(input), 2);
    }
    public static int BinToOct(int input){
        return Integer.parseInt(Integer.toString(Integer.parseInt(String.valueOf(input), 2),8));
    }
    public static String BinToHex(int input){
        return Integer.toString(Integer.parseInt(String.valueOf(input), 2),16).toUpperCase();
    }
    public static int OctToDec(int input){
        return Integer.parseInt(String.valueOf(input), 8);
    }
    public static int OctToBin(int input){
        return Integer.parseInt(Integer.toString(Integer.parseInt(String.valueOf(input), 8),2));
    }
    public static String OctToHex(int input){
        return Integer.toString(Integer.parseInt(String.valueOf(input), 8),16).toUpperCase();
    }
     public static int HexToDec(String input){
        return Integer.parseInt(String.valueOf(input), 16);
    }
    public static int HexToBin(String input){
        return Integer.parseInt(Integer.toString(Integer.parseInt(input, 16),2));
    }
    public static int HexToOct(String input){
        return Integer.parseInt(Integer.toString(Integer.parseInt(input, 16),8));
    }
}
