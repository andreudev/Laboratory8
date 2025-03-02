package single.responsibility;

public class EmailService {
    public void sendEmail(String from, String to, String subject, String message) {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println(message);
        System.out.println("Regards");
    }
}