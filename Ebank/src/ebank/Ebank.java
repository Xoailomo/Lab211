/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author phank
 */
public class Ebank {

    private Locale locale;
    private ResourceBundle messages;

    public ResourceBundle getMessages() {
        return messages;
    }
    public void setLocale(Locale locale) {
        this.messages = ResourceBundle.getBundle("ebank/language", locale);

    }

    public Ebank(Locale locale) {   
        setLocale(locale);
    }

    public String checkAccountNumber(String accountName) {
        if (accountName.matches(Constant.acnum)) {
            return "";
        }
        return messages.getString("invalidAccountMessage");

    }

    public String checkPassword(String password) {
        if (password.matches(Constant.password)) {
            return "";
        }
        return messages.getString("invalidPasswordMessage");
    }
    public String generateCaptcha() {
        String character = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPSDFGHJKLZXCVBNM";
        String captcha = "";
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * character.length());
            captcha += character.charAt(index);
        }
        return captcha;
    }

    public String checkCaptcha(String captcha, String inputCaptcha) {
        if (inputCaptcha.isEmpty()) {
            return messages.getString("emptyCaptchaMessage");
        }
        if (!inputCaptcha.equals(captcha)) {
            return messages.getString("invalidCaptchaMessage");
        }
        return "";
    }

}
