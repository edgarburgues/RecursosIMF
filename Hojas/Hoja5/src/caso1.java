import java.util.Scanner;

public class caso1 {

	public static void main(String[] args) {
		// Pide un número de cursos.
		// En cada curso hay 4 alumnos.
		// Pide las notas de cada alumno.
		// Calcula la media.
		// Muestra el curso con mejor media.

		// byte cursos[][];
		byte numeroCursos;
		float[][] cursos;
		float suma = 0;
		float mediaAlta = 0;
		byte cursoAlto = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántos cursos son?: "); 
		numeroCursos = scanner.nextByte();

		cursos = new float[numeroCursos][5];	
		for (int i = 0; i < numeroCursos; i++) { 
			suma = 0;	
			System.out.println("Clase: " + (i + 1));
			for (int j = 0; j < 4; j++) { 
				System.out.print("Nota Alumno " + (j + 1) + ": ");
				cursos[i][j] = scanner.nextFloat();	
				suma += cursos[i][j]; 
				
			}

			
			cursos[i][4] = suma/4;
			if (cursos[i][4] > mediaAlta) {
				mediaAlta = cursos[i][4];
				cursoAlto = (byte) i;
			}
			
		}
		System.out.println("El curso con mejor media es el " + (cursoAlto + 1) + " con una media de " + mediaAlta);	
		
		scanner.close();
	}
}
