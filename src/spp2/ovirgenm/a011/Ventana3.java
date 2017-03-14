/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a011;
import java.awt.*;
/**
 *
 * @author Orianna
 */
public class Ventana3 extends Frame  {
//Atributos: 5 botones.
    private final Button btn1;
    private final Button btn2;
    private final Button btn3;
    private final Button btn4;
    private final Button btn5;
    private final Button btn6;
    private final Button btn7;
    private final Button btn8;
    private final Button btn9;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana3 (){
        super("GridLayout");
        setLayout(new GridLayout());
        
        btn1 = new Button("Soy el boton 1");
        add (btn1 );
        btn2 = new Button ("Soy el boton 2");
        add (btn2 );
        btn3 = new Button ("Soy el boton 3");
        add (btn3 );
        btn4 = new Button ("Soy el boton 4");
        add (btn4 );
        btn5 = new Button ("Soy el boton 5");
        add (btn5 );
        btn6 = new Button ("Soy el boton 6");
        add (btn6 );
        btn7 = new Button ("Soy el boton 7");
        add (btn7 );
        btn8 = new Button ("Soy el boton 8");
        add (btn8 );
        btn9 = new Button ("Soy el boton 9");
        add (btn9 );
        
        
        setSize(500,500);
        setVisible(true);
    
    }
    }
    

