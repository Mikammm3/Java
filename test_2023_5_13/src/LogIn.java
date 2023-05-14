public class LogIn {
    private String userName = "admin";
    private String password = "123456";

    public void loginInfo(String userName, String password) throws UserNameException, PassWordException {
        if (!this.userName.equals(userName)) {
            throw new UserNameException("用户名错误");
        }
        if (!this.password.equals(password)) {
            throw new PassWordException("密码错误");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        LogIn logIn = new LogIn();
        try {
            logIn.loginInfo("admin1", "123456");
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PassWordException e) {
            e.printStackTrace();
        }
    }
}
