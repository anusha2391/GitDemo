package Resources;

import java.util.ArrayList;
import java.util.List;

import POJO.Location;
import POJO.place;

public class TestdataBuild {
	
	
	public place addPlacePayLoad(String name,String language,String address)
	{
		place p=new place();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		p.setName(name);
		List<String> mylist=new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		p.setTypes(mylist);
        Location l=new Location();
		l.setlat(-38.383494);
		l.setlng(33.427362);
		p.setLocation(l);
		
		return p;
	}
    
	
	public String deletePlacePayload(String place_id)
	{
		return "{\r\n    \"place_id\":\""+place_id+"\"\r\n}";
		
		 
		
		
	}
}
