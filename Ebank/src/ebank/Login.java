package ebank;

public class Login {

    public static void Login(Ebank e) {
        String accountNumber;
        String password;
        String captcha = e.generateCaptcha();
        String inputCaptcha;
        String checkAccountNumber;
        String checkPassword;
        String checkCaptcha;

        do {
            accountNumber = Validate.getString(e.getMessages().getString("accountNumber"));
            checkAccountNumber = e.checkAccountNumber(accountNumber);
            if (!checkAccountNumber.isEmpty()) {
                System.out.println(checkAccountNumber);
            }
        } while (!checkAccountNumber.isEmpty());

        do {
            password = Validate.getString(e.getMessages().getString("password"));
            checkPassword = e.checkPassword(password);
            if (!checkPassword.isEmpty()) {
                System.out.println(checkPassword);
            }
        } while (!checkPassword.isEmpty());

        do {
            System.out.println("Captcha: " + captcha);
            inputCaptcha = Validate.getString(e.getMessages().getString("enterCaptcha"));
            checkCaptcha = e.checkCaptcha(captcha, inputCaptcha);
            if (!checkCaptcha.isEmpty()) {
                System.out.println(checkCaptcha);
            }

        } while (!checkCaptcha.isEmpty());

    }
}
