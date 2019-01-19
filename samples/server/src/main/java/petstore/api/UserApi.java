package petstore.api;

import petstore.models.User;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public interface UserApi { 

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param body Created user object (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user")
    @javax.ws.rs.Consumes({ "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> createUser(
         @javax.validation.constraints.NotNull @javax.validation.Valid User body) throws javax.ws.rs.WebApplicationException; 

    /**
     * Creates list of users with given input array
     * 
     * @param body List of user object (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithArray")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> createUsersWithArrayInput(
         @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> body) throws javax.ws.rs.WebApplicationException; 

    /**
     * Creates list of users with given input array
     * 
     * @param body List of user object (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithList")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> createUsersWithListInput(
         @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> body) throws javax.ws.rs.WebApplicationException; 

    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("user/{username}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deleteUser(
        @javax.ws.rs.PathParam("username") String username) throws javax.ws.rs.WebApplicationException; 

    /**
     * Get user by user name
     * 
     * @param username The name that needs to be fetched. Use user1 for testing.  (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Produces({ "application/xml", "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getUserByName(
        @javax.ws.rs.PathParam("username") String username) throws javax.ws.rs.WebApplicationException; 

    /**
     * Logs user into the system
     * 
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/login")
    @javax.ws.rs.Produces({ "application/xml", "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> loginUser(
        @javax.ws.rs.QueryParam("username") String username,@javax.ws.rs.QueryParam("password") String password) throws javax.ws.rs.WebApplicationException; 

    /**
     * Logs out current logged in user session
     * 
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/logout")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> logoutUser(
        ) throws javax.ws.rs.WebApplicationException; 

    /**
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be updated (required)
     * @param body Updated user object (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Consumes({ "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updateUser(
        @javax.ws.rs.PathParam("username") String username, @javax.validation.constraints.NotNull @javax.validation.Valid User body) throws javax.ws.rs.WebApplicationException; 
} 