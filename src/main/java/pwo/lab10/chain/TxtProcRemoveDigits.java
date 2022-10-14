package pwo.lab10.chain;

public class TxtProcRemoveDigits extends TxtProc {

    public static String ACTION = "REMOVE_DIGITS";

    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {

            char[] initialText = request.text.toCharArray();
            String output = "";
            for (int i = 0; i < initialText.length; i++) {
                if (!Character.isDigit(initialText[i])) {
                    output += initialText[i];
                }
            }
            return output;
        } else {
            return next(request);
        }
    }
}
