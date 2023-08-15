package dev.scjoao;

import dev.scjoao.service.LeArquivoService;

public class Main {
    public static void main(String[] args) throws Exception {

        LeArquivoService executa = new LeArquivoService();
        executa.leArquivo();
    }
}