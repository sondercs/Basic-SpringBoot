package br.com.sondercs.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired // Apartir daqui o component será gerenciado pelo Spring Boot <3

    MeuComponent meuComponent; //Bean = component

    @GetMapping("/")
    public String chamandoComponet(){

        var resultado = meuComponent.chamarMeuComponet();
        return resultado;
        //localhost:8080/component/
    }
}
