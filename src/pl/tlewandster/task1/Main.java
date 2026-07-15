package pl.tlewandster.task1;

import java.time.MonthDay;
import java.time.Year;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. Wiek i pełnoletność" + RESET_FONT_COLOR);
        verifyAge();
        System.out.println(SET_GREEN_FONT + "2. Parzystość liczby" + RESET_FONT_COLOR);
        checkNumberEvenness();
        System.out.println(SET_GREEN_FONT + "3. Kategoryzacja wieku" + RESET_FONT_COLOR);
        categorizeByAge();
        System.out.println(SET_GREEN_FONT + "4. Ocena temperatury" + RESET_FONT_COLOR);
        rateTemperature();
        System.out.println(SET_GREEN_FONT + "5. Dzień tygodnia – klasyczny" + RESET_FONT_COLOR);
        getNameOfDayClassicWay();
        System.out.println(SET_GREEN_FONT + "6. Dzień tygodnia – nowy" + RESET_FONT_COLOR);
        getNameOfDayNewWay();
        System.out.println(SET_GREEN_FONT + "7. Wiek i pełnoletność - operator trójargumentowy" + RESET_FONT_COLOR);
        verifyAgeWithTernaryOperator();
        System.out.println(SET_GREEN_FONT + "8. Stawka VAT" + RESET_FONT_COLOR);
        getVatRate();
        System.out.println(SET_GREEN_FONT + "9. Mini kalkulator" + RESET_FONT_COLOR);
        miniCalc();
        System.out.println(SET_GREEN_FONT + "10. Sprawdzenie hasła" + RESET_FONT_COLOR);
        validatePass();
        System.out.println(SET_GREEN_FONT + "11. Data - rok przestępny" + RESET_FONT_COLOR);
        checkLeapYear();
        System.out.println(SET_GREEN_FONT + "12. Data - poprawność" + RESET_FONT_COLOR);
        validateDate();
        System.out.println(SET_GREEN_FONT + "13. Gra: Kamień–Papier–Nożyce" + RESET_FONT_COLOR);
        game();
    }

    private static void verifyAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek użytkownika: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
        askRepeat(Main::verifyAge);
    }

    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Powtórzyć [t/n] ?");
        if (scanner.nextLine().equals("t")) {
            action.run();
        }
    }

    private static void checkNumberEvenness() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " to liczba parzysta");
        } else {
            System.out.println(num + " to liczba nieparzysta");
        }
        askRepeat(Main::checkNumberEvenness);
    }

    private static void categorizeByAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        if (age < 12) {
            System.out.println("Dziecko");
        } else if (age <= 17) {
            System.out.println("Nastolatek");
        } else if (age <= 64) {
            System.out.println("Dorosły");
        } else {
            System.out.println("Senior");
        }
        askRepeat(Main::categorizeByAge);
    }

    private static void rateTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w st. Celsiusza: ");
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("Mróz");
        } else if (temperature <= 15) {
            System.out.println("Chłodno");
        } else if (temperature <= 25) {
            System.out.println("Ciepło");
        } else {
            System.out.println("Gorąco");
        }
        askRepeat(Main::rateTemperature);
    }

    private static void getNameOfDayClassicWay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzień tygodnia [1-7]: ");
        int day = scanner.nextInt();
        String nameOfDay;
        switch (day) {
            case 1:
                nameOfDay = "Poniedziałek";
                break;
            case 2:
                nameOfDay = "Wtorek";
                break;
            case 3:
                nameOfDay = "Środa";
                break;
            case 4:
                nameOfDay = "Czwartek";
                break;
            case 5:
                nameOfDay = "Piątek";
                break;
            case 6:
                nameOfDay = "Sobota";
                break;
            case 7:
                nameOfDay = "Niedziela";
                break;
            default:
                nameOfDay = "Nieznany dzień";
        }
        System.out.println(nameOfDay);
        askRepeat(Main::getNameOfDayClassicWay);
    }

    private static void getNameOfDayNewWay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzień tygodnia [1-7]: ");
        int day = scanner.nextInt();
        String nameOfDay = switch (day) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nieznany dzień";
        };
        System.out.println(nameOfDay);
        askRepeat(Main::getNameOfDayNewWay);
    }

    private static void verifyAgeWithTernaryOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek użytkownika: ");
        System.out.println((scanner.nextInt() >= 18) ? "Jesteś pełnoletni" : "Nie jesteś pełnoletni");
        askRepeat(Main::verifyAgeWithTernaryOperator);
    }

    private static void getVatRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię produktu [żywność, książki, usługi, ubrania, elektronika, inne]: ");
        String category = scanner.nextLine();
        switch (category) {
            case "żywność":
            case "książki":
                System.out.println("VAT 5%");
                break;
            case "usługi":
                System.out.println("VAT 8%");
                break;
            case "ubrania":
            case "elektronika":
                System.out.println("VAT 23%");
                break;
            case "inne":
            default:
                System.out.println("Poczekaj, pójdę po szklaną kulę...");
        }
        askRepeat(Main::getVatRate);
    }

    private static void miniCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wpisz operator [+, -, *, /, %]: ");
        String operator = scanner.nextLine();
        while (!String.valueOf(operator).matches("[-+*/%]")) {
            System.out.println("Niewłaściwy operator, spróbuj ponownie: ");
            operator = scanner.nextLine();
        }
        System.out.println("Wpisz drugą liczbę: ");
        int secondNum = scanner.nextInt();
        if (operator.equals("/") && secondNum == 0) {
            System.out.println("Nie dziel przez zero!");
        } else {
            double result = switch (operator) {
                case "+" -> firstNum + secondNum;
                case "-" -> firstNum - secondNum;
                case "*" -> firstNum * secondNum;
                case "/" -> (double) firstNum / secondNum;
                case "%" -> firstNum % secondNum;
                default -> 0;
            };
            System.out.println("Wynik to " + result);
        }
        askRepeat(Main::miniCalc);
    }

    private static void validatePass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz proponowane hasło: ");
        String pass = scanner.nextLine();
        if (pass.length() < 8) {
            System.out.println("Hasło za krótkie");
        } else if (Character.isLowerCase(pass.charAt(0))) {
            System.out.println("Hasło musi zaczynać się wielką literą");
        } else {
            System.out.println("OK");
        }
        askRepeat(Main::validatePass);
    }

    private static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();
        System.out.println(year + (Year.isLeap(year) ? " to rok przestępny" : " nie jest rokiem przestępnym"));
        askRepeat(Main::checkLeapYear);
    }

    private static void validateDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz datę w formacie dd/mm/rrrr: ");
        String[] date = scanner.nextLine().split("/");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        Year year = Year.of(Integer.parseInt(date[2]));
        boolean dateIsValidate;
        try {
            dateIsValidate = year.isValidMonthDay(MonthDay.of(month, day));
            System.out.println(dateIsValidate ? "Data poprawna" : "Data niepoprawna");
        } catch (Exception e) {
            System.out.println("Błędnie wprowadzona data");
        }
        askRepeat(Main::validateDate);
    }

    private static void game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz papier, nożyce czy kamień? [p, n, k]: ");
        String playerChoice = scanner.nextLine();
        String aiChoice = List.of("p", "n", "k").get(new Random().nextInt(3));
        System.out.println("Komputer wyciągnął " + aiChoice);
        if (playerChoice.equals(aiChoice)) {
            System.out.println("Remis");
        } else if ((playerChoice.equals("p") && aiChoice.equals("k")) ||
                (playerChoice.equals("n") && aiChoice.equals("p")) ||
                (playerChoice.equals("k") && aiChoice.equals("n"))) {
            System.out.println("Wygrałeś !");
        } else {
            System.out.println("Przegrałeś !");
        }
        askRepeat(Main::game);
    }
}
