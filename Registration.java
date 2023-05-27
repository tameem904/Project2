package project02;
public class Registration{
    private String email;
    private String userName;
    private String password;
    public void steEmail(String email){
        if(email.endsWith("@yahoo.com")){
            this.email=email;
        }else{
            System.out.println("Invalid email. Please provide a Yahoo email address");
        }
    }
    public void setUserName(String userName){
        if(!userName.isEmpty() && userName.length()>6){
            this.userName=userName;
        }else{
            System.out.println("userName cannot be empty and should be of length larger than 6 characters");
        }
    }
    public void setPassword(String password){
        if(!password.isEmpty() && password.length()>6){
            if(!password.contains(userName)){
                this.password=password;
            }
            else{
                System.out.println("valid password cannot contain userName.");
            }
        }else{
            System.out.println("Valid userName and password cannot be empty and should be of length larger than 6 characters");
        }
    }
}
class RegistrationTester{
    public static void main(String[] args) {

        Registration r1 = new Registration();
        r1.steEmail("example@yahoo.com");
        r1.setUserName("username123");
        r1.setPassword("Password123");

        r1.steEmail("example@gmail.com");
        r1.setUserName("usern");
        r1.setPassword("usern");
    }
}
