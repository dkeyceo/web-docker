package com.airhacks.ping.boundary;

import com.dkey.entity.SimpleCar;
import com.dkey.entity.ResponseInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Enjoy Java EE 8!";
    }
    @GET
    @Path("/entity")
    @Produces("application/json")
    public SimpleCar getCar(){
        HashMap hm = new HashMap();
        hm.put("1","Легковий");
        return new SimpleCar("XTA12121212121212","Audi","2018",hm);
    }
    @GET
    @Path("/vehicle")
    @Produces("application/json")
    public ResponseInfo getVehicle(){

        return new ResponseInfo();
    }

}
