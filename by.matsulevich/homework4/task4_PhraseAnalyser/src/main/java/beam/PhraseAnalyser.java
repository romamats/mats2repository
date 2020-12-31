package beam;

public class PhraseAnalyser {
    public String analyse(String text) {
        String phrase;
        if(text.startsWith("Make") && text.endsWith("great again")) {
            phrase = "It stands no chance";
        }
        else if(text.startsWith("Make") || text.endsWith("It is fine, really")) {
            phrase = "It could be worse";
        }
        else {
        phrase = "It is fine, really";}
        return phrase;

    }
}
