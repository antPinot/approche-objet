package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char operateur) {
		if (operateur == '+') {
			return a+b;
		}
		else if (operateur == '-') {
			return a-b;
		}
		else if (operateur == '*') {
			return a*b;
		}
		else if (operateur == '/') {
			return a/b;
		}
		else {
			return 0.0;
		}
	}

}

/*switch (operateur) {
case '+':
	return a + b;
	break;
case '-':
	return a - b;
	break;
case '*':
	return a * b;
	break;
case '/':
	return a / b;
	break;
default:
	return 0.0;
}*/