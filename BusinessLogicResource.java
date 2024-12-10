/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruas.logic.com;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author sathv
 */
public class BusinessLogicResource {

    private String id;

    /**
     * Creates a new instance of BusinessLogicResource
     */
    private BusinessLogicResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the BusinessLogicResource
     */
    public static BusinessLogicResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of BusinessLogicResource class.
        return new BusinessLogicResource(id);
    }

    /**
     * Retrieves representation of an instance of ruas.logic.com.BusinessLogicResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of BusinessLogicResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }

    /**
     * DELETE method for resource BusinessLogicResource
     */
    @DELETE
    public void delete() {
    }
}
