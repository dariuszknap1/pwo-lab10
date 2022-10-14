package pwo.lab10.chain;

public class TxtProcUp extends TxtProc {

    public static String ACTION = "UP";

    @Override

    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {

            return request.text.toUpperCase();

        } else {
            return next(request);
        }
    }
}
