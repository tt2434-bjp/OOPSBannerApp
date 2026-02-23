/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class demonstrates displaying the "OOPS" banner using String.join()
 * instead of string concatenation, improving efficiency and readability.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  *****  "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *      "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *****   "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "      *  "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "      *  "
        ));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *    *  "
        ));

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  ****   "
        ));

    }
}