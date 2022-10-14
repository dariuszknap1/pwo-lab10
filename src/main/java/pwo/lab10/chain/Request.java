package pwo.lab10.chain;

public class Request {

    public interface RequestHandler {

        String processRequest(Request request);
    }
    public final String text;
    public final String action;

    public Request(String text, String action) {
        this.text = text;
        this.action = action;
    }
}
