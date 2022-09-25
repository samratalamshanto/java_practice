package bank;

class Account{  //encapsulation class
    public String name;
    protected String email;
    int age;   //default--- access by all in package but denied by others outside package
    private String password;
    //need getter setter
    public void setPassword(String pass)
    {
        this.password= pass;
    }

    public String getPassword()
    {
        return this.password;
    }

}
public class Bank {
    public static void main(String args[])
    {
        Account act1 = new Account();
        //String pass = act1.getPassword();
        System.out.println();
        act1.setPassword("abc1234");
        System.out.println("pass: "+act1.getPassword());

    }
}