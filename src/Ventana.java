
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {

    ArrayList<Integer> numero = new ArrayList();
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,suma,resta,multiplicacion,division,igual,potencia,borrar,raiz,cose,borra,borra2;
    JTextField pantalla;
    Container container;
    CardLayout cardLayout;
    boolean operando = false;
    double op1;
    double op2;
    int op3;
    int tipoOperacion;

    public void initGUI(){
        instancias();
        configuracionContainer();
        setTitle("Calculadora");
        setBounds(30,30,250,350);
        setLocationRelativeTo(null);
        acciones();

        setVisible(true);
    }
    public void configuracionContainer(){
        container.add(panelSuperior(),BorderLayout.NORTH);
        container.add(panelCentro(),BorderLayout.SOUTH);
        container.add(centralCientifica(),BorderLayout.CENTER);
    }
    public JPanel panelSuperior(){
        panelSuperior.setLayout(new BorderLayout());
        panelSuperior.add(pantalla,BorderLayout.NORTH);

        return panelSuperior;
    }
    public void instancias(){
        b1 = new JButton("1");
        b1.setBackground(Color.blue);
        b2 = new JButton("2");
        b2.setBackground(Color.blue);
        b3 = new JButton("3");
        b3.setBackground(Color.blue);
        b4 = new JButton("4");
        b4.setBackground(Color.blue);
        b5 = new JButton("5");
        b5.setBackground(Color.blue);
        b6 = new JButton("6");
        b6.setBackground(Color.blue);
        b7 = new JButton("7");
        b7.setBackground(Color.blue);
        b8 = new JButton("8");
        b8.setBackground(Color.blue);
        b9 = new JButton("9");
        b9.setBackground(Color.blue);
        b0 = new JButton("0");
        b0.setBackground(Color.blue);
        suma = new JButton("+");
        suma.setBackground(Color.blue);
        resta = new JButton("-");
        resta.setBackground(Color.blue);
        raiz = new JButton("√");
        raiz.setBackground(Color.white;
        multiplicacion = new JButton("x");
        multiplicacion.setBackground(Color.white);
        division = new JButton("/");
        division.setBackground(Color.white);
        potencia = new JButton("x2");
        potencia.setBackground(Color.white);
        igual = new JButton("=");
        igual.setBackground(Color.white);
        borra = new JButton("<=");
        cose = new JButton("cos");
        cose.setBackground(Color.white;
        borrar = new JButton("C");
        borrar.setBackground(Color.white);
        pantalla = new JTextField();
        pantalla.setBackground(Color.white);

        container = this.getContentPane();
        panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.red);
        panelCentro = new JPanel();
        panelCentro.setBackground(Color.yellow);
        centralCientifica = new JPanel();
        centralCientifica.setBackground(Color.red);
        centralCientifica.setBorder(BorderFactory.createTitledBorder("CALCULADORA"));
        cambia = new JPanel();
        cambia.setBackground(Color.green);
        cambia2 = new JPanel();
        cambia2.setBackground(Color.green);
        cardLayout = new CardLayout();

    }


    public JPanel panelCentro(){
        panelCentro.setLayout(new GridLayout(5,10,0,0));
        panelCentro.add(b7);
        panelCentro.add(b8);
        panelCentro.add(b9);
        panelCentro.add(suma);
        panelCentro.add(b4);
        panelCentro.add(b5);
        panelCentro.add(b6);
        panelCentro.add(resta);
        panelCentro.add(b1);
        panelCentro.add(b2);
        panelCentro.add(b3);
        panelCentro.add(multiplicacion);
        panelCentro.add(borrar);
        panelCentro.add(b0);
        panelCentro.add(igual);
        panelCentro.add(division);
        panelCentro.add(borra);
        panelCentro.add(borra2);
        this.pack();
        return panelCentro;
    }

    public JPanel centralCientifica(){
        centralCientifica.setLayout(cardLayout);
        centralCientifica.add(cambia, Constante.B1);
        centralCientifica.add(cambia2,Constante.B4);
        cambia2.add(cose);
        cambia2.add(raiz);
        cambia2.add(potencia);
        return centralCientifica;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        switch (e.getActionCommand()) {
            case Constante.B2:
                System.out.println("ai");
                cardLayout.show(centralCientifica, Constante.B1);
                this.setBounds(30,30,250,270);
                setLocationRelativeTo(null);
                break;
            case Constante.B3:
                System.out.println("no");
                cardLayout.show(centralCientifica, Constante.B4);
                this.setBounds(30,30,250,350);
                setLocationRelativeTo(null);
                break;
        }

        if (e.getSource() == borrar){
            operando = true;
            op1= Double.valueOf(pantalla.getText());

            double uno = 0;
            switch(tipoOperacion){
                case 0:
                    uno = op1--;
                    break;
            }
            pantalla.setText(Double.toString(uno));

            tipoOperacion =8;
        }

        else if (e.getSource() == b1){
            if (!operando){
                pantalla.setText(pantalla.getText()+"1");
            }else{

                pantalla.setText("1");
                operando=false;
            }
        }
        else if (e.getSource() == b2){

            if (!operando){
                pantalla.setText(pantalla.getText()+"2");
            }else if (operando){
                pantalla.setText("2");
                operando=false;
            }

        }
        else if (e.getSource() == b3){
            if (!operando){
                pantalla.setText(pantalla.getText()+"3");
            }else if (operando){
                pantalla.setText("3");
                operando=false;
            }
        }
        else if (e.getSource() == b4){
            if (!operando){
                pantalla.setText(pantalla.getText()+"4");
            }else if (operando){
                pantalla.setText("4");
                operando=false;
            }
        }
        else if (e.getSource() == b5){
            double resulta;
            if (!operando){
                pantalla.setText(pantalla.getText()+"5");
            }else if (operando){

                pantalla.setText("5");
                operando=false;

            }
        }
        else if (e.getSource() == b6){
            if (!operando){
                pantalla.setText(pantalla.getText()+"6");
            }else if (operando){
                pantalla.setText("6");
                operando=false;
            }
        }
        else if (e.getSource() == b7){
            if (!operando){
                pantalla.setText(pantalla.getText()+"7");
            }else if (operando){
                pantalla.setText("7");
                operando=false;
            }
        }
        else if (e.getSource() == b8){
            if (!operando){
                pantalla.setText(pantalla.getText()+"8");
            }else if (operando){
                pantalla.setText("8");
                operando=false;
            }
        }
        else if (e.getSource() == b9){
            if (!operando){
                pantalla.setText(pantalla.getText()+"9");
            }else if (operando){
                pantalla.setText("9");
                operando=false;
            }
        }
        else if (e.getSource() == b0){
            if (!operando){
                pantalla.setText(pantalla.getText()+"0");
            }else if (operando){
                pantalla.setText("0");
                operando=false;
            }
        }
        else if (e.getSource() == resta){
            operando = true;
            op1= Double.valueOf(pantalla.getText());
            tipoOperacion =2;
        }
        else if (e.getSource() == suma){
            operando = true;

            op1 = Double.valueOf(pantalla.getText());

            tipoOperacion=1;
        }
        else if (e.getSource() == multiplicacion){
            operando = true;
            op1= Double.valueOf(pantalla.getText());
            tipoOperacion =3;
        }
        else if (e.getSource() == division){
            operando = true;
            op1= Double.valueOf(pantalla.getText());
            tipoOperacion =4;
        }
        else if (e.getSource() == potencia){
            operando = true;
            op1=Double.valueOf(pantalla.getText());
            tipoOperacion =5;
        }
        else if (e.getSource() == raiz){
            operando = true;
            op1= Integer.valueOf(pantalla.getText());
            tipoOperacion =6;
        }
        else if (e.getSource() == cose){
            operando = true;
            op1= Double.valueOf(pantalla.getText());
            tipoOperacion =7;
        }

        else if(e.getSource() == igual){
            op2 = Double.valueOf(pantalla.getText());
            double resultado = 0;
            switch(tipoOperacion){
                case 1:
                    resultado = op1 +op2 ;
                    break;
                case 2:
                    resultado = op1 - op2;
                    break;
                case 3:
                    resultado = op1 * op2;
                    break;
                case 4:
                    resultado = op1 / op2;
                    break;
                case 5:
                    resultado=op1*op1;
                    break;
                case 6:
                    resultado = Math.sqrt(op1);
                    break;
                case 7:
                    resultado = Math.cos(op1*2.0*Math.PI/360);
                case 8:
                    break;
            }
            pantalla.setText(Double.toString(resultado));

        }
    }
}
