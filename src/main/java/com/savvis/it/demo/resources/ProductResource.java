package com.savvis.it.demo.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.savvis.it.demo.domain.CustomerProduct;
import com.savvis.it.demo.domain.DemoProduct;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiError;
import com.wordnik.swagger.annotations.ApiErrors;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * This Resource is for the Description of the Swagger Demo
 * 
 * @author stephen.womack
 */
@Path("/Product")
@Api("/Product")
public class ProductResource {

	DemoProduct demoProduct;
	CustomerProduct customerProduct;

	public ProductResource() {
		demoProduct = new DemoProduct();
		demoProduct.setId(new Integer("123"));
		demoProduct.setName("This is a DemoProduct, annotated with Jackson");
		customerProduct = new CustomerProduct();
		customerProduct.setId(new Integer("123"));
		customerProduct
				.setName("This is a CustomerProduct, annotated with XML");
	}

	/**
	 * Documentation for getDemoDescription
	 * 
	 * @return The Hello World output
	 */
	@GET
	@Path("demo")
	@Produces({ "application/json" })
	@ApiOperation(value = "Get Demo Description", notes = "This is the demo product getter", responseClass = "com.savvis.it.demo.domain.DemoProduct")
	@ApiErrors(value = { @ApiError(code = 400, reason = "Invalid GET"),
			@ApiError(code = 404, reason = "Description not found") })
	public DemoProduct getDemoDescription() {
		return demoProduct;
	}

	/**
	 * @param description
	 *            The Description to create
	 * @return Success or failure XML
	 */
	@POST
	@Path("/demo/{description}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@ApiOperation(value = "Create Demo Description", notes = "Create Hello World", responseClass = "com.savvis.it.demo.domain.DemoProduct")
	@ApiErrors(value = { @ApiError(code = 400, reason = "Invalid POST"),
			@ApiError(code = 404, reason = "Unable to create Description") })
	public DemoProduct createDemoDescription(
			@PathParam("description") String description) {
		return demoProduct;
	}

	/**
	 * @param description
	 *            The Id and new Description of the item to update
	 * @return Success or failure XML
	 */
	@PUT
	@Path("/demo/{id}/{description}")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@ApiOperation(value = "Update Demo Description", notes = "This updates demo description", responseClass = "jcom.savvis.it.demo.domain.DemoProduct")
	@ApiErrors(value = { @ApiError(code = 400, reason = "Invalid PUT"),
			@ApiError(code = 404, reason = "Unable to create Description") })
	public DemoProduct updateDemoDescription(
			@PathParam("description") String description) {
		return demoProduct;
	}

	/**
	 * Documentation for getDemoDescription
	 * 
	 * @return Customer Product Description
	 */
	@GET
	@Path("/customer")
	@Produces({ "application/json" })
	@ApiOperation(value = "Get Customer Description", notes = "This is the customer product getter", responseClass = "com.savvis.it.demo.domain.CustomerProduct")
	@ApiErrors(value = { @ApiError(code = 400, reason = "Invalid GET"),
			@ApiError(code = 404, reason = "Description not found") })
	public CustomerProduct getCustomerProductDescription() {
		return customerProduct;
	}
}