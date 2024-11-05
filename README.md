Conversor de Monedas
Proyecto en Java que utiliza una API para obtener tasas de cambio en tiempo real y realizar conversiones entre múltiples monedas.

Descripción
Este conversor de monedas es una aplicación en Java que permite convertir entre diferentes monedas utilizando las tasas de cambio actuales. Integra la API de ExchangeRate para acceder a las tasas de conversión actualizadas, lo que permite ofrecer valores precisos y actuales. Es una herramienta ideal para quienes necesitan realizar conversiones rápidas y precisas entre monedas.

Funcionalidades
Conversión en tiempo real entre monedas utilizando datos de una API.
Opciones de conversión preconfiguradas para múltiples monedas, incluyendo Dólares, Pesos Argentinos, Reales, Euros, Pesos Mexicanos, Uruguayos y Colombianos.
Interfaz de usuario simple basada en texto que permite al usuario elegir y ejecutar diferentes opciones de conversión.
Tecnologías Utilizadas
Java: lenguaje principal del proyecto.
ExchangeRate API: para obtener tasas de cambio actualizadas en tiempo real.
Gson: para manejar la conversión de datos JSON de la API.
Estructura del Proyecto
El proyecto está compuesto por las siguientes clases principales:

ConversorMonedas: esta clase administra la lógica de conversión de monedas y llama a la clase ExchangeRateAPI para obtener las tasas de cambio.
ExchangeRateAPI: se encarga de realizar las solicitudes HTTP a la API de ExchangeRate y de procesar las respuestas JSON para obtener las tasas de cambio actualizadas.

Ejemplo de Uso
Bienvenido al Conversor de Monedas
1. Convertir Dólares a Pesos Argentinos
2. Convertir Pesos Argentinos a Dólares
3. Convertir Reales a Dólares
4. Convertir Dólares a Reales
5. Convertir Euros a Pesos Argentinos
6. Convertir Pesos Uruguayos a Dólares
7. Convertir Pesos Mexicanos a Dólares
8. Convertir Pesos Colombianos a Dólares
9. Salir
Selección de opciones: El usuario puede seleccionar una de las opciones de conversión e ingresar la cantidad a convertir. El programa responde con el monto convertido y la tasa de cambio utilizada.
Tasas actualizadas: Para algunas monedas específicas, el programa indicará la tasa de cambio actual, obtenida de la API.
Posibles Mejoras
Ampliación de Monedas: añadir más monedas soportadas.
Interfaz Gráfica: desarrollar una interfaz gráfica para hacer el programa más accesible.
Manejo de Errores Mejorado: mejorar la gestión de errores para una experiencia de usuario más fluida.
