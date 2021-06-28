
package uaspl;

public class Rekursif {
    static void DesimalToBiner(int n) {
        if (n > 1) {
            DesimalToBiner(n / 2);
        }
        System.out.print(n % 2);
    }
}