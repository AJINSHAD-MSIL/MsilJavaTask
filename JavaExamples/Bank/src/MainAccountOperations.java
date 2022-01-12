import java.util.Scanner;

public class MainAccountOperations {

    public static void main(String[] args) {
        LoginDetails login = new LoginDetails();
        login.default_users();
        Scanner scan = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("1.create_account\n2.login\n3.show all account \n4.duplicateusers\nenter exit");
            input = scan.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                switch (input) {
                    case "1" -> {
                        System.out.println("Enter username and password");
                        login.create_Account(scan.nextLine(), scan.nextLine(),scan);
                    }
                    case "2" -> {
                        System.out.println("enter username and password");
                        login.login(scan.nextLine(), scan.nextLine(),scan);
                    }
                    case "3"->{
                        login.showallaccount();

                    }
                    case "4"->{
                        System.out.println("enter the name and id to search");
                        login.search_User(scan.nextLine(),scan.nextInt());
                    }

                    default -> {
                    }
                }
            } else {
                break;
            }
        }
        scan.close();
    }
}

