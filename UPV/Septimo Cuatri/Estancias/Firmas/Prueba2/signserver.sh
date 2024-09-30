#!/bin/bash

#Crear .pem

openssl rsa -inform DER -in clave_privada.key -out private_key.pem -passin pass:12345678a

openssl x509 -in clave_publica.cer -inform DER -outform PEM -out certificate.pem

openssl pkcs12 -export -inkey private_key.pem -in certificate.pem -name "Ivan" -out llaves.p12 -certfile CerCA.pem -passout pass:tamarindo123

rm private_key.pem certificate.pem

chmod a+r llaves.p12

docker cp /home/yisuscena/Escritorio/Carpetas/UPV/Septimo\ Cuatri/Estancias/Firmas/Prueba2/llaves.p12 signserver:/opt/signserver/res/test/dss10/

docker exec signserver signserver deactivatecryptotoken 2
docker exec signserver signserver activatecryptotoken 2 tamarindo123
