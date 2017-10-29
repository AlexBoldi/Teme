/* Afiseaza numarul de zile al unei luni calendaristice, specificata ca argument. */

public class NumberOfDays {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        switch (month) {
            case 1:  System.out.println("Ianuarie are 31 de zile"); break;
            case 2:  System.out.println("Februarie are 28 de zile"); break;
            case 3:  System.out.println("Martie are 31 de zile"); break;
            case 4:  System.out.println("Aprilie are 30 de zile"); break;
            case 5:  System.out.println("Mai are 31 de zile"); break;
            case 6:  System.out.println("Iunie are 30 de zile"); break;
            case 7:  System.out.println("Iulie are 31 de zile"); break;
            case 8:  System.out.println("August are 31 de zile"); break;
            case 9:  System.out.println("Septembrie are 30 de zile"); break;
            case 10: System.out.println("Octombrie are 31 de zile"); break;
            case 11: System.out.println("Noiembrie are 30 de zile"); break;
            case 12: System.out.println("Decembrie are 31 de zile"); break;
            default: System.out.println("Nu e o luna valida!"); break;
        }
    }
}