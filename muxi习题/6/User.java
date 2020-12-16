public class User {
    private int ID;
    private String password;
    private String email;

    public User(int ID,String password,String email)
    {
        this.setID(ID);
        this.setPassword(password);
    }

    private void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    private void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    private void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public static void main(String[] args){
        User u1 = new User(123,"123","123@gameschool.com");
        System.out.println("用户 ID:"+u1.getID());
        System.out.println("用户密码:"+u1.password);
        System.out.println("email地址:"+u1.email);
    }
}
