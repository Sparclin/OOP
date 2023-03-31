public class MainNotif {
    public static void main(String[] args) {
        String emailPenerima = "Usman31@gmail.com";
        String nomerHp = "+623424525";
        String mobileId = "android-34243";

        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SmsNotifikasi smsNotif = new SmsNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();

        String message = "Anda siapa?";

        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
