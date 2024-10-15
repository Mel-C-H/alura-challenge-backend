# Conversor de Moneda 🌍💰
Este es un conversor de moneda hecho en Java que permite convertir entre cuatro divisas populares: Dólar (USD), Euro (EUR), Peso Colombiano (COP) y Libra Esterlina (GBP). Usa una API en 
línea llamada "ExchangeRate" para obtener las tasas de cambio en tiempo real. ¡Es súper fácil de usar y puedes hacer tantas conversiones como quieras!

## Índice
* [Cómo funciona](#cómo-funciona-)
* [Requisitos](#requisitos-%EF%B8%8F)
* [Cómo usarlo](#cómo-usarlo-)
* [Ejemplo de uso](#ejemplo-de-uso-)

## ¿Cómo funciona? 🤔
- El programa te pedirá que elijas la moneda de origen y la moneda de destino.
- Luego, te preguntará la cantidad que quieres convertir.
- Con esa información, el programa hace una consulta a la API de tasas de cambio y te devuelve el monto equivalente en la moneda de destino.
- Al final, puedes elegir si quieres hacer otra conversión o simplemente salir del programa.

## Requisitos 🛠️
- Java 11 o superior.
- Librería GSON para manejar el formato JSON (se usa para interpretar los datos de la API).

## ¿Cómo usarlo? 🚀
- Clona el repositorio o copia el código en tu editor de Java favorito.
- Asegúrate de tener la librería GSON incluida en tu proyecto.
- Compila y ejecuta el programa. Verás un menú que te pedirá elegir las divisas y la cantidad a convertir.
- Puedes hacer tantas conversiones como quieras, y cuando termines, puedes salir fácilmente.

## Ejemplo de Uso 📝
```
Bienvenido al conversor de moneda.
Seleccione las divisas para convertir:

1. Dólar (USD)
2. Euro (EUR)
3. Peso Colombiano (COP)
4. Libra Esterlina (GBP)
5. Salir

Seleccione el número de la divisa origen (o 5 para salir): 1
Seleccione el número de la divisa destino: 2
Ingrese la cantidad que desea convertir: 100
100.0 USD son equivalentes a 90.45 EUR
¿Desea realizar otra conversión? (s/n): s
```
