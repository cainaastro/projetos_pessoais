import java.util.Locale;
import java.util.Scanner;

public class mediaescolar {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, media, qf = 0;

		System.out.println("         SISTEMA DE MÉDIA ESCOLAR          ");
		System.out.println("Digite suas notas, de acordo com os bimestres!");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		System.out.println();
		
		media = ( n1 + n2 + n3 + n4)/ 4;
		
		if (media <= 6) {
			qf = 24 - (n1 + n2 + n3 + n4);
		}
		
		System.out.printf("Sua média escolar é: %.2f%n", media);
		System.out.printf("Falta exatamente %.2f pontos para você passar!", qf);
		
		sc.close();
	}
}
