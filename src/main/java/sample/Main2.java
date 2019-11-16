package speechrec;

public class Main2 {

	public static void main(String[] args) throws Exception {
        
        TextToSpeech speechText = new TextToSpeech();
        speechText.setFilePath();
        String greeting = speechText.greeting();
        speechText.run(greeting);
        ComputerSpeech player = new ComputerSpeech();
        player.play(speechText.returnFilePath());
        
        Record recorder = new Record();
        recorder.beginRecord(recorder);
        Translate test = new Translate();
        test.translation();
        String name = test.convertToString();
        System.out.println(name);
        
        String response = speechText.visitReason(name);
        speechText.run(response);
        ComputerSpeech player2 = new ComputerSpeech();
        player2.play(speechText.returnFilePath());

	}

}
