
public class SpamBlocker {
	
    public static void main(String[] args) {
       
    	System.out.print("Enter the subject line of the e-mail: ");
        String subject = IO.readString();
        System.out.println("got user input, subject = " + subject);
        subject = subject.toLowerCase();
        System.out.println("converted to lowercase, subject = " + subject);
        boolean isSpam = false;
        int makeIndex = subject.indexOf("make");
        System.out.println("makeIndex = " + makeIndex);
        int moneyIndex = subject.indexOf("money");
        System.out.println("moneyIndex = " + moneyIndex);
        int fastIndex = subject.indexOf("fast");
        System.out.println("fastIndex = " + fastIndex);
        if (makeIndex != -1  &&  moneyIndex != -1  &&  fastIndex != -1 && fastIndex > moneyIndex && moneyIndex > makeIndex) {
            System.out.println("setting isSpam to true, " +
                               "makeIndex = " + makeIndex +
                               ", moneyIndex = " + moneyIndex +
                               ", fastIndex = " + fastIndex);
            isSpam = true;
        }
        System.out.println("after if statement, isSpam = " + isSpam + ", subject = " + subject);
        if (isSpam) {
            System.out.println("identified spam, isSpam = " + isSpam + ", subject = " + subject);
            IO.outputStringAnswer("Message is spam.");
        }
        else {
            System.out.println("identified non-spam, isSpam = " + isSpam + ", subject = " + subject);
            IO.outputStringAnswer("Message is legitimate.");
        }
    }
}