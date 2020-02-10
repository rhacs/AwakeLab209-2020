// @author: Ricardo A. Hermosilla Carrillo
// @email: ra.hermosillac@gmail.com
// @date: Enero 29, 2020

// Descripcion del Problema
// Construir un programa principal de tipo menu en el cual se realizara una llamada a cada
// funcion que realizara tareas independientes.
// Menu
// 1. Secuencial
//    Pedir 3 numeros, mostrar promedio
// 2. Condicional Si Entonces
//    En un lugar tradicional antiguo se pedira nombre y genero de la persona, siendo el genero
//    determinante para derivarlo al bano de la mujeres u hombres.
// 3. Condicional Si Entonces anidado
//    Considerar funcion 2 y adicionar cobro de $250 si desea utilizar el bano o $2500 si desea
//    utilizar la ducha
// 4. Condicional Segun
//    Ingrese un numero del 1 al 10 y mostrar el numero en palabras
// 5. Repetitiva Mientras
//    Ingresar N numeros, detener el ingreso al digitar un cero, terminando el proceso. Mostrar
//    la cantidad de numeros ingresados excluyendo el cero, finalmente, calcular el promedio de
//    estos numeros
// 6. Repetitiva Repetir
//    Ingresar N nombres con J, cuando ingrese el nombre "Juan" me diga "Ganaste" y muestre la
//    cantidad de intentos antes de haber ganado.
// 7. Repetitiva Para
//    Para un maximo de 10 personas, preguntar su nombre y mostrar los que se repiten mas de 
//    una vez, en caso que los nombres no se repitan, mostrar que no existen nombres repetidos
// 8. Arreglo Simple
//    Pedir el tamano de un arreglo en el cual debo ingresar la lista de Talentos Digitales 
//    Full Stack Java para luego desplegarlos en pantalla con un maximo de 5 alumnos por linea
// 9. Arreglo Bidimensional
//    Ingresar nombre, apellido, fono e email de cada participante del curso Full Stack Java
//    Trainee, mostrar todos los datos de cada alumno en 1 linea.
// 0. Salir

// Auxiliares (repetitivos) ------------------------------------

Funcion mostrarMenu()
    Escribir "Menu";
    Escribir " [1] Calcular el promedio de 3 numeros.";
    Escribir " [2] Dilema de los Banos.";
    Escribir " [3] Bano o Ducha.";
    Escribir " [4] De numero a palabras.";
    Escribir " [5] Promedio de N elementos.";
    Escribir " [6] Nombres que comienzan con J.";
    Escribir " [7] Nombres Repetidos.";
    Escribir " [8] N Alumnos";
    Escribir " [9] Directorio";
    Escribir " [0] Salir";
FinFuncion

Funcion pedirTecla()
    Escribir "";
    Escribir "Presione una tecla para volver al menu principal.";
    Esperar Tecla;
FinFuncion

// Funciones para Menu ------------------------------------------

Funcion promedioTresNumeros()
    Definir numero, i, total Como Entero;
    Definir promedio Como Real;
    
    total <- 0;
    Para i <- 0 Hasta 2 Hacer
        Escribir "Ingrese el numero #", i + 1;
        Leer numero;
        
        total <- total + numero;
    FinPara
    
    promedio <- total / 3;
    Escribir "El promedio es: ", promedio;
FinFuncion

Funcion dilemaBanos() 
    Definir nombre, genero Como Caracter;
    
    Escribir "Escriba su nombre";
    Leer nombre;
    
    Repetir
        Escribir nombre, ", por favor ingrese su genero (f/femenino/m/masculino):";
        Leer genero;
    Hasta Que (genero = "masculino" || genero = "m" || genero = "femenino" || genero = "f");
    
    Escribir nombre, ", por favor dirijase al bano para " Sin Saltar;
    Si (genero = "f" || genero = "femenino") Entonces
        Escribir "las damas.";
    SiNo
        Escribir "los varones.";
    FinSi
FinFuncion

Funcion banoDucha()
    Definir opcion, total Como Entero;
    
    Repetir
        Escribir "Escoja una de las opciones";
        Escribir " [1] Bano.";
        Escribir " [2] Ducha.";
        Escribir " [3] Ambas.";
        Leer opcion;
    Hasta Que (opcion = 1 || opcion = 2 || opcion = 3);
    
    Si (opcion = 1) Entonces
        total <- 250;
    SiNo
        Si (opcion = 2) Entonces
            total <- 2500;
        SiNo
            total <- 2750;
        FinSi
    FinSi
    
    Escribir "El costo le sera de: $", total;
FinFuncion

Funcion numeroPalabra()
    Definir numero como Entero;
    
    Repetir
        Escribir "Ingrese un numero entre 0 y 9";
        Leer numero;
    Hasta Que (numero >= 0 && numero < 10);
    
    Segun numero Hacer
        0:
            Escribir "Cero";
        1:
            Escribir "Uno";
        2:
            Escribir "Dos";
        3:
            Escribir "Tres";
        4:
            Escribir "Cuatro";
        5:
            Escribir "Cinco";
        6:
            Escribir "Seis";
        7:
            Escribir "Siete";
        8:
            Escribir "Ocho";
        9:
            Escribir "Nueve";
    FinSegun
FinFuncion

Funcion promedioNElementos()
    Definir contador, total, numero Como Entero;
    Definir promedio Como Real;
    
    contador <- 0;
    total <- 0;
    Escribir "Por favor, ingrese un numero por linea. Para salir digite 0 (cero)";
    Repetir
        Leer numero;
        
        Si (numero <> 0) Entonces
            total <- total + numero;
            contador <- contador + 1;
        FinSi
    Hasta Que (numero = 0);
    
    promedio <- total / contador;
    Escribir "Numeros ingresados: ", contador;
    Escribir "Promedio: ", promedio;
FinFuncion

Funcion hastaJuan()
    Definir nombre, inicial Como Caracter;
    Definir intentos Como Entero;
    
    intentos <- 0;
    
    Escribir "Por favor, ingrese nombres que inicien con J.";
    Repetir
        Leer nombre;
        Si (nombre <> "") Entonces
            inicial <- SubCadena(nombre, 0, 0);
            
            Si (minusculas(inicial) <> "j") Entonces
                Escribir nombre, " no inicia con J.";
            FinSi
            
            intentos <- intentos + 1;
        SiNo
            Escribir "Por favor, ingrese un nombre valido.";
        FinSi
    Hasta Que (nombre = "Juan" || nombre = "juan");
    
    Escribir "Ganaste, Juan!";
    Escribir "Total de intentos: ", intentos;
FinFuncion

Funcion nombresRepetidos()
    Definir tamano, i, j Como Entero;
    Definir nombres, nombre Como Caracter;
    
    tamano <- 10;
    Dimension nombres[tamano];
    
    Para i <- 0 Hasta (tamano - 1) Hacer
        Escribir "Ingrese el nombre para el individuo #", i + 1;
        
        Repetir
            Leer nombre;
            
            Si (nombre = "") Entonces
                Escribir "Por favor, ingrese un nombre valido";
            SiNo
                nombres[i] <- nombre;
            FinSi
        Hasta Que (nombre <> "");
    FinPara
    
    Definir alMenosUno Como Logico;
    Definir repeticiones Como Entero;
    Dimension repeticiones[tamano];
    alMenosUno <- Falso;
    
    // Rellenar con ceros
    Para i <- 0 Hasta (tamano - 1) Hacer
        repeticiones[i] <- 0;
    FinPara
    
    // Buscar repetidos
    Escribir "Coincidencias";
    Para i <- 0 Hasta (tamano - 1) Hacer
        Para j <- 0 Hasta (tamano - 1) Hacer
            Si (j <> i) Entonces
                Si (nombres[i] = nombres[j]) Entonces
                    alMenosUno <- Verdadero;
                    Escribir " - ", nombres[i];
                    nombres[i] <- ConvertirATexto(-i);
                FinSi
            FinSi
        FinPara
    FinPara
    
    Si (!alMenosUno) Entonces
        Escribir " - No se encontraron repeticiones.";
    FinSi
FinFuncion

Funcion numeroDeAlumnos()
    Definir nombre, nombres Como Caracter;
    Definir tamano, i Como Entero;
    
    Repetir
        Escribir "Ingrese el tamano del arreglo (mayor que cero)";
        Leer tamano;
    Hasta Que (tamano > 0);
    
    Dimension nombres[tamano];
    
    Escribir "Ingrese los nombres de los ", tamano, " alumnos. Uno por linea.";
    Para i <- 0 Hasta (tamano - 1) Hacer
        Repetir
            Leer nombre;
            
            Si (nombre = "") Entonces
                Escribir "Por favor, ingrese un nombre valido.";
            SiNo
                nombres[i] <- nombre;
            FinSi
        Hasta Que (nombre <> "");
    FinPara
    
    Escribir "Alumnos ingresados (", tamano, "):";
    Para i <- 1 Hasta tamano Hacer
        Escribir nombres[i - 1], ", " Sin Saltar;
        
        Si (i > 0 && i % 5 = 0) Entonces
            Escribir "";
        FinSi
    FinPara
    
    Escribir "";
FinFuncion

Funcion directorio() 
    Definir datos Como Caracter;
    Definir tamano, i Como Entero;
    
    Repetir
        Escribir "Ingrese la cantidad de alumnos (mayor que cero)";
        Leer tamano;
    Hasta Que tamano > 0;
    
    Dimension datos[tamano, 4];

    Para i <- 0 Hasta (tamano - 1) Hacer
        Escribir "Ingrese los datos del alumno #", i + 1;
        Escribir "Nombre: " Sin Saltar;
        Leer datos[i, 0];
        
        Escribir "Apellido: " Sin Saltar;
        Leer datos[i, 1];
        
        Escribir "Telefono: " Sin Saltar;
        Leer datos[i, 2];
        
        Escribir "Email: " Sin Saltar;
        Leer datos[i, 3];
    FinPara
    
    Escribir "";
    Escribir "Detalle de Alumnos";
    Para i <- 0 Hasta (tamano - 1) Hacer
        Escribir datos[i, 1], ", ", datos[i, 0], ". T: ", datos[i, 2], ". E: ", datos[i, 3];
    FinPara
    
FinFuncion

// Main Loop -----------------------------------------------

Proceso Evaluacion
    Definir opcionMenu Como Entero;
    
    Repetir
        Limpiar Pantalla;
        mostrarMenu();
        Leer opcionMenu;
        
        Limpiar Pantalla;
        Segun opcionMenu Hacer
            1:
                promedioTresNumeros();
                pedirTecla();
            2:
                dilemaBanos();
                pedirTecla();
            3:
                dilemaBanos();
                banoDucha();
                pedirTecla();
            4:
                numeroPalabra();
                pedirTecla();
            5:
                promedioNElementos();
                pedirTecla();
            6:
                hastaJuan();
                pedirTecla();
            7:
                nombresRepetidos();
                pedirTecla();
            8:
                numeroDeAlumnos();
                pedirTecla();
            9:
                directorio();
                pedirTecla();
            0:
                Escribir "Gracias, que tenga buen dia";
        FinSegun
    Hasta Que opcionMenu = 0;
FinProceso
