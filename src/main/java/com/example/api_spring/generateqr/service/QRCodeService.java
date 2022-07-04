package com.example.api_spring.generateqr.service;

public interface QRCodeService {

    byte[] generateQRCode(String qrContent, int width, int height);
}
