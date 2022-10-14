package pwo.lab10.chain;

public abstract class TxtProc implements
        Request.RequestHandler {

    protected TxtProc next = null;

    public void add(TxtProc txtProc) {

        if (next == null) {
            next = txtProc;
        } else {
            next.add(txtProc);
        }
    }

    protected String next(Request request) {

        if (next != null) {
            return next.processRequest(request);
        } else {
            return null;
        }
    }
}
