package com.tulioanesio.QrCode_Gen.ports;

public interface StoragePort {

    String upload(byte[] data, String fileName, String contentType);
}
