public class Uloha1 {
    public static void main(String[] args) {
        /*
         * Změňte následující na 2, 4 nebo 5 a pozorujte rozdíly.
         * A hlavně: JE NEZAPOMEŇTE!
         */
        int n = 3;
        double m = 1. / n;
        double cislo = 0.;
        for (int i = 0; i < 25; i++) {
            if (cislo == i) {
                System.out.printf("==> %.0f je ok\n", cislo);
            } else {
                System.out.printf("%d != %20.16f\n", i, cislo);
            }
	    for (int o = 0; o < n; o++){
		    cislo += m;
	    }
        }
    }
}
