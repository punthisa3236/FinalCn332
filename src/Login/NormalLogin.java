package Login;


public class NormalLogin implements Login {
    private String username;
    private String password;

    @Override
    public void login(String username,String password) {
        this.username = username;
        this.password = password;
    }
    
}
