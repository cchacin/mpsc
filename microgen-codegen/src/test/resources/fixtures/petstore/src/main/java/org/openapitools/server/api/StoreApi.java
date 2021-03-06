package org.openapitools.server.api;

import org.openapitools.server.model.Order;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface StoreApi {

    /**
     * Delete purchase order by ID For valid response try integer IDs with positive integer value.
     * Negative or non-integer values will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("store/order/{orderId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deleteOrder(
            @javax.ws.rs.BeanParam DeleteOrderParams params) throws javax.ws.rs.WebApplicationException;

    class DeleteOrderParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public DeleteOrderParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public DeleteOrderParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

        @javax.ws.rs.PathParam("orderId")
        @javax.validation.constraints.Min(1)
        public Long orderId;

        public DeleteOrderParams orderId(final Long orderId) {
            this.orderId = orderId;
            return this;
        }
    }

    /**
     * Returns pet inventories by status Returns a map of status codes to quantities
     *
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("store/inventory")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getInventory(
            @javax.ws.rs.BeanParam GetInventoryParams params) throws javax.ws.rs.WebApplicationException;

    class GetInventoryParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public GetInventoryParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public GetInventoryParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Find purchase order by ID For valid response try integer IDs with value &gt;&#x3D; 1 and
     * &lt;&#x3D; 10. Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("store/order/{orderId}")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getOrderById(
            @javax.ws.rs.BeanParam GetOrderByIdParams params) throws javax.ws.rs.WebApplicationException;

    class GetOrderByIdParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public GetOrderByIdParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public GetOrderByIdParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

        @javax.ws.rs.PathParam("orderId")
        @javax.validation.constraints.Min(1)
        @javax.validation.constraints.Max(10)
        public Long orderId;

        public GetOrderByIdParams orderId(final Long orderId) {
            this.orderId = orderId;
            return this;
        }
    }

    /**
     * Place an order for a pet
     *
     * @param order order placed for purchasing the pet (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("store/order")
    @javax.ws.rs.Consumes({"application/json"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> placeOrder(
            @javax.ws.rs.BeanParam PlaceOrderParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid Order order)
            throws javax.ws.rs.WebApplicationException;

    class PlaceOrderParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public PlaceOrderParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public PlaceOrderParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }
}
