package api.pojo;

/**
 * UPDATE - Response
 * {
 *     "name": "morpheus",
 *     "job": "zion resident",
 *     "updatedAt": "2023-06-15T16:00:02.394Z"
 * }
 */
public class UserTimeResponse extends UserTime {

    private String updatedAt;

    // если не добавлять UserTimeResponse, то ошибка com.fasterxml.jackson.databind.exc.InvalidDefinitionException:
    // Cannot construct instance of `api.pojo.UserTimeResponse`
    // (no Creators, like default constructor, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
    public UserTimeResponse() {};

    public UserTimeResponse(String name, String job, String updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
