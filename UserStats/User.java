public class User {
    private String userName;
    private int UUID;
    private String status;
    private int coins;
    
    public User(String userName, int UUID, String status, int coins) {
        this.userName= userName;
        this.UUID = UUID;
        this.status = status;
        this.coins = coins;
    }
    
    public void setUserame(String userName){
         this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUUID(int UUID) {
        this.UUID = UUID;
    }
    public int getUUID() {
        return this.UUID;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
    public void setCoins(int coins) {
        this.coins = coins;
    }
    public int getCoins() {
        return this.coins;
    }
    public void printUserInfo() {
        System.out.println(getUserName());
        System.out.println(getUUID());
        System.out.println(getStatus());
        System.out.println(getCoins());
    }
}