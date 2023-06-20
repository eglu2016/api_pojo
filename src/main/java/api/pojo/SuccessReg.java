package api.pojo;

/**
 * Response
 * REGISTER - SUCCESSFUL
 */
public class SuccessReg extends Register {
    private Integer id;
    private String token;

    public SuccessReg() {
        super();
    }

    public SuccessReg(Integer id, String token) {
        super();
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}