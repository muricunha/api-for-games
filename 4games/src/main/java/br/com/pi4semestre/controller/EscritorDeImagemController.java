package br.com.pi4semestre.controller;

import br.com.pi4semestre.service.EscritorDeImagemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/produto")
public class EscritorDeImagemController {

    private final EscritorDeImagemService service;

    public EscritorDeImagemController(EscritorDeImagemService service) {
        this.service = service;
    }

    @PostMapping("/salvarImagem")
    public ResponseEntity<String> salvarImagem(@RequestParam("imagem") MultipartFile imagem) {
        String caminhoImagem = service.salvarImagem(imagem);
        return ResponseEntity.ok(caminhoImagem);
    }

}
