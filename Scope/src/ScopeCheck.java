public class ScopeCheck {
    public int publicVar =0;
    private int privateVar =1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created: Publicvar :" + publicVar +"\t Privatevar :" + privateVar);
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}
