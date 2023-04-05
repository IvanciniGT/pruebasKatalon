# KATALON

Herramienta para automatizar pruebas de software "integración/sistema" de tipo "funcional"

# Para qué sirven las pruebas?

- Para tratar de encontrar el mayor número posible de defectos en un sistema (buscando directamente DEFECTOS o FALLOS)
- Cuando aparece un FALLO -- debug --> Identificar el DEFECTO
    Aportar luz cuando hay un problema
    Pruebas deben ser atómicas: Se deben centrar en una única característica...
- Para garantizar la calidad del software
- Para garantizar que el sistem cumple con unos requisitos
- Identificar ERRORES
- Para conocer más de mi sistema
- ¿Quién dice si un software está funcionando? PRUEBAS !!!!!
  > El software funcionando es la                 "medida principal de progreso".
  ¿ Cómo sé cómo va un proyecto ?

# Vocabulario que usamos en el mundo del testing

- ERROR     Es algo comedido por un ser humano
- DEFECTO   Al cometer un ERROR un humano, puede introducir un DEFECTO en el sistema
- FALLO     Ese defecto puede MANIFESTARSE o no en forma de FALLO

# Tipos de pruebas de software

## Tipos de pruebas en base al NIVEL DE LA PRUEBA

- Unitarias             Prueban un componente** AISLADO del sistema
- Integración           Prueban la COMUNICACION entre componentes                           KATALON
- Sistema (End2End)     Prueban EL COMPORTAMIENTO del sistema en su conjunto                KATALON ****
  - Aceptación            Las que se requieren para aceptar el producto/sistema

**componente???
- Clase
- Método
- Query

## Tipos de prueba en base al Objeto de prueba

- Pruebas estáticas                 Las que NO requieren poner el sistema en funcionamiento
    - Revisión de requisitos
                            R1. El sistema debe responder en unos tiempos adecuados
                            R2. El sistema debes responder en menos de 200ms cada petición
                            R3. El sistema, instalado en un equipo con éstas características XXXX
                                y sometido a una carga de trabajo YYYY
                                debe responder a un determinado flujo de trabajo con un percentil 95% inferior a 200ms
    - Calidad de código -> MANTENIBILIDAD DEL PRODUCTO.
                            Estas pruebas eran las que antes hacía un SENIOR
                            Hoy en día esto está AUTOMATIZADO: SONARQUBE
    - Revisión de un modelo de datos
- Pruebas dinámicas                 Las que SI requieren poner el sistema en funcionamiento
  - Funcionales                     Las que se centran en la funcionalidad                  KATALON ****
                                    JUNIT, TESTNG , MSTEST, TESTUNIT, MOCHA
                                    POSTMAN, SOAPUI, Cypress, Karate, ReadyAPI
  - No Funcionales                  Las que se centran en otros aspectos
      - Carga                           Degradación de los tiempos de respuesta ante: 
                                            - Volumenes grandes de datos
      - Estres                          Degradación de los tiempos de respuesta ante: un volumen alto de peticiones
      - Rendimiento                     Tiempos de respuesta de mi sistema
                                        JMETER, LOADRUNNER
      - Alta disponibilidad             Tolerancia a fallos del sistema
      - Pruebas de backups / restore
      - Experiencia de usuario

# En base a el mecanismo de comunicación con el sistema

- Pruebas de APIs                       Me comunico directamente con el código
- Pruebas de interfaz gráfica           Me comunico a través de una interfaz gráfica (navegador, teléfono móvil)     KATALON *
- Pruebas de APIs REST/SOAP             Me comunico a través de uno de esos mecanismos.                              KATALON

# En base al... 

- Pruebas de caja blanca                Cuando conozco la estructura del código                   *** DESARROLLADORES
- Pruebas de caja negra                 Solo conozco los datos de entrada y la salida esperada    *** TESTER

## Complejidades de un codigo
- Complejidad ciclomática:              Número de caminos que puede tomar un código
- Complejidad cognitiva:                Cómo de complejo es un código para un ser humano
- Orden de complejidad de un algoritmo: Cómo se comporta el código cuando trabajo con conjuntos de datos más grandes
  O(8)n) O(n·lon(n))


  SI (Condicion 1)
    TArea1
    SI (condicion2)
      Tarea 2
    SI NO
      Tarea 3
  Si NO, SI (condicion3)
    Tarea 4
    SI (condicion4)
      TAreas 5
    Si no, si (condicion5)
      TAREA 6
  Tarea 7

  Complejidad ciclomática? 6 *** Con qué tiene que ver este dato?  
      El número MINIMO de casos de prueba que necesito para ese código
      Cómo no conozco el código, tengo una pista del número de casos necesrio al menos.

  switch(variable1
    caso 1:
      Tarea 1
    caso 2:
      Tarea 2
    caso 3:
      Tarea 3
    caso 4:
      Tarea 4
    caso 5:
      Tarea 5
    caso por defecto:
      Tarea 6


# Por qué queremos automatizar las pruebas?

Porque cuando las hacemos VARIAS VECES (la misma prueba) me sale más ECONÓMICO!
    Quiero la misma exacta prueba muchas veces (todos los días)
    Hay pequeñas variantes entre las pruebas.... que queremos ejecutar
        App web. (CITAS EN EL MINISTERIO DE HACIENDA)
            Pruebas de la web. En qué navegador las hago?
                - Firefox
                - Chrome
                - Chromium
                - Opera
                - Safari
            Sobre qué SO?
                - Windows 10
                - Windows 11
                - Windows 8
                - MacOS
                - Linux
                - iOS
                - Android
          - En qué tipo de dispositivo?
                - PC
                - Tablet
                - Movil
          - ** En internet tenemos granjas que podemos alquilar por 200€ con más de 800 configuraciones diferentes 

# Hoy en día hacemos las pruebas muchas veces? Repetimos las pruebas?

Por qué? Cambio en la forma de trabajo que usamos hoy en día. METODOLOGIAS TRADICIONALES (en cascada) ---> AGILES

# Metodología ágil

SCRUM, Extreme programming

Y el producto lo entrego al cliente de forma incremental!

Queremos hacer entregas en producción cada 2 - 8 semanas

2 semanas de comenzar tengo el primer paso a producción, de una app 100% funcional
    5% de la funcionalidad < PRUEBAS
    
4 semanas de comenzar tengo el segundo paso a producción, de una app 100% funcional
    +5% de la funcionalidad < PRUEBAS
        Repetir las pruebas del 5% anterior <<<< PRUEBAS DE REGRESION
      
6 semanas de comenzar tengo el tercer paso a producción, de una app 100% funcional
    +5% de la funcionalidad
    
De dónde saco la pasta para tanta prueba??? NO LA HAY !!! ~~> AUTOMATIZAR !

# Qué significa AUTOMATIZAR UNA PRUEBA?

Definir los pasos que son necesario realizar para ejecutar una prueba: DEFINIR UNA PRUEBA 
(para hacerla automáticamente o en manual)

Que no requiera intervencación / interacción de una persona física para su ejecución...
Y cómo conseguimos eso?
HACIENDO UN PROGRAMA PARA QUE PRUEBE OTRO PROGRAMA
                                      ^^^^^^^^^^^
                                    SISTEMA PRINCIPAL

Hoy en día los testers los hemos convertido en PROGRAMADORES (que no en desarrolladores)

# Tipos de programas

- Sistema operativo
- Driver
- Libreria
- App web
- Servicio
- Comando
- Script        <<< Una prueba automatizada es un script

# DEVOPS

CI/CD son fases en la adopción de una filosofía DEVOPS

DEVOPS es una filosofía, cultura, un movimiento en pro de la AUTOMATIZACION !

Jenkins... 


# Selenium

Es una herramienta que nos permite automatizar operaciones en un navegador. No es una herramienta de pruebas !

Podemos montar pruebas sobre un navegador WEB usando SELENIUM para automatizar unos trabajos sobre un navegador 
+ JUNIT (para hacer las pruebas)

En lugar de escribir CODIGO DE PROGRAMACION  ( que podríamos y mucha gente lo hace)
En nuestro caso vamos a estar usando KATALON STUDIO, para que sea KATALON el que vaya construyuendo ese programa por nosotros
de forma encubierta... pero sin perder de vista que estamos montando un PROGRAMA !!!!!

Y como tal, hemos de acogernos a las BUBENAS PRACTICAS QUE LLEVAN AÑOS USANDO los desarrolladores de software:
- Nuestro programa tendrá VERSIONES
- Estará controlado en un SISTEMA DE CONTROL DE CODIGO FUENTE (git)

## PRODUCTOS QUE OFRECE SELENIUM

- Selenium IDE          ESTE ES UN POCO DE JUGUETE... Nos echa una manilla a la hora de escribir esos SCRIPTS de pruebas
                        En su lugar vamos a usar nosotros KATALON STUDIO
- Selenium Webdriver    Es una librería que tenemos disponible en MUCHOS LENGUAJES DE PROGRAMACION (PY, JAVA, C#...)
                        que nos permite controlar (a través de un driver) un navegador de internet
- Selenium GRID         Nos permite montar una granja de navegadores, junto con sus drivers,
                        para que pueda ser usada REMOTAMENTE desde un script con Selenium Webdriver

                                                                                            KATALON STUDIO, SELENIUM IDE
                                                                                                VVVV
    SITIO WEB(app) <<<<< NAVEGADOR DE INTERNET <<<< DRIVER <<<<<< SELENIUM WEBDRIVER <<<<< SCRIPT DE PRUEBA
    app mia                 chrome (v.X)            chromedriver(v.X)
                            firefox (v.Y)           ghekodriver(v.Y)
                            edge

Los navegadores tienen una funcionalidad que no solemos usar mucho.
PERMITEN SER CONTROLADOR POR LO QUE LLAMAMOS UN DRIVER DE NAVEGADOR

## Cómo se le dan las órdenes al driver de un navegador

A través del driver, podemos pedir una nueva pestaña o ventana de un navegador.
Y también que navegue a una determinada URL.
La URL se cargará en el navegador... y se mostrará una pantalla (de una web)

Y cómo interactuo ahora con esa WEB???
- El navegador , al final, va a cargar un fichero HTML (página web)
- Ese fichero puede ser ESTATICO, o DINAMICO (haber sido generado por un programa)

Ese HTML le carga el navegador... y genera lo que se denomina un DOM

DOM: Document Object Model.
Es la representación en memoria RAM de un documento HTML...
lo que habitualmente vemos en el navegador cuando damos al botón "INSPECCIONAR" > Herramietas de desarrollador.

El DOM tiene una estructura JERÁRQUICA.

Dentro de esa estructura estan los COMPONENTES sobre los que vamos a interacturar (realizar operaciones):
- Click a un link
- Rellenar un campo de un formulario
- Click en un boitón para enviar un formulario
- Leer un texto de un sitio de la pantalla

HAbitualmente esos COMPONENTES con los que interactuamos los identificamos usando CON NUESTROS OJOS !!!!
Los programas NO TIENEN OJOS !!!!
Y queremos que sea UN PROGRAMA el que interactue con mi página WEB.

Necesitamos buscar una forma de IDENTIFICAR COMPOENENTES Dentro del DOM para que nuestro programa (script de automatización de pruebas) interactúe con ellos

# Cómo puedo identificar un elemento dentro de un DOM?

Hay varias formas:
- Los elementos pueden tener un IDENTIFICADOR... Si lo tiene ES MI MEJOR ALTERNATIVA.
  Según el estandar el ID debe ser UNICO. Si el ID no es único, los desarrolladores la han CAGADO: BUG!!!! DEFECTO !!!
  
    Busca el elmento del DOM cuyo id es "LOGIN" y haz click ahí en ese elemento.

- Si no tengo IDs, tengo que buscar alternativas... 
  En selenium (katalon) se ofrecen varias... SOLO NOS INTERESA 1 de ellas... el resto RUINA GIGANTE !!!!
    - La alternativa se llama XPATH: qué es un estandar del W3C
    XPATH por si solo no me resuelve el problema de identificar elementos... ES SOlO UNA LENGUAJE PARA IDENTIFICARLOS. NADA MAS
    Podré usar ese lenguaje de muchas formas... 
    - Algunas GUAYS
    - Otras RUINOSAS 
  Nada que se genere de forma AUTOMATICA ME VA A SERVIR !!!! TODO TENDRE QUE REVISARLO MANUALMENTE ... TODO <<< LO MAS CRITICO DE USAR SELENIUM / KATALON... y si no tengo experiencia... lo últmo que haré y a lo que menos importancia le daré
            
            //*[@id="pt-login"]/a/span
            /html/body/div[4]/div[1]/nav/div/ul/li[5]/a/span                **** TOTALMENTE FUERA !!!!
                                                                            Es muy frágil... Depende de muchas cositas
            //*[@id="pt-login"]//span
            //*[equals(text(),"Acceder")]

NOTA: IMPORTANTISIMO... 
El principal problema que nos vamos a encontrar al usar Selenium (desde Katalon o no) es
que un script, después de haberlo montado, a los pocos días (o muchos días) nos va a dejar de funcionar.
Y esto va a ocurrir porque los elementos van a dejar de identificarse de la misma en la que anteriormente se estaban IDENTIFICANDO.
Debería de haber CONSENSO entre desarrollo y TESTING en cuanto a la forma de identificar los elementos con los que se va a interactuar en un sitio web:
- TODO ELEMENTO CON EL QUE SE PUEDA INTERACTUAR DEBERIA TENER UN ID !!!!
  Y el equipo de desarrollo DEBE SER CONSCIENDE DE LA RELEVANCIA DE ESTO y actuar en consecuencia!
  Esto es algo que pocas veces va a ocurrir... Sobre todo:
  - En sistemas legacy
  - Cuando desarrollo y testing están desacoplados.

# XPATH

Es un lenguage que nos permite identificar elementos en un dom mediante una RUTA

# TDD. Test Driven Development

Metodología de desarrollo, que consiste en:
- Desarrollar primero las pruebas (Unitarias)
- Empiezo a escribir código hasta que las pruebas se superan... Cuando las tengo en VERDE = TRABAJO CONCLUIDO

# BDD. Behaviour driven development

Metodología de desarrollo, paralela a TDD, que consiste en:
- Desarrollar primero las pruebas de Sistema. Estas habitualmente las hace el equipo de TESTING -> desarrolladores

En esta metodología usamos un lenguaje que se utiliza para expresar las pruebas y los requerimientos (el comportamiento)

Ese lenguaje sse llama Gherkin... y la herramienta que procesa ese lenguaje se llama CUCUMBER
                        vvvv
                        En español



# Me imagino que todos trabajais en apps monolóticas 

Usais JSPs para generar el HTML? Esto es obsoleto a día de hoy.

Antaño, el HTML también se generaba en el SERVIDOR (jsp, asp, php)

Hoy en día hay una división MUY GRANDE entre lo que es 
- FrontEnd          > JS (angularJS, reactJS, vueJS, polymer...)
                        Y esos programas JS donde se ejecutan? En el navegador.
                        Dentro del navegador se generan los HTML que se van a ver en ese navegador
- BackEnd           > Servicios WEB ... que proveen al frontend(esos programas JS) de los datos que deben 
                      represntar en la pantalla

Hoy en día usamos el concepto de SPA (single Page Application)
Una página HTML va MUTANDO. USamos programas JS para solicitar a un servidor (backend) datos
Esos programas generan TROZOS de HTML que se inyectan / modifican en el HTML que está presentando el navegador en pantalla.


# W3C

World Wide Web Consortium

Es una organización que ofrece/publica ESTANDARES que se usan en el mundo WEB:
- HTML
- CSS
- XML
- XPATH *****


# Creando un proyecto en KATALON

Nuestro proyecto irá almacenado dentro de un Sistema de Control de Código fuente : Git
.gitignore: Archivo estandar de git, donde se detallan los arhivos del proyecto que NO DEBEN almacenarse en git
    Se configura bien por defecto.

build.gradle

# Gradle (equivalente a MAVEN, sbt). Microsoft dotnet msbuild. Python poetry. JS: npm, yarn

Es una herramienta que usamos en lenguajes como JAVA o KOTLIN para:
- Ayudar con la gestión de dependencias de mi proyecto
- Ayudan a automatizar algunas tareas repetitivas del proyecto:
  - Su compilación
  - El empaquetado (generar lo que voy a distribuir)
  - Su ejecución
  - La ejecución de pruebas automatizadas sobre mi proyecto

Nosotros estamos montando un software. Y nuestro software (que encubiertamente lo gestiona KATALON)
será un proyecto JAVA que se compila y gestiona a través de GRADLE.

De hecho en un momento dado, no querremos ser nosotros los que ejecutemos este proyecto (estos programas de pruebas)
Quién se encargará de ejecutar los programas de pruebas? GRADLE solicitará la ejecución de los programas de prueba ... y gestionará los mismos... pero a su vez... quién va a allamar a gradle? Un servidor de AUTOMATIZACION:
- JENKINS
- BAMBOO (atlassian)
- TEAMCITY (jetbrains)
- GITHUB Actions
- GITLAB CI/CD
- Travis CI


# Por dejado de Katalon

Tenemos selenium para automatizar trabajo en un navegador.
Además tenemos JUNIT, para realizar pruebas.

JUNIT es una framework (que incluye un montón de librerias) JAVA 


# Framework vs Librería

Librería:  Es un conjunto de funciones reutilizables, que alguien monta... para hacer operaciones muy concretas
           que yo puedo invocar desde mi proeycto.
Framework: Es un conjunto de librerías.... pero además impoenen una metodología de uso para esas librerías.
           Es decir, no es sólo una librería que yo uso y llamos desde mi código
           Es que para usar esa librería tengo que usar ciertas directrices... y organizar mi proyecto de una forma concreta.

En JUnit, nosotros definimos funciones de prueba <- SCRIPTS DE PRUEBAS
Esos métodos siempre tienen la misma estructura:
- Realizo algunas operaciones contra un sistema
- Pruebo que el sistema se ha comportado de la forma adecuada

En JUnit las pruebas (esas funciones o scripts) siempre van a acabar en uno de 3 estados posibles:
- Éxito                             Success: Prueba ejecutada correctamente y se ha verfificado el comportamiento esperado
- No éxito                          Failure: Prueba ejecutada correctamente y NO se ha verfificado el comportamiento esperado
                                             Hemos encontrado un comportamiento diferente al esperado
- Error al ejecutar la prueba       Error:   Prueba no se ha ejecutado correctamente

Al trabajar con JUnit, tendremos el concepto de ASSERTIONS. Aseguraciones <<< ESTO ES LA PRUEBA EN SI MISMA

## Caso de prueba TERUEL EXISTE

1. Abre en un navegador la página web de wikipedia          |
2. En la caja de búsqueda escribe TERUEL                    |   Tareas que hago en un sistema
3. Pulsa sbre el botón de la lupa                           |   En nuestro caso tareas que queremos realizar en AUTOMATICO 
4. Extrae el título de la página a la que has llegado       |   dentro de un navegador: SELENIUM WEBDRIVER
   
5. Asegura que el título ESE que has extraido es: Teruel!   |   Esta es la prueba: JUNIT
    Aseguración (ASSERTION)
        - Asegurame que un texto es igual a otro texto
        - Asegurame que un número es mayor o menos que otro.

Este guión de pruebas (1-4)... define acciones que vamos a realizar sobre algunos componentes
                                                     ACCION                 DATOS                   COMPONENTE              GENERAN RESULTADO
1. Abre en un navegador la página web de wikipedia   Abrir un navegador
                                                     Ir a una URL           https://wikipedia.es

2. En la caja de búsqueda escribe TERUEL             Escribir               Teruel                  Caja búsqueda

3. Pulsa sbre el botón de la lupa                    Pulsar (click)         ~                       Bóton de la lupa

4. Extrae el título de la página                     Recuperar un texto     ~                       Título de la página     TITULO-DE-LA-PAGINA


## Donde queremos que se ejecuten estas pruebas?

Las pruebas que hacen los desarrolladores en su PC me sirven para algo? No me fio.... están maleados
Las pruebas que hacen los testers en su PC me sirven para algo?         No me fio.... están maleados

Queremos un entorno controlado, limpio, parecido al de la realidad...
Tradicionalmente hemos usado lo que llamábamos un ENTORNO DE PRUEBAS, Q&A, PRE-PRODUCCION, INTEGRACION

LA tendencia a día de hoy... es a generar ese entorno desde CERO cada vez que quiero hacer pruebas...
Si del PC del desarrollador no me fio... y del PC del tester tampoco...
De un entorno donde ya he reaklizado 50 instalaciones y pruebas, me fío???? POCO !

Y hoy en día la tendencia es tener entornos de prueba de USAR Y TIRAR.... aqui nos ayudan mucho los CONTENEDORES.

Más adelante montaremos un grid de selenium con contenedores:
- Chrome
- Firefox
- Edge

## Integración Continua... Cuando hablábamos de DEVOPS (Entrega Continua > Despliegue Continuo)

Quiero la última versión que los desarrolladores hayan subido al repo de git, continuamente 
en el entorno de Integración, siendo sometida a PRUEBAS AUTOMATIZADAS.

## Entornos de un software

### Para el software principal que estoy desarrollando (Gestor documental)

                                            (va en serio) < La tendencia es que este entorno sea de usar y tirar
                                                              (no lo quiero maleado)
Entorno de desarrollo                 >     Entorno donde ejecutar pruebas    >   Entorno de producción 
Donde trabajan los desarrolladores    
                                                          ^
### Para el software de pruebas que estoy desarrollando   ^
                                                          ^
Entorno de desarrollo                 >     Entorno de producción
Mi local
Puede haber pruebas destructivas de datos.


---

# Ejemplo: Pruebas a la página de reserva de citas médicas

URL: https://katalon-demo-cura.herokuapp.com/

Estamos haciendo pruebas de caja negra: No tengo ni idea del código que hay dentro... y no puedo dar cosas por supuesto

## Qué la página está disponible

- Acceder a la página
- Ver que hemos llegado a la página que queriamos llegar

## Formulario de login

- Aceder al formulario de login: APRETAR EN EL BOTON MAKE APOINTMENT
- Debemos rellenar el nombre de usuario y la contraseña.
- Después apretar en el botón de PA DENTRO !!!!

### Comprobar que un usuario no autorizado (registrado) no puede acceder

Qué datos usaremos?
- Nombre de usuario:  RUINA     RUINA2    BLANCO    John Doe          RUINA
- Contraseña:         RUINA     RUINA2    BLANCO    RUINA             ThisIsNotAPassword

### Comprobar que un usuario autorizado (registrado) si puede acceder

Qué datos usaremos?
- Nombre de usuario:  John Doe
- Contraseña:         ThisIsNotAPassword

Sería suficiente? Al menos querría hacer la prueba con 2 usuarios... SOLO TENEMOS UNO.
Pero en un caso real de un app que controlo y controlo su BBDD, querré hacer la prueba al menos con 2 usuarios.

Tengo garantías de que el desarrollador no ha escrito el código:
  SI EL  USUARIO ES JOHN DOE y la contraseña es THISISNOTAPASSWORD le permito entrar


## Comprobación de que se muestra el mensaje Login failed

<section id="login" class="section" xpath="1">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 text-center">
                <h2>Login</h2>
                <p class="lead">Please login to make appointment.</p>
                <p class="lead text-danger">Login failed! Please ensure the username and password are valid.</p>
            </div>
            ...
        </div>
    </div>
</section>

## Pregunta

Qué tal nos lo han dejado los desarrolladores para comprobar esto????
MAL ::: No hay un id en el que basarse

Nos tenemos que volver creativos...
Cualquier cosa que hagamos llegados a este punto va a ser FRAGIL !
Y es susceptible de fallar en el futuro!

Plantearé diferentes opciones... y tomaré la que considere menos fragil. Y ME PUEDO EQUIVOCAR !

### Opción 1 <<<<<

Buscar el texto directamente dentro de la seccion id="login": LOGIN FAILED
RIESGO: Que cambie el texto                                       --> El script falla cuando en realidad "debería" funcionar 

### Opción 2

Identificar de alguna forma el elemento que contiene el texto y verificar que ese texto aparece
Identificar el párrafor de marras... y leer su texto
- p.text-danger
- Mirar si después del título hay 2 párrafos

RIESGO: Que cambién la apariencia (css) o la estructura del html -> EL SCRIPT VA A DEJAR DE FUNCIONAR
RIESGO: Que cambie el texto                                       --> El script falla cuando en realidad "debería" funcionar 


### Opción 3

Verificar que hay  un elemento para mostrar el error... sin verificar el texto de ese error
- p.text-danger
- Mirar si después del título hay 2 párrafos

RIESGO: Que cambién la apariencia (css) o la estructura del html -> EL SCRIPT VA A DEJAR DE FUNCIONAR
RIESGO: Que el elemento siga ahi... pero sin contenido...        -> El script va a ejecutarse y dirá que está bien..
                                                                    OJO!!!! Y no lo está !!! ESTO ES IMPERDONABLE !

DECISIONES !

## XPATH

En XPATH generamos RUTAS que permiten identificar elementos.
Tenemos que pensar que partimos de una estructura jerárquica (DOM) de datos (MARCAS-Componentes WEB)

HTML                                                    1
  HEAD                                                  2
  BODY                                                  3
    H1                                                  4
    SECCION id="login"                                  5
      H2                                                6
      p                                                 7
      p                                                 8
      p : Hola amigo                                    9
      div                                               14
        div                                             15
          p                                             16
          p                                             17
    SECCION id="cita"                                   10
      H2               Hola                             11
      p                                                 12
      p                                                 13
      div                                               18
        div                                             19
          p                                             20
          a                                             21

//section[@id='login']//p[contains(text(),'Login failed')]

//p[last()]         9, 17, 13, 20

Expresiones para las rutas

Si comienzo con una / indico el emento raiz (en nuestro caso HTML)
Si comienzo con //    me refiero a cualquier item dentro del DOM

/H1                   NADA !
/BODY/H1              4
//H1                  4
//H2                  6, 11
//H2[1]               6, 11     El primer H2 a su nivel
//p[2]                8, 13
//SECCION/div         14, 18
//SECCION//div        14, 15, 18, 19

Dentro de esas rutas podemos usar PREDICADOS... me ayudan a refinar un elemento. Se escriben entre corchetes.
Para leer los predicados, una buena palabra sería: "tal que"
Una @ significa acceso al valor de un ATRIBUTO
//SECCION[@id="cita"] 10
//SECCION//a          21
//SECCION[//a]        10

Igual que tenemos el token @, tenemos la función text()... me devuelve el texto de un elemento
//SECCION[@id="cita"]/H2/text()

Esa funcion la podemos usar con otras funciones en predicados
//H2[text()="Hola"]   11
//H2[contains(text(),"Ho")]   11

Dentro de los predicados podeis usar: last()

## Por qué nos encontramos con el problema de no haber un ID?

Estamos yendo a remolque del desarrollo

El diseño de la prueba se hace después de que el producto esté desarrollado.
Hoy en día, las buenas prácticas son que las pruebas se diseñen antes que el código

DESARROLLO ES QUIEN DEBE SUPERAR LAS PRUEBAS
NO LOS TESTER ACOMODAR LAS PRUEBAS AL DESARROOLO <<<<<< SIN SENTIDO 
                                                        que solo ocurre en la inductria informática
                                                          TDD
                                                          BDD

### REQUISITOS AMBIGUOS !

Qué debe ocurrir cuando un login no se ha podido hacer correctamente?
Que se muestre QUE MENSAJE???? DONDE????
Eso es decisión del desarrollador? No debería!
  AQUI ENTRA DE NUEVO, QUE EL TESTER DEFINA LA PRUEBA A PRIORI!
    AL DEFINIR LA PRUEBA ESTOY DANDO LOS REQUISITOS DEL SISTEMA
    Y hoy en día, los requisitos son responsabilidad del TESTER (entre otros)


## DEVOPS

Jenkins
Desarrollador hace commit en git de los cambios
Y jenkins toma esos cambios... compila, empaqueta instala
Y lanza pruebas....
Y si las pruebas no pasan... el sistema no pasa a producción
Por que pasa en automático.
NO HAY NADIE A QUIEN LLORAR 

# GIT

Es lo que mal llamamos un Sistema de control de versiones.
Ese término en España se acuñó debido a un "Sistema de control de código fuente" SCM, que se llamaba CVS.

GIT - Linus Torvalds

En git, guardamos COMMITs

## Commit

Es una copia completa (backup) NO INCREMENTAL de un proyecto en un momento del tiempo.

Esos commits se guardan en un REPOSITORIO (base de datos, que guarda commits).

Los commits se guardan en el repositorio asociados a una RAMA (BRANCH).

# Rama

Una linea paralela temporal de evolución de un proyecto.

Proyecto de software. 
Cuantas versiones paralelas tengo yo en un momento dado del tiempo de ese proyecto de software?
Y que vayan evolucionando en paralelo?

Gestor documental 1.0.0
  Producción. Mi cliente instala esa versión 1.0.0
  En paralelo... sigo trabajando en nuevas funcionalidades
     ~> 1.1.0 que aún no está lista... está en desarrollo... se acaba: se libera!
  Producción. Mi cliente instala esa versión 1.1.0
  En paralelo... sigo trabajando en nuevas funcionalidades
     ~> 2.0.0 que aún no está lista... está en desarrollo...
  En paralelo, descubro un bug en producción en la versión 1.1.0
  Dónde arrglo ese bug?
    En la versión que están montando nueva los desarrolladores? Quizás también deba arreglar esto en la 2.0.0 que aún no ha salido
    Si es necesario arreglar eso... y no se puede esperar, lo necesito arreglar en la 1.1.0 -> 1.1.1
      Y esa se instala en producción

Cada una de esas versiones las guardamos en una RAMA.
Además las ramas se usan con otro fin. Depende de la organización... y sus politicas:
- Cada usuario (desarrollador) de git creará su propia rama donde trabajar
- Para cada funcionalidad se creará una rama donde trabajar
- Ambas simultaneamente

Posteriormente lo que hacemos en git es fusionar RAMAS.
En ese momento, cuando solicito a git que fusione 2 ramas git calcula BAJO DEMANDA ! las diferencias que hay entre las fotos (backups, commits)
que tengo en las ramas que quiero fusionar.

En git, siempre hay una rama, llamada: master ~> main               PRINCIPAL
HAy una regla de oro en git... inquebrantable: En la rama principal NUNCA JAMAS se genera un COMMIT
Siempre se llevan a ella commits desde otras ramas!
- main                                      C4
                                            ^
- desarrollo (development, dev) C1  C2  C3  C4(estable)

Lo que hay en la rama principal SE SUPONE LISTO PARA PRODUCCION!

GIT TIENE OTRA PECULIARIDAD IMPORTANTE !!!! que lo diferencia mucho de otros sistemas de control de versión como CVS o SVN

Es un sistema de control de codigo fuente DISTRIBUIDO!

### DISTRIBUIDO

Cada participante en git, tiene su propio REPOSITORIO (No existe el concepto de REPOSITORIO CENTRAL)
El proyecto es la suma de todos esos repositorios, que son distintos entre si.

                                          Servidor (github, gitlab, bitbucket)
                                          HDD: REPO REMOTO
                                            DESARROLLO: Commit1 -> Commit2 -> Commit3 -> Commit4M -> Commit5
                                            |
  ----------------------------------------------------------------------------------------- red
    |                                                                                     |  
  DayanaPC                                                                               Mikel
    |                                                                                     |
  Proyecto de pruebas de una App1                                                        Proyecto de pruebas de la App1 
    Directorio de su HDD:                                                                  Directorio en su HDD
      c:\app1\tests                                                                           c:\test\app1
        |                                                                                       |
        v                                                                                       V
      Repo: DESARROLLO: Commit1 -> Commit2 -> Commit3 -> Commit4D -> Commit5                   REPO DE MIKEL
                          13/01     15/01      20/01                 ^                             DESARROLLO: Commit1 -> Commit2 -> Commit3 -> Commit4M
            DESARROLLO-REMO: Commit1 -> Commit2 -> Commit3 -> Commit4M -> Commit5

Subir los commits de una rama a un repo remoto? push
LA primera vez que mikel trabaje en el proyecto hará un CLONE (clonado desde un remoto)

Mikel hace push y copia el Commit 4M al remoto
Dayana hace push para copiar el Commit 4D al remoto y en ese momento OSTION !!!!!!
  En ese momento Dayana necesita hacer un FETCH
Dayana fuiona los cambios de Mikel con los suyos: MERGE, REBASE

HAy una operación en git que se llama PULL = FETCH + MERGE o un REBASE (por defecto un merge)
 A veces al hacer un pull, me pueden ocurrin CONFLICTOS, si Mikel ha tocado del proyecto lo mismo que he tocado YO.

## Versiones de software

1.2.3
^ MAYOR         Cambio/Rediseño que no respeta retrocompatibilidad
  ^ MINOR       Añado funcionalidad
    ^ MICRO     Arreglo de bugs

# REPASO!

- Grabaciones de sesiones en un navegador
  - Script
  - Objetos
- Suite de pruebas
  - Cuando ejecute pruebas, ejecutarlas de una vez
  - Integrar Katalon dentro de un flujo de intergración continua, lo que vamos a ejecutar son suites!
- Git
- Cómo integrar unas pruebas realizadas en Katalon dentro de un proceso de Integración continua.
- Pruebas servicios WEB

# Integración continua!

Tener continuamente en el entorno de integración la última versión del sistema que hayan desarrollado los desarrolladores 
siendo sometida a pruebas automatizadas.

En nuestro caso, las pruebas las hemos automatizado con Katalon.

## Proceso de Integración continua (Pipelines) = PROGRAMA (SCRIPT)

Anthill, Jenkins, Bamboo...

Al final, todas esas herramientas lo que me permiten es definir un script que vaya realizando distintas tareas:
                                                                                                              HERRAMIENTA ASOCIADA
- 1º Extraer el código del proyecto principal que han dejado los desarrolladores en un SCM(git)                     git
- 2ª Compilamos y empaquetamos ese código                                                                           java -> ant, maven, gradle?
                                                                                                                                - javac
                                                                                                                                - jar
- 3º Ejecutar las pruebas unitarias (JUNIT, TESTNG)
- 4º Solicitamos a SonarQube un análisis de calidad de código
- 5º Instalar el sistema en el entorno de Integración (puede ser que previamente necesitemos CREAR ese entorno de integración)
- 6º Ejecutar las pruebas de Integración / Sistema <<<<< KATALON
- 7º Recopilar los informes de las pruebas:
  - Generar una web con ellos, enviarlos por email...


# Para hacer esto la principal SOLUCION o ALTERNATIVA (no es la única)

Es usar una herramienta que se llama Katalon Test Runner

Nos permite ejecutar una SUITE DE PRUEBAS desde la linea de comandos.
Lanzar un comando que ejecuta una suite de pruebas... y genera unos informes de pruebas


Lo primero que necesitamos para hacer esto es esa herramienta Katalon runner:
- 1 - Descargar Katalon Runner de la web de katalon y montarlo en un servidor, desde el que voy a ejecutar las pruebas. ESTO NO SE HACE A DIA DE HOY !
- 2 - Montar un contenedor con Katalon Runner

## Contenedor

Un contenedor es un entorno aislado dentro de un SO con Kernel Linux donde ejecutar procesos.
Los contenedores son una ALTERNATIVA a las más tradicionales (y obsoletas para la mayor parte de escenarios) MAQUINAS VIRTUALES
                                                                                                                  VIRTUALBOX, HYPERV, VMWARE
Los contenedores es la forma estandar a día de hoy de EJECUTAR SOFTWARE EN ENTORNOS DE PRODUCCION !!!!

Los contenedores se crean desde IMAGENES DE CONTENEDOR

# Imágen de contenedor

Un archivo comprimido (tar) que contiene un programa YA INSTALADO Y CONFIGURADO DE ANTEANO POR ALGUIEN
Ese alguien suele ser EL FABRICANTE DEL SOFTWARE !

Office en mi máquina
MongoDB               -> C:\ArchivosDePrograma\Mongo -> zip -> email -> lo descomprimis en la misma ruta... OS FUNCIONA???? Ni de coña!
Jenkins
SOnarqube
Katalon Runner

En windows podemos ejecutur contenedores? NO
En macOS podemos ejecutur contenedores? NO

Lo que hacemos son trucos rastreros...
ME descargo una herramienta como Docker Dektop para Windows, Podman para Windows
Docker/podman son GESTORES DE CONTENEDORES
Lo que hacen esas herramientas es montar una máquina virtual (con hyperV o con ahora el WSL), donde se ejeuctan los contenedores

KAtalon nos genera el comando del contenedor de docker... casi... hay que cambiar un par de coas:

# Esto es lo que genera
katalonc -noSplash -runMode=console -projectPath="C:\Users\ivano\git\pruebasKatalon\Prueba1.prj" -retry=0 -testSuitePath="Test Suites/WebReservaCitas/Pruebas de login" -browserType="Chrome" -executionProfile="default" -apiKey="e39827af-76ae-4c8c-81e3-ae1aefcb663f" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
********(1)                         ************************************************************
Se eemplaza por                         Lo eliminamos
# Esto es lo que queremos

docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project  \ ****** ESTA LINEA (1)
    -noSplash -runMode=console -retry=0 -testSuitePath="Test Suites/WebReservaCitas/Pruebas de login" -browserType="Chrome" -executionProfile="default" -apiKey="e39827af-76ae-4c8c-81e3-ae1aefcb663f" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

# Pruebas de servicios Web

## Qué es un servicio WEB?

Un programa que montamos en un servidor WEB (con el que hablaremos por protocolo HTTP)
A ese programa le podemos pedir ciertas operaciones (endpoints)
Depende de la operación que solicité, necesitaré o no mandar unos datos
  Y recibiré o no datos de respuesta

Es el equivalente a una página web....
Solo que en una página web, lo que recibo es los datos en un formato NEUTRO en lugar de HTML

HTML que incluye?
datos(información), pero en un formato (HTML) que está orientado a la representación
de esos datos en una pantalla para ser consumida por los ojos de un ser humano.

Formatos neutros de representación de datos?
- XML         Me interesa tener mi propio protocolo: SOAP : Simple Object Access Protocol (a su vez, este protocolo por debajo usa HTTP-> TCP)
- JSON        *** REST... Lo cierto es que REST no es un protocolo... solo un conjunto de restrcciones en el uso del protocolo HTTP

Protocolo? Conjunto de normas
Protocolos de comunicación? EL QUE USAMOS CUANDO HABLAMOS POR RADIO O UN WALKIE TALKIE

 Cuando acabo suelto CAMBIO
 Cuando acabo del todo: CORTO

Y además, no hay interacturación.
Cuando trabajo con un servicio:
- Hago una petición
- Y obtengo una respuesta!
- Y PUNTO PELOTA !

Esos servicios... en algún sitio ha de esta apuntado, cómo debo llamarlos, cuáles hay disponibles, 
qué datos debo suministrar cuando los llamo... y que datos me va a devolver.
SOAP:       Los Archivos WSDL me especifican cómo se han montado unos servicios y cómo interacturar con ellos.
REST:       Los archivos SWAGGER -> OPENAPI me especifican cómo se han montado unos servicios y cómo interacturar con ellos.

PRUEBAS DE SERVICIOS
Hacemos una petición a un servicio: Qué datos envío
Y obtengo una respuesta: Qué querré validar... principalmente comprobando los datos de vuelta

El protocolo HTTP es como  cuando amazon me manda un paquete.
  Una figura del mandaloriano !!!!

En una caja
  Dentro de la caja: Muñeco del mandaloriano!
  Y esa caja por fuera lleva una pegatina, con datos adicionales:
    - Destinatario
    - Peso
    - Fecha
    - Tratar con cuidado

HTTP hace lo mismo:
  BODY: Se mete un contenido que se envía (datos)
  HEADERS: ETIQUETAS con informaicón adicional:
    - El tipo de contenido que se está mandando: Content-type

Cuando llamamos a un sevicio web por HTTP, el servicio web emite una REPSUESTA
Dentro de esa respuesta, también se mandan unos metadatos (headers)
Un metadato que siempre recibimos al hacer una petición por HTTP:
- response code   Éste indica que tal ha ido el procesamiento de la petición
  2XX     Que ha ido bien esa petición
    200     Se ha procesado correctamente
    201     Se ha creado algo correctamente
    202

  3XX     REDIRECCION. El servidor nos manda hacia otra URL para que procese nuestra petición

  4XX     ERROR del cliente que ha realizado la petición: Me has mandado mal los datos.. o la operación que me pides no existe...

  5XX     ERROR del servidor... Se me aido la BBDD y no te puedo atender... Hay un bug.... Demasiadas peticiones estoy atendiendo...
