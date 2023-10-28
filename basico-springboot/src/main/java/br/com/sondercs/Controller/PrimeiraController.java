package br.com.sondercs.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Atraves dela que eu faço a requisição dela

@RequestMapping("/primeiraController") //Rota / Recurso
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}") // Metodo & Parametro sendo criado
    public String primeiroMetodo(@PathVariable String id) {//Parametro sendo ultilizado aplicado
        return "O paramétro é " + id;//Parametro sendo ultilizado
        //http://localhost:8080/primeiraController/primeiroMetodo/(Número)
        //Para o CodeSpaces: https://vigilant-space-sniffle-4xvgprj59w4fqw5j-8080.app.github.dev/primeiraController/primeiroMetodo/(Número)
    }

    @GetMapping("metodoComQueryParams")
    public String metodoComQueryParms(@RequestParam String id){
        return "O paramétro com query params é "+id;
        //http://localhost:8080/primeiraController/metodoComQueryParams?id=123
        //Para o CodeSpaces: https://vigilant-space-sniffle-4xvgprj59w4fqw5j-8080.app.github.dev/primeiraController/metodoComQueryParams?id=123
    }
    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParms2(@RequestParam Map<String, String> allParms){
        return "O paramétro com query params é "+ allParms.entrySet();
        //http://localhost:8080/primeiraController/metodoComQueryParams2?id=123&nome=joao&idade=35
        //Para o CodeSpaces: https://vigilant-space-sniffle-4xvgprj59w4fqw5j-8080.app.github.dev/primeiraController/metodoComQueryParams2?id=123&nome=joao&idade=35

    }
}
