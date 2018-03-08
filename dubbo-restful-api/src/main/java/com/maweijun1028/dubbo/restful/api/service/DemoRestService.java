package com.maweijun1028.dubbo.restful.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2018/3/5.
 */
@Path("demo")
public interface DemoRestService {

    @GET
    @Path("test")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    String getDemoMethod();
}
