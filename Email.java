import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLenght = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    // constructor to receive the first name and last name

    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method for the department - return the deparment

        this.department = setDepartment();
        // System.out.println("Department: " + this.department);

        // Call a method that returns a ramdom password

        this.password = ramdomPassword(defaultPasswordLenght);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email= firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+ "."+ companySuffix;
        // System.out.println("your email is: " + email);

    }
    //  ask for deparment

    private String setDepartment(){
        System.out.print ("New worker: "+ firstName + "Department Codes:\n1 for Sales\n2 for Develoment\n3 for Accounting\n0 for none\n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        }else if(depChoice == 2){
            return "dev";
        }else if(depChoice == 3){
            return "acct";
        }else{ 
            return "";
        }
      
    }

    // generate a ramdom password
    private String ramdomPassword(int lenght){
        String passwordSet= "ABCDFGHJKLMNOPRSTUVWXYZ0123456789!@#$%";
        char [] password = new char [lenght];
        for (int i = 0; i <lenght; i ++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // set the mailbox capacity

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set the alternate email

    public void setAlternateEmail(String altEmail ){
        this.alternateEmail = altEmail;
    }


    //  change the password

    public void changePassword (String password){
        this.password = password;
    }

    // getters

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail (){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    // Display all info

    public String showinfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email+
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }


    
}