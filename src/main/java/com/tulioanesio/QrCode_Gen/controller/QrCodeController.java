package com.tulioanesio.QrCode_Gen.controller;

import com.tulioanesio.QrCode_Gen.Dtos.QrCodeGenerateRequest;
import com.tulioanesio.QrCode_Gen.Dtos.QrCodeGenerateResponse;
import com.tulioanesio.QrCode_Gen.services.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeService) {
        this.qrCodeGeneratorService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
        try {
            QrCodeGenerateResponse response = this.qrCodeGeneratorService.generate(request.text());
            return ResponseEntity.ok(response);
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

}
