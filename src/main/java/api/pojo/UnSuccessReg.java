package api.pojo;

public class UnSuccessReg extends Register {
    private String error;

    public UnSuccessReg() {
        super();
    }

    public UnSuccessReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}