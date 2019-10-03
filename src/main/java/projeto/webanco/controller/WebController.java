package projeto.webanco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import projeto.webanco.entities.Cliente;
import projeto.webanco.repository.WebJpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WebController {

    @Autowired
    WebJpaRepository repository;

    @PostMapping(path = "postman")
    public void insert (@RequestBody Cliente request){

        repository.save(request);
    }




}
