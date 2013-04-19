package com.myeclipseide.ws;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Produces("application/xml")
@Path("items")
public class ItemsResource {
  
	/** This is where the hibernate had to be implemented since I did not have the jars 
	 * and also since I had time constraint the below is in memory only.**/
	 private TreeMap<Integer, Item> itemMap = new TreeMap<Integer, Item>();

	  public ItemsResource() {
	    Item item = new Item();
	    item.setId(0);
	    item.setStorename("StoreName1");
	    item.setLocation("Fremont");
	    item.setCurrency("USD");
	    item.setItemdescription("Chair");
	    item.setPrice(30);	    
	    itemMap.put(0, item);
	    
	       
	  }

	@GET
	public List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();
	    items.addAll(itemMap.values());
	    return items;	}

	@GET
	@Path("{id}")
	public Item getItem(@PathParam("id") int cid) {
		return itemMap.get(cid);	}

	@POST
	@Path("create")
	@Produces("text/plain")
	@Consumes("application/xml")
	public String createItem(Item item) {
		int id = itemMap.size() + 1;
	    item.setId(id);
	    item.setStorename("Walmart"+id);
	    itemMap.put(id, item);
	    return "Item " + item.getStorename() + " added with Id " + id;

	}


	@PUT
	@Path("update")
	public Item updateItem(@PathParam("id") int cid) {
		
		//.setStorename("Different");
		Item i = new Item();	
		i=itemMap.get(cid);
		i.setStorename("UdpatedStorename3");
		//itemMap.put(cid, i);
		
		return i;
		
	}
}
