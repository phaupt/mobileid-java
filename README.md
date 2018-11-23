mobileid: Java Client
========

Mobile ID client code examples and tools written in Java.

## client-cxf-jaxws

A sample JAX-WS based client implementation that is using the Swisscom Mobile ID SOAP interface. 
Stubs were generated with Apache CXF 3.0 using the official Swisscom WSDL `mobileid.wsdl` (see details in `generateStub.bat`).

## client-saaj

A very simple SAAJ based client implementation to invoke a MSS Signature using the Swisscom Mobile ID SOAP interface. 


## How To

### Keystore
Create PKCS12 keystore from key and crt files. Use the same passwords as defined in the `mobileid.properties` file.
```
$ openssl pkcs12 -inkey mycert.key -in mycert.crt -export -out keys.pkcs12
$ keytool -importkeystore -destkeystore mykeystore.jks -srckeystore keys.pkcs12 -srcstoretype pkcs12 -deststoretype pkcs12
```

### Run java
Refer to the `README.me` in the related subfolder

### Compile and run from command line
```
$ javac -encoding ISO-8859-1 -d ./class -cp "." $(find ./src/* | grep .java)
$ java -cp ".:./class" ch.swisscom.mid.client.Test_Client
  MSS_Profile StatusCode: 100
  MSS_Signature StatusCode: 100
  MSS_Signature MSSP_TransID: HE5w0a70
  MSS_StatusQuery StatusCode: 504
  MSS_StatusQuery StatusCode: 504
  MSS_StatusQuery StatusCode: 500
  MSS_Receipt StatusCode: 100
  MSS_Receipt UserResponse: {"status":"OK"}
```
