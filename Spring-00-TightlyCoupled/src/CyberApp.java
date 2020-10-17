public class CyberApp {

    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTImeMentor partTImeMentor = new PartTImeMentor();

        Mentor mentor = new Mentor(fullTimeMentor, partTImeMentor);
        mentor.manageAccount();
    }
}
