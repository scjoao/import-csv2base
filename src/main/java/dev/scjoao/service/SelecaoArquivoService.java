package dev.scjoao.service;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class SelecaoArquivoService {

    public String selecionaArquivo(){

        JFileChooser escolhaDeArquivo = new JFileChooser("C:\\Users\\Joao\\Documents");
        escolhaDeArquivo.setDialogTitle("Selecione o Arquivo");
        escolhaDeArquivo.setMultiSelectionEnabled(false);

        FileNameExtensionFilter filtroArquivo = new FileNameExtensionFilter("Arquivo .csv", "csv");
        escolhaDeArquivo.setAcceptAllFileFilterUsed(false);
        escolhaDeArquivo.addChoosableFileFilter(filtroArquivo);

        int respostaEscolhaDeArquivo = escolhaDeArquivo.showOpenDialog(null);

        if(respostaEscolhaDeArquivo == JFileChooser.APPROVE_OPTION){
            File arquivoSelecionado = escolhaDeArquivo.getSelectedFile();
            System.out.println("Arquivo Selecionado: " + arquivoSelecionado.getAbsolutePath());
            return arquivoSelecionado.getAbsolutePath();
        }else{
            System.out.println("Escolha de Arquivo Cancelada");
        }
        return null;
    }
}
