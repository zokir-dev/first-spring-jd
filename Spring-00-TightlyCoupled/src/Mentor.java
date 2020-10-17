public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTImeMentor partTImeMentor;

    public Mentor(FullTimeMentor fullTimeMentor, PartTImeMentor partTImeMentor){
        this.fullTimeMentor = fullTimeMentor;
        this.partTImeMentor = partTImeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTImeMentor.createAcccount();
    }
}
