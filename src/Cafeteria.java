
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Cafeteria {
	
//Declaración de variables
private double precio,cant, cant1, cant2, cant3, cant4, cant5, cant6 ,cant7, cant8, cant9, cant10, cant11, cant12, precio_total,jbtot,jbdes;
private int lol;
private String hola;
private double h;

//Métodos de la clase
public void FijarValor(double cantv, double preciov)
{
cant=cantv;
precio=preciov;


}



public void Fijar_preciototal(double preciotv) {
	precio_total=preciotv;
}

public double Preciosf ()
{
	double respuesta;
	respuesta= cant*precio;
	return respuesta;
}

public double JubiladoTotal() 
{
	jbtot = precio_total*0.80;
	return jbtot;
}

public double JubiladoDescuento() 
{
	jbdes = precio_total*0.20;
	return jbdes;
}

public double Cantidad1 ()
{
	cant1= cant1 + cant;
	return cant1;
}
public double Cantidad2 ()
{
	cant2= cant2 + cant;
	return cant2;
}
public double Cantidad3 ()
{
	cant3= cant3 + cant;
	return cant3;
}
public double Cantidad4 ()
{
	cant4= cant4 + cant;
	return cant4;
}
public double Cantidad5 ()
{
	cant5= cant5 + cant;
	return cant5;
}
public double Cantidad6 ()
{
	cant6= cant6 + cant;
	return cant6;
}
public double Cantidad7 ()
{
	cant7= cant7 + cant;
	return cant7;
}
public double Cantidad8 ()
{
	cant8= cant8 + cant;
	return cant8;
}
public double Cantidad9 ()
{
	cant9= cant9 + cant;
	return cant9;
}
public double Cantidad10 ()
{
	cant10= cant10 + cant;
	return cant10;
}
public double Cantidad11 ()
{
	cant11= cant11 + cant;
	return cant11;
}

public double Cantidad12 ()
{
	cant12= cant12 + cant;
	return cant12;
}

public double Cantidad13 ()
{
	double cantidad 13=1;
	return cantidad 13;
	
}

	//Programa Principal
	public static void main(String[] args) {
		
		//Declaración de variables
		double cantv, preciov=0, precio1=0, precio2=0, precio3=0, precio4=0, precio5=0, precio6=0, precio7=0, precio8=0, precio9=0, precio10=0, precio11=0, precio12=0;
		double cant1=0, cant2=0, cant3=0, cant4=0, cant5=0, cant6=0, cant7=0 ,cant8=0, cant9=0, cant10=0, cant11=0, cant12=0, extra=0,cont=0;
		int entv = 0, stars=0, valoracion=0,contcliente=0 ;
		double total=0,preciotv = 0;
		double jbtotal, jbdescuento = 0;
		double descuento = 0, preciocondesc;
		double cont_prec1 = 0,cont_prec2 = 0,cont_prec3 = 0,cont_prec4 = 0,cont_prec5 = 0,cont_prec6 = 0,cont_prec7 = 0,cont_prec8 = 0,cont_prec9 = 0,cont_prec10 = 0,cont_prec11 = 0,cont_prec12 = 0;
		double porcentaje_item1=0,porcentaje_item2=0,porcentaje_item3=0,porcentaje_item4=0,porcentaje_item5=0,porcentaje_item6=0,porcentaje_item7=0,porcentaje_item8=0,porcentaje_item9=0,porcentaje_item10=0,porcentaje_item11=0,porcentaje_item12=0;
		char a='s', b='s', caramelo,comboagrandado, jubilado;
		
		
		//Creación del objeto
		Scanner sc=new Scanner(System.in);
		Cafeteria ors=new Cafeteria();
		LocalDateTime dateTime = LocalDateTime.now(); // tiempo
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		System.out.printf ("\nBuenas usuario mal pagado.");
		System.out.printf ("\nCINEMA MASTERS UTEPEÑO V.0.9.2.3 BETA. Ingrese los datos solicitados.");
		
	while (a=='s')
	{
		
		contcliente += 1;
		while (b=='s')
		{
		//Menú
		System.out.printf ("\nIngrese el código de producto (1-12)");

		
		System.out.printf ("\n[1] Popcorn Chico----------------------------------> $1.25");
		System.out.printf ("\n[2] Popcorn Mediano--------------------------------> $2.00");
		System.out.printf ("\n[3] Popcorn Grande --------------------------------> $3.00");
		System.out.printf ("\n[4] Hotdog ----------------------------------------> $2.50");
		System.out.printf ("\n[5] Refrescos Pequeño -----------------------------> $1.30"); 
		System.out.printf ("\n[6] Refresco Mediano ------------------------------> $2.00");
		System.out.printf ("\n[7] Refresco Grande--------------------------------> $2.75"); 
		System.out.printf ("\n[8] Agua ------------------------------------------> $1.50");
		System.out.printf ("\n[9] Chocolate--------------------------------------> $1.75");
		System.out.printf ("\n[10] Combo1(Popcorn Mediano, Refresco Grande-------> $4.50"); 
		System.out.printf ("\n[11] Combo2(Hotdog, Refresco Grande)---------------> $5.00");
		System.out.printf ("\n[12] Combo3(Popcorn Grande, 2 Refrescos Medianos---> $6.80");		
		
		try {
		entv = sc.nextInt();
		}
		catch (Exception e) {
			System.out.print("Algo salió mal.");
			break;
		}
		
		try {
			
			System.out.printf ("\n¿Cuántas órdenes desea?");
			cantv = sc.nextDouble();
			sc.nextLine();
			switch ( entv ) {
		    case 1:
		    	preciov= 1.25;
		    	ors.FijarValor(cantv, preciov);
		    	cant1= ors.Cantidad1();
		    	ors.FijarValor(cantv, preciov);
		    	precio1= ors.Preciosf() + precio1;
		    	System.out.printf ("\n¿Desea agregar caramelo a las palomitas? (s/n)");
		    	caramelo = sc.next().charAt(0);
		    	if (caramelo == 's')
		    	{
		    		extra = extra + 0.5*cant1;
		    		precio1 = precio1 + 0.5*cant1;
		    	}
		        break;
		    case 2:
		    	preciov= 2.00;
		    	ors.FijarValor(cantv, preciov);
		    	cant2= ors.Cantidad2();
		    	ors.FijarValor(cantv, preciov);
		    	precio2= ors.Preciosf() + precio2;
		    	System.out.printf ("\n¿Desea agregar caramelo a las palomitas? (s/n)");
		    	caramelo = sc.next().charAt(0);
		    	if (caramelo == 's')
		    	{
		    		extra = extra + 0.5*cant2;
		    		precio2  =precio2 + 0.5*cant2;
		    		
		    	}
		        break;
		    case 3:
		    	preciov= 3;
		    	ors.FijarValor(cantv, preciov);
		    	cant3= ors.Cantidad3();
		    	ors.FijarValor(cantv, preciov);
		    	precio3= ors.Preciosf() + precio3;
		    	System.out.printf ("\n¿Desea agregar caramelo a las palomitas? (s/n)");
		    	sc.nextLine();
		    	caramelo = sc.next().charAt(0);
		    	if (caramelo == 's')
		    	{
		    		precio3  =precio3 + 0.5;
		    	}
		        break;	
	        case 4:
		    	preciov= 2.5;
		    	ors.FijarValor(cantv, preciov);
		    	cant4= ors.Cantidad4();
		    	ors.FijarValor(cantv, preciov);
		    	precio4= ors.Preciosf() + precio4;
		    	break;
	        case 5:
		    	preciov= 1.3;
		    	ors.FijarValor(cantv, preciov);
		    	cant5= ors.Cantidad5();
		    	ors.FijarValor(cantv, preciov);
		    	precio5= ors.Preciosf() + precio5;
		    	break;
	        case 6:
		    	preciov= 2;
		    	ors.FijarValor(cantv, preciov);
		    	cant6= ors.Cantidad6();
		    	ors.FijarValor(cantv, preciov);
		    	precio6= ors.Preciosf() + precio6;
		    	break;
	        case 7:
		    	preciov= 2.75;
		    	ors.FijarValor(cantv, preciov);
		    	cant7= ors.Cantidad7();
		    	ors.FijarValor(cantv, preciov);
		    	precio7= ors.Preciosf() + precio7;
		    	break;
	        case 8:
		    	preciov= 1.5;
		    	ors.FijarValor(cantv, preciov);
		    	cant8= ors.Cantidad8();
		    	ors.FijarValor(cantv, preciov);
		    	precio8= ors.Preciosf() + precio8;
		    	break;
	        case 9:
		    	preciov= 2.5;
		    	ors.FijarValor(cantv, preciov);
		    	cant9= ors.Cantidad9();
		    	ors.FijarValor(cantv, preciov);
		    	precio9= ors.Preciosf() + precio9;
		    	break;
	        case 10:
		    	preciov= 4.5;
		    	ors.FijarValor(cantv, preciov);
		    	cant10= ors.Cantidad10();
		    	ors.FijarValor(cantv, preciov);
		    	precio10= ors.Preciosf() + precio10;
		    	System.out.printf ("\n¿Desea agrandar el popcorn? (s/n)");
		    	comboagrandado = sc.next().charAt(0);
		    	if (comboagrandado == 's')
		    	{
		    		precio10 = precio10 + 2*cant10;
		    	}
		    	break;
	        case 11:
		    	preciov= 5;
		    	ors.FijarValor(cantv, preciov);
		    	cant11= ors.Cantidad11();
		    	ors.FijarValor(cantv, preciov);
		    	precio11= ors.Preciosf() + precio11;
		    	break;
	        case 12:
		    	preciov= 6.80;
		    	ors.FijarValor(cantv, preciov);
		    	cant12= ors.Cantidad12();
		    	ors.FijarValor(cantv, preciov);
		    	precio12= ors.Preciosf() + precio12;
		    	try {
			    	System.out.printf ("\n¿Desea agrandar el refresco? (s/n)");
			    	comboagrandado = sc.next().charAt(0);
			    	if (comboagrandado == 's')
			    	{
			    		precio12 = precio12 + 1.5*cant12;
			    	}
			    	break;
		    	}
		    	catch (Exception e) {
		    		System.out.print("Algo salió mal.");
		    		break;
		    	}
	
	
		    	}
				System.out.printf ("\n¿Desea agregar otro producto? (s/n)");
				b= sc.next().charAt(0);
		}
		
		catch (Exception e) {
			System.out.print("Algo salió mal");
			break;
		}
	    
		}
		
	//Jubilado
	System.out.printf ("\n¿El cliente se encuentra jubilado? (s/n)");
	jubilado = sc.next().charAt(0);
	
	
	//Impresión de la factura	
	System.out.printf ("\n                 FACTURA");
	System.out.print("\nCliente N°"+ contcliente + "              ");
	System.out.print(dateTime.format(formatter));	
	System.out.printf ("\n\nCantidad       Precio regular       Precio ");
	if (cant1>0) 
	{
	System.out.printf ("\n"+ cant1 + " X " + "  $1.25 Pop Corn Chico (E)    $%.2f" , precio1);
	}

	if (cant2>0) 
	{
	System.out.printf ("\n"+ cant2 + " X " + "  $2.00 Pop Corn Mediano (E)  $%.2f" , precio2);
	}
	
	if (cant3>0) 
	{
	System.out.printf ("\n"+ cant3 + " X " + "  $3.00 Pop Corn Grande (E)    $%.2f" , precio3);
	}
	
	if (cant4>0) 
	{
	System.out.printf ("\n"+ cant4 + " X " + "  $2.50 Hotdog (E)             $%.2f" , precio4);
	}
	
	if (cant5>0) 
	{
	System.out.printf ("\n"+ cant5 + " X " + "  $1.30 Refrescos Pequeño (E)  $%.2f" , precio5);
	}
	
	if (cant6>0) 
	{
	System.out.printf ("\n"+ cant6 + " X " + "  $2.00 Resfreco Mediano(E)    $%.2f" , precio6);
	}
	
	if (cant7>0) 
	{
	System.out.printf ("\n"+ cant7 + " X " + "  $2.75 Resfreco Grande (E)    $%.2f" , precio7);
	}
	
	if (cant8>0) 
	{
	System.out.printf ("\n"+ cant8 + " X " + "  $1.50 Agua (E)               $%.2f" , precio8);
	}
	
	if (cant9>0) 
	{
	System.out.printf ("\n"+ cant9 + " X " + "  $1.75 Chocolate (E)          $%.2f" , precio9);
	}
	
	if (cant10>0) 
	{
	System.out.printf ("\n"+ cant10 + " X " + "  $4.50 Combo1(Pm,Rg) (E)     $%.2f" , precio10);
	}
	
	if (cant11>0) 
	{
	System.out.printf ("\n"+ cant11 + " X " + "  $5.00 Combo2(H,Rg) (E)      $%.2f" , precio11);
	}
	
	if (cant12>0) 
	{
	System.out.printf ("\n"+ cant12 + " X " + "  $6.80 Combo3(Pg, 2Rm) (E)   $%.2f" , precio12);
	}
	
	//Precio total
	preciotv = precio1+precio2+precio3+precio4+precio5+precio6+precio7+precio8+precio8+precio9+precio10+precio11+precio12;
	ors.Fijar_preciototal(preciotv);
	System.out.printf("\n----------------------------------------------");
	System.out.printf("\n                             Subtotal: $%.2f", preciotv);
	

	try {
	if (jubilado == 's') {
		jbtotal = ors.JubiladoTotal();
		jbdescuento = ors.JubiladoDescuento();
		System.out.printf("\n                             Descuento: $%.2f", jbdescuento);
		System.out.printf("\n                             Total: $%.2f", jbtotal);
	}
	else {
		System.out.printf("\n                              Total: $%.2f", preciotv);
	}
	}
	
	catch (Exception e) {
		System.out.print("Algo salió mal.");
		break;
	}
	
	System.out.println("\n\nDel 1-5, ¿qué tan satisfecho se encuentra con la orden?");
	valoracion = sc.nextInt();
	if (valoracion >5) {
		valoracion = 5;
	}
	else if (valoracion<1) {
		valoracion = 1;
	}
	
	
	
	System.out.printf ("\n¿Desea hacer otro pedido? (s/n)");
	a = sc.next().charAt(0);
	if (a=='s') {
		b=a;
	
	}	
	
	//Acumuladores 
	total = total + preciotv;
	descuento = descuento + jbdescuento;
	stars = stars + valoracion;
	cont_prec1= cont_prec1 + precio1;
	cont_prec2= cont_prec2 + precio2;
	cont_prec3= cont_prec3 + precio3;
	cont_prec4= cont_prec4 + precio4;
	cont_prec5= cont_prec5 + precio5;
	cont_prec6= cont_prec6 + precio6;
	cont_prec7= cont_prec7 + precio7;
	cont_prec8= cont_prec8 + precio8;
	cont_prec9= cont_prec9 + precio9;
	cont_prec10= cont_prec10 + precio10;
	cont_prec11= cont_prec11 + precio11;
	cont_prec12= cont_prec12 + precio12;
	

		
}
	
	//Porcentajes
	porcentaje_item1 = (cont_prec1/total)*100;
	porcentaje_item2 = (cont_prec2/total)*100;
	porcentaje_item3 = (cont_prec3/total)*100;
	porcentaje_item4 = (cont_prec4/total)*100;
	porcentaje_item5 = (cont_prec5/total)*100;
	porcentaje_item6 = (cont_prec6/total)*100;
	porcentaje_item7 = (cont_prec7/total)*100;
	porcentaje_item8 = (cont_prec8/total)*100;
	porcentaje_item9 = (cont_prec9/total)*100;
	porcentaje_item10 = (cont_prec10/total)*100;
	porcentaje_item11 = (cont_prec11/total)*100;
	porcentaje_item12 = (cont_prec12/total)*100;
	
	//Impresión de la consulta
	preciocondesc = total-descuento;
	System.out.printf("\nLo que se vendió en el día: %.2f", total);
	System.out.printf("\nLo que se dio en descuento: %.2f", descuento);
	System.out.printf("\nLo que se vendió con descuento: %.2f", preciocondesc);
	System.out.println("\nPorcentaje vendido de:");
	System.out.printf("Popcorn Chico: %.2f", porcentaje_item1);
	System.out.print('%');
	System.out.printf("\nPopcorn Mediano: %.2f", porcentaje_item2);
	System.out.print('%');
	System.out.printf("\nPopcorn Grande: %.2f", porcentaje_item3);
	System.out.print('%');
	System.out.printf("\nHotdog: %.2f ", porcentaje_item4);
	System.out.print('%');
	System.out.printf("\nRefresco Pequeño: %.2f", porcentaje_item5);
	System.out.print('%');
	System.out.printf("\nRefresco Mediano: %.2f", porcentaje_item6);
	System.out.print('%');
	System.out.printf("\nRefresco Grande: %.2f", porcentaje_item7);
	System.out.print('%');
	System.out.printf("\nAgua: %.2f", porcentaje_item8);
	System.out.print('%');
	System.out.printf("\nChocolate: %.2f", porcentaje_item9);
	System.out.print('%');
	System.out.printf("\nCombo1: %.2f", porcentaje_item10);
	System.out.print('%');
	System.out.printf("\nCombo2: %.2f", porcentaje_item11);
	System.out.print('%');
	System.out.printf("\nCombo3: %.2f", porcentaje_item12);
	System.out.print('%');
	System.out.println("\nEstrellas obtenidas al final:");
	System.out.println(stars + "  de  " + contcliente*5);
<<<<<<< Updated upstream

=======
	System.out.println(ab);

    
>>>>>>> Stashed changes


}
}
	

	
		


