package com.maweijun1028.dubbo.restful.api.provider.service.impl;


import com.maweijun1028.dubbo.restful.api.service.DemoRestService;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2018/3/5.
 */
@Path("demo")
@Service
public class DemoRestServiceImpl implements DemoRestService {



    @Override
    @GET
    @Path("test")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    public  String getDemoMethod(){
        return "demo";
    }
}
