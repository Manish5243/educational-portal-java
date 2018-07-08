import java.util.regex.Pattern;

public class Account {
    private String username;
    private String password;

    Account () {
        this.username = "";
        this.password = "";
    }

    Account (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUsername(String username) {
        if (username.length() >= Constant.UserNameLong) {
            return true;
        }
        return false;
    }

    public boolean checkPassword(String password) {
        if (username.length() >= Constant.PasswordLong) {
            if (Pattern.compile("^.*[0-9].*$").matcher(password).find()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
