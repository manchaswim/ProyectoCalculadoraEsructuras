package vista;


 
import java.util.ArrayList;
import java.util.Scanner;
import PilaA.*;
 
/**
* @author Diana Virginia, Cuauhtémoc Gonzalo,Víctor Cuauhtémoc , Marco Antonio y Susana Muñoz 
 *
 */
public class Vista extends javax.swing.JFrame {
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                         
    private void initComponents() {
 
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jbpunto = new javax.swing.JButton();
        jbigual = new javax.swing.JButton();
        jbmas = new javax.swing.JButton();
        jbmenos = new javax.swing.JButton();
        jbpor = new javax.swing.JButton();
        jbdivision = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jbpaderecha = new javax.swing.JButton();
        jbpaizquierda = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
 
        jb1.setBackground(new java.awt.Color(255, 255, 255));
        jb1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
 
        jb2.setBackground(new java.awt.Color(255, 255, 255));
        jb2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
 
        jb3.setBackground(new java.awt.Color(255, 255, 255));
        jb3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
 
        jb0.setBackground(new java.awt.Color(255, 255, 255));
        jb0.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });
 
        jb4.setBackground(new java.awt.Color(255, 255, 255));
        jb4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
 
        jb5.setBackground(new java.awt.Color(255, 255, 255));
        jb5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
 
        jb6.setBackground(new java.awt.Color(255, 255, 255));
        jb6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
 
        jb8.setBackground(new java.awt.Color(255, 255, 255));
        jb8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
 
        jb7.setBackground(new java.awt.Color(255, 255, 255));
        jb7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
 
        jb9.setBackground(new java.awt.Color(255, 255, 255));
        jb9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
 
        jbpunto.setBackground(new java.awt.Color(255, 255, 255));
        jbpunto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbpunto.setText(".");
        jbpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpuntoActionPerformed(evt);
            }
        });
 
        jbigual.setBackground(new java.awt.Color(255, 255, 255));
        jbigual.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbigual.setText("=");
        jbigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbigualActionPerformed(evt);
            }
        });
 
        jbmas.setBackground(new java.awt.Color(255, 255, 255));
        jbmas.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbmas.setText("+");
        jbmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmasActionPerformed(evt);
            }
        });
 
        jbmenos.setBackground(new java.awt.Color(255, 255, 255));
        jbmenos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbmenos.setText("-");
        jbmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmenosActionPerformed(evt);
            }
        });
 
        jbpor.setBackground(new java.awt.Color(255, 255, 255));
        jbpor.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbpor.setText("*");
        jbpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbporActionPerformed(evt);
            }
        });
 
        jbdivision.setBackground(new java.awt.Color(255, 255, 255));
        jbdivision.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbdivision.setText("/");
        jbdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdivisionActionPerformed(evt);
            }
        });
 
        jbborrar.setBackground(new java.awt.Color(255, 255, 255));
        jbborrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbborrar.setText("CE");
        jbborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbborrarActionPerformed(evt);
            }
        });
 
        jbpaderecha.setBackground(new java.awt.Color(255, 255, 255));
        jbpaderecha.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbpaderecha.setText(")");
        jbpaderecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpaderechaActionPerformed(evt);
            }
        });
 
        jbpaizquierda.setBackground(new java.awt.Color(255, 255, 255));
        jbpaizquierda.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbpaizquierda.setText("(");
        jbpaizquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpaizquierdaActionPerformed(evt);
            }
        });
 
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbmas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbigual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbpaizquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jbpaderecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbpor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbborrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbpaderecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbpaizquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbpor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbmas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbigual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
 
        jb1.getAccessibleContext().setAccessibleParent(jb1);
 
        pack();
    }// </editor-fold>       
    //Metodo para revisar parentesis
    
    
    
    boolean bandera=false, primera=true, parentesis=true, punto=false, cero=true;
   
 
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 1");
        else
            jTextField1.setText(jTextField1.getText()+"1");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 2");
        else
            jTextField1.setText(jTextField1.getText()+"2");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 3");
        else
            jTextField1.setText(jTextField1.getText()+"3");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 0");
        else
            jTextField1.setText(jTextField1.getText()+"0");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 4");
        else
            jTextField1.setText(jTextField1.getText()+"4");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 5");
        else
            jTextField1.setText(jTextField1.getText()+"5");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 6");
        else
            jTextField1.setText(jTextField1.getText()+"6");
        bandera=true;
    }                                  
 
    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 8");
        else
            jTextField1.setText(jTextField1.getText()+"8");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 7");
        else
            jTextField1.setText(jTextField1.getText()+"7");
        bandera=true;
        cero=false;
    }                                  
 
    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(!bandera)
            jTextField1.setText(jTextField1.getText()+" 9");
        else
            jTextField1.setText(jTextField1.getText()+"9");
        bandera=true;
        cero=false;
    }                                  
 
    private void jbpuntoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(!punto){
            if(!bandera)
              jTextField1.setText(jTextField1.getText()+" .");
            else
              jTextField1.setText(jTextField1.getText()+".");
            bandera=true;
            punto=true;
        }
        else
           jTextField1.setText(jTextField1.getText()+""); 
    }                                      
 
    private void jbigualActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String expresion=jTextField1.getText();
        
        ArrayList postFijo = new ArrayList();
        
        
        if(OperacionCalculadora.revisaParentesis(expresion)&&!OperacionCalculadora.operadoresRepetidos(expresion)){
            expresion=Util.addInversoAditivo(expresion);
            System.out.println(expresion);
            expresion=Util.quitaSignosMas(expresion);
            System.out.println(expresion);
            char inFijo[]=new char[expresion.length()];
            for(int i =0;i<expresion.length();i++){
                inFijo[i]=expresion.charAt(i);
                System.out.print(inFijo[i]);
            }
            System.out.println("");
            postFijo = OperacionCalculadora.convertirAPostFijo(inFijo);
            for(int i=0;i<postFijo.size();i++){
                System.out.print(postFijo.get(i));
            }
            jTextField1.setText("");
            jTextField1.setText(OperacionCalculadora.evaluarPostFija(postFijo));
        }
        else{
            jTextField1.setText("Syntax error");
        }
        //postFijo=OperacionCalculadora.convertirAPostFijo(inFijo);
        //int j=0;
        
        /*for(int i=0;i<postFijo.size();i++){
            jTextField1.setText(jTextField1.getText()+postFijo.get(i));
        }*/
        bandera=false;
    }                                      
 
    private void jbmasActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if(parentesis && !cero){
            if(primera){
                jTextField1.setText(jTextField1.getText()+" +");
            }
            else
                jTextField1.setText(jTextField1.getText()+"+");
            parentesis=false;
        }
        else
            jTextField1.setText(jTextField1.getText()+" +");
        bandera=false;
        punto=false;
        primera=false;
    }                                    
 
    private void jbmenosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(parentesis){
            if(primera && !cero){
                jTextField1.setText(jTextField1.getText()+" -");
            }
            else
                jTextField1.setText(jTextField1.getText()+"-");
            parentesis=false;
        }
        else
            jTextField1.setText(jTextField1.getText()+" -");
        bandera=false;
        punto=false;
        primera=false;
    }                                      
 
    private void jbporActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if(parentesis){
            if(primera){
                jTextField1.setText(jTextField1.getText()+" *");
            }
            else
                jTextField1.setText(jTextField1.getText()+"*");
            parentesis=false;
        }
        else
            jTextField1.setText(jTextField1.getText()+" *");
        bandera=false;
        punto=false;
        primera=false;
    }                                    
 
   private void jbdivisionActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(parentesis){
            if(primera){
                jTextField1.setText(jTextField1.getText()+" /");
            }
            else
                jTextField1.setText(jTextField1.getText()+"/");
            parentesis=false;
        }
        else
            jTextField1.setText(jTextField1.getText()+" /");
        bandera=false;
        punto=false;
        primera=false;
    }                                          
 
    private void jbborrarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        jTextField1.setText("");
        bandera=false;
        parentesis=true;
        punto=false;
        primera=true;
        cero=true;
    }                                       
 
    private void jbpaderechaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+" )");
        bandera=false;
        parentesis=true;
    }                                           
 
    private void jbpaizquierdaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"(");
        bandera=false;
    }                                             
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify                    
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbborrar;
    private javax.swing.JButton jbdivision;
    private javax.swing.JButton jbigual;
    private javax.swing.JButton jbmas;
    private javax.swing.JButton jbmenos;
    private javax.swing.JButton jbpaderecha;
    private javax.swing.JButton jbpaizquierda;
    private javax.swing.JButton jbpor;
    private javax.swing.JButton jbpunto;
    // End of variables declaration                  
}
