package com.javanauta.lojavirtualbff.infrastructure.clients.produtosclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "produtos-api", url = "localhost:8181")
public interface ProdutosClient {

    @GetMapping("/produtos/")
    List<ProductsDTO> buscaTodosProdutos();

    @GetMapping("/produtos/{nome}")
    ProductsDTO buscaProdutoPorNome(@PathVariable ("nome") String nome);
}
