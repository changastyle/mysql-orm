package com.vd.mysqlorm;

import com.vd.mysqlorm.repo.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@Controller
public class MysqlOrmApplication
{

    public static ApplicationContext appContext;
    public static Environment environment;

    public static void main(String[] args)
    {
        SpringApplication.run(MysqlOrmApplication.class, args);
        System.out.println("APP ORM MYSQL CORRIENDO");

        String puertoServer = environment.getProperty("local.server.port");
        System.out.println("CORRIENDO MYSQL ORM EN http://localhost:" + puertoServer);
    }

    @GetMapping(value = "/api")
    public static RedirectView swagger()
    {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("../swagger-ui.html");

        return redirectView;
    }

    @GetMapping(value = "/")
    public static RedirectView web()
    {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("api/");

        return redirectView;
    }


    @Autowired
    public void setearEnvironment(Environment environment) {
        MysqlOrmApplication.environment = environment;
    }

    public static ApplicationContext dameAppContext() {
        return appContext;
    }



}
