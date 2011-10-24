import java.util.Scanner;

public class SegundoGrau {
	public static void main(String[] args){
		Scanner entrada= new Scanner(System.in);
		System.out.println("Informe Coeficiente A,B e C");
		String s=entrada.nextLine();
		double[] d=Converte(s);
		if(Delta(d)>=0){
			double[] resultato=Calcula(d);
			System.out.println(resultato[0]);
			if(resultato[0]!=resultato[1]){
				System.out.println(resultato[1]);
			}
		}else{
			System.out.println("Não Existe Raiz Real");
		}
	}
	public static double[] Calcula(double [] d) {
		double[] resultado={0,0};
		if(d[0]==0){
			resultado[0]=-d[2]/d[1];
			resultado[1]=resultado[0];
		}else{
			resultado[0]=(-d[1]+Math.sqrt(Delta(d)))/2*d[0];
			resultado[1]=(-d[1]-Math.sqrt(Delta(d)))/2*d[0];
		}
		return resultado;
	}
	public static double Delta(double[] d) {
		double delta=Math.pow(d[1],2)-4*d[0]*d[2];
		return delta;
	}
	public static double[] Converte(String s) {
		String[] coef=s.split(" ");
		double[] d = new double[]{0,0,0};
		d[0]=Double.valueOf(coef[0]);
		d[1]=Double.valueOf(coef[1]);
		d[2]=Double.valueOf(coef[2]);
		return d;
	}
}
