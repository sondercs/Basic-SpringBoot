package br.com.sondercs.ioc_di;

import org.springframework.stereotype.Service;


@Service // faz o spring identificar como irá funcionar o component
public class MeuComponent {

    public String chamarMeuComponet(){
        return "Olá, sou o component!";
    }
    
}
