import javax.swing.*;
public class Cebolla {
	public static void main(String[] args) {
		int m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas:"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas:"));
		int matriz[][]=new int[m][n];
		int i,j;
		int d1,d2,d3,d4;
		for(i=0;i<matriz.length;i++)
			for(j=0;j<matriz[i].length;j++){
				d1=i+1;
				d2=j+1;
				d3=matriz.length-i;
				d4=matriz[i].length-j;
				if(d1<=d2&&d1<=d3&&d1<=d4)
					matriz[i][j]=d1;
				else 
					if(d2<=d1&&d2<=d3&&d2<=d4)
						matriz[i][j]=d2;
				else 
					if(d3<=d2&&d3<=d1&&d3<=d4)
						matriz[i][j]=d3;
				else
					matriz[i][j]=d4;
			}
		System.out.println("\n\tMatriz de"+" "+m+" "+"por"+" "+n+"\n");
		for(i=0;i<matriz.length;i++){
			System.out.println();
			for(j=0;j<matriz[i].length;j++)
				System.out.print("\t"+matriz[i][j]);
		}
	}
}
