package com.myeclipseide.ws;

import javax.persistence.Entity;
import javax.persistence.Table;



public class insertDB {

      @Entity
	    @Table(name="Item")
		public class insertItem {
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml);");
				SessionFactory sf = sf.openSession();
				Session s = s.beginTransaction();
				Transaction tx = s.beginTransaction();
				Item item = new Item();
				item.getId();
				item.getStorename();
				item.getLocation();
				item.getPrice();
				item.getItemdescription();
				item.getCurrency();
		        s.save(item);
		        s.flush();
		        tx.commit();
		        s.close();
			}
    
	@Entity
	@Table(name="Item")
	public void updateDB()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml);");
		SessionFactory sf = sf.openSession();
		Session s = s.beginTransaction();
		Transaction tx = s.beginTransaction();
		UserDetails user = (UserDetails)session.get(Item.class, id);
	    user.setStoreName("Different");
	}

}
