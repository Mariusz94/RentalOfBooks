import java.util.Scanner;

class Menu {
    private Library library;
    private Scanner scanner;
    private Controller controller;
    private int choiceAction;

    Menu() {
        library = new Library();
        scanner = new Scanner(System.in);
        controller = new Controller();
        choiceAction = 99;

        welcome();

        while (choiceAction != 6) {
            showMenu();
            choiceAction = controller.choiceMenu(scanner);
            option();
        }

    }

    private void welcome() {
        System.out.println("Welcome to the bookstore, please choose the number from the menu");
    }

    private void farewell() {
        System.out.println("Have a nice day.");
    }

    private void showMenu() {
        spaceBar();
        System.out.println("1.Show all books in library");
        System.out.println("2.Show all available books in library");
        System.out.println("3.Show all hire books");
        System.out.println("4.Hire book");
        System.out.println("5.Give back book");
        System.out.println("6.Exit");
    }

    private void hireBook() {
        System.out.println("To borrow books, enter it's title from the list below or undo back");
        library.showAvailableBook();
        int score = controller.hireBook(scanner, library);

        if (score == 1) {
            System.out.println("The book was borrowed");
        } else if (score == -1) {
            System.out.println("The book has already been borrowed or does not exist");
            spaceBar();
            hireBook();
        }
    }

    private void returnBook() {
        System.out.println("To return book, enter it's title from the list below or undo back");
        library.showHireBook();
        int score = controller.returnBook(scanner, library);

        if (score == 1) {
            System.out.println("The book was return");
        } else if (score == -1) {
            System.out.println("Bad title or it has been rented in other library");
            spaceBar();
            returnBook();
        }
    }

    private void spaceBar() {
        System.out.println("==========================================================================================================================");
    }

    private void option() {
        switch (choiceAction) {
            case 1:
                library.showAllBooksInLibrary();
                break;
            case 2:
                library.showAvailableBook();
                break;
            case 3:
                library.showHireBook();
                break;
            case 4:
                hireBook();
                break;
            case 5:
                returnBook();
                break;
            case 6:
                farewell();
                break;
            default:
                System.out.println("The selected number is incorrect");
                choiceAction = controller.choiceMenu(scanner);
                spaceBar();
                option();
        }
    }
}
