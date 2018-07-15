import java.util.Scanner;
import java.util.regex.Pattern;

class Controller {
    Controller() {
    }

    int choiceMenu(Scanner scanner) {
        String choiceString = scanner.nextLine();
        int choiceInt;
        if (Pattern.matches("[1-6]", choiceString)) {
            choiceInt = Integer.parseInt(choiceString);
        } else {
            badDataEntered();
            choiceInt = choiceMenu(scanner);
        }
        return choiceInt;
    }

    int hireBook(Scanner scanner, Library library) {
        String bookToHire = scanner.nextLine();

        if (bookToHire.equals("back")) {
            return 0;
        }

        for (Book book : library.getBooks()) {
            if (bookToHire.equals(book.getTitle()) && book.isAvailable()) {
                book.setAvailable(false);
                return 1;
            }
        }
        return -1;
    }

    int returnBook(Scanner scanner, Library library) {
        String bookToReturn = scanner.nextLine();

        if (bookToReturn.equals("back")) {
            return 0;
        }

        for (Book book : library.getBooks()) {
            if (bookToReturn.equals(book.getTitle()) && !book.isAvailable()) {
                book.setAvailable(true);
                return 1;
            }
        }
        return -1;
    }

    private void badDataEntered() {
        System.out.println("Bad data entered try again");
    }


}
