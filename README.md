# Conversor de Monedas y Temperaturas
Este es un programa en Java que permite convertir diferentes tipos de monedas y temperaturas.

## Requisitos
- JDK 8 o superior
- IDE de Java (opcional)

## Instalación
1. Clonar o descargar el repositorio.
    ```bash
    git clone https://github.com/FabricioMR22/challenge-one-conversor
    ```
2. Abrir el proyecto en un IDE de Java (opcional).
3. Ejecutar el archivo Main.java.

## Uso

Al ejecutar el programa, se mostrará un menú para seleccionar el tipo de conversión que se desea realizar: monedas o temperaturas. Luego, se solicitará al usuario la cantidad de la moneda o temperatura que se desea convertir y el tipo de conversión que se desea realizar (por ejemplo, convertir de PEN a USD o de Celsius a Fahrenheit). Por último, se mostrará el resultado de la conversión y se preguntará al usuario si desea continuar convirtiendo.

![uso.gif](src%2FresourcesMD%2Fuso.gif)

## Estructura del código
![class.png](src%2FresourcesMD%2Fclass.png)

- Clase Main: Es la clase principal que contiene el método main del programa y se encarga de mostrar el menú, solicitar la cantidad y el tipo de conversión, y mostrar el resultado de la conversión.
- Clase PadreConversion: Es una clase abstracta que define la estructura de los diferentes tipos de conversión (monedas, temperaturas, etc.).
- Clase Conversion: Es una clase que contiene un mapa de los diferentes tipos de conversión (monedas, temperaturas, etc.) y sus valores.
- Clase Moneda: Es una clase que extiende de PadreConversion y se encarga de realizar las conversiones de monedas.
- Clase Temperatura: Es una clase que extiende de PadreConversion y se encarga de realizar las conversiones de temperaturas.

## Flujo de ejecución
![flowclass.png](src%2FresourcesMD%2Fflowclass.png)

## Contribuir
Las contribuciones son bienvenidas. Si desea contribuir, siga los siguientes pasos:

1. Realice un fork del repositorio.
2. Cree una rama con la nueva funcionalidad: 
    ```bash
   git checkout -b nueva-funcionalidad
    ```
3. Realice los cambios necesarios y haga los commits correspondientes:
    ```bash
    git commit -am 'Agregada nueva funcionalidad'
    ```
4. Haga push a la rama:
    ```bash
   git push origin nueva-funcionalidad
    ```
5. Abra un Pull Request en GitHub.

## Autor

- [@FabricioMR22](https://github.com/FabricioMR22)