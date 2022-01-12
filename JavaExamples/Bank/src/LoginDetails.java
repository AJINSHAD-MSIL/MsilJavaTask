import java.util.HashMap;
import java.util.Scanner;

public class LoginDetails {

    //globally used variables
    private HashMap<String, String> accountdetails = new HashMap<>();
    private HashMap<String, Integer> accountoperations = new HashMap<>();
    private boolean isuserlogined;


    //account functionalities

    public void showallaccount() {
        for (String names : accountdetails.values()) {
            System.out.println(names);
        }
    }

    public void create_Account(String username, String password, Scanner scanner) {
        //local variables

        String address, name;
        char initial = 0;
        StringBuilder builder = new StringBuilder();
        accountdetails.put(password, username);
        System.out.println("Enter your address");
        name = scanner.nextLine();
        int j = 0;
        for (int i = 0; i <= name.toCharArray().length - 1; i++) {

            if (name.toCharArray()[i] == '.' || name.toCharArray()[i] == ' ') {
                initial = name.toCharArray()[i + 1];
                name = name.substring(j, i);
            }
        }

        address = String.valueOf(builder.append(name).append(" " + initial).append("\n").append(scanner.nextLine()).append("\n").append(scanner.nextLine()).append("\n").append(scanner.nextLine()));
        System.out.println("username and password are\t" + accountdetails);
        System.out.println("Enter some amount to deposit initially");
        accountoperations.put(password, scanner.nextInt());
        System.out.println("if you need a passbook then press yes");
        if (scanner.hasNext()) {
            if (scanner.next().equalsIgnoreCase("yes")) {
                sendMessage(address);
            }

        }
    }

    public void login(String username, String password, Scanner scanner) {
        for (String passwords : accountdetails.keySet()) {
            if (passwords.equalsIgnoreCase(password) && username.equalsIgnoreCase(accountdetails.get(passwords))) {
                isuserlogined = true;
                transactions_Start(scanner, passwords);
            } else {
                isuserlogined = false;
            }
        }
        if (isuserlogined) {
            System.out.println("Successfully login");
        } else {
            System.out.println("Invalid user");

        }

    }

    private void transactions_Start(Scanner scanner, String password) {
        String input;
        while (true) {
            System.out.println("1.deposit cash\n2.show Balance\n3.withdraw \nSelect any options");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                switch (input) {
                    case "1" -> deposit_Cash(password, scanner);
                    case "2" -> show_Balance(password);
                    case "3" -> withdraw(password, scanner);
                    default -> {
                        break;
                    }
                }
            } else {
                break;
            }
        }

    }

    public void default_users() {
        accountdetails.put("1", "ajin");
        accountdetails.put("2", "hithesh");
        System.out.println("current users" + accountdetails);

    }

    private void withdraw(String password, Scanner scanner) throws NullPointerException {
        int amount, balance;
        try {
            if (!accountoperations.isEmpty()) {
                System.out.println("Enter the amount you want to withdraw");
                balance = accountoperations.get(password);
                amount = scanner.nextInt();
                if (amount > balance) {
                    System.out.println("amount is exceeded the balance");
                } else {
                    accountoperations.replace(password, balance - amount);
                    System.out.println("please take the cash");
                    System.out.println("show balance then press yes else No");
                    if (scanner.hasNext()) {
                        String input = scanner.next();
                        if (input.equalsIgnoreCase("yes")) {
                            show_Balance(password);
                        } else {
                            System.out.println("thank you visit again  !!!!!!!!!!!");
                            System.exit(0);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("your account is empty");
        }

    }

    private void show_Balance(String password) {

        System.out.println("your balance is" + accountoperations.get(password));
    }

    private void deposit_Cash(String password, Scanner scanner) {
        int balance;
        if (accountoperations.isEmpty()) {
            try {
                System.out.println("its a 0 balance account");
            } catch (Exception e) {
                System.out.println(e);
                userwarning();
            }
        } else {
            balance = accountoperations.get(password);
            System.out.println("Enter the amount");
            balance = balance + scanner.nextInt();
            accountoperations.put(password, balance);
        }
    }


    private void sendMessage(String address) {
        System.out.println("the passbook will be sending to\n" + address);
    }

    private void userwarning() {
        System.out.println("your account is empty it has 0 balance");

    }

    public void search_User(String name, int password) {
        if (name.equals(accountdetails.get(String.valueOf(password)))) {
            System.out.println("account holder exist");
            if (name.hashCode() == accountdetails.get(String.valueOf(password)).hashCode()) {
                System.out.println("it has same object");
            }
        }
    }
}
