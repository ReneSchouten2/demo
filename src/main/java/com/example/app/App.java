package com.example.app;

import com.example.dep.Dep;

import java.io.*;
import javax.xml.ws.*;
import javax.xml.ws.http.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

@WebServiceProvider
@ServiceMode(value = Service.Mode.PAYLOAD)
public class Server implements Provider<Source> {

    public Source invoke(Source request) {
        return  new StreamSource(new StringReader(Dep.hello("GitLab")));
    }

    public static void main(String[] args) throws InterruptedException {

        String address = "http://0.0.0.0:80/";
        Endpoint.create(HTTPBinding.HTTP_BINDING, new Server()).publish(address);

        Thread.sleep(Long.MAX_VALUE);
    }
}
