public class Uloha1 {
    public static void main(String[] args) {
        /*
         * Změňte následující na 2, 4 nebo 5 a pozorujte rozdíly.
         * A hlavně: JE NEZAPOMEŇTE!
         */
        int kroku = 3;
        double zdibec = 1. / 50;
        double cislo = 0.;
        for (int i = 0; i < 25 * kroku; i++) {
            if ((i % kroku) == 0) {
                double ocekavam = i / 50;
                if (cislo == ocekavam) {
                    System.out.printf("==> %.0f je ok\n", cislo);
                } else {
                    System.out.printf("%20.16f != %20.16f\n", ocekavam, cislo);
                }
            }
            cislo += zdibec;
        }
    }
}
