Proceso TablasMultiplicar
	Definir contador,contador2, numUsuario, resultado Como Entero;
	Escribir "Dame un número del 1 al 10";
	Leer numUsuario;
	contador2 = 1;
	Para contador=1 Hasta 10 Hacer
		resultado = contador2 * contador;
		Escribir contador2, " x ", contador, " = ", resultado;
		Si contador == 10 Y contador2 < numUsuario Entonces
			contador = 0;
			contador2 = contador2 + 1;
		FinSi
	FinPara
FinProceso
