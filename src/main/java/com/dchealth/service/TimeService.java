package com.dchealth.service;

import com.dchealth.entity.YunUsers;
import com.dchealth.facade.common.BaseFacade;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
@Produces("application/json")
@Path("time")
public class TimeService {

    @Autowired
    private BaseFacade baseFacade ;

    @GET
    public Date getDate(){
        return new Date();
    }

    @GET
    @Path("users")
    public List<YunUsers> getAllUser(){
        return baseFacade.findAll(YunUsers.class);
    }
}
