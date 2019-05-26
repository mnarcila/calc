# calc
AES-MODVAL Calculadora creada con springboot contenerizada en docker con pluggin de maven spotify

En las carpetas se encontraran las fuentes y los archivos de ejecución de postman.

# Como utilizar:

1. Para obtener la imagen desde dockerhub se debe ejecutar desde la consola el siguiente comando:

docker pull mnarcla/dkcalcv1

2. Ejecutar la imagen del docker:

docker run -it -p 8888:8080 mnarcla/dkcalcv1

3. Para validar la información del servicios que se acaba de desplegar puede utilizar la documentación del contrato: 
http://localhost:8888/calc/swagger-ui.html#/calc

o importar el archivo: calc.postman_collection.json al aplicativo postman para validar sus operaciones.
