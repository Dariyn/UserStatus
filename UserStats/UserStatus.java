public class UserStatus {
    public static void main(String[] args) {
        User User1 = new User("Darren ", 30000, "Active", 2000 );
        User1.printUserInfo();
        User1.setStatus("inactive");
    }
        
}