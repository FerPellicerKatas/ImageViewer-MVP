# ImageViewer-MVP

## Descripción 
Dada una ruta, con varias imágenes, se deberá desarrollar una aplicación que muestre las imágenes en pantalla y permita navegar entre ellas (siguiente y anterior imagen).

Se puede pasar o retroceder de imagen arrastrando, y también podemos hacer las mismas acciones, haciendo click en la imagen (Se explican ambas a continuación). 

En el caso de deslizar, solo se pasa de imagen si el desplazamineto de la imagen es mayor que la mitad del display. Esto sucede tanto para pasar de imagen como para retroceder a la imagen previa.

Por otro lado, si la coordenada x del click obtenido se encuentra en posiciones mayores que la mitad del tamaño del display, se pasa a la siguiente imagen. En caso de que la posición en el eje x del click sea menor que la mitad del tamaño del display, se retrocede a la imagen previa.

En este proyecto se ha conseguido este objetivo aplicando MVP.

## Muestra de funcionamiento del programa

# Se muestra la primera imagen deslizando.

![Primera Imagen](https://github.com/FerPellicerKatas/ImageViewer-MVP/blob/master/imagesExample/imagenEjemplo1.png)

# Al avanzar de imagen se muestra la siguiente.

![Segunda Imagen](https://github.com/FerPellicerKatas/ImageViewer-MVP/blob/master/imagesExample/imagenEjemplo2.png)

# Avanzamos nuevamente de imagen.

![Tercera Imagen](https://github.com/FerPellicerKatas/ImageViewer-MVP/blob/master/imagesExample/imagenEjemplo3.png)

# Volvemos a la imagen anterior deslizando.

![Cuarta Imagen](https://github.com/FerPellicerKatas/ImageViewer-MVP/blob/master/imagesExample/imagenEjemplo2.png)
