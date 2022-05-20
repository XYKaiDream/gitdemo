public class D0520FZ {
    public String name;
    public double balance;
    private String password;
    
    public D0520FZ(String name, double balance, String password) {
        this.setBalance(balance);
        this.setName(name);
        this.setPassword(password);
    }
    public String info(){
        return name+"\n"+balance+"\n"+password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }
        else{
            this.name = ""+System.identityHashCode(name);
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance>=20){
            this.balance = balance;
        }
        else{
            balance = 0;
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(password.length()>=6){
            this.password = password;
        }
        else{
            password = "123456";
        }
    }
    
}