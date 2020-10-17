import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;

public class CyberApp {

    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);

        mentorAccount.manageAccount();
    }
}
