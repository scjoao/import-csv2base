package dev.scjoao.service;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import dev.scjoao.model.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeArquivoService {

    public List<Produto> leArquivo() throws Exception {

        List<Produto> listaProdutos = new ArrayList<>();

        SelecaoArquivoService selecaoArquivo = new SelecaoArquivoService();
        String caminhoArquivo = selecaoArquivo.selecionaArquivo();
        FileReader arquivo = new FileReader(caminhoArquivo);

        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
        CSVReader csvReader = new CSVReaderBuilder(arquivo).withSkipLines(1).withCSVParser(parser).build();

        String[] linhaArquivo;

        while ((linhaArquivo = csvReader.readNext()) != null){

            String name = linhaArquivo[0];
            Double price = Double.parseDouble(linhaArquivo[1]);
            Integer quantity = Integer.parseInt(linhaArquivo[2]);

            Produto produto = new Produto(name, price, quantity);
            listaProdutos.add(produto);

            for (Produto p : listaProdutos){
                System.out.println(p);
            }
        }
        return listaProdutos;
    }
}
