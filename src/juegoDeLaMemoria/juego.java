package juegoDeLaMemoria;

import javax.swing.JOptionPane;
import java.util.Random;

public class juego {

	public static void main(String[] args) {

		int[] numerosYSuPar = {1,1,2,2,3,3,4,4};
		int[] numerosAleatoriosSinRepetir = new int[numerosYSuPar.length];
		int[][] tablero = new int[2][numerosYSuPar.length];

//		se define el orden de los pares
//		se carga la segunda fila del array(tablero) que se muestra en pantalla
		for (int i = 0; i < numerosYSuPar.length; i++) {
			numerosAleatoriosSinRepetir(numerosYSuPar, numerosAleatoriosSinRepetir, i);
			tablero[1][i] = 0;
		}

		// se insertan los pares en la "mesa de juego" en orden aleatorio
		for (int i = 0; i < tablero[0].length; i++) {
			tablero[0][i] = numerosYSuPar[numerosAleatoriosSinRepetir[i]];
			System.out.println(tablero[0][i] + " " + tablero[1][i]);
		}

//		-----------------------------------------------
//		COMIENZA EL JUEGO

		int eleccion1, eleccion2, finDelJuego = 0, cantidadDeMovimientos = 0;

		JOptionPane.showMessageDialog(null,
				"-- Juego de la Memoria --\nEncuentra el número con su par correspondiente.");

		do {
			eleccion1 = Integer.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n"
					+ tablero[1][0] + tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));

			while (tablero[1][eleccion1 - 1] != 0) {
				eleccion1 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));
			}

			if (eleccion1 == 1) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[0][0]
								+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[0][0]
									+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso1(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 2) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[0][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[0][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso2(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 3) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[0][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[1][1] + tablero[0][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso3(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 4) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[1][2] + tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[1][1] + tablero[1][2] + tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso4(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 5) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso5(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 6) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso6(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 7) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]));
				}

				finDelJuego = segundaEleccionCaso7(eleccion1, eleccion2, finDelJuego, tablero);
			} else if (eleccion1 == 8) {
				eleccion2 = Integer
						.parseInt(JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
								+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]));

				while (tablero[1][eleccion2 - 1] != 0) {
					eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog("Movimientos: " + cantidadDeMovimientos + "\nIngrese el numero de la posicion (1-8)\n" + tablero[1][0]
									+ tablero[1][1] + tablero[1][2] + tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]));
				}

				finDelJuego = segundaEleccionCaso8(eleccion1, eleccion2, finDelJuego, tablero);
			} else {
				JOptionPane.showMessageDialog(null, "Error");
			}

			cantidadDeMovimientos++;
			// el contador se carga cuando se encuentra un par
		} while (finDelJuego != 4);

		JOptionPane.showMessageDialog(null, "¡Ganaste!");
	}
	

	public static int[] numerosAleatoriosSinRepetir(int[] cantidadDePares, int[] largoDelTablero, int i) {
		int cont = 0;
		Random rnd = new Random();

		if (i == 0) {
			largoDelTablero[i] = rnd.nextInt(cantidadDePares.length);
		} else {
			largoDelTablero[i] = rnd.nextInt(cantidadDePares.length);
			do {
				if (largoDelTablero[i] == largoDelTablero[cont]) {
					largoDelTablero[i] = rnd.nextInt(cantidadDePares.length);
					cont = 0;
				} else {
					cont++;
				}
			} while (cont < i);
		}

		return largoDelTablero;
	}

	public static int segundaEleccionCaso1(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {

		if (eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else if (eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else if (eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else if (eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else if (eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else if (eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else if (eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error");
		}

		return finDelJuego;
	}

	public static int segundaEleccionCaso2(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {

		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}

	public static int segundaEleccionCaso3(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {

		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}

	public static int segundaEleccionCaso4(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {

		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}

	public static int segundaEleccionCaso5(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {

		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}

	public static int segundaEleccionCaso6(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {

		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[0][5] + tablero[1][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}

	public static int segundaEleccionCaso7(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {
		
		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[0][6] + tablero[1][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 8) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}
	
	public static int segundaEleccionCaso8(int eleccion1, int eleccion2, int finDelJuego, int[][] tablero) {
		
		if(eleccion2 == 1) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[0][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 2) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[0][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 3) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[0][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 4) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[0][3] + tablero[1][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 5) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[0][4] + tablero[1][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 6) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[0][5] + tablero[1][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else if(eleccion2 == 7) {
			JOptionPane.showMessageDialog(null, "Posiciones elegidas\n" + tablero[1][0] + tablero[1][1] + tablero[1][2]
					+ tablero[1][3] + tablero[1][4] + tablero[1][5] + tablero[0][6] + tablero[0][7]);

			if (tablero[0][eleccion1 - 1] == tablero[0][eleccion2 - 1]) {
				tablero[1][eleccion1 - 1] = tablero[0][eleccion1 - 1];
				tablero[1][eleccion2 - 1] = tablero[0][eleccion2 - 1];
				finDelJuego++;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
		return finDelJuego;
	}
	
	
}