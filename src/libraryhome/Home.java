package libraryhome;


// Import statements for the AdminLogForm class

public class Home {

    public static void main(String[] args) {
        // Initialize the login form for admin or librarian
        showLoginForm();
    }

    private static void showLoginForm() {
        // Create and display the login form
        AdminLogform loginForm = new AdminLogform();
        loginForm.setVisible(true);
    }
}
