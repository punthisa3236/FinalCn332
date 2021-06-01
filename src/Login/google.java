
package Login;

public class google implements Login {
    private String email;
    private String password;
    
    @Override
    public void login(String email,String password) {
        this.email = email;
        this.password = password;
    }
    
}
