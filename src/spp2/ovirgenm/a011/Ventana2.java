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
public class Ventana2 extends Frame  {
    //Atributos: 5 botones.
    private final Button btnNorte;
    private final Button btnSur;
    private final Button btnEste;
    private final Button btnOeste;
    private final Button btnCentro;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Ventana2 (){
        super("BorderLayout");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("Norte");
        add (btnNorte,BorderLayout.NORTH );
        btnSur = new Button ("Sur");
        add (btnSur,BorderLayout.SOUTH );
        btnEste = new Button ("Este");
        add (btnEste,BorderLayout.EAST );
        btnOeste = new Button ("Oeste");
        add (btnOeste,BorderLayout.WEST );
        btnCentro = new Button ("Centro");
        add (btnCentro,BorderLayout.CENTER );
        
        setSize(800,600);
        setVisible(true);
    
    }
    }

    
