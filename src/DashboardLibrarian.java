import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class DashboardLibrarian extends JFrame {
    private JButton jButtonAddBook;
    private JButton jButtonViewBook;
    private JButton jButtonIssueBook;
    private JButton jButtonViewIssuedBook;
    private JButton jButtonReturnBook;
    private JButton jButtonLogOut;
    private JButton jButtonBack;
    private JPanel jPanel1;

    public DashboardLibrarian() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jButtonAddBook = new JButton();
        jButtonViewBook = new JButton();
        jButtonIssueBook = new JButton();
        jButtonViewIssuedBook = new JButton();
        jButtonReturnBook = new JButton();
        jButtonLogOut = new JButton();
        jButtonBack = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jButtonAddBook.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonAddBook.setText("Add Book");
        jButtonAddBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonAddBookActionPerformed(evt);
            }
        });

        jButtonViewBook.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonViewBook.setText("View Book");
        jButtonViewBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonViewBookActionPerformed(evt);
            }
        });

        jButtonIssueBook.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonIssueBook.setText("Issue Book");
        jButtonIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonIssueBookActionPerformed(evt);
            }
        });

        jButtonViewIssuedBook.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonViewIssuedBook.setText("View Issued Book");

        jButtonReturnBook.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonReturnBook.setText("Return Book");
        jButtonReturnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonReturnBookActionPerformed(evt);
            }
        });

        jButtonLogOut.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonLogOut.setText("LogOut");
        jButtonLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(jButtonViewIssuedBook, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddBook, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonViewBook, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIssueBook, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReturnBook, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(68, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jButtonLogOut)
                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBack)
                    .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jButtonAddBook)
                    .addGap(18, 18, 18)
                    .addComponent(jButtonViewBook)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(jButtonIssueBook)
                    .addGap(18, 18, 18)
                    .addComponent(jButtonViewIssuedBook)
                    .addGap(18, 18, 18)
                    .addComponent(jButtonReturnBook)
                    .addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(jButtonLogOut)
                        .addComponent(jButtonBack))
                    .addGap(20, 20, 20))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtonAddBookActionPerformed(ActionEvent evt) {
        new AddBookWindow().setVisible(true);
    }

    private void jButtonViewBookActionPerformed(ActionEvent evt) {
        new ViewBookWindow().setVisible(true);
    }

    private void jButtonIssueBookActionPerformed(ActionEvent evt) {
        new IssueBookWindow().setVisible(true);
    }

    private void jButtonReturnBookActionPerformed(ActionEvent evt) {
        new ReturnBookWindow().setVisible(true);
    }

    private void jButtonLogOutActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void jButtonBackActionPerformed(ActionEvent evt) {
        AdminLOG adminLOG = new AdminLOG ();
        adminLOG.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DashboardLibrarian.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardLibrarian().setVisible(true);
            }
        });
    }
}

class AddBookWindow extends JFrame {
    public AddBookWindow() {
        setTitle("Add Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Add Book Page");
        label.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        // Add logo image
        JLabel logo = new JLabel(new ImageIcon("C:\\Users\\Danielle.Engelbrecht\\IdeaProjects\\Library-Management-System\\src\\7706655e8ab74e88b12245260d76ec6f.png"));
        add(logo, "North");
    }
}

class ViewBookWindow extends JFrame {
    public ViewBookWindow() {
        setTitle("View Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("View Book Page");
        label.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        // Add logo image
        JLabel logo = new JLabel(new ImageIcon("C:\\Users\\Danielle.Engelbrecht\\IdeaProjects\\Library-Management-System\\src\\7706655e8ab74e88b12245260d76ec6f.png"));
        add(logo, "North");
    }
}

class IssueBookWindow extends JFrame {
    public IssueBookWindow() {
        setTitle("Issue Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Issue Book Page");
        label.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        // Add logo image
        JLabel logo = new JLabel(new ImageIcon("C:\\Users\\Danielle.Engelbrecht\\IdeaProjects\\Library-Management-System\\src\\7706655e8ab74e88b12245260d76ec6f.png"));
        add(logo, "North");
    }
}

class ReturnBookWindow extends JFrame {
    public ReturnBookWindow() {
        setTitle("Return Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Return Book Page");
        label.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        // Add logo image
        JLabel logo = new JLabel(new ImageIcon("C:\\Users\\Danielle.Engelbrecht\\IdeaProjects\\Library-Management-System\\src\\7706655e8ab74e88b12245260d76ec6f.png"));
        add(logo, "North");
    }
}
