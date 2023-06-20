package api.pojo;

/**
 * UPDATE - Request
 * {
 *     "name": "morpheus",
 *     "job": "zion resident"
 * }
 */
public class UserTime {
    private String name;
    private String job;

    public UserTime(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public UserTime() {
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}

