import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caballo{
	public static void main(String[] args)  throws IOException {
		int recorrido[]=new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca la cantidad de casos de prueba: ");
        int cantidad=Integer.parseInt(br.readLine());
        for(int i=0;i<cantidad;i++) {
        	String s = br.readLine();
        	String[] splitStr = s.split("\\s+");
        	for(int j=0;j<4;j++) {
        		recorrido[j]=Integer.parseInt(splitStr[j]);
        	}
        	int inix=recorrido[0];
        	int iniy=recorrido[1];
        	int finx=recorrido[2];
        	int finy=recorrido[3];
        	int total = 0;
        	while(inix!=finx||iniy!=finy) {
        		if(inix<finx&&inix<6&&inix>=0 && iniy<finy&&iniy<7&&iniy>=0) {
        			inix=inix+2;
        			iniy=iniy+1;
        		}else if(inix<finx&&inix>=6&&inix>=0 && iniy<finy&&iniy<7&&iniy>=0) {
        			inix=inix+1;
        			iniy=iniy+2;
        		}else if(inix==finx&&inix>6&&inix>=0 && iniy<finy&&iniy<7&&iniy>=0) {
        			inix=inix-2;
        			iniy=iniy+1;
        		}
        		total++;
        	}
        	System.out.println(total);
        }
	}
}