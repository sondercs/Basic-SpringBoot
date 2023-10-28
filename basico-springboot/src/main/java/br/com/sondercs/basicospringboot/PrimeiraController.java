package br.com.sondercs.basicospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Atraves dela que eu faço a requisição dela

@RequestMapping("/primeiraController") //Rota / Recurso
public class PrimeiraController {

    @GetMapping("/primeiroMetodo") // Metodo
    public String primeiroMetodo() {
        return "Meu primeiro metodo de api rest";
        //http://localhost:8080/primeiraController/primeiroMetodo
    }
}
